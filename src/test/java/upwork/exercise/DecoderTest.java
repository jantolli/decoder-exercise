package upwork.exercise;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class DecoderTest {

    @Test
    public void decode1() {
        String decoded = main.java.upwork.exercise.Decoder.decode("1, 3, 4, 1");
        Assert.assertEquals("Values do not match", "31111", decoded);
    }

    @Test
    public void decode2() {
        String decoded = main.java.upwork.exercise.Decoder.decode("4, 8, 2, 7, 1, 4");
        Assert.assertEquals("Values do not match", "8888774", decoded);
    }

}