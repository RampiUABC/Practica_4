package PooLab.practica_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class CatalogoTest {
    Catalogo cat;
    Pelicula p1 = new Pelicula("Shrek", "Andrew Adamson", 2001, "Animación", 90);

    @Before
    public void setup() {
        cat = new Catalogo();
    }

    @Test
    public void testAgregarPelicula() {
        assertEquals(0, cat.getNumeroPeliculas());
        cat.agregarPelicula(p1);
        assertEquals(1, cat.getNumeroPeliculas());
    }

    @Test
    public void testGetPeliculas() {
        assertEquals("El catálogo está vacío", cat.getPeliculas());
        cat.agregarPelicula(p1);
        assertTrue(cat.getPeliculas().contains("Shrek"));
    }

    @Test
    public void testBuscarPelicula() {
        cat.agregarPelicula(p1);
        assertTrue(cat.buscarPeliculaPorTitulo("SHREK").contains("2001"));
        assertTrue(cat.buscarPeliculaPorTitulo("Titanic").contains("No se encontró"));
    }
}