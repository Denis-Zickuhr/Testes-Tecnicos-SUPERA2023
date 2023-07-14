
import Challenge04.Descrambler;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class Challenge04Tests {

    private Descrambler descrambler;

    @Before
    public void setUp() {
        descrambler = new Descrambler();
    }

    @Test
    public void DescrambleString01() {
        String input = "I ENIL SIHTHSIREBBIG S";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "THIS LINE IS GIBBERISH";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }

    @Test
    public void DescrambleString02() {
        String input = "VOD OWT SNEH HCNERF EGDIRTRAP A DNA SE";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "FRENCH HENS TWO DOVES AND A PARTRIDGE";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }

    @Test
    public void DescrambleString03() {
        String input = "LEVELKAYAK";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "LEVELKAYAK";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }

    @Test
    public void DescrambleString04() {
        String input = "H YPPAHSYADILO";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "HAPPY HOLIDAYS";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }

    @Test
    public void DescrambleString05() {
        String input = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "MLKJIHGFEDCBAZYXWVUTSRQPON";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }

    @Test
    public void DescrambleString06() {
        String input = "EM ,UELAVMETARTNOC ";

        System.out.println("Descrambling string: " + input);

        String expectOutput = "VALEU, ME CONTRATEM";
        String actualOutput = descrambler.DescramblePrinterVirusEncryption(input);
        Assert.assertEquals(expectOutput, actualOutput);

        System.out.println("Descrambled string: " + actualOutput);

        System.out.println("---------------------------------------");
    }
}

