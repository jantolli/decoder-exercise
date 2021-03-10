package upwork.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class SimpleDecoderTest {

    @Test
    public void decode1() {
        assertEquals("31111", getFullyDecodedString("1341"));
    }

    @Test
    public void decode2() {
        assertEquals("8888774", getFullyDecodedString("482714"));
    }

    @Test
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

    private String getFullyDecodedString(String stringToDecode) {
        StringBuilder decodedString = new StringBuilder();
        SimpleDecoder decoder = new SimpleDecoder(stringToDecode);
        while (decoder.hasNext()) {
            decodedString.append(decoder.next());
        }
        return decodedString.toString();
    }

}