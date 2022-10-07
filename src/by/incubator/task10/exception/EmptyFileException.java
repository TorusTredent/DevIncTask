package by.incubator.task10.exception;

import by.incubator.task10.console.Writer;

public class EmptyFileException extends RuntimeException{

    public EmptyFileException(String message, String filePath) {
        Writer.print(message + filePath);
    }

    public EmptyFileException(String message, Throwable throwable, String filePath) {
        Writer.print(message + filePath);
    }
}
