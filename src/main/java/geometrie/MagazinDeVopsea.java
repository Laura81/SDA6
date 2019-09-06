package geometrie;

public class MagazinDeVopsea {

    public double calc(FormaGeometrica[] fg){
        double suma=0.0;

        for(FormaGeometrica value:fg){
            suma+=value.calcArie();
        }
        return suma;
    }
}
