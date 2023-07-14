package Challenge01;

import javax.swing.*;

public class ListInsertionSorter extends SortableList {
    public ListInsertionSorter(int[] list) {
        super(list);
    }

    public int[] sort(SortOrder order) {
        int n = this.list.length;

        for (int i = 1; i < n; i++) {
            int key = this.list[i];
            int j = i - 1;

            if (order == SortOrder.ASCENDING) {
                while (j >= 0 && this.list[j] > key) {
                    this.list[j + 1] = this.list[j];
                    j--;
                }
            } else {
                while (j >= 0 && this.list[j] < key) {
                    this.list[j + 1] = this.list[j];
                    j--;
                }
            }

            this.list[j + 1] = key;
        }

        return this.list;
    }
}
