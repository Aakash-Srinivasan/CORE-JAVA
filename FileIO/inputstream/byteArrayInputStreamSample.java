package FileIO.inputstream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class byteArrayInputStreamSample {
    public static void main(String[] args) throws IOException {
        byte con[]={'a','b','c'};
        ByteArrayInputStream by=new ByteArrayInputStream(con);
        System.out.println(by);
        for(int i=0;i<con.length;i++){
            char data=(char) by.read();
            System.out.print(data+" ");
        }
        by.close();
    }
    
}
