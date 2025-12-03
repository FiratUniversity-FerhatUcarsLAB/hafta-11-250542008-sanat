/*
 * Ad Soyad: [Mustafa Şahingöz]
 * Ogrenci No: [250542008]
 * Tarih: [03.12.2025]
 * Aciklama:Egzersiz1
 *
 * 
 * 
 */

public class Egzersiz1 {
    //Amerikan metodu oluşturulur
    //Formatı:Gün, Ay, Tarih, Yıl
    public static void printAmerican(String gün, String ay, int tarih, int yıl){
        System.out.println(gün + "," + ay +  " " + tarih + ", " + yıl);
    }
    //Avrupa metodu oluşturlur
    //Formatı:Gün Tarih Ay Yıl
    public static void printEurpean(String day, String ay, int tarih, int yıl){
        System.out.println(day + " " + tarih + " " + ay + " " +  yıl);
    }


    //Ana metot(main) oluşturulur
    public static void main(String[] args) {
        String gün = "Cumartesi";
        String ay = "Temmuz";
        int tarih = 22;
        int yıl = 2025;

        printAmerican(gün, ay, tarih, yıl);
        printEurpean(gün, ay, tarih, yıl);

        //Metotlar çağrılır
        System.out.println("***Amerikan Formatı***");
        printAmerican(gün, ay, tarih, yıl);

        System.out.println("***Avrupa Formatı***");
        printEurpean(gün, ay, tarih, yıl);
    }
}








public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}
