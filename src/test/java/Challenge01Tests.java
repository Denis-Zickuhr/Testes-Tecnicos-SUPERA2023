import Challenge01.EvenASC_OddDESC_Sorter;
import Challenge01.ListBubbleSorter;
import Challenge01.ListInsertionSorter;
import Challenge01.ListQuickSorter;
import Challenge01.SortingOptions;
import org.junit.Assert;
import org.junit.Test;

import javax.swing.*;
import java.util.Arrays;

public class Challenge01Tests {

    int[] input = {10,
            4,
            32,
            34,
            543,
            3456,
            654,
            567,
            87,
            6789,
            98
    };
    int[] expectedOutput = {4,
            10,
            32,
            34,
            98,
            654,
            3456,
            6789,
            567,
            543,
            87};

    @Test
    public void testBubbleSort() {

        System.out.println("Bubble sorting test");
        System.out.println("----------------------------------");

        int[] input = {5, 3, 8, 2, 1};
        int[] expectedOutput = {1, 2, 3, 5, 8};

        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));

        ListBubbleSorter bubbleSorter = new ListBubbleSorter(input);
        int[] sortedArray = bubbleSorter.sort(SortOrder.ASCENDING);

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("OUTPUT");
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    public void testInsertionSort() {

        System.out.println("Insertion sorting test");
        System.out.println("----------------------------------");

        int[] input = {5, 3, 8, 2, 1};
        int[] expectedOutput = {1, 2, 3, 5, 8};

        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));

        ListInsertionSorter insertionSorter = new ListInsertionSorter(input);
        int[] sortedArray = insertionSorter.sort(SortOrder.ASCENDING);

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("OUTPUT");
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    public void testQuickSort() {

        System.out.println("Quick sorting test");
        System.out.println("----------------------------------");

        int[] input = {5, 3, 8, 2, 1};
        int[] expectedOutput = {1, 2, 3, 5, 8};

        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));

        ListQuickSorter quickSorter = new ListQuickSorter(input);
        int[] sortedArray = quickSorter.sort(SortOrder.ASCENDING);

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("OUTPUT");
        System.out.println(Arrays.toString(sortedArray));
    }

    @Test
    public void testCorrectSortBubbleSort() throws Exception {

        System.out.println("Rearrange with Bubble sorting test");
        System.out.println("----------------------------------");

        EvenASC_OddDESC_Sorter challenge01 = new EvenASC_OddDESC_Sorter(input, SortingOptions.BUBBLE_SORTING);
        int[] sortedArray = challenge01.getSorted_dataset();

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));
        System.out.println("OUTPUT");
        System.out.println(challenge01);
    }

    @Test
    public void testCorrectSortQuickSort() throws Exception {

        System.out.println("Rearrange with Quick sorting test");
        System.out.println("----------------------------------");

        EvenASC_OddDESC_Sorter challenge01 = new EvenASC_OddDESC_Sorter(input, SortingOptions.QUICK_SORTING);
        int[] sortedArray = challenge01.getSorted_dataset();

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));
        System.out.println("OUTPUT");
        System.out.println(challenge01);
    }

    @Test
    public void testCorrectSortInsertionSort() throws Exception {

        System.out.println("Rearrange with Insertion sorting test");
        System.out.println("----------------------------------");

        EvenASC_OddDESC_Sorter challenge01 = new EvenASC_OddDESC_Sorter(input, SortingOptions.INSERTION_SORTING);
        int[] sortedArray = challenge01.getSorted_dataset();

        Assert.assertArrayEquals(expectedOutput, sortedArray);
        System.out.println("INPUT: ");
        System.out.println(Arrays.toString(input));
        System.out.println("OUTPUT");
        System.out.println(challenge01);
    }

}