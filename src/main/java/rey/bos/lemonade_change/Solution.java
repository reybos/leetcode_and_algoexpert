package rey.bos.lemonade_change;

public class Solution {

    private final static int TWENTY = 20;
    private final static int TEN = 10;
    private final static int FIVE = 5;


    public boolean lemonadeChange(int[] bills) {
        int[] cash = new int[11];
        for (int i = 0; i < bills.length; i++) {
            if (!tryChange(bills[i], cash)) {
                return false;
            }
            addCash(bills[i], cash);
        }
        return true;
    }

    private boolean tryChange(int bill, int[] cash) {
        return switch (bill) {
            case TWENTY -> {
                if (cash[TEN] > 0 && cash[FIVE] > 0) {
                    cash[TEN]--;
                    cash[FIVE]--;
                    yield true;
                } else if (cash[FIVE] >= 3) {
                    cash[FIVE] = cash[FIVE] - 3;
                    yield true;
                }
                yield false;
            }
            case TEN -> {
                if (cash[FIVE] > 0) {
                    cash[FIVE]--;
                    yield true;
                }
                yield false;
            }
            default -> true;
        };
    }

    private void addCash(int bill, int[] cash) {
        if (bill != TWENTY) {
            cash[bill]++;
        }
    }
    
}
