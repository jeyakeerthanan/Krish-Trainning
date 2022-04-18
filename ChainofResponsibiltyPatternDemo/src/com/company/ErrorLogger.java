package com.company;

public class ErrorLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("standard error logger: "+message);
    }
    public  ErrorLogger (int level){
        this.level=level;
    }
}
