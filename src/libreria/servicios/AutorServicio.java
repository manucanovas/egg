
package libreria.servicios;

import java.util.UUID;
import libreria.entidades.Autor;
import persitencia.AutorDAO;

/**
 *
 * @author LENOVO
 */
public class AutorServicio {

     private AutorDAO autorDAO;

    public AutorServicio() {
        autorDAO = new AutorDAO();

    }

    public Autor creaautor(String nombre) {
        Autor autornuevo = new Autor();
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autornuevo.setNombre(nombre);
            autornuevo.setId(UUID.randomUUID().toString().replaceAll("-", ""));
            autornuevo.setAlta(Boolean.TRUE);
            autorDAO.guardarAutor(autornuevo);

            return autornuevo;

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
            return null;
        }

    }

    public void eliminarautor(String nombre) {

        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            autorDAO.eliminarPorNombre(nombre);
        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    public void modificarautor(String nombre, String nuevonombre) {
        Autor aux = null;
        try
        {
            if (nombre == null || nombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            if (nuevonombre == null || nuevonombre.trim().isEmpty())
            {
                throw new Exception("Debe indicar el nombre del autor");
            }
            aux = autorDAO.buscarPorNombre(nombre);
            aux.setNombre(nuevonombre);
            autorDAO.modificarAutor(aux);

        } catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}
