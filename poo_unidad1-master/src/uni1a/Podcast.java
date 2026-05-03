package uni1a;

public class Podcast extends ContenidoAudiovisual {
    private String anfitrion;

    public Podcast(String titulo, int duracionEnMinutos, String genero, String anfitrion) {
        super(titulo, duracionEnMinutos, genero);
        this.anfitrion = anfitrion;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Podcast: " + getTitulo());
        System.out.println("Anfitrión: " + anfitrion);
        System.out.println("Duración: " + getDuracionEnMinutos() + " min\n");
    }
}