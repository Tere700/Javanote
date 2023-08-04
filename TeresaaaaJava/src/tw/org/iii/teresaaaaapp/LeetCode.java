package tw.org.iii.teresaaaaapp;

public class LeetCode {

	public int[] twoSum(int[] nums, int target) {
		
		//nums = [2,7,11,15], target = 9
		int a =nums.length;
		int[]ans = new int [2];
		for(int i=0; i<nums.length; i++) {
			for(int j=i+1; j<nums.length; j++) {
				if (nums[i]+nums[j]==target) {
					//return new int [] {i,j};
					ans[0]=i;
					ans[1]=j;
				}//else {return new int [] {i,j}, null;}
			}
		}
		
		//return new int [0];
		return ans;
    }
	}

	

		
		
		
		
 