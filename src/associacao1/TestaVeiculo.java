
package associacao1;

/**
 *
 * @author timoteodimapereira
 */
public class TestaVeiculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Veiculo v = new Veiculo("JHL- 9811", 2009, 
                new Pessoa("007", "Timóteo ", 38, 
                        new  Endereco("SHT ", 01)));
        
        System.out.println(v);
       
    }
    
}
