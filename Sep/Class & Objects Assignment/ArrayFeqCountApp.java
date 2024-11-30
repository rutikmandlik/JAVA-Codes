import java.util.*;
class ArrayFeqCount
    {
        int c[];
        void setIntArray(int ch[])
            {
                c=ch;
            }

        void countFeqCount()
        {
            for(int i=0;i<c.length;i++)
            {
                for(int j=i+1;j<c.length;j++)
                {
                    int temp;
                    if(c[i]>c[j])
                    {
                        temp=c[i];
                        c[i]=c[j];
                        c[j]=temp;
                                            
                    }
                }
            }
                        
            int count=1;
            for(int i=0;i<c.length;i++)
            {
                        if(i < c.length - 1 && c[i] == c[i+1])
                        {
                            count++;
                        }    
                        else 
                        {
                            System.out.println(c[i]+" ------> "+count);
                            count=1;
                        }
                    }
                        
                }
    }
    public class ArrayFeqCountApp
    {
        public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                int arr[]=new int[6];
                System.out.print("Enter 6 input in the array: ");
                for(int i=0;i<arr.length;i++)
                {
                    arr[i]=sc.nextInt();
                }
                ArrayFeqCount iq=new ArrayFeqCount();
                iq.setIntArray(arr);
                iq.countFeqCount();

            }
    }