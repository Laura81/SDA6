package geometrie;

public class Cerc extends FormaGeometrica {

    private int radius;
    static final double PI=Math.PI;

    public Cerc(int radius) {
        this.radius = radius;
    }

    @Override

    public double calcArie(){
        return Math.pow(radius, PI);
    }
}
