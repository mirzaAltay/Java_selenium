package main.java.day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {


    /*
        1)HashTable "thread-safe" ve "synchronized" dir.
        2)HashTable entry'leri rastgele siralar.
        3)HashTable'lar "thread-safe" ve "synchronized" olduklari icin
          HashMap'lere gore daha yavastirlar.
        4)HashTable'lar "key" lerde ve "value" larda "null" kullanilmasina
          musaade etmezler
        Note: i)" multi thread" ve "synchornization" kullanmaniz gerekirse
          == buda sizi yavaslatir,
              ii)"key" lerde ve "value" larda "null" kullanmak yasak ise;
                  HashTable kullanmak gerekir.
     */

    public static void main(String[] args) {
        Hashtable<Integer, Integer> ht = new Hashtable<>();
        ht.put(1, 2);// 1 ve -1  1 'in kac tane boleni var 1 ve  -1=2 tane
        ht.put(2, 4);// 1, -1, 2, -2 ==4 tane 2 nin tam boleni
        ht.put(6, 8);// 1, 2, 3, 6, -1, -2, -3, -6 == tam boleni = 8 tane
        System.out.println(ht);// {6=8, 2=4, 1=2}
        Enumeration<Integer> r = ht.elements();
        /*
        elements():
        Bu karma tablodaki değerlerin bir listesini döndürür.
        Öğeleri sıralı bir düzende almak için,
        döndürülen nesnede Numaralandırma yöntemlerini kullanın.
        Hashtable,değerler üzerinden numaralandırılırken yapısal
         olarak değiştirilirse, numaralandırma sonuçları tanımsızdır.
         */
    }//MAIN
}
