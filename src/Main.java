import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        // Crear artículos
        Articulo art1 = new Articulo("A001", "Teclado mecánico", 79.99, 5.99, 60);

        // Crear clientes
        Cliente cliente1 = new ClienteEstandar("Ana", "Calle 1", "12345678A", "ana@mail.com");
        Cliente cliente2 = new ClientePremium("Luis", "Calle 2", "87654321B", "luis@mail.com");

        // Crear pedidos
        Pedido pedido1 = new Pedido(1, cliente1, art1, 2, LocalDateTime.now().minusMinutes(10));
        Pedido pedido2 = new Pedido(2, cliente2, art1, 1, LocalDateTime.now().minusMinutes(120));

        // Mostrar objetos
        System.out.println(art1);
        System.out.println(cliente1);
        System.out.println(cliente2);

        System.out.println(pedido1);
        System.out.println("Pedido1 enviado? " + pedido1.estaEnviado());
        System.out.println("Pedido1 se puede eliminar? " + pedido1.sePuedeEliminar());

        System.out.println(pedido2);
        System.out.println("Pedido2 enviado? " + pedido2.estaEnviado());
        System.out.println("Pedido2 se puede eliminar? " + pedido2.sePuedeEliminar());
    }
}
