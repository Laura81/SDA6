package nested;

public class Main {
    public static void main(String[] args) {
        Cpu c = new Cpu();

        Cpu.Procesor procesor = c.new Procesor(1, "GH");
        procesor.getCache();

        Cpu.Ram ram = c.new Ram(1, "fg");
        ram.getCockSpeed();
    }
}
