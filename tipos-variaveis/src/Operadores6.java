public class Operadores6 {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        System.out.println("numero 1 é igual a número 2? " + simNao);

        if(numero1 > numero2)
            System.out.println("numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.println("numero 1 menor que numero 2");


        simNao = numero1 != numero2;
        System.out.println("numero 1 é diferente de número 2? " + simNao);

        simNao = numero1 > numero2;
        System.out.println("numero 1 é maior de número 2? " + simNao);
    }
}
