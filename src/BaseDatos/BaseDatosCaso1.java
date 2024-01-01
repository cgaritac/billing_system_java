
package BaseDatos;

import facturas.Factura;
import java.util.ArrayList;
import java.util.List;
import persona.Cliente;
import persona.TipoCliente;

public class BaseDatosCaso1 {
    private static BaseDatosCaso1 instancia = null;
    
    List<TipoCliente> tiposCliente = new ArrayList<>();
    List<Cliente> clientes = new ArrayList<>();
    List<Factura> facturas = new ArrayList<>();
    
    // El usuario no puede ingresar clientes nuevos, ya que para hacerlo, hay que realizarlo directamente en el código por no tener conexion a una base de datos real
    
    private BaseDatosCaso1(){
        
        // Los clientes normales se subdividen en "Normales registrados" y "Normales no registrados", siendo los segundos cuando la cédula que se ingresa no aparece en la base de datos simulada
        
        TipoCliente tp1 = new TipoCliente("normal registrado", 10);
        TipoCliente tp2 = new TipoCliente("premier", 15);
        
        tiposCliente.add(tp1);
        tiposCliente.add(tp2);
        
        Cliente c1 = new Cliente("101110111", "Carlos Garita", tp1);
        Cliente c2 = new Cliente("202220222", "María Espinoza", tp2);
        Cliente c3 = new Cliente("303330333", "Martín Berzosa", tp1);
        Cliente c4 = new Cliente("404440444", "Elizabeth Zamora", tp2);
        Cliente c5 = new Cliente("505550555", "Natalia Carranza", tp1);
        Cliente c6 = new Cliente("606660666", "Gonzalo Chaves", tp2);
        Cliente c7 = new Cliente("707770777", "Victor Ugalde", tp1);
        Cliente c8 = new Cliente("808880888", "Ruth Córdoba", tp2);
        Cliente c9 = new Cliente("909990999", "Elizabeth Campos", tp1);
        Cliente c10 = new Cliente("102220222", "Sergio Chacón", tp2);
        Cliente c11 = new Cliente("201110111", "Laura Fajardo", tp1);
        Cliente c12 = new Cliente("302220222", "Jhina Hernández", tp2);        
        
        clientes.add(c1);
        clientes.add(c2);
        clientes.add(c3);
        clientes.add(c4);
        clientes.add(c5);
        clientes.add(c6);
        clientes.add(c7);
        clientes.add(c8);
        clientes.add(c9);
        clientes.add(c10);
        clientes.add(c11);
        clientes.add(c12);       
    }       

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }

    public static BaseDatosCaso1 getInstancia() {
        if (instancia == null){
            instancia = new BaseDatosCaso1();
        }
        return instancia;
    }

    public List<TipoCliente> getTiposCliente() {
        return tiposCliente;
    }

    public void setTiposCliente(List<TipoCliente> tiposCliente) {
        this.tiposCliente = tiposCliente;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
