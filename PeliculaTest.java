package PooLab.practica_4;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PeliculaTest {
    Pelicula p = new Pelicula("Matrix", "Wachowski", 2010, "Ciencia Ficción", 136);

    @Test
    public void testDatosBasicos() {
        assertEquals("Matrix", p.getTitulo());
        assertEquals(136, p.getDuracion());
    }

    @Test
    public void testGetInformacion() {
        assertTrue(p.getInformacion().contains("Matrix"));
        assertTrue(p.getInformacion().contains("2010"));
    }

    @Test
    public void testEsClasica() {
        Pelicula pClasica = new Pelicula("Casablanca", "Curtiz", 1942, "Romance", 102);
        assertTrue(pClasica.esClasica()); // Más de 25 años
        assertFalse(p.esClasica()); // Menos de 25 años
    }

    @Test
    public void testToString() {
        assertTrue(p.toString().contains("Matrix (2010)"));
    }
}
