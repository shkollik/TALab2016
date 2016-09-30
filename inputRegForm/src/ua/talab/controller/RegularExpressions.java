package ua.talab.controller;

/**
 * Created by Shkolik on 22.09.2016.
 */
public interface RegularExpressions {
    public static final String REGEX_NAME = "(([A-Za-z][a-z]{1,10})|([А-Яа-я][а-я]){1,10})";
    public static final String REGEX_NICKNAME = "^[\\w\\.-]{3,20}$";
    public static final String REGEX_COMMENTS = "[\\w\\s]{1,50}";
    public static final String REGEX_GROUP = "(Home)|(Job)|(Friends)";
    public static final String REGEX_HOMEPHONE = "\\(\\d{3,5}\\)\\d{5,7}";
    public static final String REGEX_MOBILEPHONE = "(\\d{3}-\\d{2}-\\d{2}-\\d{3})|(\\d{10})|(\\+\\d{1,2}\\d{10})";
    public static final String REGEX_EMAIL = "[A-Za-z0-9]{1,10}@[a-z]{1,10}\\.[a-z]{2,5}";
    public static final String REGEX_SKYPE = "[\\w\\.-]{5,20}";
    public static final String REGEX_ADDRESS = "(\\d{5})(\\s)([A-Za-z]{3,15})(\\s)([A-Za-z]{3,15})(\\s)(\\d{1,3})(\\s)(\\d{1,3})";
    public static final String REGEX_DATE = "[0-9]{2}:[0-9]{2}:[0-9]{4}";
}
