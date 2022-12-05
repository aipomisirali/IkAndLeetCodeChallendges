package DataStructures;

public class LinkedList {
    Node head;

    public static LinkedList insert(LinkedList list, int data){
        //Create a new node with given data
    Node new_node=new Node(data);

        // If the Linked List is empty,
        // then make the new node as head

    if(list.head==null){
        list.head=new_node;}
    else{
        // Else traverse till the last node
        // and insert the new_node there
        Node last=list.head;
        while(last.next!=null) {
            last=last.next;

        }
        // Insert the new_node at last node
        last.next=new_node;
    }
        // Return the list by head
    return list;}
    public static LinkedList inserString(LinkedList list, String data2){
        //Create a new node with given data
        Node new_node=new Node(data2);

        // If the Linked List is empty,
        // then make the new node as head

        if(list.head==null){
            list.head=new_node;}
        else{
            // Else traverse till the last node
            // and insert the new_node there
            Node last=list.head;
            while(last.next!=null) {
                last=last.next;

            }
            // Insert the new_node at last node
            last.next=new_node;
        }
        // Return the list by head
        return list;}

    public static void print_linked_list(LinkedList list){
        Node current_Node=list.head;
        System.out.println("Linkedlist; ");
        while(current_Node!=null){
            System.out.println(current_Node.data2+ " ");
            current_Node=current_Node.next;

        }
        }

}
