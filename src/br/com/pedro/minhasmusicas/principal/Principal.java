package br.com.pedro.minhasmusicas.principal;

import br.com.pedro.minhasmusicas.modelos.MinhasPreferidas;
import br.com.pedro.minhasmusicas.modelos.Musica;
import br.com.pedro.minhasmusicas.modelos.Podcast;

public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Ricochet");
        minhaMusica.setCantor("Faith no More");
        minhaMusica.setGenero("Rock");
        minhaMusica.setAlbum("King for a day...");

        for (int i = 0; i < 1000; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 50; i++) {
            minhaMusica.curte();
        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("Mano a Mano");
        meuPodcast.setApresentador("Mano Brown");

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
