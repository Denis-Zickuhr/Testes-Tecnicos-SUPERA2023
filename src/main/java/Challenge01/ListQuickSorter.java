package Challenge01;

import javax.swing.*;

public class ListQuickSorter extends SortableList {
    public ListQuickSorter(int[] list) {
        super(list);
    }

    public int[] sort(SortOrder order) {
        quickSort(0, this.list.length - 1, order);
        return this.list;
    }

    private void quickSort(int low, int high, SortOrder order) {
        if (low < high) {
            int pivotIndex = partition(low, high, order);
            quickSort(low, pivotIndex - 1, order);
            quickSort(pivotIndex + 1, high, order);
        }
    }

    private int partition(int low, int high, SortOrder order) {
        int pivot = this.list[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if ((order == SortOrder.ASCENDING && this.list[j] < pivot) ||
                    (order == SortOrder.DESCENDING && this.list[j] > pivot)) {
                i++;
                swap(i, j);
            }
        }

        swap(i + 1, high);
        return i + 1;
    }

    private void swap(int i, int j) {
        int temp = this.list[i];
        this.list[i] = this.list[j];
        this.list[j] = temp;
    }
}

