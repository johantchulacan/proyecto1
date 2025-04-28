public class Main {
    public static void main(String[] args) {
        // Crear fotos
        Foto foto1 = new Foto("foto1.jpg");
        Foto foto2 = new Foto("foto2.jpg");
        Foto[] fotos = {foto1, foto2};

        // Crear productos
        Impresion impresion = new Impresion(1, "Color", fotos);
        Camara camara = new Camara(2, "Canon", "EOS 90D");

        Producto[] productos = {impresion, camara};

        // Crear cliente
        Cliente cliente = new Cliente("123456789", "Juan Pérez");

        // Crear pedido
        Pedido pedido = new Pedido(cliente, productos, "05/10/25", 987654321);

        // Mostrar pedido
        pedido.mostrarPedido();
    }
}