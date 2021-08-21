import java.util.Date;
import java.util.List;

public class Proveedores extends InforData{

    protected Date fecha;
    protected int cantidad;
    protected String productos;

    public Proveedores(String nombre, String direccion, int telefono, int empleados, int nit,Date fecha,int cantidad,String productos){
        super(nombre,direccion,telefono,empleados,nit);

        this.setFecha(fecha);
        this.setCantidad(cantidad);
        this.setProductos(productos);

    }

    public Proveedores(String modelos, int precios, int codigo, int memoria, int velocidad, String definicion, int cantidad, String productos) {
        super(cantidad,productos);
    }

    public Proveedores(String nombre, String direccion, int telefono, Date fechacompra, int preciototal, int cantidad, String productos,int codigo) {
        super(nombre,direccion,telefono,fechacompra,preciototal,cantidad,productos,codigo);
    }

    public Proveedores(String motivo, String nombre, Date fechacompra, Date fechasoporte, String productos, int codigo) {
        super(motivo,nombre,fechacompra,fechasoporte,productos,codigo);
    }


    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Proveedores :"  +
                 " Fecha=" + fecha +
                ", Cantidad=" + cantidad +
                ", Productos='" + productos + '\'' +
                ", Nombre='" + nombre + '\'' +
                ", Direccion='" + direccion + '\'' +
                ", Telefono=" + telefono +
                ", Empleados=" + empleados +
                ", Nit=" + nit ;
    }
}
