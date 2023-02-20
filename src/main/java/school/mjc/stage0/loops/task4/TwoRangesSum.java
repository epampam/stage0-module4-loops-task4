package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip == lastInRow) {
            int counter = 1, sum = 0;
            do sum += counter; while (++counter <= lastInRow);
            System.out.printf("skipped sum is %d\ncounted sum is 0\n", sum);
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            int counter = 1, sum = 0;
            do sum += counter; while (++counter <= lastInRow - numberToSkip);
            System.out.printf("skipped sum is %d\n", sum);
            int counter2 = numberToSkip + 1, sum2 = 0;
            do sum2 += counter2; while (++counter2 <= lastInRow);
            System.out.printf("counted sum is %d\n", sum2);
        }
    }

    public static void main(String[] args) {
        TwoRangesSum rangesSum = new TwoRangesSum();
        rangesSum.printSumOfTwoRanges(10,10);
    }
}

