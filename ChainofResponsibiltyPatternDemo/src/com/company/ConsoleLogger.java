package com.company;

public class ConsoleLogger extends AbstractLogger{
    @Override
    protected void write(String message) {
        System.out.println("standard console logger: "+message);
    }
    public  ConsoleLogger (int level){
        this.level=level;
    }

}
