public class Multadd {

    // 1. ADIM: Ana Program (Main)
    public static void main(String[] args) {

        System.out.println("--- Basit Test ---");
        multadd(1.0, 2.0, 3.0);

        System.out.println("\n--- Trigonometri Testi ---");
        double a1 = 1.0;
        double b1 = Math.sin(Math.PI / 4);
        double c1 = Math.cos(Math.PI / 4) / 2.0;
        multadd(a1, b1, c1);

        System.out.println("\n--- Logaritma Testi ---");
        multadd(1.0, Math.log10(10), Math.log10(20));

        System.out.println("\n--- expSum Metodu Testi ---");
        expSum(2.0);
    }

    // 2. ADIM: multadd Metodu
    // Görevi: a * b + c işlemini yapıp yazdırmak.
    public static void multadd(double a, double b, double c) {
        double result = a * b + c;
        System.out.println(result);
    }

    // 3. ADIM: expSum Metodu
    public static void expSum(double x) {
       

        double a = x;
        double b = Math.exp(-x);           
        double c = Math.sqrt(1 - b);       

        System.out.print("x = " + x + " için sonuç: ");
        multadd(a, b, c);
    }
}



public class Exercise4_6_Multadd {

    public static double multadd(double a, double b, double c) {
        // TODO
        return 0.0;
    }

    public static double expSum(double x) {
        // TODO
        return 0.0;
    }

    public static void main(String[] args) {
        // TODO: test methods
    }
}
