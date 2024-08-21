package rey.bos.youngest_common_ancestor;

public class Main {

    public static void main(String[] args) {
        Solution.AncestralTree h = new Solution.AncestralTree('h');
        Solution.AncestralTree i = new Solution.AncestralTree('i');
        Solution.AncestralTree d = new Solution.AncestralTree('d');
        d.addAsAncestor(new Solution.AncestralTree[]{h, i});
        Solution.AncestralTree e = new Solution.AncestralTree('e');
        Solution.AncestralTree b = new Solution.AncestralTree('b');
        b.addAsAncestor(new Solution.AncestralTree[]{d, e});
        Solution.AncestralTree f = new Solution.AncestralTree('f');
        Solution.AncestralTree g = new Solution.AncestralTree('g');
        Solution.AncestralTree c = new Solution.AncestralTree('c');
        c.addAsAncestor(new Solution.AncestralTree[]{f, g});
        Solution.AncestralTree a = new Solution.AncestralTree('a');
        a.addAsAncestor(new Solution.AncestralTree[]{b, c});

        Solution.AncestralTree[][] input = new Solution.AncestralTree[][] {
            new Solution.AncestralTree[]{a, b}, new Solution.AncestralTree[]{e, i}, new Solution.AncestralTree[]{h, g},
            new Solution.AncestralTree[]{f, g}, new Solution.AncestralTree[]{a, c}, new Solution.AncestralTree[]{h, e}
        };
        Solution.AncestralTree[] expected = new Solution.AncestralTree[]{a, b, a, c, a, b};

        for (int idx = 0; idx < expected.length; idx++) {
            if (Solution.getYoungestCommonAncestor(a, input[idx][0], input[idx][1]).equals(expected[idx])) {
                System.out.println("test " + idx + " passed");
            } else {
                System.out.println("test " + idx + " failed");
            }
        }
    }

}
