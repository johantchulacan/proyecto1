// Clase Impresion que hereda de Producto
public class Impresion extends Producto {
    private String color;
    private Foto[] fotos;

    public Impresion(int numero, String color, Foto[] fotos) {
        super(numero);
        this.color = color;
        this.fotos = fotos;
    }

    public void mostrarDetalles() {
        System.out.println("Impresión #" + numero + " en color: " + color);
        System.out.println("Fotos asociadas:");
        for (Foto foto : fotos) {
            System.out.println("- " + foto.getFichero());
        }
    }
}
