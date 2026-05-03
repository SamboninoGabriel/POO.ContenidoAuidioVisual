package uni1a;

public class Pelicula extends ContenidoAudiovisual {
    private String estudio;
    private Actor actorPrincipal;

    // Etapa 2: Clase Actor dentro de Pelicula (Agregación)
    public static class Actor {
        private String nombre;
        public Actor(String nombre) { this.nombre = nombre; }
        public String getNombre() { return nombre; }
    }

    public Pelicula(String titulo, int duracion, String genero, String estudio, Actor actor) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
        this.actorPrincipal = actor;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Película: " + getTitulo());
        System.out.println("Actor: " + (actorPrincipal != null ? actorPrincipal.getNombre() : "N/A"));
        System.out.println("Estudio: " + estudio + "\n");
    }
}