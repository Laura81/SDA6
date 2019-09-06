package geometrie;

public class Main {

    public static void main(String[] args) {

       FormaGeometrica cerc = new Cerc(12);
       FormaGeometrica patrat = new Patrat(15);
       FormaGeometrica dreptunghi = new Dreptunghi(3,4);
       FormaGeometrica triunghi = new Triunghi(1,2);

       FormaGeometrica[] f={cerc, patrat, dreptunghi, triunghi};
        System.out.println(cerc.calcArie());
        System.out.println(patrat.calcArie());
        System.out.println(dreptunghi.calcArie());
        System.out.println(triunghi.calcArie());

        }
    }

