package Array;

import java.util.ArrayList;

/*Given nums = [3,2,2,3], val = 3,

Your function should return length = 2, with the first two elements of nums being 2
*/

public class Solution {

	public static void main(String[] args) {
		int[] nums1 = {3,2,2,3};
		int[] nums2 = {0,1,2,2,3,0,4,2};
		int result =removeElement(nums1,3);
		int result2 =removeElement(nums2,2);
		
		System.out.println(result+" "+result2);
		
		
		

	}
	public static int removeElement(int[] nums , int val) {
		ArrayList<Integer> al = new ArrayList();
		int count = 0;
		
		for(int i = 0 ; i<nums.length;i++) {
			if(nums[i]!=val) {
				al.add(nums[i]);
			}
		}
		
		for (Integer number : al) {
			count++;
		}
		
		return count;
		
	}

}
