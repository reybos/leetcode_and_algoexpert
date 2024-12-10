package rey.bos.test_jp2;

import java.util.Arrays;
import java.util.List;

public class Test {

    //3
    //V
    //O H
    //OOOHH
    //OOOO_
    //OOOOO
//[1, 2] //[] [1] [2] [1,2]
    public static List<String> createScedule(int n) {//100
        int roundedUp = (int) Math.ceil(n * 0.6);
        //O(2^n)
        //V H O
        //3
        //V
        //H
        //O
        //
        //VV
        //VH
        //VO
        //VV
        //VH
        //VO
        //VV
        //VH
        //VO
        char[] arr = new char[n];
        Arrays.fill(arr, 'O');
        return List.of();
    }


}
