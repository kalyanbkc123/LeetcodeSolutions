import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Node
{
    int data;

    Node next;

    Node(int data,Node next)
    {
        this.data = data;
        this.next = next;
    }

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }

}


public class MergeTwoSortedLL9 {

    static Node convertArrToLinkedList(ArrayList<Integer> arr)
    {
        // create a dummy node to serve..

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        // Iterate through the array and
        // create nodes with array elements
        for(int i=0; i < arr.size(); i++)
        {
            temp.next = new Node(arr.get(i));

            temp = temp.next;
        }

        return dummyNode.next;

    }

    static Node sortTwoLinkedLists(Node list1,Node list2)
    {

        ArrayList<Integer> arr = new ArrayList<>();
        Node temp1 = list1;
        Node temp2 = list2;

        while(temp1 != null)
        {
            arr.add(temp1.data);

            temp1 = temp1.next;
        }

        while(temp2 != null)
        {
            arr.add(temp2.data);
            temp2 = temp2.next;
        }

        Collections.sort(arr);

        Node head = convertArrToLinkedList(arr);

        return head;
    }

    static void printLinkedList(Node head)
    {
        Node temp = head;

        while(temp != null)
        {
            System.out.println(temp.data+" ");

            temp = temp.next;
        }
        System.out.println();
    }

    static Node mergeTwoSortedLists(Node list1,Node list2)
    {
        Node dummyNode = new Node(-1);
        Node temp =  dummyNode;

        while(list1 != null && list2 != null)
        {
            if(list1.data <= list2.data)
            {
                temp.next = list1;
                list1.next = list1;
            }
            else
            {
                temp.next = list2;
                list2.next = list2;
            }
            temp = temp.next;
        }

        if(list1 != null) temp.next = list1;
        else
            temp.next = list2;

        return dummyNode.next;
    }

    public static void main(String[] args) {

        Node list1 = new Node(1);
        list1.next = new Node(3);
        list1.next.next = new Node(5);

        Node list2 = new Node(2);
        list2.next = new Node(4);
        list2.next.next = new Node(6);

        System.out.println("First sorted linked list:");
        printLinkedList(list1);

        System.out.println("Second sorted linked list: ");
        printLinkedList(list2);

        Node mergedList = mergeTwoSortedLists(list1,list2);

        System.out.println("Merged sorted linked list");
        printLinkedList(mergedList);

    }
}
