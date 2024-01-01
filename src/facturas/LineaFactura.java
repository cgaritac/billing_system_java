
package facturas;

public class LineaFactura {
    int cantidad;
    String descripcionProd;
    double precio;

    public LineaFactura(int cantidad, String descripcionProd, double precio) {
        this.cantidad = cantidad;
        this.descripcionProd = descripcionProd;
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcionProd() {
        return descripcionProd;
    }

    public void setDescripcionProd(String descripcionProd) {
        this.descripcionProd = descripcionProd;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
    
}
