package com.enroute;

import com.enroute.modifiers.ModifierExample;
import com.enroute.modifiers.PackageModifier;

public class Modifiers {

    public void exampleMethod() {

        ModifierExample modifierExample = new ModifierExample();

        System.out.println("From an external class I just can print public variable: " +  modifierExample.allVisible);
        System.out.println("--");
        System.out.println(modifierExample);
        System.out.println("--");

        PackageModifier packageModifier = new PackageModifier();

        System.out.println("From an external class I just can print public variable: " +  packageModifier.allVisible);
        System.out.println("--");
        System.out.println(packageModifier);
        System.out.println("--");

        InheritedModifier inheritedModifier = new InheritedModifier();

        System.out.println("From an external class I just can print public variable: " +  inheritedModifier.allVisible);
        System.out.println("--");
        System.out.println(inheritedModifier);
        System.out.println("--");

    }

}
