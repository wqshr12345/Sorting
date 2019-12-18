//改一下然后试试能不能更新github
public class bubble {
	public static <T extends Comparable<? super T>>
	void bubbleSort (T[] a) {
	    int pass = 1;  
	    boolean exchange = true;
	    while ( pass < a.length && exchange ) {
	         exchange = bubbleExchange (a, pass);
	         pass++;
	    }
}

	private static <T extends Comparable<? super T>> boolean bubbleExchange(T[] a, int j) {//这里的i是代表本次循环可以把第i大的数排好序。
		boolean flag = false;
		for(int i = 0;i<a.length-1-j;i++) {
			if(a[i].compareTo(a[i+1])>0) {
				T t = a[i];
				a[i] = a[i+1];
				a[i+1] = t;
				flag =true;//如果某次小循环没有任何交换，flag就会是false，说明这个数组已经完全排序完成。
			} 
		}
		return flag;
	}
}