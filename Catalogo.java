
package PooLab.practica_4;

import java.util.ArrayList;

/**
 * 
 * Clase que gestiona una lista de objetos Pelicula.
 * 
 * Métodos que utiliza: ArrayList.
 * 
 * @author Ramiro Maldonado
 */
public class Catalogo {
    private ArrayList<Pelicula> peliculas;

    /**
     * 
     * Constructor que inicializa la lista de películas vacía.
     * 
     * Métodos que utiliza: ArrayList().
     * 
     * @author Ramiro Maldonado
     */
    public Catalogo() {
        this.peliculas = new ArrayList<>();
    }

    /**
     * 
     * Agrega una película a la lista del catálogo.
     * 
     * Métodos que utiliza: add() de ArrayList.
     * 
     * @author Ramiro Maldonado
     */
    public void agregarPelicula(Pelicula pelicula) {
        this.peliculas.add(pelicula);
    }

    /**
     * 
     * Obtiene la cantidad de películas en el catálogo.
     * 
     * Métodos que utiliza: size() de ArrayList.
     * 
     * @author Ramiro Maldonado
     */
    public int getNumeroPeliculas() {
        return this.peliculas.size();
    }

    /**
     * 
     * Obtiene un texto con la información de todas las películas.
     * 
     * Métodos que utiliza: isEmpty() de ArrayList, getInformacion() de Pelicula.
     * 
     * @author Ramiro Maldonado
     */
    public String getPeliculas() {
        if (this.peliculas.isEmpty()) {
            return "El catálogo está vacío";
        }

        String resultado = "";
        for (Pelicula p : this.peliculas) {
            resultado += p.getInformacion() + "\n";
        }
        return resultado;
    }

    /**
     * 
     * Busca una película por título ignorando mayúsculas y minúsculas.
     * 
     * Métodos que utiliza: getTitulo() y getInformacion() de Pelicula,
     * toLowerCase() y contains() de String.
     * 
     * @author Ramiro Maldonado
     */
    public String buscarPeliculaPorTitulo(String titulo) {
        for (Pelicula p : this.peliculas) {
            if (p.getTitulo().toLowerCase().contains(titulo.toLowerCase())) {
                return p.getInformacion();
            }
        }
        return "No se encontró la película con título: " + titulo;
    }

    /**
     * 
     * Devuelve un texto con la cantidad de películas del catálogo.
     * 
     * Métodos que utiliza: size() de ArrayList.
     * 
     * @author Ramiro Maldonado
     */
    @Override
    public String toString() {
        return "Catálogo con " + this.peliculas.size() + " películas.";
    }
}