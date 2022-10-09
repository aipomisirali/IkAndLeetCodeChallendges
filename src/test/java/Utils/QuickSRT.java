package Utils;

import java.util.ArrayList;
import java.util.Random;

public class QuickSRT {


    public static ArrayList<Integer> quickSort(ArrayList<Integer> arr) {
        int start=0;
        int end =arr.size()-1;

           ArrayList<Integer> arr2=aipo(arr, start,end);
        return arr2;
    }
    static ArrayList<Integer> aipo(ArrayList<Integer> arr, int start, int end) {
        if (start < end) {
            /* pi is partitioning index, arr[pi] is
            now at right place */
            int pi = Partition(arr, start, end);

            // Recursively sort elements before
            // partition and after partition
            aipo(arr, start, pi - 1);
            aipo(arr, pi + 1, end);
        }

        return arr;}

        public static int Partition(ArrayList<Integer> arr, int start, int end){


        random(arr,start,end);
            int smaller = (start-1);
            int pivot=arr.get(end);

            for (int j =start; j < end; j++) {
                if (arr.get(j)<pivot) {
                    smaller++;
                    // swap arr[i] and arr[j]
                    int temp = arr.get(smaller);
                    arr.set(smaller, arr.get(j));
                    arr.set(j, temp);
                }}
            int temp = arr.get(smaller+1);


            arr.set(smaller+1,arr.get(end));
            arr.set(end,temp);

            return smaller+1;

    } static void random(ArrayList<Integer> arr, int start, int end)
    {

        Random rand= new Random();
        int pivot = rand.nextInt(end-start)+start;

        int temp1=arr.get(pivot);
        arr.set(pivot,arr.get(end));
        arr.set(end,temp1);
    } }






