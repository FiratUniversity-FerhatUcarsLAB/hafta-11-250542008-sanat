/*
 * Ad Soyad: [Mustafa Şahingöz]
 * Ogrenci No: [250542008]
 * Tarih: [03.12.2025]
 * Aciklama:     Egzersiz3
 *
 * 
 * 
 */








STACK DİYAGRAMI
//Stack Frame (Metot),Durum
//ping,Şu an aktif (çalışıyor)
//baffle,ping'in bitmesini bekliyor
//zoop,baffle'ın bitmesini bekliyor
//main,zoop'un bitmesini bekliyor
    
KOD ÇIKTISI
    //No , I  wug.
 //You wugga  wug.
//I  wug.//









public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
