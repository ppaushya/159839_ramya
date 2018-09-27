import java.util.Scanner;
import java. util. Arrays;
public class multiarr5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		int[][] arr=new int[3][2];int x;
		int[] sum=new int[3];
		System.out.print("enter 6 elements ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
				arr[i][j]=st.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++) {
				sum[i]+=arr[i][j];
			}
	}
		Arrays.sort(sum);
		x=sum[0];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<1;j++) {
				if(arr[i][j]+arr[i][j+1]==x)
				{
					System.out.print(" "+arr[i][j]+" "+arr[i][j+1]);
				}
			}
	}
	}
}
