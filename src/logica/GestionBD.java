
package logica;

import persona.Cliente;
import BaseDatos.BaseDatosCaso1;

public class GestionBD {
    public Cliente buscarClientexcedula (String cedula){
        for (Cliente c: BaseDatosCaso1.getInstancia().getClientes()){
            if (c.getCedula().equals(cedula)){
                return c;  
            }
        }
        return new Cliente ("", "Normal no registrado", null);       
    }
}
