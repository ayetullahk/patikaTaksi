package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basla=10,bitisMin=20;
        double km=2.20,mesafe,ücret;
        Scanner yolunUzunlugu=new Scanner(System.in);
        System.out.print("Lütfen gidilecek km giriniz; ");
        mesafe= yolunUzunlugu.nextInt();
        ücret=km*mesafe+basla;
        ücret=(ücret<20) ? 20 : ücret;
        System.out.println("Tutar:"+ücret);
    }
}