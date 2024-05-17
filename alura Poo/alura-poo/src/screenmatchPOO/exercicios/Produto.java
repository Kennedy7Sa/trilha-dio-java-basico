package screenmatchPOO.exercicios;

public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public double setPreco(double preco) {
        this.preco = preco;
        return preco;
    }

    public double aplicaDeconto(double percentual) {
        double desconto = preco * (percentual/100);
        preco -=desconto;
        return desconto;
    }


}
