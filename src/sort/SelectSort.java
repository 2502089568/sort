package sort;
public class SelectSort {
	public static void main(String[] args) {
		//selectSort(ArrayUtil.a);
		heapSort(ArrayUtil.a);
	}

	/*选择排序*/
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
	
	/*堆排序*/	
	private static void heapSort(int[] a) {
		//构成最大堆
		heapInsert(a,a.length);
		int heapSize = a.length;
		swap(a,0,--heapSize);//把最下面的放到最上面,减少一个位置（最大值放到最后一位了）
		//排序
		while(heapSize>0) {
			heapify(a,0,heapSize);
			swap(a,0,--heapSize);
		}
		ArrayUtil.sysArr(a,"堆排序：");
	}

	private static void heapInsert(int[] a,int limit) {
		for(int i=0;i<limit;i++) {
			//从子孩子向父孩子比
			while(a[i]>a[(i-1)/2]) {
				swap(a,i,(i-1)/2);
				i=(i-1)/2;//向上比
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
			left = index*2+1;//一直向最大值的孩子的左走
			//因为那边的节点值变了，要恢复成最大堆就要循环，另一边没变不用管
		}
		
	}

	private static void swap(int[] a, int i, int j) {
		int temp;
		temp=a[i];
		a[i]=a[j];
		a[j]=temp;
		
	}
	
}
