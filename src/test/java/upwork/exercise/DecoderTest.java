package upwork.exercise;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DecoderTest {

    @Test
    public void decode1() {
        String decoded = upwork.exercise.Decoder.decode("1, 3, 4, 1");
        System.out.println(decoded);
        assertEquals( "31111", decoded, "Values do not match");
    }

    @Test
    public void decode2() {
        String decoded = upwork.exercise.Decoder.decode("4, 8, 2, 7, 1, 4");
        System.out.println(decoded);
        assertEquals("8888774", decoded, "Values do not match");
    }

}