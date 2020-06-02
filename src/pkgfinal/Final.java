package pkgfinal;
//girilen sayıların çift ve tek olanların toplamını bulan program

import java.util.Scanner;
public class Final {

    public static void sayidenetle()     	//sayidenetle adında metot oluşturduk.
    {
        Scanner veri = new Scanner(System.in);  //veri girişi için veri adında scanner oluşturduk.
        int sayi,ciftsayilar=0,teksayilar=0;    //sayi,çift ve tek sayılar adında int değişkeni oluşturduk.
        do{                                     //do while döngüsü başlatık ki en az bir defa sayı istesin.
        System.out.print("Bir Sayı Girin: ");   //kullanıcıdan sayı istedik.
        sayi = veri.nextInt();                  //sayiyi hafızaya attık.
        if(sayi%2==0)                           //if-else ile 2'ye bölenden kalan sıfır ise çift değil ise tek diye ayırdık.
            ciftsayilar+=sayi;                  //bu şartı sağlayan sayıları çiftsayilar değişkenine ekledik
        else
            teksayilar+=sayi;                   //bu şartı sağlamayan sayıyı teksayilar değişkenine ekledik.
  
        }while(sayi != 0);                      //döngüye 0 sayısı girilene kadar devam etmesini söyledik
 
        System.out.println("Tek Sayıların Toplamı : " + teksayilar);        //tek sayıların toplamını yazdırdık.
        System.out.println("Çift Sayıların Toplamı: " + ciftsayilar);       //çift sayıların toplamını yazdırdık.
    }

    public static void main(String[] args)      //ana kısım	
    {
        sayidenetle();                          //sayidenetle metotunu çağırıp ekrana yazılmasını sağladık.
    }
}

