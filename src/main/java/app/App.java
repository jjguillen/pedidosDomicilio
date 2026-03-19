package app;

import entities.Cliente;
import entities.Pedido;
import entities.Plato;
import services.GestorPedidos;

public class App {

    static void main() {

        GestorPedidos gestPed = new GestorPedidos("LaCalle SmashBurger");

        //CLIENTES
        Cliente cl1 = new Cliente("12345678A", "Juan Pérez", "600123456", "jp@gmail.com");
        Cliente cl2 = new Cliente("45454545A", "Ana Silvia", "688889888", "as@gmail.com");

        //PEDIDOS
        Pedido pr1 = new Pedido(cl1, "Calle Sevilla 33, Vera");
        pr1.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr1.agregarPlato(new Plato(15,"Dichosa", 16.50, ""));
        pr1.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        Pedido pr2 = new Pedido(cl2, "Calle Córdoba 2, Garrucha");
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr2.agregarPlato(new Plato(14,"Smash burguer doble barbacoa", 15.50, ""));
        pr1.agregarPlato(new Plato(25,"Ración patatas fritas", 12.50, ""));

        gestPed.agregarPedido(pr1);
        gestPed.agregarPedido(pr2);

        gestPed.mostrarPedidos();



    }
}
