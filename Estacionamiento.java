
import java.util.Scanner;

public class Estacionamiento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1.Moto 2.Auto 3.Camión");
        int tipo = sc.nextInt();
        System.out.print("Horas: ");
        int h = sc.nextInt();

        double tarifa = 0;

        switch (tipo) {
            case 1: tarifa = 2; break;
            case 2: tarifa = 5; break;
            case 3: tarifa = 10; break;
            default: System.out.println("Tipo inválido");
        }

        if (tarifa > 0) {
            double total = tarifa * h;
            System.out.println("Total: $" + total);
        }
    }
}
