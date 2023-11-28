package Serial;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import FileIO.outputstream.objectoutputstreamSample;

public class SerializedData {
    public static void main(String[] args) throws IOException {
        Dataproto dp= new Dataproto();
        dp.name="Vertical";
        dp.Address="Guindy";
        dp.PhoneNumber="9994714723";
        dp.Courses="Fullstack";
        FileOutputStream fos=new FileOutputStream("/Users/Admin/Documents/file.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(dp);
        oos.close();
        fos.close();
        System.out.println("serialization is completed ");
    }
    
}
