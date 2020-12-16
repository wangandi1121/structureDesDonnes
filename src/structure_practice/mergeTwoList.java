package structure_practice;

public class mergeTwoList {
	public ListNode mergeTwoList(ListNode l1,ListNode l2) {
		ListNode res1 = new ListNode();
		ListNode res = res1;
		while(l1!=null&&l2!=null) {
			if(l1.val<l2.val) {
			res.next = l1;
			res = res.next;
			l1 = l1.next;
			}
			else {
			res.next = l2;
			res = res.next;
			l2 = l2.next;
			}
		if(l1==null) {
			res.next = l2;
		}
		else {
			res.next = l1;
		}
		
	}
		return res1.next;
	}
	
}
