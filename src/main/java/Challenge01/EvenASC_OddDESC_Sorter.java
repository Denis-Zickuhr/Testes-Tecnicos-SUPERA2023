package Challenge01;

import javax.swing.*;

/**
 * author Denis Zickuhr
 *
 * <p>
 * Considerando a entrada de valores inteiros não negativos, ordene estes valores segundo
 * o seguinte critério:
 * • Primeiro os Pares
 * • Depois os Ímpares
 * Sendo que deverão ser apresentados os pares em ordem crescente e depois os ímpares
 * em ordem decrescente.
 */
public class EvenASC_OddDESC_Sorter {

    private final SortableList even;
    private final SortableList odd;
    private final int[] sorted_dataset;


    public EvenASC_OddDESC_Sorter(int[] dataset, SortingOptions sortingOptions) throws Exception {

        // obtains even and numbers dataset sizes
        int evenCounter = 0;
        for (int entry : dataset
        ) {
            if (entry % 2 == 0)
                evenCounter++;
        }

        // instantiate SortableLists
        switch (sortingOptions) {
            case BUBBLE_SORTING -> {
                even = new ListBubbleSorter(new int[evenCounter]);
                odd = new ListBubbleSorter(new int[dataset.length - evenCounter]);
            }
            case INSERTION_SORTING -> {
                even = new ListInsertionSorter(new int[evenCounter]);
                odd = new ListInsertionSorter(new int[dataset.length - evenCounter]);
            }
            case QUICK_SORTING -> {
                even = new ListQuickSorter(new int[evenCounter]);
                odd = new ListQuickSorter(new int[dataset.length - evenCounter]);
            }
            default -> throw new Exception("invalid sortingOptions!");
        }

        // parse dataset into correct arrays
        for (int entry : dataset
        ) {
            if (entry % 2 == 0) {
                even.place(entry);
            } else {
                odd.place(entry);
            }
        }


        // sort lists based on need
        even.sort(SortOrder.ASCENDING);
        odd.sort(SortOrder.DESCENDING);

        sorted_dataset = new int[even.list.length + odd.list.length];

        System.arraycopy(even.list, 0, sorted_dataset, 0, even.list.length);
        System.arraycopy(odd.list, 0, sorted_dataset, even.list.length, odd.list.length);

    }

    public int[] getSorted_dataset() {
        return sorted_dataset;
    }

    @Override
    public String toString() {
        return even + "" + odd;
    }

}
