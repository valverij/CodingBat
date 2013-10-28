package valverij.codingbat;

/**
 * Solutions for problems from <a href='http://codingbat.com/java/Array-1'>CodingBat Array-1</a>
 */
public class Array1 {

	/**
	 * Given an array of ints, return true if 6 appears as either the first or last element in the array. 
	 * The array will be length 1 or more.
	 */
	public boolean firstLast6(int[] nums) {		
		return nums[0] == 6 || nums[nums.length - 1] == 6;
	}
	
	/**
	 * Given an array of ints, return true if the array is length 1 or more, 
	 * and the first element and the last element are equal
	 */
	public boolean sameFirstLast(int[] nums) {
		return nums.length > 0 && nums[0] == nums[nums.length - 1];
	}
	
	/** Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4} */
	public int[] makePi() {
		return new int[] {3, 1, 4};
	}
	
	/** 
	 * Given 2 arrays of ints, a and b, return true if they have the same first element or they have 
	 * the same last element. Both arrays will be length 1 or more. 
	 */
	public boolean commonEnd(int[] a, int[] b) {
		return a[0] == b[0] || a[a.length-1] == b[b.length-1];
	}
	
	/** Given an array of ints length 3, return the sum of all the elements */
	public int sum3(int[] nums) {
		int sum = 0;
		for(int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;
		
		// codingbat wanted it done like this, but I couldn't bring myself to actually do it:
		// return nums[0] + nums[1] + nums[2];
	}
	
	/** Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1} */
	public int[] rotateLeft3(int[] nums) {
		int[] retVal = new int[nums.length];
		
		for(int i = 0; i < nums.length; i++) {
			retVal[i] = nums[(i + 1) % nums.length]; // example: 1 % 3 = 1; 2 % 3 = 2; 3 % 3 = 0
		}		
		
		return retVal; 
	}
	
	/** Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1} */
	public int[] reverse3(int[] nums) {		
		int temp;				
		for(int i = 0; i < nums.length / 2; i++) {
			temp = nums[i];
			nums[i] = nums[nums.length - 1 - i];
			nums[nums.length - 1 - i] = temp;
		}		
		return nums;
	}
	
	/**
	 * Given an array of ints length 3, figure out which is larger between the first and last elements in the array,
	 * and set all the other elements to be that value. Return the changed array. 
	 */
	public int[] maxEnd3(int[] nums) {
		int max = nums[0] > nums[nums.length - 1] ? nums[0] : nums[nums.length - 1];
		for(int i = 0; i < nums.length; i++)
			nums[i] = max;
		return nums;
	}
	
	/** 
	 * Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
	 * just sum up the elements that exist, returning 0 if the array is length 0.  
	 */
	public int sum2(int[] nums) {
		int sum = 0;
		for(int i = 0; i < 2 && i < nums.length; i++) {
			sum += nums[i];
		}
		return sum;		
	}
	
	/** 
	 * Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
	 */
	public int[] middleWay(int[] a, int[] b) {		
		return new int[] { a[1], b[1] };
	}
	
	/** 
	 * Given an array of ints, return a new array length 2 containing the first and last elements from the original array. 
	 * The original array will be length 1 or more.
	 */
	public int[] makeEnds(int[] nums) {		
		return new int[] { nums[0], nums[nums.length - 1] };
	}
	
	/** 
	 * Given an int array length 2, return true if it contains a 2 or a 3
	 */
	public boolean has23(int[] nums) {
		for(int num : nums){
			if(num == 2 || num == 3) {
				return true;
			}
		}
		return false;
	}
	
	/** 
	 * Given an int array length 2, return true if it contains a 2 or a 3
	 */
	public boolean no23(int[] nums) {
		for(int num : nums){
			if(num == 2 || num == 3) {
				return false;
			}
		}
		return true;
	}
	
	/** 
	 * Given an int array, return a new array with double the length where its last element is the same as the original array, 
	 * and all the other elements are 0. The original array will be length 1 or more. 
	 * Note: by default, a new int array contains all 0's.
	 */
	public int[] makeLast(int[] nums) {
		int[] retVal = new int[nums.length * 2];
		retVal[retVal.length - 1] = nums[nums.length - 1]; 
		return retVal;
	}
	
	/** 
	 * Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2
	 */
	public boolean double23(int[] nums) {
		int count2 = 0, count3 = 0;		
		for(int num : nums){
			if(num == 2) {
				count2++;
			}
			else if(num == 3) {
				count3++;
			}
		}
		return count2 >=2 || count3 >=2;
	}
	
	/** 
	 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. 
	 * Return the changed array.
	 */
	public int[] fix23(int[] nums) {
		for(int i = 1; i < nums.length; i++) {
			if(nums[i - 1] == 2 && nums[i] == 3) {
				nums[i] = 0;
			}
		}
		return nums;
	}
	
	/** 
	 * Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
	 */
	public int start1(int[] a, int[] b) {
		int count = 0;
		if(a.length > 0 && a[0] == 1) count++;
		if(b.length > 0 && b[0] == 1) count++;
		return count;
	}
	
	/** 
	 * Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
	 * Return the array which has the largest sum. In event of a tie, return a.
	 */
	public int[] bigger2(int[] a, int[] b) {
		int sum_a = 0, sum_b = 0;
		
		for(int i = 0; i < a.length; i++) {
			sum_a += a[i];
		}
		
		for(int i = 0; i < b.length; i++) {
			sum_b += b[i];
		}
		
		if(sum_b > sum_a) return b;
		
		return a;
	}
	
	/** 
	 * Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. 
	 * The original array will be length 2 or more.
	 */
	public int[] makeMiddle(int[] nums) {
		int[] retVal = new int[2];
		int endIndex = nums.length/2;
		
		retVal[0] = nums[endIndex - 1]; 
		retVal[1] = nums[endIndex];
				
		return retVal;
	}
	
	/** 
	 * Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
	 */
	public int[] plusTwo(int[] a, int[] b) {
		int[] retVal = new int[4];		
		
		retVal[0] = a[0];
		retVal[1] = a[1];
		retVal[2] = b[0];
		retVal[3] = b[1];
		
		return retVal;
		
		/* I like this way more, but CodeingBat throws an error: "code should not use println or class or static or exceptions"		 
		int[] retVal = new int[a.length + b.length];		
		System.arraycopy(a, 0, retVal, 0, a.length);
		System.arraycopy(b, 0, retVal, a.length, b.length);		
		return retVal;
		*/
	}
	
	/** 
	 * Given an array of ints, swap the first and last elements in the array. 
	 * Return the modified array. The array length will be at least 1. 
	 */
	public int[] swapEnds(int[] nums) {
		int end = nums[nums.length - 1];
		nums[nums.length - 1] = nums[0];
		nums[0] = end;
		return nums;
	}
	
	/**
	 * Given an array of ints of odd length, return a new array length 3 containing the elements 
	 * from the middle of the array. The array length will be at least 3.
	 */
	public int[] midThree(int[] nums) {
		int[] retVal = new int[3];
		int endIndex = nums.length/2;
		
		retVal[0] = nums[endIndex - 1]; 
		retVal[1] = nums[endIndex];
		retVal[2] = nums[endIndex + 1];
				
		return retVal;
	}

	/**
	 * Given an array of ints of odd length, look at the first, last, and middle values 
	 * in the array and return the largest. The array length will be a least 1.
	 */
	public int maxTriple(int[] nums) {
		int middle = nums.length / 2;		
		
		int retVal = nums[0];
		
		if(retVal < nums[middle]) retVal = nums[middle];
		if(retVal < nums[nums.length - 1]) retVal = nums[nums.length - 1];
		
		return retVal;
	}
	
	/**
	 * Given an int array of any length, return a new array of its first 2 elements. 
	 * If the array is smaller than length 2, use whatever elements are present.
	 */
	public int[] frontPiece(int[] nums) {
		int length = nums.length < 2 ? nums.length : 2;
		int[] retVal = new int[length];
		
		for(int i = 0; i < length; i++) {
			retVal[i] = nums[i];
		}
				
		return retVal;
	}
	
	/** 
	 * We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1.
	 * Return true if the given array contains an unlucky 1 in the first 2 or last 2 positions in the array.
	 */
	public boolean unlucky1(int[] nums) {		
		if(nums.length >= 2)
		{	
			if((nums[0] == 1 && nums[1] == 3) || (nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3)) {
				return true;
			}
			else if(nums.length >= 3 && nums[1] == 1 && nums[2] == 3) {
				return true;
			}			 
		}
		return false;
	}
	
	/** 
	 * Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, 
	 * the elements from a followed by the elements from b. The arrays may be any length, 
	 * including 0, but there will be 2 or more elements available between the 2 arrays. 
	 */
	public int[] make2(int[] a, int[] b) {
		int[] retVal = new int[2];
		int counter;
		
		for(counter = 0; counter < a.length && counter < retVal.length; counter++){
			retVal[counter] = a[counter];
		}
	
		for(int i = 0; i < b.length && counter < retVal.length; i++, counter++) {
			retVal[counter] = b[i];
		}
		
		return retVal;		
	}
	
	/** 
	 * Given 2 int arrays, a and b, of any length, return a new array with the first element of each array. 
	 * If either array is length 0, ignore that array. 
	 */
	public int[] front11(int[] a, int[] b) {		
		int[] retVal = new int[0];
		
		if(a.length > 0) {
			retVal = new int[1];
			retVal[0] = a[0]; 
		}
		
		if(b.length > 0) {
			int[] temp = retVal.clone();
			int index = 0;
			retVal = new int[temp.length + 1];
			if(temp.length > 0) retVal[index++] = temp[0];
			retVal[index] = b[0]; 
		}
		
		return retVal;		
	}
}
