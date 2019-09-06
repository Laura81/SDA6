package nested;
//Creati un outer class care se numeste CPU si contine un field price;
// CPU contine urmatoarele inner classes:
// Procesor: double cores;
//           String manufacturer;
//           double getCache();
// RAM: double memory;
//      String manufacturer;
//      double getCockSpeed();
// Class Main -> psvm()
// Scriem un CPU cu toate componentele si afisam metodele

public class Cpu {

    public class Procesor {
        double cores;
        String manufacturer;

        public Procesor(double cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        public void getCache() {
            System.out.println(cores);
        }
    }

    public class Ram {
        double memory;
        String manufacturer;

        public Ram(double memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        public void getCockSpeed() {
            System.out.println(memory);
        }
    }
}
