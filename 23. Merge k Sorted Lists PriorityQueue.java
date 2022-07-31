/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pQueue = new PriorityQueue<ListNode>(Comparator.comparing(e -> e.val));
        
        for(int i=0;i<lists.length;i++) {
            ListNode q = lists[i];
            while(q!=null) {
                pQueue.add(q);
                q=q.next;
            }
        }
        
        ListNode res =pQueue.poll();
        ListNode p=res;
        while(!pQueue.isEmpty()) {
            p.next=pQueue.poll();
            p=p.next;
            p.next=null;
        }
        return res;
    }
}
