package FileIO.inputstream;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.IOException;

public class fileinputStreamSample {
    public static void main(String[] args) throws IOException,FileNotFoundException{
        File file=new File("/Users/Admin/Documents/file.txt");
        FileInputStream fis=new FileInputStream(file);
        System.out.println(fis.read() );
        int i=0;
        while ((i=fis.read())!=-1) {
            System.out.print((char)i);
            
        }
         fis.close();
    }
    
}
