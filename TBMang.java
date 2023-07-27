
public class TBMang {
	public static double mean(double[] a) {
		double sum = 0;
		for(int i = 0; i<a.length;i++) {
			sum= (sum + a[i]);
		}
		double tb = sum / a.length;
		return tb;
		
	}

	public static void main(String[] args) {
		double[] a = {2,3,4,5,6};
		for(int i = 0; i<a.length;i++) {
		
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);
			System.out.println(a[4]);
			System.out.println(a[5]);
			
		}
		System.out.println("giá trị trung bình của mảng" + mean(a));
		System.out.print(a.length);

	}

}
