public class AboutMe {
  public static void main(String[] args) {
    String nome = args[0];
    String sobrenome = args[1];
    int idade = Integer.valueOf(args[2]);
    double altura = Double.valueOf(args[3]);

    System.out.println("Ola, me chamo " + nome + " " + sobrenome);
    System.out.println("Tenho " + idade  + " anos ");
    System.out.println("Minha altura é "  + altura + " m");


            // para executar essa classe MinhaClasse no prompt do DOS,
        // abra o prompt do DOS:
        // digite cd C:\dev\projetos\estudos\dio-trilha-java-basico\java-terminal\java-terminal\bin
        //
        // digite no prompt do DOS:
        // java AboutMe Marcos Ueda 56 1.75
        // 
        // Resultado abaixo:
        //Ola, me chamo Marcos Ueda
        //Tenho 56 anos
        //Minha altura é 1.75 m
        //
  }  
}
