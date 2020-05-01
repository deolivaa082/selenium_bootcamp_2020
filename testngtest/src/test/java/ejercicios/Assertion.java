package ejercicios;

public class Assertion {

    public static void main(String[] args){

        assert comparaTexto("joe", "joe"):"texto diferente";
        assert rango(20,4, 34):"numero no esta en rango";
        assert comparaTextoNumero("34", 33):"numero no es igual";
    }

    public static boolean comparaTexto(String texto1, String texto2){
        if (texto1==texto2)
            return true;
        else
            return false;

    }

    public static boolean comparaTextoNumero(String text, Integer number){
       String numtxt = number.toString();


        if (text.equals(numtxt))
            return true;
        else
            return false;

    }

    public static boolean rango(int num, int min, int max){
        if (num >= min && num <= max)
            return true;
        else
            return false;
    }


}
