package tw.org.iii.teresaaaaapp;

public class test {

	public static void main(String[] args) {
		int[] nums = {1,1,2};
		int[] expectedNums = {1,2};
		int k = 0;
		
		assert k == expectedNums.length;
		for(int i=0; i<k; i++) {
			
		}
		
	}

}

class Solution {
    public int strStr(String haystack, String needle) {
        int index =haystack.indexOf(needle);
        System.out.println(index);
        return index;
    }
} 