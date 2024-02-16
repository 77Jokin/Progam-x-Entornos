package aplicaciones;

import java.time.LocalDate;
import java.util.Scanner;

import modelo.dao.AutorContactos;
import modelo.javabean.Contacto;

public class AppGestionContactos {

    // Declaración de variables estáticas para el acceso a la capa de datos y la entrada de usuario
    private static AutorContactos adao;
    private static Scanner leer;

    // Inicialización estática de las variables
    static {
        adao = new AutorContactos();  // Inicialización del objeto para acceder a los contactos en la capa de datos
        leer = new Scanner(System.in);  // Inicialización del objeto para leer la entrada del usuario
    }

    // Método para imprimir todos los contactos almacenados
    public static void procLeerTodos() {
        for (Contacto contacto: adao.buscarTodos()) {
            System.out.println(contacto);
        }
    }

    // Método para agregar un nuevo contacto
    public static void procAltaContacto() {
        Contacto contacto = new Contacto();

        // Lectura de información del nuevo contacto desde la entrada del usuario
        contacto.setNombre(leer.next());
        String apellidos = leer.next();
        contacto.setApellidos(apellidos);
        String email = leer.next();
        contacto.setEmail(email);
        String telefono = leer.next();
        contacto.setTelefono(telefono);
        String empresa = leer.next();
        contacto.setEmpresa(empresa);

        // Intento de agregar el contacto y mensaje correspondiente
        if (adao.altaContacto(contacto) == 1)
            System.out.println("Contacto agregado satisfactoriamente");
        else
            System.out.println("Problemas al agregar el contacto");
    }

    // Método para buscar y mostrar un contacto específico
    public static void leerContacto() {
        System.out.print("dame el contacto : ");
        String numero = leer.next();
        Contacto contacto = adao.buscarUno(numero);
        if (contacto != null)
            System.out.println("Tu contacto elegido : " + contacto);
        else
            System.out.println("Contacto no encontrado");
    }
}