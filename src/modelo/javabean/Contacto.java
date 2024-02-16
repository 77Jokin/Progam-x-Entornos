package modelo.javabean;

import java.util.Objects;

public class Contacto {

    // Atributos que representan la información del contacto
    private String Nombre;
    private String Apellidos;
    private String Telefono;
    private String Email;
    private String Empresa;

    // Constructor que inicializa los atributos con valores proporcionados
    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        super();
        Nombre = nombre;
        Apellidos = apellidos;
        Telefono = telefono;
        Email = email;
        Empresa = empresa;
    }

    // Constructor vacío (TODO: puede requerir implementación)
    public Contacto() {
        // TODO: puede requerir implementación específica
    }

    // Métodos getter y setter para acceder y modificar los atributos

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmpresa() {
        return Empresa;
    }

    public void setEmpresa(String empresa) {
        Empresa = empresa;
    }

    // Método hashCode generado automáticamente para facilitar el uso en estructuras de datos

    @Override
    public int hashCode() {
        return Objects.hash(Apellidos, Email, Empresa, Nombre, Telefono);
    }

    // Método equals para comparar objetos Contacto

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        return Objects.equals(Apellidos, other.Apellidos) && Objects.equals(Email, other.Email)
                && Objects.equals(Empresa, other.Empresa) && Objects.equals(Nombre, other.Nombre)
                && Objects.equals(Telefono, other.Telefono);
    }

    // Método toString para obtener una representación en cadena del objeto

    @Override
    public String toString() {
        return "Contacto [Nombre=" + Nombre + ", Apellidos=" + Apellidos + ", Telefono=" + Telefono + ", Email=" + Email
                + ", Empresa=" + Empresa + "]";
    }
}