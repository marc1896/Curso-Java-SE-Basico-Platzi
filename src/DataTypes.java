public class DataTypes {
    public static void main(String[] args) {
        //Tipos de datos enteros
        byte bytePositivo = 127;
        byte byteNegativo = -128;

        short shortPositivo  = 32767;
        short shortNegativo = -32768;

        int intPositivo = 2127483647;
        int intNegativo = -2147483648;

        long longPositivo = 9223372036854775807L;
        long longNegativo = -9223372036854775808L;

        //Tipos de datos Punto Flotante
        float floatPositivo = 3.40282346638528860e+38F;
        float floatNegativo = 1.40129846432481707e-45F;

        double doublePositivo = 1.79769313486231570e+308D;
        double doubleNegativo = 4.94065645841246544e-324D;


        //Tipo de dato char
        char letra = 'A';

        //Tipo de dato boolean
        boolean estadoTrue = true;
        boolean estadoFalse = false;
        
        var salary = 1000;//int
        //pension 3%
        var pension = salary*0.03;
        var totalSalary = salary - pension;
        System.out.println("totalSalary = " + totalSalary);

        var textoMensaje = "Hola mundo";
        
        System.out.println("textoMensaje = " + textoMensaje);
    }


}
