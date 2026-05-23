
import java.util.Scanner;

public class Logico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Operador (AND, OR, XOR): ");
        String op = sc.next().toUpperCase();

        System.out.print("Valor 1 (true/false): ");
        boolean a = sc.nextBoolean();

        System.out.print("Valor 2 (true/false): ");
        boolean b = sc.nextBoolean();

        switch (op) {
            case "AND": System.out.println(a && b); break;
            case "OR": System.out.println(a || b); break;
            case "XOR": System.out.println(a ^ b); break;
            default: System.out.println("Operador inválido");
        }
    }
}
