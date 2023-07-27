package practice.practice_daytime.daytime09;

public class SE03 {
    public static void main(String[] args) {


        try {
            run();
        } finally {
            System.out.println("Can bizim Dev'imiz");
        }

        System.out.println("BJK");
    }//main

    private static void run() {
     throw new RuntimeException("Run more");
    }
}
