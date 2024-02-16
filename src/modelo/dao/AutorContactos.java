package modelo.dao;

import java.time.LocalDate;
import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AutorContactos implements ContactosDao {

    private ArrayList<Contacto> contactos;

    // Constructor que inicializa la lista de contactos y carga datos iniciales
    public AutorContactos() {
        contactos = new ArrayList<>();
        cargardatos();
    }

    // Método privado para cargar datos iniciales en la lista de contactos
    private void cargardatos() {
        contactos.add(new Contacto("Jokin", "Mel", "620543698", "Mel@gmail.com", "Melit"));
        contactos.add(new Contacto("Rubeng", "Peraita", "604943790", "Ruben@gmail.com", "Ifp"));
        contactos.add(new Contacto("Alonso", "Blanco", "679261039", "Alonsoblanco@gmail.com", "Ifp"));
    }

    // Implementación del método altaContacto de la interfaz ContactosDao
    @Override
    public boolean altaContacto(Contacto contacto) {
        if (!contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        } else
            return false;
    }

    // Implementación del método eliminarContacto de la interfaz ContactosDao
    @Override
    public boolean eliminarContacto(Contacto contacto) {
        return contactos.remove(contacto);
    }

    // Implementación del método buscarUno de la interfaz ContactosDao
    @Override
    public Contacto buscarUno(String nombre) {
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        int pos = contactos.indexOf(contacto);
        if (pos == -1)
            return null;
        else
            return contactos.get(pos);
    }

    // Implementación del método buscarTelefono de la interfaz ContactosDao
    @Override
    public Contacto buscarTelefono(String telefono) {
        for (Contacto ele : contactos) {
            if (telefono.equals(ele.getTelefono()))
                return ele;
        }
        return null;
    }

    // Implementación del método buscarEmail de la interfaz ContactosDao
    @Override
    public Contacto buscarEmail(String email) {
        for (Contacto ele : contactos) {
            if (email.equals(ele.getEmail()))
                return ele;
        }
        return null;
    }

    // Otros métodos de la interfaz ContactosDao sin implementación (pendientes)

}