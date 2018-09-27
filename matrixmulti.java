import java.util.Scanner;

public class matrixmulti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,a,b;int temp=0;
		Scanner st=new Scanner(System.in);
		System.out.println("enter 1st array size:");
		x=st.nextInt();
		y=st.nextInt();
		System.out.println("enter 2nd array size:");
		a=st.nextInt();
		b=st.nextInt();
		int[][] arr1=new int[x][y];
		int[][] arr2=new int[a][b];
		int[][] arr3=new int[x][b];
		if(y==a) {
			
			System.out.print("enter 1st array elements ");
			for(int i=0;i<x;i++)
			{
				for(int j=0;j<y;j++)
					arr1[i][j]=st.nextInt();
			}  
			
			System.out.print("enter 2nd array elements ");
			for(int i=0;i<a;i++)
			{
				for(int j=0;j<b;j++)
					arr2[i][j]=st.nextInt();
			}  
			
			for(int i=0;i<x;i++)
			{
				for(int j=0;j<b;j++) {
					for(int k=0;k<y;k++)
					arr3[i][j]+=arr1[i][k]*arr2[k][j];
				}
	}
			for(int i=0;i<x;i++)
			{
				for(int j=0;j<b;j++) {
					System.out.print(" "+arr3[i][j]);
				}
				System.out.println();
		}
			
			
			}
		else
			System.out.print("arrays cannot b multiplied");
	}

}
