package com.enroute.modifiers;

public class ModifierExample {

    private String nonVisible = "Private Visible";

    String packageVisible = "Package Visible";

    protected String inheritVisible = "Inherit Visible";

    public String allVisible = "All visible";

    @Override
    public String toString() {
        return "ModifierExample{" +
                "nonVisible='" + nonVisible + '\'' +
                ", packageVisible='" + packageVisible + '\'' +
                ", inheritVisible='" + inheritVisible + '\'' +
                ", allVisible='" + allVisible + '\'' +
                '}';
    }
}
