package generic;

public class MyClass <T,K>{
    T field1;
    K field2;


    public MyClass(T field1, K field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void print(){
        System.out.println(field1+"_"+field2);
    }

    @Override
    public String toString() {
        return "MyClass{" +
                "field1=" + field1 +
                ", field2=" + field2 +
                '}';
    }
}
