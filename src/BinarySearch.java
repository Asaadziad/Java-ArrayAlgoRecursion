package src;

public class BinarySearch {
	
	public static int getXofArrayAux(int[] arr, int x, int head, int last) {
		int midArray = head + (head+last)/2;
		if(arr[midArray] == x) { 
			return midArray;
		} else if(arr[midArray] > x) {
			return getXofArrayAux(arr, x, head, midArray);
		} else if(arr[midArray] < x) {
			return getXofArrayAux(arr, x, midArray + 1, last);
		}
		return -1;
	}
	public static int getXofArray(int[] arr, int X) {
		return getXofArrayAux(arr, X, 0, arr.length - 1);
	}
	
}
