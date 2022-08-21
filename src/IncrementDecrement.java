public class IncrementDecrement {
    public static void main(String[] args) {
        //Posfijo
        int lives = 5;
        lives--;//Operador decremento
        System.out.println("lives = " + lives);
        lives--;
        System.out.println("lives = " + lives);
        lives++;//Operador incremento
        System.out.println("lives = " + lives);
        lives--;
        System.out.println("lives = " + lives);

        //Prefija
        //Gana un regalo por ganar una vida
        int gift = 100 + ++lives;//prefijo
        System.out.println("gift = " + gift);
    }
}
