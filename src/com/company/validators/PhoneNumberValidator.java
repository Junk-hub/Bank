package com.company.validators;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidator {

    private Pattern pattern;
    private Matcher matcher;

    private static final String PHONE_PATTERN = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";

    public PhoneNumberValidator() {
        pattern = Pattern.compile(PHONE_PATTERN);
    }

    public boolean validate(final String hex) {

        matcher = pattern.matcher(hex);
        return matcher.matches();

    }
}
