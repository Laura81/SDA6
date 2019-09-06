package bubble;

import java.util.Arrays;

public class BubbleSort {
   private int[] elements;

    @Override
    public String toString() {
        return Arrays.toString(elements);
    }

    public int[] sortBubbleMethod(int[] elements){
        System.out.println("Initial"+Arrays.toString(elements));
        int z=0;
        for(int i=0; i<elements.length-1; i++){
            for (int j=i; j<elements.length-i;j++){
                if (elements[j-1]>elements[j]){
                    z=elements[j-1];
                    elements[j-1]=elements[j];
                    elements[j]=z;
                }
            }
            System.out.println(Arrays.toString(elements));
        }
        return elements;

    }


}
