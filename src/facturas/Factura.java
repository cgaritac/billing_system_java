
package facturas;

import java.util.ArrayList;
import java.util.List;
import persona.Cliente;

public class Factura {
    Cliente cliente;
    List<LineaFactura> lineas = new ArrayList<LineaFactura>();
    double descuentoCliente;
    double descuentoAdicional;
    double subTotal;
    double total;

    public double getDescuentoCliente() {
        return descuentoCliente;
    }

    public void setDescuentoCliente(double descuentoCliente) {
        this.descuentoCliente = descuentoCliente;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Factura(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public void agregarLinea(LineaFactura linea){
        lineas.add(linea);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<LineaFactura> getLineas() {
        return lineas;
    }

    public void setLineas(List<LineaFactura> lineas) {
        this.lineas = lineas;
    }

    public double getDescuentoAdicional() {
        return descuentoAdicional;
    }

    public void setDescuentoAdicional(double descuentoAdicional) {
        this.descuentoAdicional = descuentoAdicional;
    }
    
    public String toString () {
        String datos = "Cliente "+getCliente().getNombreCompleto()+"\n"+
                       "Subtotal            ¢"+getSubTotal()+"\n"+
                       "Descuento Cliente   ¢"+getDescuentoCliente()+"\n"+
                       "Descuento Adicional ¢"+getDescuentoAdicional()+"\n"+
                       "                    ----------------------"+"\n"+
                       "Total               ¢"+getTotal()+"\n"+
                       "\n\n";
        return datos;
    }    
}
