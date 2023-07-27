
public class Mang {
	
	private static boolean isSort(int[] a) {
		if(a.length<2) return true;
		for(int i = 1; i<a.length; i++)
			if(a[i] > a[i-1]) 
				return false;
			return true;
	}
	private static boolean isSort2(int[] a) {
	    for (int i = 0; i < a.length-1; i++) {// 0 1 2 3 4 => khi i =3 thì i +1  4 nên dừng lạ tại đây
	        if (a[i] < a[i + 1]) { //2 3 4 5 6
	            return false;
	        }
	    }
	    return true;
	}
	
	private static int minimum(int[] a) {
		int min = a[0];
		for(int i = 0; i < a.length; i++) { 
			if(min > a[i]) {
				min = a[i];
			}
		}
		return min;
	}


	public static void main(String[] args) {
		 int[] a = {4,10,9,5,6};
		System.out.println("kết quả của sort1: " + isSort(a));
		System.out.println("kết quả của sort2: " + isSort2(a));
		System.out.println("giá trị nhỏ nhất của mảng: " + minimum(a));
	}
	

}

