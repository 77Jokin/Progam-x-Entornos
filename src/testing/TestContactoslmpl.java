package testing;

import java.time.LocalDate;
import java.util.Scanner;

import modelo.dao.AutorContactos;
import modelo.dao.AutorDaoImplArrayList;

public class TestContactosImpl {

    // Declaración de variables estáticas para el acceso a la capa de datos y la entrada de usuario
    private static AutorContactos adao;
    private static Scanner leer;

    // Inicialización estática de las variables
    static {
        adao = new AutorContactos();  // Inicialización del objeto para acceder a los contactos en la capa de datos
        leer = new Scanner(System.in);  // Inicialización del objeto para leer la entrada del usuario
    }

    public static void main(String[] args) {
        Contacto contacto = null;

        // Descomenta y ejecuta una de las siguientes opciones:

        // Opción 1: Alta de un nuevo contacto
        //altaContacto();

        // Opción 2: Eliminación de un contacto existente
        //eliminarContacto();

        // Opción 3: Lectura de un contacto por nombre
        //leerUno();

        // Opción 4: Modificación de un contacto existente
        //modificarContacto();
    }

    // Método para eliminar un contacto por nombre e imprimir la lista resultante
    public static void eliminarContacto() {
        System.out.println(adao.eliminarContacto("Pepe"));
        for (Contacto contacto : adao.buscarTodos()) {
            System.out.println(contacto);
        }
    }

    // Método para modificar un contacto existente e imprimir antes y después de la modificación
    public static void modificarContacto() {
        Contacto contacto = new Contacto("Pepe", "Mel", "62001409", "PepeMel@gmail.com", "Melit");
        System.out.println(adao.buscarUno("Pepe"));
        System.out.println(adao.modificarAutor(contacto));
        System.out.println(adao.buscarUno("Pepe"));
    }

    // Método para leer un contacto por nombre e imprimirlo si existe
    public static void leerUno() {
        String nombre = leer.next();
        Contacto contacto = adao.buscarUno(nombre);
        if (contacto != null)
            System.out.println(contacto);
        else
            System.out.println("Este contacto no existe");
    }

    // Método para agregar un nuevo contacto e imprimir la lista resultante
    public static void altaContacto() {
        Contacto contactoNew = new Contacto("Alonso", "Negro", "62111111", "Negroº1@gmail.com", "IFP");
        System.out.println("filas insertadas : " + adao.altaContacto(contactoNew));
        for (Contacto contacto : adao.buscarTodos()) {
            System.out.println(contacto);
        }
    }
}