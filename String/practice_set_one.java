package String;
import java.util.Scanner;

public class practice_set_one {
    public static void reverse(){
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String : ");
            String name =sc.next();
            char ch[]=name.toCharArray();
            for(int i=ch.length-1;i>=0;i--){
                System.out.print(ch[i]);
            }
            System.out.println("");
        System.out.println("***************************************************");
    }
    public static void duplicates(){
         Scanner sc=new Scanner(System.in);
            System.out.println("Enter the String : ");
            String names =sc.next();
            String name=names+" ";
            char ch[]=name.toCharArray();
            for(int i=0;i<ch.length;i++){
                for(int j=i+1;j<ch.length;j++){
                    if(ch[i]!=ch[j]){
                    System.out.print(ch[i]);
                    }
                    break;
                }
            }
        System.out.println("");
        System.out.println("***************************************************");

    }
    public static void max(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String names =sc.next();
        String maxOccStr=names;
		char maxChar =' ';
		int i, max = -1;
		int[] charFreq = new int[256];
		for(i = 0; i < maxOccStr.length() ; i++)
		{
			charFreq[maxOccStr.charAt(i)]++;
		}
		for(i = 0; i < maxOccStr.length(); i++) 
		{
			char cha = maxOccStr.charAt(i);
			if(max < charFreq[cha]) {
				max = charFreq[cha];
				maxChar = cha;
			}
		}
		System.out.format( maxChar +"-"+ max+"times");	
        System.out.println("");
        System.out.println("***************************************************");
	}
    public static void palindrome(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str =sc.next();
        String reverseStr = "";
              for (int i = (str.length() - 1); i >=0; --i) {
                reverseStr = reverseStr + str.charAt(i);
              }
          
              if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
              }
              else {
                System.out.println(str + " is not a Palindrome String.");
              }
        System.out.println("");
        System.out.println("***************************************************");
    }
    public static void remove(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str =sc.next();
        System.out.println("Enter The Character : ");
        String ch = sc.next();
        String string=str.replace(ch, "");
        System.out.println(string);
        System.out.println("");
        System.out.println("***************************************************");
    }
        public static void main(String[] args) {
         reverse();
         duplicates();
         max();
         palindrome();
         remove();
  }
}

        
    
