import nsSum.Sum;
import nsVar.Var;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("xp = ");
        Var.x_p = scanner.nextDouble();
        System.out.print("xk = ");
        Var.x_k = scanner.nextDouble();
        System.out.print("dx = ");
        Var.dx = scanner.nextDouble();
        System.out.print("eps = ");
        Var.e = scanner.nextDouble();

        System.out.println("-------------------------------------------------");
        System.out.println("| " + String.format("%9s", "x") + " | " + String.format("%9s", "arcth(x)") + " | " + String.format("%9s", "S") + " | " + String.format("%9s", "n") + " |");
        System.out.println("-------------------------------------------------");

        Var.x = Var.x_p;
        while (Var.x <= Var.x_k) {
            Sum.sum();
            System.out.printf("| %9.2f | %9.5f | %9.5f | %9s |%n", Var.x, 0.5 * Math.log((Var.x + 1) / (Var.x - 1)), Var.s, Var.n);
            Var.x += Var.dx;
        }
        System.out.println("-------------------------------------------------");
    }
}
