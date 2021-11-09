package com.enroute;

import com.enroute.modifiers.ModifierExample;

public class InheritedModifier extends ModifierExample {

    public void setInheritVisible(String value) {
        this.inheritVisible = value;
    }

    @Override
    public String toString() {
        return "InheritedModifier{" +
                "inheritVisible='" + inheritVisible + '\'' +
                ", allVisible='" + allVisible + '\'' +
                '}';
    }
}
