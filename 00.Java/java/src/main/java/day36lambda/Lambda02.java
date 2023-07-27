package main.java.day36lambda;

import java.util.*;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

   Universite u1 = new Universite("hacettepe","fizik",1200,88);
   Universite u2 = new Universite("bogazici","qa",400,90);
   Universite u3 = new Universite("odtu","matematik ogretmenligi",900,95);
   Universite u4 = new Universite("marmara","matematik",3000,60);
   Universite u5 = new Universite("ege","elektrik-elektronik",2000,83);
   Universite u6 = new Universite("sutcu Imam","matematik",250,60);
   Universite u7 = new Universite("karaelmas","matematik",4000,60);
   Universite u8 = new Universite("samsun","matematik",6000,60);


   List<Universite> unv = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
        System.out.println(notOrt75tenByk(unv));
        System.out.println();
        System.out.println(mtkVrmYkm(unv));//true
        System.out.println("ogrncSylrBykKc");
        System.out.println(ogrncSylrBykKc(unv));
        System.out.print("matematikBolmSys : ");
        System.out.println(matematikBolmSys(unv));
        System.out.print("ogrncSylr > 550 ");
        System.out.println(ogrncSylr550Fzl(unv));
        System.out.print("ogrnci Sys < 1050 : ");
        System.out.println(ogrnciSysBinEllidenAz(unv));


    }//main

    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu
    // gosteren bir program olusturunuz.
     public static boolean notOrt75tenByk(List<Universite> unv){
        return  unv.
                stream().
                allMatch(t->t.getNotOrtalamasi()>75);

     }

    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden
    //  bir program olusturunuz.
    public static boolean mtkVrmYkm(List<Universite> unv){
        return  unv.
                stream().
                anyMatch(t->t.getBolum().
                equalsIgnoreCase("matematik"));

    }

    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayan
    //    bir program olusturunuz.
    public static List<Universite> ogrncSylrBykKc(List<Universite> unv){
        return unv.
                stream().
                sorted(Comparator.comparing(Universite::getOgrenciSayisi).
                reversed()).
                collect(Collectors.toList());//Stream yapisindaki datalar List haline getirildi


    }




    //Task 04-->"matematik" bolumlerinin sayisini  print ediniz.

    public static int matematikBolmSys(List<Universite> unv){
        return (int) unv.
                     stream().
                     filter(t->t.getBolum().equals("matematik")).
                     count();//sayma islemi yapar
    }



    //Task 05-->Ogrenci sayilari 550'dan fazla olan universite'lerin en buyuk notOrt'unu bulunuz.

    public static OptionalInt ogrncSylr550Fzl(List<Universite> unv){
        return unv.
                stream().
                filter(t->t.getOgrenciSayisi()>550).
                mapToInt(t->t.getNotOrtalamasi()).//mapToInt ile degeri guncelledik
                // max() methodundan null gelme ihtimali wrapper classlarda var.
                // OptionalInt return etmeni ister
                max();

    }

    //Task 06-->Ogrenci sayilari 1050'dan az olan universite'lerin en kucuk notOrt'unu bulunuz.
    public static OptionalInt ogrnciSysBinEllidenAz(List<Universite> unv) {
        return unv.
                stream().
                filter(t -> t.getOgrenciSayisi() < 1050).
                mapToInt(t -> t.getNotOrtalamasi()).
                min();
    }
}//class
