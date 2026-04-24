package es.tienda.modelos;
import java.sql.SQLOutput;
import java.util.Objects;
public class Cliente extends Persona{
    private TipoCliente tipoCliente;

    public Cliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente){
        super(nombre, apellidos, dni);
        this.tipoCliente = tipoCliente;
    }
    public TipoCliente getTipoCliente(){
        return tipoCliente;
    }
    public TipoCliente setTipoCliente(TipoCliente tipoCliente){
        Objects.requireNonNull(tipoCliente, "El tipo de cliente no puede ser nulo");
        return tipoCliente;
    }
    public void altaCliente(String nombre, String apellidos, String dni, TipoCliente tipoCliente){
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
        this.tipoCliente = tipoCliente;
        System.out.println("Cliente dado de alta correctamente");
    }
    @Override
    public void mostrarDatos() {
        System.out.println("CLIENTE -> Nombre: " + getNombre() +
                ", Apellidos: " + getApellidos() +
                ", DNI: " + getDni() +
                ", Tipo: " + tipoCliente);
    }
}
