package es.tienda.modelos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<Cliente> clientes = new ArrayList<>();
        ArrayList<Proveedor> proveedores = new ArrayList<>();
        ArrayList<Articulo> articulos = new ArrayList<>();

        // Añadir clientes
        clientes.add(new Cliente("Ana", "López", "11111111A", TipoCliente.VIP));
        clientes.add(new Cliente("Luis", "Martínez", "22222222B", TipoCliente.NUEVO));
        clientes.add(new Cliente("Marta", "García", "33333333C", TipoCliente.POTENCIAL));
        clientes.add(new Cliente("Pedro", "Ruiz", "44444444D", TipoCliente.MOROSO));

        // Añadir proveedores
        proveedores.add(new Proveedor("Carlos", "Jiménez", "55555555E", TipoProveedor.SERVICIO));
        proveedores.add(new Proveedor("Laura", "Fernández", "66666666F", TipoProveedor.RECURSOS));
        proveedores.add(new Proveedor("Sonia", "Navarro", "77777777G", TipoProveedor.FABRICANTE));

        // Añadir artículos
        articulos.add(new Articulo("A01", "Balón", 25.99));
        articulos.add(new Articulo("A02", "Raqueta", 79.50));

        // Mostrar datos
        System.out.println("=== CLIENTES ===");
        for (Cliente c : clientes) {
            c.mostrarDatos();
        }

        System.out.println("\n=== PROVEEDORES ===");
        for (Proveedor p : proveedores) {
            p.mostrarDatos();
        }

        System.out.println("\n=== ARTICULOS ===");
        for (Articulo a : articulos) {
            a.visualizarDatos();
        }
    }

    }

