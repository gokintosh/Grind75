package org.example.Week1;

import java.util.List;

public class MergeTwoSortedLists {


    public static void main(String[] args) {





    }

    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2){

        ListNode temp = null;
        ListNode head;



//        check for the lowest value in head for the two lists and assign it to the head for resulting list
        if(l1.val>l2.val){
            temp=head= new ListNode(l1.val);
            l1=l1.next;
        }
        if(l2.val>l1.val){
            temp=head=new ListNode(l2.val);
            l2=l2.next;
        }

//        loop until both the lists are not null

        while(!(l1 ==null) || !(l2 ==null)){
            if(l1.val>l2.val){
                temp.next=new ListNode(l1.val);
                l1=l1.next;
            }
            if(l2.val>l1.val){
                temp.next=new ListNode(l2.val);
                l2=l2.next;
            }

        }
        return temp;

    }


    static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode( int val){
            this.val = val;
        }
        ListNode( int val, ListNode next){
            this.val = val;
            this.next = next;
        }
    }
}
