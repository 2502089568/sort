package sort;
/*
 * 1.ѡd=lenght/2��
 * 2.����ÿ��d����ֱ�Ӳ�������
 * 3.d=d/2��ֱ��dС��1����
 * */
public class ShellSort {

	public static void main(String[] args) {
		//int[] a= {312,126,272,226,28,165,123};
		shellSort(ArrayUtil.a);
	}
	public static void shellSort(int[] a) {
		int d=a.length/2,i,j,sentry;
		while(d>=1) {
			for(j=0;j+d<a.length;j++) {
				for(i=j+d;i<a.length;i=i+d) {
					sentry=a[i];
					//System.out.print(sentry+"  "+a[i-d]);
					//�ȺŲ���ʡ�����в�����a[i]<a[i-d]��iһֱ�ڱ䣡��
					while(i-d>=0&&sentry<a[i-d]) {	
						a[i]=a[i-d];
						i=i-d;
						//Systeyym.out.print(" xx ");
					}
					//System.out.print(" zz ");
					a[i]=sentry;
					//ArrayUtil.sysArr(a,"aaaaa��");
				}
				//System.out.println();
			}
			d=d/2;
		}
		ArrayUtil.sysArr(a,"shellSort��");
	}
}
