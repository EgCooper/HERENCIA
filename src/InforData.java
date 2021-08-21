import java.util.Date;

public class InforData {
     protected String nombre;
     protected String direccion;
     protected int telefono;
     protected int empleados;
     protected int nit;

    public InforData(String nombre, String direccion, int telefono, int empleados, int nit) {
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setEmpleados(empleados);
        this.setNit(nit);
    }

    public InforData(int cantidad, String productos) {
    }

    public InforData(String nombre, String direccion, int telefono, Date fechacompra, int preciototal, int cantidad, String productos, int codigo) {
    }

    public InforData(String motivo, String nombre, Date fechacompra, Date fechasoporte, String productos, int codigo) {
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getEmpleados() {
        return empleados;
    }

    public void setEmpleados(int empleados) {
        this.empleados = empleados;
    }

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "Infordata :"  +
                 " Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono=" + telefono +
                ", Empleados=" + empleados +
                ", Nit=" + nit ;
    }
}
