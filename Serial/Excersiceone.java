package Serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import String.name;

public class Excersiceone {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        datas dt=new datas();
        dt.name="Aakash.S";
        dt.Degree="CSE";
        dt.PhoneNumber="9994714723";
        FileOutputStream fops=new FileOutputStream("/Users/Admin/Documents/empty file.txt");
        ObjectOutputStream Ous=new ObjectOutputStream(fops);
        Ous.writeObject(dt);
        Ous.close();
        fops.close();
        System.out.println("Serialized data are writed");
        File fis=new File("/Users/Admin/Documents/empty file.txt");
        FileInputStream fos=new FileInputStream(fis);
        System.out.println("The data inside the file");
        System.out.println("The byte code of file "+fos.read());
        int i;
        while ((i=fos.read())!=-1) {

            System.out.print((char)i);
        }
        fos.close();

    }
    
}
