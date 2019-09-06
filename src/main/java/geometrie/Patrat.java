package geometrie;

public class Patrat extends FormaGeometrica {

    private int l;

    public Patrat(int l) {
        this.l = l;
    }

    @Override
    public double calcArie(){
        return l*l;
        }
}
