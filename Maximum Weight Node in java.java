import java.util.*;
class Main 
{
public static void main (String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=0;
        int max=0;
        int ele=0;
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<arr.length;i++)
        {
            for(int j=i;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                 k=k+j;
                
                }
                
                 
            } 
            
            if(k>max)
             max=k;
             ele=i;
        
        } 
         System.out.println(arr[ele]+"");

    }
}
