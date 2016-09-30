package ua.talab.controller;

import ua.epam.View;
import ua.epam.model.Address;
import ua.epam.model.Record;

import java.util.Scanner;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class Controller {
    Record record;
    View view;

    InputRegForm regForm;

    public void proccessUser() {
        Scanner sc = new Scanner(System.in);
        regForm = new InputRegForm();
        regForm.setSurname(checkRegex(sc, view.SURNAME, RegularExpressions.REGEX_NAME));
        regForm.setName(checkRegex(sc, view.FIRSTNAME, RegularExpressions.REGEX_NAME));
        regForm.setDaddyName(checkRegex(sc, view.DADDYNAME, RegularExpressions.REGEX_NAME));
        regForm.setNickName(checkRegex(sc, view.NICKNAME, RegularExpressions.REGEX_NICKNAME));
        regForm.setComments(checkRegex(sc, view.COMMENTS, RegularExpressions.REGEX_COMMENTS));
        regForm.setGroup(checkRegex(sc, view.GROUP, RegularExpressions.REGEX_GROUP));
        regForm.setPhoneNumberHome(checkRegex(sc, view.HOMEPHONE, RegularExpressions.REGEX_HOMEPHONE));
        regForm.setPhoneNumberMobile(checkRegex(sc, view.MOBILE, RegularExpressions.REGEX_MOBILEPHONE));
        regForm.setPhoneNumberSecondMobile(checkRegex(sc, view.SECONDMOBILE, RegularExpressions.REGEX_MOBILEPHONE));
        regForm.setEmail(checkRegex(sc, view.EMAIL, RegularExpressions.REGEX_EMAIL));
        regForm.setSkype(checkRegex(sc, view.SKYPE, RegularExpressions.REGEX_SKYPE));
        regForm.setAddress(new Address(checkRegex(sc, view.ADDRESS, RegularExpressions.REGEX_ADDRESS)));
        regForm.setFirstInsertDate(checkRegex(sc, view.FIRSTINPUTDATE, RegularExpressions.REGEX_DATE));
        regForm.setLastChangeDate(checkRegex(sc, view.LASTCHANGESDATE, RegularExpressions.REGEX_DATE));

        record = new Record(regForm.getSurname(), regForm.getName(),
                regForm.getDaddyName(),regForm.getNickName(), regForm.getComments(), regForm.getGroup(),
                regForm.getPhoneNumberHome(), regForm.getPhoneNumberMobile(), regForm.getPhoneNumberSecondMobile(),
                regForm.getSkype(), regForm.getEmail(), regForm.getAddress(), regForm.getFirstInsertDate(), regForm.getLastChangeDate());

        System.out.println(record);


    }

    public String checkRegex(Scanner sc, String message, String regex) {
       String temp = inputValueWithScanner(sc, message);
        while (true) {
            if (temp.matches(regex)) {
                return temp;
            }
            else{
                view.printMessage(view.ERROR);
                temp = inputValueWithScanner(sc, message);
            }
        }

    }

    public String inputValueWithScanner(Scanner sc, String message) {
        view.printMessage(message);
        while (!sc.hasNextLine()) {
            view.printMessage(view.ERROR);
            sc.nextLine();
        }
        return sc.nextLine();
    }

}
