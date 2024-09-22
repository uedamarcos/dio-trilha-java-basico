public class Operadores6b {
    public static void main(String[] args) {
        String nomeUm = "Marcos";
        String nomeDois = "Marcos";
        System.out.println(nomeUm == nomeDois);
        nomeDois = new String("Marcos");
        System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));
    }
}
