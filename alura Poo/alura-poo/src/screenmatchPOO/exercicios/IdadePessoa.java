package screenmatchPOO.exercicios;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public int setIdade(int idade) {
        this.idade = idade;
        return idade;
    }
    public void verificarIdade(int idade){
        if (idade>=18){
            System.out.println("maior de idade ");
        }else{
            System.out.println("menor de idade");
        }

    }

}
