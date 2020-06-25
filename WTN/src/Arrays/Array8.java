package Arrays;

public class Array8 {
	public static void main(String[] args)
    {
        int a[][] = new int[3][3];
        int i,j;
        for( i=0; i<2; i++)
        {
            for( j=0; j<2; j++)
            {
                a[i][j]=Integer.parseInt(args[2*i+j]);
            }
        }

        for( i=1; i!=-1; i--)
        {
            for(j=1; j!=-1; j--)
            {
                System.out.print(a[i][j]+" ");
            }
        System.out.print("\n");
        }
    }
}
