
public class Insertion {
	public static <T extends Comparable<? super T>>
	void insertionSort(T[] a) {
		for(int i=0;i<a.length;i++) {
			insert(a,i);
		}
	}

	private static<T extends Comparable<? super T>> void insert(T[] a, int i) {
		// TODO Auto-generated method stub
		T insert = a[i];//���Ƚ�Ԫ�ص�ָ��
		int j = i-1;//������У�ÿ����insert�Ƚϵ�Ԫ�ص�ָ�롣
		while(j>=0&&insert.compareTo(a[j])<0) {
			a[j+1]=a[j];//�����˼��ÿ�αȽ���֮��˳�����Խ�����
			j--;
		}
		a[j]=insert;
	}
}
