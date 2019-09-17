package com.yang.chainOfResponsibility;

/**
 * 责任链模式
 */
public abstract class AbstractLogger {

    protected int level;
    protected AbstractLogger nextLogger;

    public AbstractLogger(AbstractLogger nextLogger){
       this.nextLogger = nextLogger;
    }

    public void logMessage(int level,String message){
        if(this.level <= level){
            write(message);
        }
        if(nextLogger != null){
            nextLogger.logMessage(level,message);
        }
    }
    abstract void write(String message);
}

class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level,AbstractLogger nextLogger) {
        super(nextLogger);
        this.level = level;
    }

    @Override
    void write(String message) {
        System.out.println("Console: "+message);
    }
}


class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level,AbstractLogger nextLogger) {
        super(nextLogger);
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("ERROR: "+message);
    }
}


class FileLogger extends AbstractLogger{
    public FileLogger(int level,AbstractLogger nextLogger) {
        super(nextLogger);
        this.level = level;
    }
    @Override
    void write(String message) {
        System.out.println("FILE: "+message);
    }
}
