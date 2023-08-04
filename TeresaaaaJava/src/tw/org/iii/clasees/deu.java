package tw.org.iii.clasees;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class deu {

	public static void main(String[] args) {
		int []nums = {1,3,5,6};
		int newArray[] = new int [nums.length+1];
		int k =5;
		int j =0;
		for(int i=0; i<nums.length;i++) {
				if( k==nums[i]) {
						System.out.println(i);
						break;
				}else if (k!=nums[i]){
					newArray[i]=nums[i];
					newArray[i]=k;
						for(int e: newArray) {
						//System.out.println(e);
					}
					}
					
				}

	} 
	
	}

//class Solution {
//    public int removeElement(int[] nums, int val) {
//    	int n=0;
//    	LinkedList<String> e = new LinkedList<>();
//		for(int i=0; i<nums.length;i++) {
//				if( val!=nums[i]) {
//						e.add(String.valueOf(nums[i]));	
//						n++;
//				}	
//			}return n;
//    	}
//}