import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de estudiantes: ");
        int cantidad = scanner.nextInt();

        double[] notas = new double[cantidad];

        for(int i = 0; i < cantidad; i++){
            System.out.println("Ingrese la nota del estudiante: " + (i+1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        System.out.println("\n =========NOTAS DE ESTUDIANTES=========");
        for (int i = 0; i < cantidad; i++){
            System.out.println("Estudiante "+(i+1)+": " + notas[i]);
        }

    }
}
