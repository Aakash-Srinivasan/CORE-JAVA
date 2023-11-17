package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {

    public static void main(String[] args) {
        // Checked Exception: FileNotFoundException
        try{
            FileReader fi=new FileReader("test.txt");
            
        }catch(FileNotFoundException e){
            System.out.println("error"+e.getMessage());
        }finally{
            System.out.println("This file not found exception");
        }
        //IO exception 
          try{
            FileReader fr=new FileReader("test.txt");
            fr.read();
            fr.close();
        }catch(IOException e){
            System.out.println("error"+e.getMessage());
        }finally{
            System.out.println("This is IOexception");
        }
        //class exception
        try{
            int result=10/0;
        }catch(ArithmeticException e){
            System.out.println("Error"+e.getMessage());;
        }finally{
            System.out.println("this arthmetic exception");
        }
}
}
