import java.util.ArrayList;

public class ArrayLIst {
    public static void main(String[] args) {
        ArrayList<String> ListaString = new ArrayList<>();
        ListaString.add("Paulo");
        ListaString.add("Jorge");
        ListaString.add("Rodrigo");

        for (String elemento : ListaString) {
            System.out.println(elemento);
        }
    }

}