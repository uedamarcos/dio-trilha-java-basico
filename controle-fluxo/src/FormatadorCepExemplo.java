public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            //String cepFormatado = formatarCep("23765064");
              String cepFormatado = formatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (CepInvidoException e) {
            // TODO Auto-generated catch block
            System.out.println("O cep não corresponde com as regras de negócio");
        }
    }
    static String formatarCep(String cep) throws CepInvidoException{
        if(cep.length() !=8)
            throw new CepInvidoException();
        //simulando um cep formatado
        return "23.765-064";
    }
}
