package Serial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import String.name;

public class Deserialized {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dataproto dp=new Dataproto();
        FileInputStream fis=new FileInputStream("/Users/Admin/Documents/file.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        dp=(Dataproto)ois.readObject();
        System.out.println("Deserialized Data:");
        System.out.println("name: "+dp.name);
        System.out.println("Address: "+dp.Address);
        System.out.println("Number: "+dp.PhoneNumber);
        System.out.println("Courses: "+dp.Courses);
        ois.close();
        fis.close();
    }
    
}
