package services;

import entities.Pedido;

import java.util.HashMap;
import java.util.Map;

public class GestorPedidos {

    private String nombreRestaurante;
    private Map<String, Pedido> pedidos; //Código - Pedido

    public GestorPedidos(String nombreRestaurante) {
        this.nombreRestaurante = nombreRestaurante;
        this.pedidos = new HashMap<>();
    }

    /**
     * Agrega un pedido al gestor de pedidos.
     * @param pedido
     */
    public void agregarPedido(Pedido pedido) {
        this.pedidos.put(nombreRestaurante.substring(0,3).toUpperCase() + "_" + pedido.getId(), pedido);
    }

    /**
     * Muestra todos los pedidos del gestor de pedidos.
     */
    public void mostrarPedidos() {
        IO.println("--- PEDIDOS ---");
        for(String codigo : pedidos.keySet()) {
            IO.println(codigo + "\n" + pedidos.get(codigo).mostrarPedido());
        }
    }


}
