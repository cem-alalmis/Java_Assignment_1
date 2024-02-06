import java.util.Scanner;
import java.util.Random;

public class question4 {
    public static void main(String[] args) {
        Scanner veriAl = new Scanner(System.in);
        Random rastgele = new Random();

        int maxSayi = 10;
        int rasgeleSayi = rastgele.nextInt(maxSayi) + 1;
        int kullaniciTahmini = 0;
        int tahminSayisi = 0;

        System.out.println("1 ile " + maxSayi + " arasında bir sayı tahmin edin.");

        while (kullaniciTahmini != rasgeleSayi) {
            System.out.print("Tahmininizi girin: ");
            kullaniciTahmini = veriAl.nextInt();
            tahminSayisi++;

            if (kullaniciTahmini == rasgeleSayi) {
                System.out.println("Tebrikler! Doğru tahmin ettiniz. Sayı: " + rasgeleSayi);
            } else {
                System.out.println("Yanlış tahmin. Tekrar deneyin.");
            }
        }

        System.out.println("Toplam tahmin sayısı: " + tahminSayisi);
        veriAl.close();
    }
}


