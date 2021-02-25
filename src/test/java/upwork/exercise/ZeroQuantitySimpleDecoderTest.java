package test.java.upwork.exercise;

import main.java.upwork.exercise.ZeroQuantityDecoder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ZeroQuantitySimpleDecoderTest {

    @Test
    public void decode1() {
        assertEquals("31111", getFullyDecodedString("1341"));
    }

    @Test
    public void decode2() {
        assertEquals("8888774", getFullyDecodedString("482714"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void decodeNull() {
        getFullyDecodedString(null);
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
        ZeroQuantityDecoder decoder = new ZeroQuantityDecoder(stringToDecode);
        while (decoder.hasNext()) {
            decodedString.append(decoder.next());
        }
        return decodedString.toString();
    }

}