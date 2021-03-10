package upwork.exercise;

import java.util.Iterator;

/**
 * Decoder which *supports* this case "01"
 */
public class ZeroQuantityDecoder implements Iterator<Integer> {

    char[] digits;
    protected int currentIndex = 0;
    protected int requiredIterations;
    protected int numberToRepeat;

    public ZeroQuantityDecoder(String digits) {
        if (digits == null) {
            throw new IllegalArgumentException("digits cannot be null");
        }
        this.digits = digits.toCharArray();
    }

    @Override
    public boolean hasNext() {
        if (currentIndex >= digits.length && requiredIterations == 0) return false;
        if (requiredIterations == 0) {
            int repeater = Integer.decode(digits[currentIndex] + "");
            if (repeater == 0) {
                currentIndex+=2;
                return hasNext();
            }
        }
        return true;
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
