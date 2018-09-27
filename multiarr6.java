
import static java.lang.System.out;
import java.util.Scanner;
import java.util.Arrays;
public class multiarr6 {
Scanner sc=new Scanner(System.in);
int row,col;
public void getSize()
{
System.out.println("Enter num of row and col: ");
row=sc.nextInt();
col=sc.nextInt();
}
public void getElem(int[][] arr)
{
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
arr[i][j]=sc.nextInt();
}
}
}
public void print(int[][] arr)
{
for(int i=0;i<row;i++)
{
for(int j=0;j<col;j++)
{
System.out.print(arr[i][j]+"\t");
}
System.out.println();
}
}
public void sort(int[][] arr)
{
for(int i=0;i<row;i++)
{
//sort
Arrays.sort(arr[i]);
}
} 
public void sequence(int[][] arr)
{
int miss=0;
int []temp=new int[row];
for(int i=0;i<row;i++) {
for(int j=0;j<col-1;j++) {
if(arr[i][j+1]-arr[i][j]!=1) {
miss=arr[i][j]+1;
temp[i]=miss;
break;
}
else {
miss=0;
temp[i]=miss;
}
}
out.println("1st Missing elements are "+miss);
}
Arrays.sort(temp);
out.println("Minimum missing element are "+temp[0]);
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
multiarr6 obj=new  multiarr6();
obj.getSize();
int[][] arr=new int[obj.row][obj.col];
System.out.println("Enter Elements:");
obj.getElem(arr);
System.out.println("Array is:");
obj.print(arr);
System.out.println("After sorting:");
obj.sort(arr);
obj.print(arr);
System.out.println("The missing number is:");
obj.sequence(arr);
sc.close();
}

}


