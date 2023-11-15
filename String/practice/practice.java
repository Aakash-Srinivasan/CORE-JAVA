package String.practice;

import java.util.Scanner;

public class practice {
   
 public static void main(String[] args) {
   { int i=16;
    int j=2;
    i=i+j;
    j=i-j;
    i=i-j;
    // i=i+j-i;
    // j=j+i+j;
     System.out.println("Swaping two numbers");
    System.out.print("I:"+i+" J:"+j);
    System.out.println("");
    System.out.println("***********************************************************");
   }
   {
    String str="kash";
    System.out.println("if vowel is or is not in string ");
    int count=0;
    String lower=str.toLowerCase();
    char ch[]=lower.toCharArray();
    for(int i=0;i<ch.length;i++){
        String vowel="aeiou";
        char lo[]=vowel.toCharArray();
        for(int j=0;j<lo.length;j++){
        if(ch[i]==lo[j]){
            count++;
        }
    }
    
 }
 if(count>0){
        System.out.println("vowel is in the string");
        
    }
    else{
        System.out.println("no vowels is in the string");
    
    }
}
}
}
