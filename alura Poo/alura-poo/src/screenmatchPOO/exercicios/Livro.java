package screenmatchPOO.exercicios;

public class Livro {
    String titulo;
    String autor;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;

    }

    public void exibirDetalhes() {
        System.out.println(String.format("Titulo do livro %s autor %s ", titulo, autor));

    }


}