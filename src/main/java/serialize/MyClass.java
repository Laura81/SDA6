package serialize;

import java.io.Serializable;

public class MyClass implements Serializable {
    private String nume;

    public MyClass(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "nume='" + nume + '\'' +
                '}';
    }
}
