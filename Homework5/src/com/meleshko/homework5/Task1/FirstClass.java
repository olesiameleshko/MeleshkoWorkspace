package com.meleshko.homework5.Task1;

//Task 1
public class FirstClass {
    private String name;
    private String type;
    private String access;

    public FirstClass (String name, String type, String access) {
        this.name = name;
        this.type = type;
        this.access = access;
    }
    public String toString () {

        return this.name + "\n" + this.type + "\n" + this.access;
    }
}
