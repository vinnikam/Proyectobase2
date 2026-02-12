import util.Operaciones;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main");
        Operaciones oper = new Operaciones();
        long resultado = oper.sumar("", true);
        System.out.println(resultado);
    }
}