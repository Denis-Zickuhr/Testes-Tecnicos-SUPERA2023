
import Challenge03.FindK_PairsIn;
import org.junit.Assert;
import org.junit.Test;

public class Challenge03Tests {

    @Test
    public void exampleTest01() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 4;
        int k = 1;
        int expectedOutput = 3;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void exampleTest02() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 5;
        int k = 2;
        int expectedOutput = 3;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KPositiveNPositive() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 10;
        int k = 3;
        int expectedOutput = 7;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KZeroNPositive() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 10;
        int k = 0;
        int expectedOutput = 0;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KNegativeNPositive() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 10;
        int k = -2;
        int expectedOutput = 8;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KPositiveNZero() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 0;
        int k = 5;
        int expectedOutput = 0;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KZeroNZero() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 0;
        int k = 0;
        int expectedOutput = 0;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KNegativeNZero() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 0;
        int k = -5;
        int expectedOutput = 0;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KPositiveNNegative() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = -10;
        int k = 4;
        int expectedOutput = 0;
        int actualOutput;
        try{
            actualOutput = finder.getK_Pairs(n, k);
        }catch (NegativeArraySizeException e){
            actualOutput = 0;
        }
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KZeroNNegative() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = -10;
        int k = 0;
        int expectedOutput = 0;
        int actualOutput;
        try{
            actualOutput = finder.getK_Pairs(n, k);
        }catch (NegativeArraySizeException e){
            actualOutput = 0;
        }
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KNegativeNNegative() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = -10;
        int k = -3;
        int expectedOutput = 0;
        int actualOutput;
        try{
            actualOutput = finder.getK_Pairs(n, k);
        }catch (NegativeArraySizeException e){
            actualOutput = 0;
        }
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }

    @Test
    public void testGetK_Pairs_KPositiveNEqual() {
        FindK_PairsIn finder = new FindK_PairsIn();
        int n = 5;
        int k = 5;
        int expectedOutput = 0;
        int actualOutput = finder.getK_Pairs(n, k);
        Assert.assertEquals(expectedOutput, actualOutput);
        System.out.println("-------------------------------------");
        System.out.println("n: " + n + " k: " + k + "\n" + " output: " + actualOutput + " expectedOutput: " + expectedOutput);
    }
}

