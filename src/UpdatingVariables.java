public class UpdatingVariables {
    public static void main(String[] args) {
        int salary = 1000;

        //bono $200.00
        salary += 200;

        //pension $50
        salary -= 50;
        System.out.println("salario mas bono = " + salary);

        //2 horas extra $30 c/u
        //Comida: $45

        salary = salary + (30 * 2) - 45;

        System.out.println("salario total = " + salary);

        //Actualizando cadenas de texto
        String employeeName = "Marco Antonio";
        employeeName += " Hernandez Osorio";
        System.out.println("Nombre completo = " + employeeName);
    }
}
