// O sistema terá 3 planos: BASICO, MÉDIO, TURBO 
// BÁSICO: 100 minutos de ligação 
// MÉDIO: 100 minutos de ligação + WhatsApp e Instagram grátis
// TURBO: 100 minutos de ligação + WhatsApp e Instagram grátis + 5 GB YouTube
public class PlanoOperadora {
    public static void main(String[] args) {
        String plano = "B" ;// M / T
        if(plano == "B"){
            System.out.println ("100 minutos de ligação");
        }
        if(plano == "M"){
            System.out.println ("100 minutos de ligação");
            System.out.println ("WhatsApp e Instagram grátis");
        }
        if(plano == "T"){
            System.out.println ("100 minutos de ligação");
            System.out.println ("WhatsApp e Instagram grátis");
            System.out.println ("5 GB YouTube");
        }
    }
}
