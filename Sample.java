import java.util.*;
class Sample
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr1[]=new int[n];
int arr2[]=new int[n];
int i,j;
for(i=0;i<n;i++)
arr1[i]=sc.nextInt();
int k=0,c;
for(i=0;i<n;i++)
{
c=0;
arr2[k++]=arr1[i];
for(j=0;j<n;j++)
{
if(arr2[i]==arr1[j])
{
c++;
}
}
System.out.println(c);
}
}
}
