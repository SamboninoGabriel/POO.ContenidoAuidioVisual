package uni1a;

public class VideoMusical extends ContenidoAudiovisual {
    private String artista;

    public VideoMusical(String titulo, int duracionEnMinutos, String genero, String artista) {
        super(titulo, duracionEnMinutos, genero);
        this.artista = artista;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Video Musical: " + getTitulo());
        System.out.println("Artista: " + artista);
        System.out.println("Género: " + getGenero() + "\n");
    }
}