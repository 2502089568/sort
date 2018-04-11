package sort;
public class SelectSort {
	public static void main(String[] args) {
		selectSort(ArrayUtil.a);
	}
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
}
