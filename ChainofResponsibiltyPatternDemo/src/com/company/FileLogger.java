package com.company;

public class FileLogger extends AbstractLogger {
    @Override
    protected void write(String message) {
        System.out.println("standard fie logger: "+message);
    }
    public  FileLogger (int level){
        this.level=level;
    }
}
