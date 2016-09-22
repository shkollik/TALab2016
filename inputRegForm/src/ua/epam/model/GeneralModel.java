package ua.epam.model;

import ua.epam.controller.InputRegForm;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class GeneralModel {
    public Record createRecord(InputRegForm input){
        InputRegForm regForm = new InputRegForm();
        Record record = new Record(regForm.getSurname(), regForm.getName(),
                regForm.getDaddyName(),regForm.getNickName(), regForm.getComments(), regForm.getGroup(),
                regForm.getPhoneNumberHome(), regForm.getPhoneNumberMobile(), regForm.getPhoneNumberSecondMobile(),
                regForm.getSkype(), regForm.getEmail(), regForm.getAddress(), regForm.getFirstInsertDate(), regForm.getLastChangeDate());
        return record;
    }
}
