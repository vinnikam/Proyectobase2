import util.Operaciones;

public class Main {
    public static void main(String[] args) {

        System.out.println("Main");
        Operaciones oper = new Operaciones();
        Long resultado = oper.sumar("", "");
        if (resultado != null)
            System.out.println(resultado);
        else
            System.out.println("Datos en blanco no se puede sumar");
    }
}