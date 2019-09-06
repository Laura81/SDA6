package designpattern.singleton;

public enum LogSeverity {
    INFO(0),
    STATISTICS(1),
    WARNING(2),
    ERROR(3);

    private int numVal;

    LogSeverity(int val){
        this.numVal = val;
    }

    public int getNumVal() {
        return numVal;
    }
}
