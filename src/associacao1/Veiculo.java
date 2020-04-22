package associacao1;

/**
 *
 * @author timoteodimapereira
 */
public class Veiculo {
   private String placa;
   private int ano;
   private Pessoa proprietario;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Pessoa getProprietario() {
        return proprietario;
    }

    public void setProprietario(Pessoa proprietario) {
        this.proprietario = proprietario;
    }

    public Veiculo(String placa, int ano, Pessoa proprietario) {
        this.placa = placa;
        this.ano = ano;
        this.proprietario = proprietario;
    }

    public String toString(){
        return "****DADOS DO VEÍCULO*****" + 
                "\n Placa: "+getPlaca()+
                "\n Ano: "+getAno()+
                "\n Dados do Proprietário: "+ getProprietario();
               
    }
}
