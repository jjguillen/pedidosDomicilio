package app;

import entities.Cliente;
import entities.EstadoPedido;
import entities.Pedido;
import entities.Plato;
import services.GestorPedidos;

import java.time.LocalDate;

public class App {

    static void main() {

        GestorPedidos gestPed = new GestorPedidos("LaCalle SmashBurger");

        //CLIENTES
        Cliente cl1 = new Cliente("12345678A", "Juan Pérez", "600123456", "jp@gmail.com");
        Cliente cl2 = new Cliente("45454545A", "Natalia Silvia", "688889888", "as@gmail.com");

        //PEDIDOS
        Pedido pr1 = new Pedido(cl1, "Calle Sevilla 33, Vera");
        pr1.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr1.agregarPlato(new Plato(15,"Dichosa", 16.50, ""));
        pr1.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        Pedido pr2 = new Pedido(cl2, "Calle Córdoba 2, Garrucha");
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));
        pr2.setFecha(LocalDate.now().plusDays(1)); //Simular cambiar la fecha del pedido
        pr2.setEstado(EstadoPedido.CANCELADO);

        gestPed.agregarPedido(pr1);
        gestPed.agregarPedido(pr2);

        gestPed.mostrarPedidos();
        gestPed.mostrarPedidosOrdenadosPorFecha();
        gestPed.mostrarPedidosOrdenadosPorCliente();
        gestPed.mostrarPedidosOrdandosPorEstado();



    }
}
