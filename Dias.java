import java.util.Scanner;

public class Dias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();

        switch (d) {
            case 1: System.out.println("Lunes - Laborable"); break;
            case 2: System.out.println("Martes - Laborable"); break;
            case 3: System.out.println("Miércoles - Laborable"); break;
            case 4: System.out.println("Jueves - Laborable"); break;
            case 5: System.out.println("Viernes - Laborable"); break;
            case 6: case 7:
                System.out.println((d == 6 ? "Sábado" : "Domingo") + " - Fin de semana");
                break;
            default: System.out.println("Número inválido");
        }
    }
}
