package rey.bos.array_of_products;

public class Solution {

    public static int[] arrayOfProducts(int[] array) {
        int[] leftProduct = new int [array.length];
        int temp = 1;
        for (int i = 0; i < array.length; i++) {
            leftProduct[i] = temp;
            temp *= array[i];
        }
        int rightProduct = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            leftProduct[i] *= rightProduct;
            rightProduct *= array[i];
        }
        
        return leftProduct;
    }

}
