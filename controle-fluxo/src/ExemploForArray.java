public class ExemploForArray {
    public static void main(String[] args) {

        String alunos[]={"FELIPE","JONAS","JULIA","MARCOS"};
        // em arrays o índice dos elementos inicia com valor 0 (zero)
        for (int x=0; x<alunos.length; x++){

            System.out.println("O aluno no indice x " + x + " é " + alunos [x] ) ;
        }
    }
}
