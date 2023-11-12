package nsSum;

import nsDod.Dod;
import nsVar.Var;

public class Sum {
    public static void sum() {
        Var.n = 0;
        Var.a = 1 / Var.x;
        Var.s = Var.a;
        do {
            Var.n++;
            Dod.dod();
            Var.s += Var.a;
        } while (Math.abs(Var.a) > Var.e);
    }
}
