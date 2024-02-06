import java.util.Scanner;
public class question1 {
    public static void main(String[] args) {

        String product;
        Scanner veriAl = new Scanner(System.in);

        System.out.print("Siparis no gir: ");
        int siparisNo = veriAl.nextInt();

        switch (siparisNo) {
            case 1: product = "Ipad";
                break;
            case 2: product = "Iphone";
                break;
            case 3: product = "Macbook";
                break;
            case 4: product = "AppleTV";
                break;
            case 5: product = "AppleWatch";
                break;
            default: product = "Yanlış sipariş no girdiniz";
                break;
        }

        System.out.println("Sipariş numarası: " + siparisNo + " Sipariş edilen ürün: " + product);
        veriAl.close();

    }
}
