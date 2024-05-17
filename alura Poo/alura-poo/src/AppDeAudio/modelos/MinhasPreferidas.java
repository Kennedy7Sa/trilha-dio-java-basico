package AppDeAudio.modelos;

public class MinhasPreferidas {
    public void inclui(Audio audio){
        if (audio.getClassificacao()>=9) {
            System.out.println(String.format("%s é considerado sucesso absoluto e preferido por todos ",audio.getTitulo()));
        }else {
            System.out.println("Excelente opção para ser ouvido depois ");
        }
    }
}
