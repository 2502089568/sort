package sort;
public class SelectSort {
	public static void main(String[] args) {
		//selectSort(ArrayUtil.a);
		heapSort(ArrayUtil.a);
	}

	/*ѡ������*/
	public static void selectSort(int[] a) {
		int min,minId,temp;
		for(int i=0;i<a.length-1;i++) {
			min=a[i];
			minId=i;
			for(int j=i;j<a.length;j++) {
				if(min>a[j]) {
					min=a[j];
					minId=j;
				}
			}
			System.out.print(minId+"  ");
			temp=a[i];
			a[i]=a[minId];
			a[minId]=temp;
			ArrayUtil.sysArr(a,"aaaaa:");
		}
		ArrayUtil.sysArr(a,"SelectSort:");
	}
	
	/*������*/	
	private static void heapSort(int[] a) {
		//��������
		heapInsert(a,a.length);
		int heapSize = a.length;
		swap(a,0,--heapSize);//��������ķŵ�������,����һ��λ�ã����ֵ�ŵ����һλ�ˣ�
		//����
		while(heapSize>0) {
			heapify(a,0,heapSize);
			swap(a,0,--heapSize);
		}
		ArrayUtil.sysArr(a,"������");
	}

	private static void heapInsert(int[] a,int limit) {
		for(int i=0;i<limit;i++) {
			//���Ӻ����򸸺��ӱ�
			while(a[i]>a[(i-1)/2]) {
				swap(a,i,(i-1)/2);
				i=(i-1)/2;//���ϱ�
			}
		}
	}
	
	private static void heapify(int[] a, int index, int heapSize) {
		int left = index*2+1;
		while(left<heapSize) {
			int largest = left +1<heapSize&&a[left+1]>a[left]
					? left+1 : left;
			largest = a[largest]>a[index] ?largest:left;
			if(largest==index) {break;}
			swap(a,largest,index);
			index = largest;
			left = index*2+1;//һֱ�����ֵ�ĺ��ӵ�����
			//��Ϊ�ǱߵĽڵ�ֵ���ˣ�Ҫ�ָ������Ѿ�Ҫѭ������һ��û�䲻�ù�
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
}
