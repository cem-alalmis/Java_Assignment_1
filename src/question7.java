import java.util.Scanner;

public class question7 {

    public static void main(String[] args) {

        Scanner veriAl = new Scanner(System.in);

        System.out.print("Öğrenci sayısını giriniz: ");
        int ogrenciSayisi = veriAl.nextInt();

        for (int i = 1; i <= ogrenciSayisi; i++) {
            System.out.println("----" + i +". Öğrenci----");

            System.out.print("Öğrenci adı: ");
            String ad = veriAl.next();

            System.out.print("Öğrenci soyadı: ");
            String soyad = veriAl.next();

            System.out.print("1. sınav notu: ");
            double not1 = veriAl.nextDouble();

            System.out.print("2. sınav notu: ");
            double not2 = veriAl.nextDouble();

            System.out.print("3. sınav notu: ");
            double not3 = veriAl.nextDouble();

            double ortalama = (not1 + not2 + not3) / 3;

            System.out.println("Not Ortalaması: " + ortalama);

        }

        veriAl.close();

    }
}


