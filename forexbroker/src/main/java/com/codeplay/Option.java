package com.codeplay;

// the receiver class
public class Option {
    private int ammount;

    public Option(int ammount) {
        this.ammount = ammount;
    }

    public void buy() {
        System.out.println(ammount + " was bought");
    }

    public void sell() {
        System.out.println(ammount + " was sold");
    }
}
