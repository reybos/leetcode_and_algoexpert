package rey.bos.phone_number_mnemonics;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] input = new String[] {"1905"};
        List<List<String>> expected = List.of(
            List.of("1w0j", "1w0k", "1w0l", "1x0j", "1x0k", "1x0l", "1y0j", "1y0k", "1y0l", "1z0j", "1z0k", "1z0l")
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.phoneNumberMnemonics(input[i]), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
