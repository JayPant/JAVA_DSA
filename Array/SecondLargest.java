import java.util.Scanner;

public class SecondLargest {
     static int findSecondMax(int[] arr)
     {
          int max = Integer.MIN_VALUE;
          for(int j : arr){
               if(j> max){
                    max = j;
               }
          }
          for(int i =0;i<arr.length;i++)
          {
               if(arr[i]==max)
               {
                    arr[i]= Integer.MIN_VALUE;
               }
          }

          int second_max= Integer.MIN_VALUE;

          for(int j : arr){
               if(j> second_max){
                    second_max = j;
               }
          }


          return second_max;
     }

     public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter the size of the array");
          int size = s.nextInt();

          System.out.println("Enter "+ size +" elements in the array:");
          int[] arr = new int[size];
          for(int i= 0; i<size; i++)
          {
               arr[i]= s.nextInt();
          }

          System.out.println("Second largest element in the array are: "+ findSecondMax(arr));

     }
}
