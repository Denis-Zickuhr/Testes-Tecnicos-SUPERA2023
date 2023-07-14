package Challenge03;

public class FindK_PairsIn {

    public int getK_Pairs(int n, int k){
        int [] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        int k_matches = 0;

        for (int n1: array
        ) {
            for (int n2: array){
                if (n1 - n2 == k & n1 != n2){
                    k_matches++;
                }
            }
        }
        return k_matches;
    }

}
