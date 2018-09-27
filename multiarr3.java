import java.util.Scanner;

public class multiarr3 {

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
			if(i==1)
			{
			System.out.println();
			System.out.print("\t");}
			else if(i==2)
			{
				System.out.println();
				System.out.print("\t"+"\t");}
			for(int j=0;j<3;j++)
			{
				if(j>=i)
					System.out.print(arr[i][j]+"\t");
			}
			
	}
	}

}
