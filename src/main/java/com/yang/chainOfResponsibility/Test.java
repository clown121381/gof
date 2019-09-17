package com.yang.chainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        FileLogger fileLogger = new FileLogger(3, null);
        ErrorLogger errorLogger = new ErrorLogger(2,fileLogger);
        ConsoleLogger consoleLogger = new ConsoleLogger(1,errorLogger);

        consoleLogger.logMessage(4,"message+++++++++++");
    }
}
