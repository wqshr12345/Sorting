
public class Insertion {
	public static <T extends Comparable<? super T>>
	void insertionSort(T[] a) {
		for(int i=0;i<a.length;i++) {
			insert(a,i);
		}
	}

	private static<T extends Comparable<? super T>> void insert(T[] a, int i) {
		// TODO Auto-generated method stub
		T insert = a[i];//待比较元素地指针
		int j = i-1;//有序表中，每次与insert比较地元素的指针。
		while(j>=0&&insert.compareTo(a[j])<0) {
			a[j+1]=a[j];//这个意思是每次比较完之后顺带可以交换。
			j--;
		}
		a[j]=insert;
	}
}
