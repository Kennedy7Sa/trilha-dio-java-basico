package AppDeAudio.principal;

import AppDeAudio.modelos.MinhasPreferidas;
import AppDeAudio.modelos.Musica;
import AppDeAudio.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Meu tributo ");
        minhaMusica.setAlbum("Louvores");
        minhaMusica.setGenero("Gospel");
        minhaMusica.setArtista("Oseias");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }
        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }
        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("99 vidas ");
        meuPodcast.setHost("jurandir filho ");
        meuPodcast.setDescricao("Pod de video game e nostalgia");

        for (int i = 0; i < 5000; i++) {
            meuPodcast.reproduz();
        }
        for (int i = 0; i < 1000; i++) {
            meuPodcast.curte();
            
        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
