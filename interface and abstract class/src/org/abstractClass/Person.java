package org.abstractClass;

import org.multipleInheritanceWithInterface.IsAlive;
import org.multipleInheritanceWithInterface.LiveLife;

public abstract class Person implements IsAlive, LiveLife {
    public void speak(){
        System.out.println("Share something");
    }

    public abstract void eat();

    @Override
    public void breath() {
        System.out.println("Should Breath fresh air");
    }

    @Override
    public void message() {
        System.out.println("I am doing Great");
    }
}
