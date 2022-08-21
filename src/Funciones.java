public class Funciones {
    public static void main(String[] args) {
        int resultado = suma(3,6);
        System.out.println("El resultado de suma es " + resultado);

    }

    /**
     *Descripcion: Funcion para realizar la suma entre dos numero y retorna el resultado
     *
     * @param a numero 1
     * @param b numero 2
     * @return suma Retorna el resultado de la suma de numero 1 mas numero 2
     * */
    public static int suma(int a, int b){
        int suma =0;
        suma = a + b;
        return suma;
    }
}
