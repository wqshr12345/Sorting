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
    int pivotPos = low;     //pivotPos指针存放的是本次循环后枢轴应该在的位置。
    swap(a[low], a[(low+high)/2]);
    T pivot = a[low];	
    for (int i = low+1; i <= high; i++ )//i进行无条件递加遍历，是为了找到所有可能比枢轴位置小的元素，然后与pivotPos位置交换。不仅确保了pivotPos前面都是比枢轴小的，而且同时递加了pivotPos
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