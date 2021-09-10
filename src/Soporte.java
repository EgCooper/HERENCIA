import java.util.Date;

public  abstract class Soporte extends Cliente{
    private Date fechasoporte;
    private String motivo;
    public Soporte(String motivo,String nombre ,Date fechacompra,Date fechasoporte,String productos,int codigo){
        super(motivo,nombre,fechacompra,fechasoporte,productos,codigo);
        this.setMotivo(motivo);
        this.setNombre(nombre);
        this.setFechacompra(fechacompra);
        this.setFechasoporte(fechasoporte);
        this.setProductos(productos);
        this.setCodigo(codigo);


    }

    public Date getFechasoporte() {
        return fechasoporte;
    }

    public void setFechasoporte(Date fechasoporte) {
        this.fechasoporte = fechasoporte;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Soporte" +
                "Nombre='" + nombre + '\'' +
                ", Fechacompra=" + fechacompra +
                ", Productos='" + productos + '\'' +
                ", Fechasoporte=" + fechasoporte +
                ", Motivo='" + motivo + '\'' +
                ",Codigo="+ getCodigo();
    }

}
