package Serial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;

import String.name;

public class Excersicetwo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        datas dt=new datas();
        FileInputStream fis=new FileInputStream("/Users/Admin/Documents/empty file.txt");
        ObjectInputStream fos =new ObjectInputStream(fis);
        dt=(datas)fos.readObject();
        System.out.println("Deserialized is Completed......");
        String one=dt.name;
        String two=dt.Degree;
        String three=dt.PhoneNumber;
        File file=new File("/Users/Admin/Documents/empty file.txt");
        FileWriter fw=new FileWriter(file);
        fw.write(one);
        fw.write(two);
        fw.write(three);
        fw.flush();
        fw.close();
    }
    
}
