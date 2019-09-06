package serialize;

import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        MyClass c = new MyClass("adasasa");
        File myFile = new File("C:\\Users\\Laura\\Desktop\\a.txt");

        serialize(c, myFile);
        MyClass myNewObj = deserialize(myFile);
        System.out.println(myNewObj);

    }

    private static void serialize(MyClass c, File file) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(c);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static MyClass deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        MyClass myClass = (MyClass) objectInputStream.readObject();

        return myClass;
    }
}

