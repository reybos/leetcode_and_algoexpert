package rey.bos.generate_document;

public class Main {

    public static void main(String[] args) {
        String[] characters = new String[] {
            "Bste!hetsi ogEAxpelrt x ", "a", "a", "a hsgalhsa sanbjksbdkjba kjx", " ", "     "
        };
        String[] documents = new String[] {
            "AlgoExpert is the Best!", "A", "a", "", "hello", "     "
        };
        boolean[] expected = new boolean[] {true, false, true, true, false, true};
        for (int i = 0; i < characters.length; i++) {
            if (Solution.generateDocument(characters[i], documents[i]) == expected[i]) {
                System.out.println("test " + i + " passed");
            } else {
                System.out.println("test " + i + " failed");
            }
        }
    }

}
