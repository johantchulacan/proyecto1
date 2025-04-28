// Clase Foto
// Representa una imagen que se puede imprimir
public class Foto {
    private String fichero; // Nombre del archivo de la foto


    // Constructor de Foto
    public Foto(String fichero) {
        this.fichero = fichero;
    }

    // Método para imprimir una foto (no utilizado en esta versión)
    public void print() {
        System.out.println("Imprimiendo foto desde el fichero: " + fichero);
    }

    public String getFichero() {
        return fichero;
    }
}
