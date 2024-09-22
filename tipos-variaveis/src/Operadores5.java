public class Operadores5 {
    public static void main(String[] args) {
        int a,b;
        String resultado="";
        a = 5;
        b = 6;
        if(a==b)
            resultado = "verdadeiro";
        else
            resultado = "falso";
        System.out.println(resultado);


        String resultado2 = a==b ? "verdadeiro" : "falso";
        System.out.println(resultado2);
    }
}
