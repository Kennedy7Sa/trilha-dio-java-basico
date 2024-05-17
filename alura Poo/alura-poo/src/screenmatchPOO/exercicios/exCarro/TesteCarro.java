package screenmatchPOO.exercicios.exCarro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuCarro = new ModeloCarro();
        meuCarro.definirModelo("Fox");
        meuCarro.definirPrecos(35000,31000,27000);
        meuCarro.exibirInfo();

    }
}
