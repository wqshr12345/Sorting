public class quick{
private static <T extends Comparable<? super T>>
void quickSort(T[] a, int left, int right ) {

    if ( left < right) {					
       int pivotpos = partition (a, left, right ); 
      quickSort (a, left, pivotpos-1);	    
       quickSort (a, pivotpos+1, right );	
    }
}

private static <T extends Comparable<? super T>>
int partition( T[] a, int low, int high) {
    int pivotPos = low;     //pivotPosָ���ŵ��Ǳ���ѭ��������Ӧ���ڵ�λ�á�
    swap(a[low], a[(low+high)/2]);
    T pivot = a[low];	
    for (int i = low+1; i <= high; i++ )//i�����������ݼӱ�������Ϊ���ҵ����п��ܱ�����λ��С��Ԫ�أ�Ȼ����pivotPosλ�ý���������ȷ����pivotPosǰ�涼�Ǳ�����С�ģ�����ͬʱ�ݼ���pivotPos
       if (a[i].compareTo(pivot)<0 && ++pivotPos != i )
          swap(a[pivotPos], a[i] );
    swap (a[low], a[pivotPos] );
    return pivotPos;
}

private static <T extends Comparable<? super T>> void swap(T t, T t2) {
	// TODO Auto-generated method stub
	T a=t;
	t = t2;
	t2=a;
}
}