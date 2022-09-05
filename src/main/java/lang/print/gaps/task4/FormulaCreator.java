package lang.print.gaps.task4;

import java.util.logging.Logger;

public class FormulaCreator {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int formula = ((9 * (a * a)) - (5 * b) + 2 + a + 7) * (((a + b) - 4 * a *b) / 2);
        String str = Integer.toString(formula);
        Logger.getLogger(str);
    }
}
