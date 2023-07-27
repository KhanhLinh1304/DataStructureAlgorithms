
public class MangD {
	private static boolean isSorted(int[] a) {
		int mt = 0;
		for(int i=0; i<a.length-1; i++) {
			if(a[i] > a[i+1]) {
				return false;
			}else {
				
				mt=1;
			}
		}
		if(mt == 1) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		int[] a = {1, 2, 3, 4,15, 5, 6, 7,8,9};
		System.out.println(isSorted(a));
		
	}
}
