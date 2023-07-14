package Challenge01;

import javax.swing.*;

public abstract class SortableList {
    private int index = 0;
    protected int[] list;
    public abstract int[] sort(SortOrder sortOrder);

    public SortableList(int[] list){
        this.list = list;
    }

    public void place(int value){
        this.list[index] = value;
        index++;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int elem: list){
            sb.append(elem);
            sb.append("\n");
        }
        return sb.toString();
    }
}
