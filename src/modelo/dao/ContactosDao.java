package modelo.dao;

import java.util.ArrayList;
import modelo.javabean.Contacto;

public interface ContactosDao {

    // Interfaz que define métodos para la gestión de contactos en la capa de datos

    boolean altaContacto(Contacto contacto);  // Método para agregar un nuevo contacto
    boolean eliminarContacto(Contacto contacto);  // Método para eliminar un contacto existente
    Contacto buscarUno(String nombre);  // Método para buscar un contacto por su nombre
    Contacto buscarTelefono(String telefono);  // Método para buscar un contacto por su número de teléfono
    Contacto buscarEmail(String email);  // Método para buscar un contacto por su dirección de correo electrónico
    ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre);  // Método para buscar contactos por los tres primeros caracteres del nombre
    boolean cambiarDatos(Contacto contacto);  // Método para cambiar la información de un contacto
    ArrayList<Contacto> contactosPorEmpresa(String empresa);  // Método para obtener contactos de una empresa específica
    void exportarContactos(String nombreFichero);  // Método para exportar la lista de contactos a un archivo
    void importarContactos(String nombreFichero);  // Método para importar la lista de contactos desde un archivo
}
