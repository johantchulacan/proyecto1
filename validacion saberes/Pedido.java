// Clase Pedido que compone Cliente y un arreglo de Productos
public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private String fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, String fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }

    public void mostrarPedido() {
        System.out.println("Pedido del cliente: " + cliente.getNombre());
        System.out.println("Fecha: " + fecha);
        System.out.println("Número de tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos en el pedido:");
        for (Producto p : productos) {
            p.mostrarDetalles();
            System.out.println();
        }
    }
}