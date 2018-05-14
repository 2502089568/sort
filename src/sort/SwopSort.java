package sort;

public class SwopSort {

	public static void main(String[] args) {
		//bubbleSort(ArrayUtil.a);
		fastSort(ArrayUtil.a,0,ArrayUtil.a.length-1);
	}
	
	public static void bubbleSort(int[] a) {
		int temp,flag=0,flagLast = 0;
		for(int i=0;i<a.length-1;i++) {
			flag=flagLast;
			for(int j=0;j<a.length-1-i;j++) {
				if(a[j]>a[j+1]) {
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					flagLast=j;
				}
			}
			if(flag==flagLast) {break;}
		}
		ArrayUtil.sysArr(a,"bubbleSort:");
	}
	
	//可改进，等于放中间
	public static void fastSort(int[] a,int left,int right) {
		int key=a[left],i=left,j=right;
		while(left<right) {
			while(a[right]>=key&&left<right) {
				right--;
			}
			a[left]=a[right];
			while(a[left]<=key&&left<right) {
				left++;
			}
			a[right]=a[left];
			
		}
		a[left]=key;
		ArrayUtil.sysArr(a,"fastSort：");
		if(i<left-1) {fastSort(a,i,left-1);}
		if(left+1<j) {fastSort(a,left+1,j);}
	}
	
}
