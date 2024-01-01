
package persona;


public class TipoCliente {
    String descripcion;
    double porcentajeDescuento;

    public TipoCliente(String descripcion, double porcentajeDescuento) {
        this.descripcion = descripcion;
        this.porcentajeDescuento = porcentajeDescuento;
    }   

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }
    
}
