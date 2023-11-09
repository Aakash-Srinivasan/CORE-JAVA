public  class name {
    public static void main(String[] args) {
    String name="Aakash";
    String name2=name.concat("Srinivasan");
    System.out.println(name2);
    System.out.println("***********************************************************");
    String name3=name.substring(4);
    System.out.println(name3);
    System.out.println("***********************************************************");
    int len=name2.length();
    System.out.println(len);
    System.out.println("***********************************************************");
    String match="Aakash";
    boolean flag= name.equalsIgnoreCase(match);
    System.out.println(flag);
    System.out.println("***********************************************************");
    boolean flagTwo= name==match;
    System.out.println(flagTwo);
    System.out.println("***********************************************************");
    char x=match.charAt(5);
    System.out.println(x);
    System.out.println("***********************************************************");
    boolean flagthree =name2.contains(match);
    System.out.println(flagthree);
    System.out.println("***********************************************************");
    String up=name.toUpperCase();
    System.out.println(up);
    System.out.println("***********************************************************");
    String low=name.toLowerCase();
    System.out.println(low);

    }
}

