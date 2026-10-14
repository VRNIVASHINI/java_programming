
import java.util.*;
@FunctionalInterface
interface Check {
    void checkNumber(int n);
}

public class interoddeven {
    public static void main(String[] args) {

        Check c = (n) -> {
            if (n % 2 == 0) {
                System.out.println(n + " is Even");
            } else {
                System.out.println(n + " is Odd");
            }
        };

        c.checkNumber(10);
        c.checkNumber(7);
    }
}