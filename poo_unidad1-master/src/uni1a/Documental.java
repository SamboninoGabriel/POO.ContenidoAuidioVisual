package uni1a;

public class Documental extends ContenidoAudiovisual {
    private String tema;
    private Investigador investigador;

    // Etapa 2: Clase Investigador dentro de Documental (Asociación)
    public static class Investigador {
        private String nombre;
        public Investigador(String nombre) { this.nombre = nombre; }
        public String getNombre() { return nombre; }
    }

    public Documental(String titulo, int duracion, String genero, String tema, Investigador inv) {
        super(titulo, duracion, genero);
        this.tema = tema;
        this.investigador = inv;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Documental: " + getTitulo());
        System.out.println("Tema: " + tema);
        System.out.println("Investigador: " + (investigador != null ? investigador.getNombre() : "N/A") + "\n");
    }
}