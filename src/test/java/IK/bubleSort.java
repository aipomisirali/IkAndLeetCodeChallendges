package IK;

import Utils.IKAlgos;
import Utils.QuickSRT;
import org.junit.Test;

import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bubleSort {

    @Test
    public void testBubleSort() {
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        arr.add(5);
        arr.add(8);
        arr.add(3);
        arr.add(9);
        arr.add(4);
       arr.add(1);


        QuickSRT.quickSort(arr);
       IKAlgos.mergeSort(arr);

    }}


