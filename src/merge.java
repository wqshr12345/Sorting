
public class merge {
	public static <T extends Comparable<? super T>>
	void mergeSort (T[] list ) {
		T[] tempList = (T[]) new Object[list.length];
		int len = 1;
		while(len<=list.length) {
			mergePass(list,tempList,len);
			len = len*2;
			mergePass(tempList,list,len);
			len = len*2;//这里为什么还要反着来一次?因为第一次mergepass后，有序数组是在templist里面，要反过来进行一次mergepass。
		}
	}

	private static <T extends Comparable<? super T>> void mergePass(T[] initList, T[] mergedList, int len) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i+len*2<=initList.length) {//这个循环是为了把能配对的元素排好序
			merge(initList,mergedList,i,i+len-1,i+2*len-1);
			i=i+len*2;
		}
		if(i+len<=initList.length-1) {//这个if是剩了两组，但第二组不够len。
			merge(initList,mergedList,i,i+len-1,initList.length-1);
		}else for(int j = i;j<initList.length;j++) {//这个else是剩了一组。
				mergedList[j] = initList[j];
			}
		
	}
	private static <T extends Comparable<? super T>> 
	void merge (T[] initList, T[] mergedList, int l,  int m, int n ) {
		int i = l;
		int k = l;
		int j = m+1;
		while(i<=m&&j<=n) {
			if(initList[i].compareTo(initList[j])<=0) {
				mergedList[k] = initList[i];
				i++;
				k++;
			}else {
				mergedList[k] = initList[j];
				j++;
				k++;	
			}
		}
		if(i>m) {
			while(j<=n) {
				mergedList[k] = initList[j];
				k++;
				j++;
			}
		}else {
			while(i<=m) {
				mergedList[k] = initList[i];
				k++;
				i++;
			}
		}
	}
}
