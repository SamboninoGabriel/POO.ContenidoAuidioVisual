package poo;
import uni1a.*;

public class PruebaAudioVisual {
    public static void main(String[] args) {
        System.out.println ("CONTENIDO AUDIOVISUAL");

        // Objetos de apoyo para las clases con inner classes
        Pelicula.Actor actor = new Pelicula.Actor("Sam Worthington");
        SerieDeTV.Temporada temp = new SerieDeTV.Temporada(10);
        Documental.Investigador inv = new Documental.Investigador("Neil deGrasse Tyson");

        // Arreglo de 5 posiciones para cubrir todas las clases (Etapa 5)
        ContenidoAudiovisual[] lista = new ContenidoAudiovisual[5];
        
        // Clases Originales con Relaciones (Etapa 2)
        lista[0] = new Pelicula("Avatar", 162, "Ciencia Ficción", "Lightstorm", actor);
        lista[1] = new SerieDeTV("Breaking Bad", 45, "Drama", 5, temp);
        lista[2] = new Documental("Cosmos", 60, "Ciencia", "Espacio", inv);
        
        // Nuevas Subclases (Etapa 4)[cite: 12]
        lista[3] = new VideoMusical("Blinding Lights", 4, "Synth-pop", "The Weeknd");
        lista[4] = new Podcast("The Wild Project", 120, "Entrevistas", "Jordi Wild");

        // Bucle para mostrar todo (Sistema Funcional)[cite: 12]
        for (ContenidoAudiovisual c : lista) {
            if (c != null) {
                c.mostrarDetalles();
            }
        }
    }
}