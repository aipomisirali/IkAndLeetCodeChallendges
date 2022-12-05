package DataStructures;

import org.junit.Test;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public class StackDS {
    @Test
    public void StackFunctions(){

        Stack st=new Stack();
        st.push("hello");
        st.push("hi");
        st.push("drink");
        st.push("cup");
        st.push("IamHappy");

        System.out.println(st.peek());

        System.out.println(st.search("hi"));
        Iterator itr=st.iterator();
// Here with while and foreach
//        while(itr.hasNext()) {
//            Object values = itr.next();
//            System.out.println(values);
//        }
//               st.forEach(var->{System.out.println(var)
//        ;});
//


    ListIterator<String>listitr= st.listIterator(st.size());
    while(listitr.hasPrevious()){
        String str= listitr.previous();
        System.out.println(str);
    }
}}
