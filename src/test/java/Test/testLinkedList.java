package Test;


import DataStructures.LinkedList;
import org.junit.Test;

public class testLinkedList {
    @Test
    public void test_on_insertionlinkedlist(){
        LinkedList list = new LinkedList();

        LinkedList.insert(list,8);
        LinkedList.insert(list,89);
        LinkedList.insert(list,90);
        LinkedList.insert(list,34);
        LinkedList.insert(list,45);
        LinkedList.insert(list,77);
        LinkedList.insert(list,88);
        LinkedList.insert(list,89);
        LinkedList.insert(list,23);
        LinkedList.print_linked_list(list);


    }
    @Test
    public void test_on_insertionStringlinkedlist(){
        LinkedList list = new LinkedList();

        LinkedList.inserString(list,"hi");
        LinkedList.inserString(list,"hoi");
        LinkedList.inserString(list,"dow");
        LinkedList.inserString(list,"move");
        LinkedList.inserString(list,"soi");

        LinkedList.print_linked_list(list);


    }

}
