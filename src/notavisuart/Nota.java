package notavisuart;

public class Nota {
    //Variaiveis
    private String nomeCliente;
    private String descricao;
    private Servico novo;
    
    //Metodo Construtor
    public Nota(String nomeCliente, Servico novo) {
        this.nomeCliente = nomeCliente;
    }
      
    //Metodos Acessores e Modificadores
    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public void statusAtual(){
        System.out.println("Cliente da Nota: " + this.getNomeCliente());
        System.out.println("Descrição da Nota: " + this.getDescricao());
    }
      
}
