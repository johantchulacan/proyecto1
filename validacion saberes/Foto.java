// Clase Foto
public class Foto {
    private String fichero;

    public Foto(String fichero) {
        this.fichero = fichero;
    }

    public void print() {
        System.out.println("Imprimiendo foto desde el fichero: " + fichero);
    }

    public String getFichero() {
        return fichero;
    }
}
