package structure_practice;

public class listCycle {
    public ListNode detectCycle(ListNode head) {
    	ListNode slow = head;
        ListNode fast = head;
        while(true){
            if(fast == null||fast.next == null){
                return null;
            }
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow) break;
        }
        fast = head;
        //每走a+nb步都会到入口点，slow指针已经走过nb步。
        while(slow!=fast) {
        	slow = slow.next;
        	fast = fast.next;
        }
        return fast;
    }
}

