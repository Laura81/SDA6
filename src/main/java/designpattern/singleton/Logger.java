package designpattern.singleton;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public enum Logger {
    INSTANCE;

    private String filePath;
    private LogSeverity severity;

    public void Initialize (LogSeverity logSeverity, String filePath){
        this.filePath = filePath;
        this.severity = logSeverity;
    }

    public void writeMessage (LogSeverity logSeverity, String message) throws IOException {
        if(logSeverity.getNumVal() >= severity.getNumVal()){
           FileWriter fileWriter = new FileWriter(filePath);
           BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
           bufferedWriter.append(String.format("%s\t%s", severity.toString(), message));
           bufferedWriter.close();

         //   System.out.println(message);
        }

    }

}
