package uni1a;

public class SerieDeTV extends ContenidoAudiovisual {
    private int totalTemporadas;
    private Temporada temporadaActual;

    // Etapa 2: Clase Temporada dentro de SerieDeTV (Composición)
    public static class Temporada {
        private int episodios;
        public Temporada(int episodios) { this.episodios = episodios; }
        public int getEpisodios() { return episodios; }
    }

    public SerieDeTV(String titulo, int duracion, String genero, int total, Temporada temp) {
        super(titulo, duracion, genero);
        this.totalTemporadas = total;
        this.temporadaActual = temp;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Serie: " + getTitulo());
        System.out.println("Temporadas: " + totalTemporadas);
        System.out.println("Episodios Temp: " + (temporadaActual != null ? temporadaActual.getEpisodios() : "0") + "\n");
    }
}