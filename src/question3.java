import java.util.Scanner;
public class question3 {
    public static void main(String[] args) {
        Scanner veriAl = new Scanner(System.in);
        System.out.println("1.sayıyı girin:");
        int sayi1 = veriAl.nextInt();

        System.out.println("2.sayıyı girin:");
        int sayi2 = veriAl.nextInt();


        do {
            System.out.print(sayi1); // bu satır her zaman çalışır.
            if (sayi1 == 5) {
                System.out.print("*");
            } else if (sayi1 == 9) {
                System.out.print("$");
            } else if (sayi1 == 11) { // burada çıkış olacak
                System.out.print("X");
                break; // bunu kullanarak direk while içinden çıkarız
            }
        } while(++sayi1 <= sayi2); // başlangıç olarak sayi1 alıyoruz ve sayi2den küçük olduğu müddetçe.

    }
}
