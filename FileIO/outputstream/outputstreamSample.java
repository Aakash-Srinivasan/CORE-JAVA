package FileIO.outputstream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputstreamSample {
    public static void main(String[] args) throws IOException ,FileNotFoundException{
        String content ="AAkash";
        File file=new File("/Users/Admin/Documents/newfile.txt");
        FileOutputStream fiod=new FileOutputStream(file);
        byte [] b=content.getBytes();
        fiod.write(b);
        fiod.close();

        
    }
    
}
