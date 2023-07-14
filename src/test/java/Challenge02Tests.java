import Challenge02.MinChangeGenerator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Challenge02Tests {

    private MinChangeGenerator change;

    @Before
    public void setUp() {
        change = new MinChangeGenerator();
    }

    @Test
    public void testEquals_576point73() {
        double input = 576.73;
        int[] expectedOutput = {5, 1, 1, 0, 1, 0, 1, 1, 0, 2, 0, 3};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_152point20() {
        double input = 152.20;
        int[] expectedOutput = {1, 1, 0, 0, 0, 1, 0, 0, 0, 2, 0, 0};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_0point99() {
        double input = 0.99;
        int[] expectedOutput = {0, 0, 0, 0, 0, 0, 0, 1, 1, 2, 0, 4};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_55point55() {
        double input = 55.55;
        int[] expectedOutput = {0, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 0};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_20point05() {
        double input = 20.05;
        int[] expectedOutput = {0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_0point00() {
        double input = 0.0;
        int[] expectedOutput = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testNotEquals_12point34() {
        double input = 12.34;
        int[] expectedOutput = {1, 0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 4};
        Assert.assertNotEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testNotEquals_100point00() {
        double input = 100.0;
        int[] expectedOutput = {10, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        Assert.assertNotEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testEquals_500point50() {
        double input = 500.50;
        int[] expectedOutput = {5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        Assert.assertArrayEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testNotEquals_1234point56() {
        double input = 1234.56;
        int[] expectedOutput = {123, 0, 0, 0, 0, 1, 0, 1, 0, 0, 1, 1};
        Assert.assertNotEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testNotEquals_999point99() {
        double input = 999.99;
        int[] expectedOutput = {99, 1, 0, 0, 0, 1, 1, 0, 0, 0, 2, 4};
        Assert.assertNotEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

    @Test
    public void testNotEquals_1point00() {
        double input = 1.0;
        int[] expectedOutput = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1};
        Assert.assertNotEquals(expectedOutput, change.getChange(input));
        System.out.println(input);
        System.out.println("-----------------------------------------------------");
        System.out.println(change.getCoins(input));
    }

}
