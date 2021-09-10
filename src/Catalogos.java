import interfaces.IReseteable;

import java.util.Date;

public  abstract class  Catalogos extends Proveedores implements IReseteable {
            private String modelos;
            private int precio;
            private int codigo;
             private int memoria;
             private int velocidad;
            private String definicion;
            public Catalogos(String modelos,int precio,int codigo,int memoria,int velocidad,String definicion,int cantidad,String productos){
                super(modelos,precio,codigo,memoria,velocidad,definicion,cantidad,productos);
                this.setProductos(productos);
                this.setCantidad(cantidad);
                this.setModelos(modelos);
                this.setPrecios(precio);
                this.setCodigo(codigo);
                this.setMemoria(memoria);
                this.setVelocidad(velocidad);
                this.setDefinicion(definicion);

            }

            public Catalogos(String nombre, String direccion, int telefono, Date fechacompra, int preciototal, int cantidad, String productos,int codigo) {
                super(nombre,direccion,telefono,fechacompra,preciototal,cantidad,productos,codigo);

            }

            public Catalogos(String motivo, String nombre, Date fechacompra, Date fechasoporte, String productos, int codigo) {
                super(motivo,nombre,fechacompra,fechasoporte,productos,codigo);
            }


            public String getModelos() {
                return modelos;
            }

            public void setModelos(String modelos) {
                this.modelos = modelos;
            }

            public int getPrecios() {
                return precio;
            }

            public void setPrecios(int precio) {
                this.precio = precio;
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
                return "Catalogos :" +
                        " Productos=" + productos +
                        ", Cantidad='" + cantidad + '\''+
                        " Modelos='" + modelos + '\'' +
                        ", Precio=" + precio +
                        ", Codigo=" + codigo +
                        ", Memoria=" + memoria +
                        ", Velocidad=" + velocidad +
                        ", Definicion='" + definicion + '\'';
            }


            @Override
            public void reset() {
                System.out.println(".....Reseteando Monitor.....");

            }
           public void estado(){
        System.out.println("Brillo:"+75 +"%");
    }
    }






