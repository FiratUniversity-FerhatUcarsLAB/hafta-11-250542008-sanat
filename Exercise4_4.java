/*
 * Ad Soyad: [Mustafa Şahingöz]
 * Ogrenci No: [250542008]
 * Tarih: [03.12.2025]
 * Aciklama:Egzersiz4
 *
 * 
 * 
 */










public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);

        // Cevaplarinizi yorum olarak ekleyin.



        //Cevap-1:Hata ve uyarı vermez.Metod çalışır ve toplama işlemini yapar 15 sonucunu bulur ama bu değeri yaklayan kimse olmadığı için yok sayılır.
        //Cevap-2:Derleme hatası(Error: operator + cannot be applied to void, int (Hata: + operatörü 'void' ve 'int' türlerine uygulanamaz) Veya: 'void' type not allowed here) alınır ve kod çalışmaz.Çünkü void bir veri tipi değildir.

    }
}
