//��һ��Ȼ�������ܲ��ܸ���github
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

	private static <T extends Comparable<? super T>> boolean bubbleExchange(T[] a, int j) {//�����i�Ǵ�����ѭ�����԰ѵ�i������ź���
		boolean flag = false;
		for(int i = 0;i<a.length-1-j;i++) {
			if(a[i].compareTo(a[i+1])>0) {
				T t = a[i];
				a[i] = a[i+1];
				a[i+1] = t;
				flag =true;//���ĳ��Сѭ��û���κν�����flag�ͻ���false��˵����������Ѿ���ȫ������ɡ�
			} 
		}
		return flag;
	}
}