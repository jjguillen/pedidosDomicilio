package entities;

import java.time.LocalDate;
import java.util.Map;

public class Pedido {
    private static long count = 0;

    private Long id;
    private Cliente cliente;
    private String direccion;
    private LocalDate fecha;
    private EstadoPedido estado;
    private Map<Integer, Plato> platos; //1 - Hamburguesa, 2 - Pizza
}
