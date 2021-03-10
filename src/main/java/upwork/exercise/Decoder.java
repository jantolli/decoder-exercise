package upwork.exercise;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Decoder {

    public static String decode(String encoded) {

        String decoded = new String();
        List<Integer> asList =
                Arrays.asList(
                encoded.split(","))
                .stream().map(String::trim)
                .map(Integer::valueOf)
                .collect(Collectors.toList());

        EncodedList encodedAsList = new EncodedList<Integer>(asList);
        EncodedList.IteratorDecoder iter = encodedAsList.iterator();
        while (iter.hasNext()) {
            Integer howMAnyTimes = iter.next();
            Integer oneDigitNumber = iter.next();
            decoded += String.valueOf(String.valueOf(oneDigitNumber).repeat(howMAnyTimes));
            System.out.println(howMAnyTimes + ", " + oneDigitNumber);
        }
        return decoded;
    }

    public static void main(String[] args) {
        Decoder.decode("1, 3, 4, 1");
    }

}
