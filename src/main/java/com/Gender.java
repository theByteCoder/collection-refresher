package com;

public enum Gender {

    MALE("Male"), FEMALE("Female");

    private String label;

    Gender(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "label='" + label + '\'' +
                '}';
    }
}
