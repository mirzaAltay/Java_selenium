package practice.practice_daytime.daytime09;

public class SE05 {

    public static void main(String[] args) {

  /*  String s = "abcd";

        try {
            Object obj = new Integer(12);
            s = (String)obj;
        }catch(ClassCastException e){
            System.out.println("Good");
        }
        System.out.println(s);


   /*     Integer z = 0;
        try {
            String s = "abcd";
            z = Integer.parseInt(s);
        }catch(NumberFormatException e) {
            System.out.println("Good");
        }
        System.out.println(z);*/

    //Run Time Exception verir



     /*   Integer z = 0;
        try {
            String s = "abcd";
            z = Integer.parseInt(s);
        }catch(NumberFormatException e) {
            System.out.println("Good");
        }
        System.out.println(z);*/


        Integer z = 0;
        try {
            String s = "asdf";
            z = Integer.parseInt(s);
        }catch(NumberFormatException e) {
         //   System.out.println(e);//java.lang.NumberFormatException: For input string: "asdf"
         //   System.out.println(e.getMessage());//For input string: "asdf"
            e.printStackTrace();
        }
        System.out.println(z);
    }//main
}
