package sort;

public class InsertSort {
	public static void main(String[] args) {
		int[] a= {312,126,272,226,28,165,123};
		InsertSort ex = new	InsertSort();
		//ex.insertSort(a);
		ex.twoInsertSort(a);
	}
	
	public void insertSort(int[] a) {
		int sentry=0;
		int j;
		for(int i=1;i<a.length;i++) {
			sentry=a[i];
			j=i;
			while(j>=0&&sentry<a[j-1]) {//������a[i]����Ϊa[i]��ֵ��һ��ѭ�������a[i-1]��ֵ
				a[j]=a[j-1];
				j--;
			}
			a[j]=sentry;
			System.out.print("aaaaa:");
			for(int count:a) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
		System.out.print("insertSort:");
		for(int count:a) {
			System.out.print(count+" ");
		}
		System.out.println();
	}
	
	public void twoInsertSort(int[] a) {
		int sentry=0;
		int min,max,mod;
		for(int i=1;i<a.length;i++) {
			sentry=a[i];
			min=0;max=i-1;
			while(min<=max) {//����ȥ�����ڣ�������min=maxʱ���ٱȽ�һ�γ��ִ���
				mod=(min+max)/2;
				if(a[mod]>sentry) {
					max=mod-1;
				}else if(a[mod]<sentry) {
					min=mod+1;
				}else {
					min=mod;
					max=mod;
				}
			}
			System.out.print("aaaaaa:"+a[min]+"  :");
			for(int j=i;j>min;j--) {
				a[j]=a[j-1];
			}
			a[min]=sentry;
			
			
			for(int count:a) {
				System.out.print(count+" ");
			}
			System.out.println();
		}
		
		System.out.print("twoInsertSort");
		for(int count:a) {
			System.out.print(count+" ");
		}
		System.out.println();
	}

}
