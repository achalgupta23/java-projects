package arrayprojects;

import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    int m,n,i,j,k=1;
	    Scanner oj=new Scanner(System.in);
	    System.out.print("enter the value of m and n");
	    m=oj.nextInt();
	    n=oj.nextInt();
    int[][] arr=new int[m][n];
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i>=j)
            arr[i][j]=k++;
            else
                arr[i][j]=0;
            
        }
    }
    System.out.println("<------------------------array pattern------------------------->");
    for(i=0;i<m;i++)
    {
        for(j=0;j<n;j++)
        {
            if(i>=j)
            System.out.print(arr[i][j]+" ");
        }
	  System.out.print("\n");
    }
}
}
