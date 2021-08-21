import java.util.Date;

public class Cliente extends Catalogos {
     protected String nombre;
     protected String direccion;
     protected int telefono;
     protected Date fechacompra;
    protected int preciototal;
    protected int cantidad;
    public Cliente(String nombre,String direccion,int telefono, Date fechacompra, int preciototal, int cantidad,String productos,int codigo){
        super(nombre,direccion,telefono,fechacompra,preciototal,cantidad,productos,codigo);
        this.setNombre(nombre);
        this.setDireccion(direccion);
        this.setTelefono(telefono);
        this.setFechacompra(fechacompra);
        this.setPreciototal(preciototal);
        this.setCantidad(cantidad);
        this.setProductos(productos);
        this.setCodigo(codigo);
    }

    public Cliente(String motivo, String nombre, Date fechacompra, Date fechasoporte, String productos, int codigo) {
        super(motivo,nombre,fechacompra,fechasoporte,productos,codigo);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public int getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public Date getFechacompra() {
        return fechacompra;
    }

    public void setFechacompra(Date fechacompra) {
        this.fechacompra = fechacompra;
    }

    public int getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(int preciototal) {
        this.preciototal = preciototal;
    }

    @Override
    public int getCantidad() {
        return cantidad;
    }

    @Override
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono=" + telefono +
                ", Fechacompra=" + fechacompra +
                ", Preciototal=" + preciototal +
                ", Cantidad=" + cantidad +
                ", Productos='" + productos + '\'' +
                ", Codigo="+getCodigo()
                ;
    }
}
