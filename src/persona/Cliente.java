
package persona;

public class Cliente {
    String cedula;
    String nombreCompleto;
    TipoCliente tipoCliente; 

    public Cliente(String cedula, String nombreCompleto, TipoCliente tipoCliente) {
        this.cedula = cedula;
        this.nombreCompleto = nombreCompleto;
        this.tipoCliente = tipoCliente;
    }   
    
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
