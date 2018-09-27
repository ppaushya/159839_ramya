import java.util.Scanner;

public class multiarr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner st=new Scanner(System.in);
		int[][] arr=new int[3][3];
		
		System.out.print("enter 9 elements ");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
				arr[i][j]=st.nextInt();
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i>=j)
					System.out.print(" "+arr[i][j]+"\t");
			}
			System.out.println();
	}
	}
}
