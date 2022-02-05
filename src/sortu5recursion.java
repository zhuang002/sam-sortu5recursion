
public class sortu5recursion {
	public static final int ZERO = 0;
	public static final int NPOS = -1;
	
	public static int some_search(int[] arr, int x) {
		/* Student implementation begins here */ 
		
		/* Student implementation ends here */ 
		
		return searchInRange(arr, x, 0, arr.length-1);
	}

	private static int searchInRange(int[] arr, int x, int begin, int end) {
		// TODO Auto-generated method stub
		if (begin<0 || begin>end || end>=arr.length) return -1;
		
		if (begin == end) {
			if (arr[begin] == x) return begin;
			else return -1;
		}
		
		int posX = begin+ (int)((x-arr[begin])*(end-begin)/(arr[end]-arr[begin]));
		if (posX<begin) posX = begin;
		if (posX>end) posX = end;
		if (posX==arr[posX]) {
			return posX;
		} else if (posX<arr[posX]){
			end = posX-1;
			return searchInRange(arr,x,begin,end);
		} else {
			begin = posX+1;
			return searchInRange(arr,x,begin,end);
		}
	}

}
