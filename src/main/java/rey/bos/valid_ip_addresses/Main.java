package rey.bos.valid_ip_addresses;

import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> input = List.of("0000", "00001", "1921680");
        List<List<String>> expected = List.of(
            List.of("0.0.0.0"), List.of(),
            List.of(
                "1.9.216.80", "1.92.16.80", "1.92.168.0", "19.2.16.80", "19.2.168.0", "19.21.6.80", "19.21.68.0",
                "19.216.8.0", "192.1.6.80", "192.1.68.0", "192.16.8.0"
                )
        );
        for (int i = 0; i < expected.size(); i++) {
            if (CollectionUtils.isEqualCollection(Solution.validIPAddresses(input.get(i)), expected.get(i))) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
