// Clase Pedido que compone Cliente y un arreglo de Productos
// Composición: Pedido contiene Cliente
// Agregación: Pedido tiene productos
public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private String fecha;
    private int numeroTarjetaCredito;

    // Constructor de Pedido
    public Pedido(Cliente cliente, Producto[] productos, String fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    // Método para mostrar todos los detalles del pedido
    public void mostrarPedido() {
        System.out.println("Pedido del cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");
        for (Producto p : productos) {
            // Polimorfismo: llamada a mostrarDetalles() de forma polimórfica
            p.mostrarDetalles();
            System.out.println();
        }
    }
}