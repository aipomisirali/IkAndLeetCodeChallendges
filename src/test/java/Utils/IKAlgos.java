package Utils;

import java.util.ArrayList;

public class IKAlgos {

    public static ArrayList<Integer> selection_sort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            // find position of smallest num between (i + 1)th element and last element
            int pos = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(pos))
                    pos = i;
            }
            // Swap min (smallest num) to current position on array
            int tempVar = arr.get(pos);
            arr.set(pos, arr.get(i));
            arr.set(i, tempVar);
        }
        return arr;
    }

    public static ArrayList<Integer> insertion_sort(ArrayList<Integer> arr) {
        for (int j = 1; j < arr.size(); j++) {

            int tempVar = arr.get(j);
            int varOneBefore= j-1;
            while(varOneBefore>=0 && tempVar < arr.get(varOneBefore)){

                arr.set(varOneBefore+1, arr.get(varOneBefore));

                varOneBefore--;

            }

            arr.set(varOneBefore+1,tempVar);
        }
        return arr;
    }

    public static ArrayList<Integer> bubble_sort(ArrayList<Integer> arr) {

        int minNum = 0;
        ArrayList<Integer> NegativeNumbers = new ArrayList<Integer>();
        ArrayList<Integer> PositiveNumbers = new ArrayList<Integer>();
        ArrayList<Integer> FinalArr = new ArrayList<Integer>();



        //  FinalArr.set(pos, arr.get(j+1));
        //  FinalArr.set(j+1, min);}
        if(arr.size()!=2) {
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) >= 0) {

                    PositiveNumbers.add(arr.get(i));
                }

            }
            for (int i = 0; i < arr.size(); i++) {
                if (arr.get(i) < 0) {

                    NegativeNumbers.add(arr.get(i));
                }

            }
        }
        for (int i = 0; i < arr.size() - 1; i++) {
            // find position of smallest num between (i + 1)th element and last element
            int tempIndexHolder = 0;
            for (int j = 0; j < arr.size() - i - 1; j++) {

                if (arr.size() == 2 && arr.get(j + 1) < 0 | arr.get(j) < 0) {
                    int min = arr.get(j);
                    FinalArr.add(arr.get(j + 1));
                    FinalArr.add(min);}}}


        for (int i = 0; i < PositiveNumbers.size() - 1; i++) {
            // find position of smallest num between (i + 1)th element and last element
            int tempIndexHolder  = 0;
            for (int j = 0; j < PositiveNumbers.size() - i - 1; j++) {

                if (PositiveNumbers.get(j) >= 0 & PositiveNumbers.get(j + 1) >= 0 && PositiveNumbers.get(j + 1) < PositiveNumbers.get(j)) {
                    tempIndexHolder  = j;

                    int smalInt = PositiveNumbers.get(j);
                    PositiveNumbers.set(tempIndexHolder , PositiveNumbers.get(j + 1));
                    PositiveNumbers.set(j + 1, smalInt);

                }}}
        for (int i = 0; i < NegativeNumbers.size() - 1; i++) {
            // find position of smallest num between (i + 1)th element and last element
            int tempIndexHolder  = 0;
            for (int j = 0; j < NegativeNumbers.size() - i - 1; j++) {

                if (NegativeNumbers.get(j) < 0 & NegativeNumbers.get(j + 1) < 0 && NegativeNumbers.get(j + 1) < NegativeNumbers.get(j)) {
                    tempIndexHolder  = j;
                    int min = NegativeNumbers.get(tempIndexHolder );

                    NegativeNumbers.set(tempIndexHolder , NegativeNumbers.get(j + 1));
                    NegativeNumbers.set(j + 1, min);
                }

            }
        }
        for (int i = 0; i < NegativeNumbers.size(); i++) {

            FinalArr.add(NegativeNumbers.get(i));
        }
        for (int j = 0; j < PositiveNumbers.size(); j++) {
            FinalArr.add(PositiveNumbers.get(j));
        }
        return FinalArr; }



    public static ArrayList<Integer> mergeSort(ArrayList<Integer>arr) {

        if (arr.size() ==1){
            return arr;
        }
        else {
            int mid=arr.size()/2;
            ArrayList<Integer> left= new ArrayList<Integer>(mid);
            ArrayList<Integer> right=new ArrayList<Integer>(arr.size()-mid);

            for (int i = 0; i < mid; i++) {
                left.add(arr.get(i));
            }

            for (int i = mid; i < arr.size(); i++) {
                right.add(arr.get(i));
            }

            left=mergeSort(left);
            right=mergeSort(right);
            merge(left,right,arr);
        }
        return arr;
    }


    public static void merge (ArrayList<Integer>left,ArrayList<Integer>right,ArrayList<Integer>values) {
        int i1 = 0;// left Index
        int i2 = 0;// right Index
        int InputIndex = 0;


        for (int i = 0; i < values.size(); i++) {

            if (i1 == left.size()) {
                values.set(i, right.get(i2));
                i2++;
            } else {
                if (i2 == right.size()) {
                    values.set(i, left.get(i1));
                    i1++;
                } else {
                    if (left.get(i1) <= right.get(i2)) {
                        values.set(i, left.get(i1));
                        i1++;
                    } else {
                        if (left.get(i1) >= right.get(i2)) {
                            values.set(i, right.get(i2));
                            i2++;
                        }
                    }
                }
            }

        }
    }
}
