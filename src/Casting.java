public class Casting {
    public static void main(String[] args) {
        //En un año me dedique a ubicar a 30 perritos
        //Cuantos perritos ubique al mes

        double monthlyDogs = 30.0/12.0;
        System.out.println("monthlyDogs = " + monthlyDogs);

        //Estimacion
        System.out.println("monthlyDogs = " + (int)monthlyDogs);

        //Exatitud
        int a = 30;
        int b = 12;

        System.out.println((double) a/b);
    }
}
