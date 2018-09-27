import java.util.Scanner;

public class matrixsum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,a,b;
		Scanner st=new Scanner(System.in);
		System.out.println("enter 1st array size:");
		x=st.nextInt();
		y=st.nextInt();
		System.out.println("enter 2nd array size:");
		a=st.nextInt();
		b=st.nextInt();
		
		int[][] arr1=new int[x][y];
		int[][] arr2=new int[a][b];
		int[][] arr3=new int[x][y];
		if(x==a&&y==b) {
			
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
			for(int j=0;j<y;j++) {
				arr3[i][j]=arr1[i][j]+arr2[i][j];
			}
	}
		
		for(int i=0;i<x;i++)
		{
			for(int j=0;j<y;j++) {
				System.out.print(" "+arr3[i][j]);
			}
			System.out.println();
	}
		
		}
		else
			System.out.print("arrays cannot b added");
	}
}
