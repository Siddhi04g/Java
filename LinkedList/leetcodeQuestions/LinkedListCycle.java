//Ques-141
package LinkedList.leetcodeQuestions;
import LinkedList.LL.*;
public class LinkedListCycle {
    public boolean hasCycle(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
                return true;
        } 
        return false;
    }
}
