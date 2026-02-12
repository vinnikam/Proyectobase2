package util;

public class Operaciones {
    public Long sumar (String a, String b){
        if (!a.isEmpty() && !b.isEmpty())
            return Long.parseLong(a)+Long.parseLong(b);
        return null;

    }
    public Long multiplicar (String a, String b){
        if (!a.isEmpty() && !b.isEmpty())
            return Long.parseLong(a)+Long.parseLong(b);
        return null;

    }
}
