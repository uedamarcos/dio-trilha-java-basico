// O sistema terá 3 planos: BASICO, MÉDIO, TURBO 
// BÁSICO: 100 minutos de ligação 
// MÉDIO: 100 minutos de ligação + WhatsApp e Instagram grátis
// TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB YouTube
public class PlanoOperadora2 {
    public static void main(String[] args) {
        String plano = "A" ;
        switch (plano){
            case "T": {
                System.out.println ("5 GB YouTube");
            }
            case "M": {
                System.out.println ("WhatsApp e Instagram grátis");
            }
            case "B": {
                System.out.println ("100 minutos de ligação");
            }
        }
    }
}
