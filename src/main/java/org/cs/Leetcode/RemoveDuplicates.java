package org.cs.Leetcode;

/*
* Definition for singly-linked list.
* More about linked-list : https://github.com/ZQR0/CompScieJourney/tree/master/src/main/java/org/cs/DataStructures/LinkedList
*/
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

 /*
 @author ZQR0
 @since 24.12.2022
 * Main solution for removing duplicates
 */
public class RemoveDuplicates {
    /*
    * @method deleteDuplicates
    * @param ListNode head - the node of list
    * @return ListNode head without duplicated values
    */
    public ListNode deleteDuplicates(ListNode head) {
        ListNode array = head;

        while (array != null) {
            if (array.next == null) {
                break;
            }

            if (array.val == array.next.val) {
                array.next = array.next.next;
            } else {
                array = array.next;
            }
        }

        return head;
    }
}
