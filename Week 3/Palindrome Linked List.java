class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> arr = new ArrayList<Integer>();

        while(head!=null){
            arr.add(head.val);
            head = head.next;
        }

        int left =0, right = arr.size()-1;
        while(left<=right){
            if(arr.get(left)!=arr.get(right)){
            return false;
        }
        else{
            left++;
            right--;
        }
        }
        return true;
    }
}
