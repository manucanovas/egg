
package libreria.servicios;

import java.util.UUID;
import libreria.entidades.Autor;
import libreria.entidades.Editorial;
import libreria.entidades.Libro;
import persitencia.LibroDAO;

/**
 *
 * @author LENOVO
 */
public class LibroServicio {
 private LibroDAO libroDAO;

    public LibroServicio() {
        libroDAO = new LibroDAO();

    }

    public Libro creaLibro(String titulo, Integer anio, Autor autor, Editorial editorial) {
      Libro libronuevo = new Libro();

        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }
            libronuevo.setTitulo(titulo);

            if (anio == null || anio < 0)
            {
                throw new Exception("Debe indicar el año");
            }
            libronuevo.setAnio(anio);

            if (autor == null)
            {
                throw new Exception("Autor nulo");
            }
            libronuevo.setAutor(autor);

            if (editorial == null)
            {
                throw new Exception("Editorial nulo");
            }
            
            libronuevo.setEditorial(editorial);
            //Magia para obtener los ejemplares
            int ejemplares = (int) (Math.random() * 999 + 1);
            int prestados = ejemplares - (int) (Math.random() * 88 + 1);

            libronuevo.setIsbn((long) (int) (Math.random() * 100000 + 1));
            libronuevo.setNroEjemplares(ejemplares);
            libronuevo.setEjemplaresPrestados(prestados);
            libronuevo.setEjemplaresRestantes(ejemplares - prestados);

            libronuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            libronuevo.setAlta(Boolean.TRUE);
            libroDAO.guardarLibro(libronuevo);

            return libronuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminarLibro(String titulo) {

        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }
            libroDAO.eliminaPorTitulo(titulo);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
    
    public Libro buscaLibro(String titulo){
        Libro buscado = null;
        
        try
        {
            if (titulo == null || titulo.trim().isEmpty())
            {
                throw new Exception("Debe indicar el titulo del libro");
            }
            
            buscado = libroDAO.buscaPorTitulo(titulo);
            
            return buscado;
            
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }
        
    }
    
    public Libro buscaISBN(Long isbn){
        Libro buscado = null;
        
        try
        {
            if (isbn == null || isbn<0)
            {
                throw new Exception("Debe indicar el ISBN");
            }
            
            buscado = libroDAO.buscaPorISBN(isbn);
            
            return buscado;
            
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

        
    }
    

//    public void modificarLibro(String titulo, Libro libroAMod) {
//        Libro aux = null;
//            
//        try
//        {
//            if (titulo == null || titulo.trim().isEmpty())
//            {
//                throw new Exception("Debe indicar el titulo de la Libro");
//            }
//            if (libroAMod == null)
//            {
//                throw new Exception("Debe indicar el Libro");
//            }
//            
//                       
//            
//            libroDAO.guardarLibro(aux);
//
//        } catch (Exception e)
//        {
//            System.out.println(e.getMessage());
//        }
//
//    }
//
}
