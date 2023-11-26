import java.util.*;
public class Buffer {
    public static void practices() {
    String swapone=new String("Srinivasan");
    String swaptwo=new String("Aakash");
    System.out.println("Before swapping swapone: "+swapone+" Swaptwo: "+swaptwo);
    swapone=swapone+swaptwo;
    swaptwo=swapone.substring(0,(swapone.length()-swaptwo.length()));
    swapone=swapone.substring(swaptwo.length());
    System.out.println("After swapping swapone: "+swapone+" Swaptwo: "+swaptwo);
    System.out.println("************************************************************************");
    String str="pavithra";
    char ch[]=str.toCharArray();
    for(int i=0;i<str.length();i++){
    if(i==0||i%2==0){
        String s=String.valueOf(ch[i]);
        System.out.print(s.toUpperCase());
        

    }
    else{
        String s=String.valueOf(ch[i]);
        System.out.print(s.toLowerCase());
    }
    }
    System.out.println("");
    System.out.println("************************************************************************");
    char cha[]={'a','a','k','a','s','h'};
    for(int i=0;i<cha.length;i++){
        String string=String.valueOf(cha[i]);
        System.out.print(string);
    }
    System.out.println("");
    int arr[]={1,2,3,4};
    String stringone;
    for(int i=0;i<arr.length;i++){
    stringone=String.valueOf(arr[i]);
    System.out.print(stringone);
    }
    System.out.println("");
    String Array[]={"ajith","vijay","surya"};
    for(int i=0;i<Array.length;i++){
        String Stringtwo=String.valueOf(Array[i]);
        System.out.print(Stringtwo);
    }
    System.out.println("");
    System.out.println("********************************STRING BUFFER****************************************");
    StringBuffer strbu=new StringBuffer("aakash");
    System.out.println(strbu.length());
    System.out.println(strbu.reverse());
    System.out.println(strbu.hashCode());
    System.out.println(strbu.capacity());
    System.out.println(strbu.equals("AAKASH"));
     System.out.println("*************************************STRING BUILDER***********************************");
    StringBuilder strbui=new StringBuilder("Vertical");
    System.out.println(strbui.length());
    System.out.println(strbui.reverse());
    System.out.println(strbui.hashCode());
    System.out.println(strbui.capacity());
    System.out.println(strbui.equals("AAKASH"));
    System.out.println("*********************************************************************************");
    String input = "W*#O*#R*K^ ^@H!A*#R*%D*% @P:L*^A*^Y*# ^H%A*^R*@D*@ !";
    String pattern = "[^a-zA-Z\\s]";
    String result = input.replaceAll(pattern, "");
    System.out.println(result+"!");
    }
   public static void main(String[] args) {
    practices();
   }
    
    
}
