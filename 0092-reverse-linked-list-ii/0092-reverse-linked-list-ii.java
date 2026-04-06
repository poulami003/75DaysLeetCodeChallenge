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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack <Integer> st=new Stack<>();
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            if(count>=left && count<=right){
                st.push(temp.val);
            }

            if(count>right){
                break;
            }
            temp=temp.next;
        }

        temp=head;
        count=0;
        while(temp!=null){
            count++;
            if(count>=left && count<=right){
                temp.val=st.peek();
                st.pop();
            }
            if(count>right){
                break;
            }
            temp=temp.next;
        }

        return head;
    }
}