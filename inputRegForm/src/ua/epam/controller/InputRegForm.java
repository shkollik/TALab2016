package ua.epam.controller;

import ua.epam.model.Address;
import ua.epam.model.Group;

/**
 * Created by Shkolik on 22.09.2016.
 */
public class InputRegForm {
    private String name;
    private String surname;
    private String daddyName;
    private String nickName;
    private String comments;
    private Group group;
    private String phoneNumberHome;
    private String phoneNumberMobile;
    private String phoneNumberSecondMobile;
    private String email;
    private String skype;
    private String firstInsertDate;
    private String lastChangeDate;
    private Address address;

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getDaddyName() {
        return daddyName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getComments() {
        return comments;
    }

    public Group getGroup() {
        return group;
    }

    public String getPhoneNumberHome() {
        return phoneNumberHome;
    }

    public String getPhoneNumberMobile() {
        return phoneNumberMobile;
    }

    public String getPhoneNumberSecondMobile() {
        return phoneNumberSecondMobile;
    }

    public String getEmail() {
        return email;
    }

    public String getSkype() {
        return skype;
    }

    public String getFirstInsertDate() {
        return firstInsertDate;
    }

    public String getLastChangeDate() {
        return lastChangeDate;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setPhoneNumberMobile(String phoneNumberMobile) {
        this.phoneNumberMobile = phoneNumberMobile;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setDaddyName(String daddyName) {
        this.daddyName = daddyName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void setGroup(String group) {
        this.group = Group.valueOf(group);
    }

    public void setPhoneNumberHome(String phoneNumberHome) {
        this.phoneNumberHome = phoneNumberHome;
    }

    public void setPhoneNumberSecondMobile(String phoneNumberSecondMobile) {
        this.phoneNumberSecondMobile = phoneNumberSecondMobile;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public void setFirstInsertDate(String firstInsertDate) {
        this.firstInsertDate = firstInsertDate;
    }

    public void setLastChangeDate(String lastChangeDate) {
        this.lastChangeDate = lastChangeDate;
    }
}
