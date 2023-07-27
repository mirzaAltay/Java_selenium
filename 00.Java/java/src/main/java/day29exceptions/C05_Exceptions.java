package main.java.day29exceptions;

import java.util.Scanner;

public class C05_Exceptions {

    // yasi ekran yazdiran bir kod yaziniz
    public static void main(String[] args) {
        /*
        throw == Application'in kurallarini biz belirlemek istiyorsak throw exceptions kullanabiliriz
        throw key wordu 2 { } arasinda body 'de yer alir
        throw new key worduyle constructor olusturur.
        throw'dan sonra bir exceptions ancak body icindeki istenildigi kadar tekrarlanabilir
        throws'dan sonra istenildigi kadar exceptions eklenebilir
         */
//


        Scanner input = new Scanner(System.in);
        int yas=input.nextInt();

        System.out.println(yas);

        if(yas<0){
            throw new IllegalArgumentException("Yas negatif olmaz");

        }else
            System.out.println("throw hersey yolunda "+yas);
    }
}
