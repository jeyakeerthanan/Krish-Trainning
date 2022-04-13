package com.company;

public class Application {

    public static void main(String[] args) {
	// write your code here
        Mobile builder= new Mobile.Builder("A11").airpod("aipod pro").camera("5px").build();
        Mobile.Builder builder2= new Mobile.Builder("snapDragon");
        System.out.println(builder);
        System.out.println(builder2);
    }
}
