package src;

public class GetMaxOfArray {
	
	public static int getMax(int[] arr) {
		int max = arr[0];
		for(int i = 0; i<arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
	public static int getMaxRecursionAux(int[] arr, int head, int last) {
		if(last - head <= 1) return arr[head] > arr[last] ? arr[head] : arr[last];
		
		int midArray = head + (head+last)/2;
		int max1 = getMaxRecursionAux(arr, head, midArray);
		int max2 = getMaxRecursionAux(arr, midArray + 1, last);
		
		return (max1 > max2 ? max1 : max2);
		
	}
	public static int getMaxRecursion(int[] arr) {
		return getMaxRecursionAux(arr, 0, arr.length - 1);
	}
	
	public static void main(String args[]) {
		int[] test = {3,4,5,6,7};
		int maxTest = getMaxRecursion(test);
		System.out.println(maxTest);
	}

}
