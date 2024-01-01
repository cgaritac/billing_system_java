
package logica;

import facturas.Factura;
import facturas.LineaFactura;


public class CrearFactura {
    Factura f;
    GestionBD g = new GestionBD();
    
    public CrearFactura(String cedula) {
        f = new Factura(g.buscarClientexcedula(cedula));
    }
    
    public void agregarLinea (LineaFactura lf){
        f.agregarLinea(lf);
    }
    
    public void cerrarFactura (){
        double descuentoCliente = 0.0;
        double descuentoAdicional = 0.0;
        double subTotal = 0.0;
        int  cantidad = 0;
        double total = 0.0;
        
        for (LineaFactura lf: f.getLineas()){
            subTotal = lf.getPrecio()+subTotal;
        }
        
        for (LineaFactura lf: f.getLineas()){
            cantidad = lf.getCantidad()+cantidad;
        }
        
        // Descuentos normales
        
        if (f.getCliente().getTipoCliente() != null){
            descuentoCliente = (f.getCliente().getTipoCliente().getPorcentajeDescuento()*subTotal)/100;
        }
        
         if (f.getCliente().getTipoCliente() == null){
            descuentoCliente = (10*subTotal)/100;
        }
        
        // Descuentos adicionales
        
        if (subTotal < 10000 && cantidad >= 5) {
            descuentoAdicional = (5*subTotal)/100;
        }
        
        if (subTotal >= 10000 && subTotal <= 20000 && cantidad >= 5) {
            descuentoAdicional = (10*subTotal)/100;
        }
        
        if (subTotal > 20000 && cantidad >= 5) {
            descuentoAdicional = (15*subTotal)/100;
        }
        
        total = subTotal - descuentoCliente - descuentoAdicional;
        
        f.setSubTotal(subTotal);
        f.setDescuentoAdicional(descuentoAdicional);
        f.setDescuentoCliente(descuentoCliente);        
        f.setTotal(total);
    }

    public Factura getF() {
        return f;
    }

    public void setF(Factura f) {
        this.f = f;
    }
    
}
