package upm;

public class Usuario {
    private String nombre;
    private String fechaNacimiento;
    private char genero;
    private String correo;
    private String contra;
    public Usuario(String nombre, String fechaNacimiento, char genero, String correo, String contra) {
        this.nombre=nombre;
        this.fechaNacimiento=fechaNacimiento;
        this.contra=contra;
        this.correo=correo;
        this.genero=genero;
    }

    public String getContra() {
        return contra;
    }

    public String getfechaNacimiento() {
        return fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public char getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", genero=" + genero +
                ", correo='" + correo + '\'' +
                ", contra='" + contra + '\'' +
                '}';
    }
}
