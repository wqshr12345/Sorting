
public class merge {
	public static <T extends Comparable<? super T>>
	void mergeSort (T[] list ) {
		T[] tempList = (T[]) new Object[list.length];
		int len = 1;
		while(len<=list.length) {
			mergePass(list,tempList,len);
			len = len*2;
			mergePass(tempList,list,len);
			len = len*2;//����Ϊʲô��Ҫ������һ��?��Ϊ��һ��mergepass��������������templist���棬Ҫ����������һ��mergepass��
		}
	}

	private static <T extends Comparable<? super T>> void mergePass(T[] initList, T[] mergedList, int len) {
		// TODO Auto-generated method stub
		int i = 0;
		while(i+len*2<=initList.length) {//���ѭ����Ϊ�˰�����Ե�Ԫ���ź���
			merge(initList,mergedList,i,i+len-1,i+2*len-1);
			i=i+len*2;
		}
		if(i+len<=initList.length-1) {//���if��ʣ�����飬���ڶ��鲻��len��
			merge(initList,mergedList,i,i+len-1,initList.length-1);
		}else for(int j = i;j<initList.length;j++) {//���else��ʣ��һ�顣
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
