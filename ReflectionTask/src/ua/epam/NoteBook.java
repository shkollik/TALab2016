package ua.epam;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Vladyslav_Shkola on 9/23/2016.
 */
public class NoteBook extends Date {
    private String fullName;
    private String phone;
    private Date dateOfBirth;

    public NoteBook(){

    }

    public NoteBook(String fullName, String phone, Date dateOfBirth) {
        this.fullName = fullName;
        this.phone = phone;
        this.dateOfBirth = dateOfBirth;
    }

    @MarkForRevoke(description = "for invoke")
    public int calculteNumberOfDaysTillBirthDay(String currentDate, String birthdayDate, String format) throws ParseException {
        SimpleDateFormat type = new SimpleDateFormat(format);
        Date dateNow = type.parse(currentDate);
        Date dateBirthDay = type.parse(birthdayDate);
        long difference = dateBirthDay.getTime() - dateNow.getTime();
        int days = (int) difference / (24 * 60 * 60 * 1000);
        return days;
    }

    @Override
    public String toString() {
        return "NoteBook{" +
                "fullName='" + fullName + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
