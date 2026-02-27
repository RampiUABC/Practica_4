package PooLab.practica_4;

/**
 * 
 * Clase que representa una película con sus datos básicos.
 * 
 * Métodos que utiliza: Ninguno externo.
 * 
 * @author Ramiro Maldonado
 */
public class Pelicula {
    // atributos
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion; // En minutos

    /**
     * 
     * Clase que representa una película con sus datos básicos.
     * 
     * Métodos que utiliza: Ninguno externo.
     * 
     * @author Ramiro Maldonado
     */
    public Pelicula(String titulo, String director, int anio, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anio;
        this.genero = genero;
        this.duracion = duracion;
    }

    /**
     * 
     * Clase que representa una película con sus datos básicos.
     * 
     * Métodos que utiliza: Ninguno externo.
     * 
     * @author Ramiro Maldonado
     */
    public Boolean esClasica() {

        int antiguedad = 2026 - this.anioEstreno; // se calcula restando

        if (antiguedad > 25) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 
     * Obtiene una cadena con la información detallada de la película.
     * 
     * Métodos que utiliza: this.esClasica().
     * 
     * @author Ramiro Maldonado
     */
    public String getInformacion() {
        return "Título: " + this.titulo + " | Director: " + this.director + " | Año: " + this.anioEstreno
                + " | Género: " + this.genero + " | Clásica: " + this.esClasica();
    }

    /**
     * 
     * Devuelve el título y año de la película como representación en texto.
     * 
     * Métodos que utiliza: Ninguno.
     * 
     * @author Ramiro Maldonado
     */
    @Override
    public String toString() {
        return this.titulo + " (" + this.anioEstreno + ")";
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDirector() {
        return this.director;
    }

    public int getAñoEstreno() {
        return this.anioEstreno;
    }

    public String getGenero() {
        return this.genero;
    }

    public int getDuracion() {
        return this.duracion;
    }
}
