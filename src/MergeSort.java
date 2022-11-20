package src;

public class MergeSort {
	
	public static void addRest(int[] arr,int arrIndex, int[] targetArr,int targetIndex) {
		while(arrIndex < arr.length) {
			targetArr[targetIndex] = arr[arrIndex];
			arrIndex++;
			targetIndex++;
		}
	}
	
	public static void merge(int[] a, int[] b,int c[]) {
		int bSize = b.length;
		int aSize = a.length;
		int cSize = aSize + bSize;
		
		int currentIndex = 0;
		int aIndex = 0;
		int bIndex = 0;
		
		while(aIndex < aSize && bIndex < bSize) {
			if(a[aIndex] <= b[bIndex]) {
				c[currentIndex] = a[aIndex];
				aIndex++;
			} else {
				c[currentIndex] = b[bIndex];
				bIndex++;
			}
			currentIndex++;
		}
		addRest(a, aIndex, c, currentIndex);
		addRest(b, bIndex, c, currentIndex);

	}
	public static void copyTo(int[] arr,int arrSize, int[] target,int start, int targetSize) {
		int arrIndex = start;
		int targetIndex = 0;
		while(targetIndex < targetSize && arrIndex < arrSize) {
			target[targetIndex] = arr[arrIndex];
			targetIndex++;
			arrIndex++;
		}

	}
	public static void mergeSortAux(int[] arr,int size) {
		if(size <= 1) return;
		
		int mid = size/2;
		
		int[] a = new int[mid];
		int[] b = new int[size-mid];
		
		copyTo(arr, size, a, 0, mid);
		copyTo(arr, size, b, mid, size);
		
		mergeSortAux(a,  mid);
		mergeSortAux(b, size-mid);
		
		
		merge(a, b, arr);
	}
	
	public static void mergeSort(int[] arr) {
		mergeSortAux(arr, arr.length);
	}

}
