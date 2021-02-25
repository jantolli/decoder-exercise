package test.java.upwork.exercise;

import main.java.upwork.exercise.SimpleDecoder;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleDecoderTest {

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

//    @Test
//    public void decode3() {
//        assertEquals("999999999", getFullyDecodedString("0199"));
//    }
//
//    @Test
//    public void decode4() {
//        assertEquals("", getFullyDecodedString("01"));
//    }

    private String getFullyDecodedString(String stringToDecode) {
        StringBuilder decodedString = new StringBuilder();
        SimpleDecoder decoder = new SimpleDecoder(stringToDecode);
        while (decoder.hasNext()) {
            decodedString.append(decoder.next());
        }
        return decodedString.toString();
    }

}