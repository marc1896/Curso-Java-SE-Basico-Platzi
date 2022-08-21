public class IfStatement {
    public static void main(String[] args) {
        var opt = 17;
        var opt1 = 18;
        if (opt>18){
            System.out.println("Es menor de edad");
        }else{
            System.out.println("Es mayor de edad");
        }

        //Operadores de asignacion
        System.out.println(opt == opt1);
        System.out.println(opt != opt1);

        //Operadores Relacionales
        System.out.println(opt > opt1);
        System.out.println(opt < opt1);
        System.out.println(opt >= opt1);
        System.out.println(opt <= opt1);
    }
}
