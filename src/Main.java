import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);
        HashSet<String> asistencia = new HashSet<>();

        String nombre;

        System.out.println("Registro de asistencia");
        System.out.println("Escribe 'fin' para terminar. ");

        while (true) {
            System.out.println("Ingrese el nombre del asistencia: ");
            nombre = Teclado.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }
            if (asistencia.add(nombre)) {
                System.out.println("Asistencia registrado");
            } else {
                System.out.println("Esta persona ya fue registrada.");
            }
        }
        System.out.println("\nLista de asistencias");
        for (String asistencia1 : asistencia) {
            System.out.println(asistencia1);
        }

        System.out.println("\nTotal de asistencias unicas son: " +asistencia.size());
        Teclado.close();
    }
}
