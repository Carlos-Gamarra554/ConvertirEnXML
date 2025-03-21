import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Editorial> editoriales = new ArrayList<Editorial>();

        editoriales.add(new Editorial(1, "El Mundo", "C/Román Bono Marín, 8", "698435671"));
        editoriales.add(new Editorial(2, "No Solo Rol", "C/Francisco Ibáñez, 56", "294857239"));

        toXML(editoriales);
    }
    public static void toXML(ArrayList<Editorial> editoriales) {
        System.out.print("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        for (Editorial editorial : editoriales) {
            System.out.println("<usuario>\n" +
                    "   <id>" + editorial.getId_editorial() + "</id>\n" +
                    "   <nombre>" + editorial.getNombre() + "</nombre>\n" +
                    "   <direccion>" + editorial.getDireccion() + "</direccion>\n" +
                    "   <telefono>" + editorial.getTelefono() + "<telefono>\n" +
                    "</usuario>");
        }
    }
}
