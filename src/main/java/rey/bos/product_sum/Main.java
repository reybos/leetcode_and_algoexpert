package rey.bos.product_sum;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Object> array = List.of(
            5, 2, List.of(7, -1), 3, List.of(6, List.of(-13, 8), 4)
        );
        int expected = 12;
        if (Solution.productSum(array) == expected) {
            System.out.println("passed");
        } else {
            System.out.println("failed");
        }
    }

}
