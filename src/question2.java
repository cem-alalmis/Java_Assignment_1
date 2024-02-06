import java.util.Scanner;
public class question2 {

    public static void main(String[] args) {
        Scanner veriAl = new Scanner(System.in);

        System.out.print("Satılan alacağınız ürün sayısını girin:");
        int urunSayisi = veriAl.nextInt();

        double toplamFiyat = 0;

        for (int i = 1; i <= urunSayisi; i++) {
            System.out.print(i + ". ürünün fiyatını girin: ");
            double urunFiyati = veriAl.nextDouble();

            toplamFiyat = toplamFiyat + urunFiyati;
        }
        System.out.println("Toplam ödenecek miktar: " + toplamFiyat);
        veriAl.close();
    }
}



