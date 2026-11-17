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
    public boolean hasCycle(ListNode head) {
        ListNode curr = head;
        ListNode currnext = head;
        while(currnext != null && currnext.next != null){
            curr = curr.next;
            currnext = currnext.next.next;
            if(curr == currnext){
                return true;
            }
           
        }
        return false;

    }
}
