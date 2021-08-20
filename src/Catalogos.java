import java.util.Date;

public class Catalogos extends Proveedores{
    private String modelos;
    private int precios;
    private int codigo;
     private int memoria;
     private int velocidad;
    private String definicion;
    public Catalogos(String nombre, String direccion, int telefono, int empleados, int nit,Date fecha,int cantidad,String productos){
        super(nombre,direccion,telefono,empleados,nit,fecha,cantidad,productos);
        this.setModelos(modelos);
        this.setPrecios(precios);
        this.setCodigo(codigo);
        this.setMemoria(memoria);
        this.setVelocidad(velocidad);
        this.setDefinicion(definicion);

    }



    public String getModelos() {
        return modelos;
    }

    public void setModelos(String modelos) {
        this.modelos = modelos;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getDefinicion() {
        return definicion;
    }

    public void setDefinicion(String definicion) {
        this.definicion = definicion;
    }

    @Override
    public String toString() {
        return "Catalogos{" +
                "modelos='" + modelos + '\'' +
                ", precios=" + precios +
                ", codigo=" + codigo +
                ", memoria=" + memoria +
                ", velocidad=" + velocidad +
                ", definicion='" + definicion + '\'' +
                ", cantidad=" + cantidad +
                ", productos='" + productos + '\'' +
                '}';
    }
}
