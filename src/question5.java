
import java.util.Scanner;
public class question5 {
    public static void main(String[] args) {
        Scanner veriAl = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = veriAl.nextInt();

        if (sayi > 0) {
            if (isMukemmelSayi(sayi)) {
                System.out.println(sayi + " mükemmel bir sayıdır.");
            } else {
                System.out.println(sayi + " mükemmel bir sayı değildir.");
            }
        } else {
            System.out.println("Lütfen pozitif bir sayı girin.");
        }

        veriAl.close();
    }


    public static boolean isMukemmelSayi(int sayi) {
        int toplam = 1;

        for (int i = 2; i <= sayi / 2; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }
        }


        return (toplam == sayi);
    }
}


