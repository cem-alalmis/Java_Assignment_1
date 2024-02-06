import java.util.Scanner;

public class question6 {

    public static void main(String[] args) {

        //length():
        //Bu metot, bir dizinin uzunluğunu (karakter sayısını) döndürür.
        String kelime1 = "Merhaba";
        int uzunluk = kelime1.length();
        System.out.println("Kelimenin uzunluğu: " + uzunluk);

        //charAt(int index):
        //Belirli bir indeksteki karakteri döndürür.
        String kelime2 = "Java";
        char karakter = kelime2.charAt(2);
        System.out.println("İndeks 2'deki karakter: " + karakter);

        //substring(int başlangıçIndex, int bitişIndex):
        //Belirli bir alt diziyi (substring) alır.
        String orjinal = "Merhaba Dünya";
        String altDizi = orjinal.substring(8, 13);
        System.out.println("Alt Dizi: " + altDizi);

        //toUpperCase() ve toLowerCase():
        //Tüm karakterleri büyük veya küçük harfe çevirir.
        String kelime = "Java";
        String buyukHarfli = kelime.toUpperCase();
        String kucukHarfli = kelime.toLowerCase();
        System.out.println("Büyük harfli: " + buyukHarfli);
        System.out.println("Küçük harfli: " + kucukHarfli);


        //equals(String başkaString):
        //İki stringin eşit olup olmadığını kontrol eder.
        String kelime11 = "Java";
        String kelime22 = "java";
        boolean esitMi = kelime11.equals(kelime22);
        System.out.println("Eşit mi: " + esitMi);


        //indexOf(String aranan):
        //Bir alt dizenin (substring) ilk indeksini bulur.
        String cumle = "Merhaba Dünya";
        int indeks = cumle.indexOf("Dünya");
        System.out.println("İlk indeks: " + indeks);

        //replace(char eskiChar, char yeniChar):
        //Belirli bir karakteri başka bir karakterle değiştirir.
        String orjinal1 = "Merhaba";
        String yeniHali = orjinal1.replace('a', 'e');
        System.out.println("Yeni hali: " + yeniHali);

        //startsWith(String prefix) ve endsWith(String suffix):
        //Bir stringin belirli bir önek veya sonek ile başlayıp başlamadığını kontrol eder.
        String kelime3 = "Merhaba";
        boolean baslangic = kelime3.startsWith("Mer");
        boolean son = kelime3.endsWith("ba");
        System.out.println("Başlangıç: " + baslangic);
        System.out.println("Son: " + son);

    }
}


