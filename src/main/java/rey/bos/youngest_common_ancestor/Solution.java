package rey.bos.youngest_common_ancestor;

import java.util.Objects;

public class Solution {

    public static AncestralTree getYoungestCommonAncestor(
        AncestralTree topAncestor,
        AncestralTree descendantOne,
        AncestralTree descendantTwo
    ) {
        int oneDepth = findDepth(descendantOne);
        int twoDepth = findDepth(descendantTwo);
        if (oneDepth > twoDepth) {
            while (oneDepth != twoDepth) {
                oneDepth--;
                descendantOne = descendantOne.ancestor;
            }
        } else if (twoDepth > oneDepth) {
            while (twoDepth != oneDepth) {
                twoDepth--;
                descendantTwo = descendantTwo.ancestor;
            }
        }
        while (descendantOne != null && descendantTwo != null) {
            if (descendantOne.equals(descendantTwo)) {
                return descendantOne;
            }
            descendantOne = descendantOne.ancestor;
            descendantTwo = descendantTwo.ancestor;
        }
        return topAncestor;
    }
    
    private static int findDepth(AncestralTree descendant) {
        AncestralTree ancestor = descendant.ancestor;
        int depth = 1;
        while (ancestor != null) {
            depth++;
            ancestor = ancestor.ancestor;
        }
        return depth;
    }

    public static class AncestralTree {

        public char name;
        public AncestralTree ancestor;

        AncestralTree(char name) {
            this.name = name;
            this.ancestor = null;
        }

        // This method is for testing only.
        void addAsAncestor(AncestralTree[] descendants) {
            for (AncestralTree descendant : descendants) {
                descendant.ancestor = this;
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof AncestralTree that)) return false;
            return name == that.name;
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

    }

}
