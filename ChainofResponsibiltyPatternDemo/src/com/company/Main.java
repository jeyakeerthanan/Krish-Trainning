package com.company;

public class Main {

    private static AbstractLogger getChainOfloggers(){
        AbstractLogger errorLogger= new ErrorLogger(AbstractLogger.Error);
        AbstractLogger filelogger= new FileLogger(AbstractLogger.Debug);
        AbstractLogger consolelogger= new ConsoleLogger(AbstractLogger.info);

        errorLogger.setNextLogger(filelogger);
        filelogger.setNextLogger(consolelogger);
        return errorLogger;
    }

    public static void main(String[] args) {
	 AbstractLogger loggerChain=getChainOfloggers();
	 loggerChain.logMessage(AbstractLogger.info,"this is an information");
        System.out.println(" ");
        loggerChain.logMessage(AbstractLogger.Debug,"this is an debug information");
        System.out.println(" ");
        loggerChain.logMessage(AbstractLogger.Error,"this is an error information");
    }
}
