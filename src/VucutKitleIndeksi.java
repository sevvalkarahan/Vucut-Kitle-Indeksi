import java.util.Scanner;

public class VucutKitleIndeksi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        double m=klavye.nextDouble();
        System.out.print("Kilonuzu giriniz: ");
        double kg=klavye.nextDouble();
        double indeks=kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz : "+indeks);
    }
}
