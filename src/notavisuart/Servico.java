package notavisuart;

import javax.swing.JTextField;

public class Servico {
    //Variaveis
    private String nomeServico;
    private float valorServico;
    private float valorTotal;
    private int quantiServico;
    
    //Metodo Construtor
    public Servico(String nomeServico, float valorServico, int quantiServico, float valortotalservico){    
        this.nomeServico = nomeServico;
        this.valorServico = valorServico;
        this.quantiServico = quantiServico;
        this.valorTotal = valortotalservico;
    }
       
    //Metodos Acessores e Modificadores
    public String getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(String nomeServico) {
        this.nomeServico = nomeServico;
    }

    public float getValorServico() {
        return valorServico;
    }

    public void setValorServico(float valorServico) {
        this.valorServico = valorServico;
    }

    public int getQuantiServico() {
        return quantiServico;
    }

    public void setQuantiServico(int quantiServico) {
        this.quantiServico = quantiServico;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }
      
}
