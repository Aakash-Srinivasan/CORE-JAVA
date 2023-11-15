package String;

import java.util.Random;
import java.util.Scanner;

public class practice_set_two {
    private static final String RandomStringUtils = null;

    public static void wordcount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str =sc.next();
        int count=1;
        for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==',') {
				count++;
			}
		}
        System.out.println(count+" words");
        System.out.println("");
        System.out.println("***************************************************");
    
    }
    public static void compare(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String str1=sc.next();
        String str2=sc.next();
        System.out.print("compare the string :");
        System.out.print(str1.compareTo(str2));
        System.out.println("4");
        System.out.println("***************************************************");

    }
    public static void random(){
        Random r = new Random();
		String random = "";
		for(int i=1;i<5;i++) {
		 int randomNumber = r.nextInt(26) + 65;
		 char randomChar = (char) randomNumber;
		 random = random+randomChar;
		}
		System.out.println(random);
        System.out.println("***************************************************");
    }
    public static void asci(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String name=sc.next();
            char ch[]=name.toCharArray();
            int i=ch.length-1;
            int a=ch[i];
            System.out.println(a);
        System.out.println("***************************************************");
    }

	public static void sort(){
	{
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Strings : ");
        String str=sc.next();
		char arr[] = str.toCharArray();
		char temp;
		int i = 0;
		while (i < arr.length) {
			int j = i + 1;
			while (j < arr.length) {
				if (arr[j] < arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				j += 1;
			}
			i += 1;
		}

		System.out.println(arr);
	}
    System.out.println("***************************************************");
}


    public static void main(String[] args) {
      wordcount();
      compare();
      random();
      asci();
      sort();
    }
    
}
