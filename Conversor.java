import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Metros a Km\n2. Km a Metros\n3. Celsius a Fahrenheit\n4. Fahrenheit a Celsius");
        int op = sc.nextInt();
        System.out.print("Valor: ");
        double v = sc.nextDouble();
        
        switch (op) {
            case 1: System.out.println(v / 1000 + " km"); break;
            case 2: System.out.println(v * 1000 + " m"); break;
            case 3: System.out.println((v * 9.0 / 5.0) + 32); break; 
            case 4: System.out.println((v - 32) * 5.0 / 9.0); break;
            default: System.out.println("Opción inválida");
        }

        sc.close();
    }
}
