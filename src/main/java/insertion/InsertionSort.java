package insertion;

public class InsertionSort {

    public void sort(int[] arrToSort) {
        for(int i=1; i<arrToSort.length; i++){
            int j=i-1;
            int key=arrToSort[i];

            while(j>=0 && arrToSort[j]>key){
                arrToSort[j+1]=arrToSort[j];
                j=j-1;
            }
            arrToSort[j+1]=key;
        }
    }
}
