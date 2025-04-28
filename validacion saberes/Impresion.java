// Clase Impresion que hereda de Producto
// Especialización de Producto que maneja Fotos
public class Impresion extends Producto {
    private String color;
    private Foto[] fotos; // Composición: Impresion contiene varias Fotos

    // Constructor de Impresion
    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);  // Llamada al constructor de Producto
        this.color = color;
        this.fotos = fotos;
    }

    // Sobrescritura del método mostrarDetalles()
    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + " en color: " + color);
        System.out.println("Fotos asociadas:");
        for (Foto foto : fotos) {
            System.out.println("- " + foto.getFichero());
        }
    }
}
