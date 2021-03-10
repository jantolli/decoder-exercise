package upwork.exercise;

import java.util.Iterator;

/**
 * Decoder which does not support this case "01"
 */
public class SimpleDecoder implements Iterator<Integer> {

    char[] digits;
    protected int currentIndex = 0;
    protected int requiredIterations;
    protected int numberToRepeat;

    public SimpleDecoder(String digits) {
        if (digits == null) {
            throw new IllegalArgumentException("digits cannot be null");
        }
        this.digits = digits.toCharArray();
    }

    @Override
    public boolean hasNext() {
        return currentIndex < digits.length || requiredIterations != 0;
    }

    @Override
    public Integer next() {
        if (requiredIterations == 0 || requiredIterations < 0) {
            prepareNextIteration();
        }
        requiredIterations--;
        return numberToRepeat;
    }

    private void prepareNextIteration() {
        requiredIterations = Integer.decode(digits[currentIndex++] + "");
        numberToRepeat = Integer.decode(digits[currentIndex++] + "");
    }
}
