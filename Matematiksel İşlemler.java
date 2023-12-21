public class MatematikIslemleri {
    public static void main(String[] args) {
        int sayi1 = 5;
        int sayi2 = 3;

        // Toplama
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam: " + toplam);

        // Çıkarma
        int fark = sayi1 - sayi2;
        System.out.println("Fark: " + fark);

        // Çarpma
        int carpim = sayi1 * sayi2;
        System.out.println("Çarpım: " + carpim);

        // Bölme
        double bolum = (double) sayi1 / sayi2; // Kesirli sonuç almak için casting
        System.out.println("Bölüm: " + bolum);
    }
}
