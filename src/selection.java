
public class selection {
	private static <T extends Comparable<? super T>> void swap(T t, T t2) {
		// TODO Auto-generated method stub
		T a=t;
		t = t2;
		t2=a;
	}
	private static <T extends Comparable<? super T>> 
	void selectSort (T[] a) {
		for(int i = 0;i<a.length;i++) {
			selectExchange(a,i);
		}
	}
	private static <T extends Comparable<? super T>> 
	void selectExchange (T[] a, int i) {
		int key = i;
		for(int j = 0;j<a.length;j++) {
			if(a[key].compareTo(a[j])>0) {
				key = j;
			}
		}
		swap(a[i],a[key]);
	}
}
