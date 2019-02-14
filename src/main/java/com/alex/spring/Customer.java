package com.alex.spring;

import com.alex.spring.validators.CourseCode;

import javax.validation.constraints.*;

public class Customer {

    @Pattern(regexp = "^[a-zA-Z0-9]{5}", message = "only five digits or characters")
    private String firstName;

    @NotBlank(message = "is required")
    private String lastName;

    @NotNull(message = "is required")
    @Min(value = 18, message = "should be at least 18")
    @Max(value = 90, message = "should be lower than 90")
    private Integer age;

    @CourseCode(value = "LIB", message = "should starts with LIB")
    private String courseCode;

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public Integer getAge() {

        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
