package FileIO.outputstream;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class byteArrayStreamSample {
    public static void main(String[] args) throws IOException {
        String data="Test String ....!";
        ByteArrayOutputStream boi=new ByteArrayOutputStream();
        byte[] datas=data.getBytes();
        boi.write(datas);
        boi.close();
        String two=boi.toString();
        System.out.println(two);
    }
    
}
