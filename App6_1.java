//filename: App_1.java
import java.util.*;
public class App6_1
{
  public static void main(String[] args)
  {
     Scanner reader=new Scanner(System.in);
     int N,i,j=1,k=0;
     System.out.print("������qq�����λ���� ");
     N=reader.nextInt();
     int m=N;
     int []a=new int[N];
     int []b=new int[N];
     System.out.print("��Ҫ���ܵ�QQ����Ϊ�� ");
     for(i=1;i<=N;i++)
       a[i-1]=reader.nextInt();
     i=0;
     while(m>0)
     {
       i++;
       while(i>m)
         i-=m;
       b[k]=a[i-1];
       for(j=i-1;j<m-1;j++)
       {
         a[j]=a[j+1];
       }
       k++;
       m--;
     }
     System.out.print("QQ��Ϊ��");
     for(i=0;i<N;i++)
     {
       System.out.print(" "+b[i]);
     }
  }
}