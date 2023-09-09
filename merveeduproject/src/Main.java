public class Main {
    public static void main(String[] args) {
        String isim="mustafa";
        // Değer tipli değişkenler -> Stack alanında tutulurç
        int sayi = 2;
        long sayi2 = 10000;
        float sayi3 = 2.5f;
        double sayi4 = 2.5;
        char karakter = 'a'; // ASCII Codu ->
        //Referans tipli değişkenkler. RAM deki adres önemlidir. RAM ikiye bölünür. Stack ve Heap -> Heap javanın alanı -> Stack bizim alanımız.
        String metin = "emine"; // Heap alanında tutulur. Pointer kavramı. OOP nin çıkış noktasıdır.
        //Class lar da referans tipli değişkenler ile refere edilir. Bunlara da nesne denir. Her nesne referans tipli değişkendir.
        boolean dogru_mu = 1==1 || 2>10; // çift = gerçek eşitliği kontrol eder.
        //Collection yapılar. Array(Dizi) ve Listeler(ArrayList)
        int[] sayilar = new int[3]; //new demek instance demektir.
        sayilar[0] = 1;
        sayilar[1] = 12;
        sayilar[2] = 14;

        System.out.println("İlk sayı " + sayilar[0] + " ikinci sayı " + sayilar[1] + " Üçüncü sayı " + sayilar[2] + " dir."); // Görevi consola çıktı vermek.
        System.out.println(sayilar); //Diziler de referans tipli değişkenlerdir.

        char[] karakterler = new char[10];
        karakterler[0] = 'e';
        karakterler[1] = 'm';
        karakterler[2] = 'i';
        karakterler[3] = 'n';
        karakterler[4] = 'e';

        String isim1 = "emine"; // Referans tipli

        System.out.println(dogru_mu);



//        System.out.println("Hello " + isim);
//        System.out.println("Yeni isim " + isim + " oldu");
    }
}