package designpattern.singleton;

import java.io.IOException;

public class SingletonDemo {
    public static void main(String[] args) throws IOException {
        Logger.INSTANCE.Initialize(LogSeverity.INFO, "C:\\Users\\Laura\\Desktop\\log.txt");
        Logger.INSTANCE.writeMessage(LogSeverity.STATISTICS, "mesaj1");
        Logger.INSTANCE.writeMessage(LogSeverity.INFO, "mesaj2");
        Logger.INSTANCE.writeMessage(LogSeverity.ERROR, "mesaj3");
        Logger.INSTANCE.writeMessage(LogSeverity.WARNING, "mesaj4");

    }
}
