
public class nineteen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ListNode node=new ListNode(1);
       node.next=new ListNode(2);
       node=node.next;
       node.next=new ListNode(3);
       node=node.next;
       node.next=new ListNode(4);
       node=node.next;
       node.next=new ListNode(5);
       ListNode newList=removeNthFromEnd(node, 2);
       
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	 ListNode pre=new ListNode(0);
    	 pre.next=head;
    	 ListNode start=pre,end=pre;
    	 while(n!=0) {
    		 start=start.next;
    		 n--;
    	 }
    	 while(start.next!=null) {
    		 start=start.next;
    		 end=end.next;
    	 }
    	 end.next=end.next.next;
    	 return pre.next;
	}
}
