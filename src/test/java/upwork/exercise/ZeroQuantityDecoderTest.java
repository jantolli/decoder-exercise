package upwork.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ZeroQuantityDecoderTest {

    @Test
    public void decode1() {
        assertEquals("31111", getFullyDecodedString("1341"));
    }

    @Test
    public void decode2() {
        assertEquals("8888774", getFullyDecodedString("482714"));
    }

    @Test()
    public void decodeNull() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            getFullyDecodedString(null);
        });

        String expectedMessage = "digits cannot be null";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void decodeEmptyString() {
        assertEquals("", getFullyDecodedString(""));
    }

    @Test
    public void decode3() {
        assertEquals("999999999", getFullyDecodedString("0199"));
    }

    @Test
    public void decode4() {
        assertEquals("", getFullyDecodedString("01"));
    }

    @Test
    public void decode5() {
        assertEquals("400", getFullyDecodedString("01140120"));
    }

    private String getFullyDecodedString(String stringToDecode) {
        StringBuilder decodedString = new StringBuilder();
        upwork.exercise.ZeroQuantityDecoder decoder = new upwork.exercise.ZeroQuantityDecoder(stringToDecode);
        while (decoder.hasNext()) {
            decodedString.append(decoder.next());
        }
        return decodedString.toString();
    }

}