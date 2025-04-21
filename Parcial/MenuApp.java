
import java.util.Scanner;

public class MenuApp {
    static double[] array = new double[10];
    static double[][] matriz = new double[4][4];
    static boolean arrayLleno = false, matrizLlena = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;
        do {
            System.out.println("\n1. Area Circulo\n2. Ingresar Array\n3. Listar Array\n4. Dato Array\n5. Ingresar Matriz\n6. Listar Matriz\n7. Dato Matriz\n8. Salir");
            System.out.print("Opcion: ");
            op = sc.nextInt();
            switch (op) {
                case 1 -> { System.out.print("Radio: "); double r = sc.nextDouble(); System.out.printf("Área: %.2f\n", Math.PI * r * r); }
                case 2 -> { for (int i = 0; i < 10; i++) { System.out.print("Array[" + i + "]: "); array[i] = sc.nextDouble(); } arrayLleno = true; }
                case 3 -> { if (!arrayLleno) { System.out.println("Llenar primero."); break; } for (int i = 0; i < 10; i++) System.out.println("[" + i + "]: " + array[i]); }
                case 4 -> { if (!arrayLleno) { System.out.println("Llenar primero."); break; } System.out.print("Índice (0-9): "); int i = sc.nextInt(); System.out.println(i >= 0 && i < 10 ? array[i] : "Índice inválido."); }
                case 5 -> { for (int i = 0; i < 4; i++) for (int j = 0; j < 4; j++) { System.out.print("Matriz[" + i + "][" + j + "]: "); matriz[i][j] = sc.nextDouble(); } matrizLlena = true; }
                case 6 -> { if (!matrizLlena) { System.out.println("Llenar primero."); break; } for (double[] fila : matriz) { for (double val : fila) System.out.print(val + "\t"); System.out.println(); } }
                case 7 -> { if (!matrizLlena) { System.out.println("Llenar primero."); break; } System.out.print("Fila (0-3): "); int i = sc.nextInt(); System.out.print("Columna (0-3): "); int j = sc.nextInt(); System.out.println(i >= 0 && i < 4 && j >= 0 && j < 4 ? matriz[i][j] : "Índices inválidos."); }
                case 8 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida.");
            }
        } while (op != 8);
        sc.close();
    }
}
