package com.alex.spring.validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String coursePrefix;

    public void initialize(CourseCode constraintAnnotation) {
        coursePrefix = constraintAnnotation.value();
    }

    public boolean isValid(String value, ConstraintValidatorContext context) {
        boolean result;

        if(value != null) {
            result = value.startsWith(coursePrefix);
        } else {
            result = true;
        }

        return result;
    }
}
