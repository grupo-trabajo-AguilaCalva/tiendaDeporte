package es.tienda.modelos;

public class Proveedor extends Persona {

    private TipoProveedor tipoProveedor;

    public Proveedor(String nombre, String apellidos, String dni, TipoProveedor tipoProveedor) {
        super(nombre, apellidos, dni);
        setTipoProveedor(tipoProveedor);
    }

    public TipoProveedor getTipoProveedor() {
        return tipoProveedor;
    }

    public void setTipoProveedor(TipoProveedor tipoProveedor) {
        if (tipoProveedor == null) {
            throw new IllegalArgumentException("El tipo de proveedor no puede ser nulo");
        }
        this.tipoProveedor = tipoProveedor;
    }

    public void altaProveedor(String nombre, String dni, String apellidos, TipoProveedor tipoProveedor) {
        setNombre(nombre);
        setApellidos(apellidos);
        setDni(dni);
        this.tipoProveedor=tipoProveedor;
    }

    @Override
    public String toString() {
        return String.format("%s, Tipo: %s", super.toString(), tipoProveedor);
    }

    @Override
    public void mostrarDatos() {
        System.out.println("PROVEEDOR -> Nombre: " + getNombre() +
                ", Apellidos: " + getApellidos() +
                ", DNI: " + getDni() +
                ", Tipo: " + tipoProveedor);
    }
}

