package Challenge01;

import javax.swing.*;

public class ListBubbleSorter extends SortableList{
    public ListBubbleSorter(int[] list) {
        super(list);
    }

    public int[] sort(SortOrder order) {
        int n = this.list.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                boolean swap;
                if (order == SortOrder.ASCENDING){
                    swap = this.list[j] > this.list[j + 1];
                }else{
                    swap = this.list[j] < this.list[j + 1];
                }
                if (swap) {
                    int temp = this.list[j];
                    this.list[j] = this.list[j + 1];
                    this.list[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
        }
        return this.list;
    }
}
