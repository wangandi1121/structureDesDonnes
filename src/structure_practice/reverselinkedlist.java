package structure_practice;

public class reverselinkedlist {

		    public ListNode reverseList(ListNode head) {
		        ListNode cur = head;
		        ListNode pre = null;
		        ListNode temp;
		        while(cur!=null){
		            temp = cur.next;
		            cur.next = pre;
		            pre = cur;
		            cur = temp;
		        }
		        return pre;
		    }
		}

