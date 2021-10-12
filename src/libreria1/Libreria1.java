package libreria1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import libreria.servicios.AutorServicio;
import libreria.servicios.EditorialServicio;
import libreria.servicios.LibroServicio;

public class Libreria1 {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Libreria1PU");
        EntityManager em = emf.createEntityManager();

        AutorServicio au = new AutorServicio();
        EditorialServicio editorSv = new EditorialServicio();
        LibroServicio lu = new LibroServicio();

        Autor au1 = au.creaautor("Cortazar");
        //  Editorial ed1 = em.creaEditorial("Planeta");
        //  Libro l1 = lu.creaLibro("RAYUELA", 1974, au1, ed1);

        au.modificarautor("borges", "Jose Luis Borges");
        au.eliminarautor("Jose Luis Borges");
        Menu m = new Menu();

        m.menu();
        /**
         * Editorial edit1 = new Editorial("Minotauro", true); Editorial edit2 =
         * new Editorial("Sudamericana", true); Editorial edit3 = new
         * Editorial("Penguin Random House", true); Editorial edit4 = new
         * Editorial("Bruguera", true); Editorial edit5 = new
         * Editorial("Planeta", true); Editorial edit7 = new Editorial("Emece",
         * true); Editorial edit8 = new Editorial("Siruela", true); Editorial
         * edit9 = new Editorial("Companhia das Letras", true); Editorial edit10
         * = new Editorial("New Directions", true); Editorial edit11 = new
         * Editorial("Lippincott's Monthly Magazine", true); Editorial edit12 =
         * new Editorial("Santillana", true); Editorial edit13 = new
         * Editorial("Estrada", true); Editorial edit14 = new
         * Editorial("Combel", true);
         *
         * editorSv.creaEditorial(edit1); editorSv.creaEditorial(edit2);
         * editorSv.creaEditorial(edit3); editorSv.creaEditorial(edit4);
         * editorSv.creaEditorial(edit5); editorSv.creaEditorial(edit7);
         * editorSv.creaEditorial(edit8); editorSv.creaEditorial(edit9);
         * editorSv.creaEditorial(edit10); editorSv.creaEditorial(edit11);
         * editorSv.creaEditorial(edit12); editorSv.creaEditorial(edit13);
         * editorSv.creaEditorial(edit14);
         *
         * Libro lb1 = new Libro("El señor de los anillos", 1937, 5, 2, 3, true,
         * aut1, edit1); Libro lb2 = new Libro("El señor de los anillos 2",
         * 1939, 3, 1, 2, true, aut1, edit1); Libro lb3 = new Libro("El señor de
         * los anillos 3", 1940, 4, 2, 2, true, aut1, edit1); Libro lb4 = new
         * Libro("Cien años de soledad", 1967, 5, 1, 4, true, aut2, edit2);
         * Libro lb5 = new Libro("El amor en tiempos del colera", 1985, 5, 2, 3,
         * true, aut2, edit3); Libro lb6 = new Libro("Cronica de una muerte
         * anunciada", 1981, 5, 4, 1, true, aut2, edit4); Libro lb7 = new
         * Libro("Del amor y otros demonios", 1994, 5, 5, 0, true, aut2, edit2);
         * Libro lb8 = new Libro("El alquimista", 1988, 5, 0, 5, true, aut3,
         * edit5); Libro lb9 = new Libro("Veronika decide morir", 1998, 5, 1, 4,
         * true, aut3, edit5); Libro lb10 = new Libro("Adulterio", 2014, 5, 4,
         * 1, true, aut3, edit5); Libro lb11 = new Libro("Manual del guerrero de
         * la luz", 1997, 5, 2, 3, true, aut3, edit7); Libro lb12 = new
         * Libro("Ficciones", 1944, 5, 0, 5, true, aut3, edit7); Libro lb13 =
         * new Libro("La biblioteca de Babel", 1941, 3, 1, 2, true, aut4,
         * edit8); Libro lb14 = new Libro("El libro de arena", 1975, 7, 3, 4,
         * true, aut4, edit7); Libro lb15 = new Libro("El hacedor", 1917, 4, 2,
         * 2, true, aut4, edit2); Libro lb16 = new Libro("Labyrinths", 1962, 6,
         * 2, 4, true, aut4, edit10); Libro lb17 = new Libro("El retrato de
         * Dorian Gray", 1890, 5, 1, 4, true, aut5, edit11); Libro lb18 = new
         * Libro("El principe feliz y otros cuentos", 1888, 5, 0, 5, true, aut5,
         * edit12); Libro lb19 = new Libro("El fantasma de Canterville", 1887,
         * 5, 4, 1, true, aut5, edit13); Libro lb20 = new Libro("El gigante
         * egoista", 1888, 5, 1, 4, true, aut5, edit14);
         *
         * libroSv.crearLibro(lb1); libroSv.crearLibro(lb2);
         * libroSv.crearLibro(lb3); libroSv.crearLibro(lb4);
         * libroSv.crearLibro(lb5); libroSv.crearLibro(lb6);
         * libroSv.crearLibro(lb7); libroSv.crearLibro(lb8);
         * libroSv.crearLibro(lb9); libroSv.crearLibro(lb10);
         * libroSv.crearLibro(lb11); libroSv.crearLibro(lb12);
         *
         * libroSv.crearLibro(lb13); libroSv.crearLibro(lb14);
         * libroSv.crearLibro(lb15); libroSv.crearLibro(lb16);
         * libroSv.crearLibro(lb17); libroSv.crearLibro(lb18);
         * libroSv.crearLibro(lb19); libroSv.crearLibro(lb20);
*
         */
    }

}
