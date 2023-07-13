package ses3;

import java.util.Scanner;

class checkElementsinArray{
    public void checkElements(int[] arr){
         int a = arr.length;
         int odd = 0;
         int even = 0;
         for(int i = 0;i<a;i++){
             if(arr[i]%2==0){
             even++;
             }
             else{
                 odd++;
             }
         }
             if(even == a){
                System.out.println("The elements are even");
             }
             else if(odd == a){
                 System.out.println("The elements are Odd");
             }
             else{
                for(int i = 0;i<a;i++){
                    System.out.print(arr[i] + " ");
                }
             }
             
         
     }
     
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        checkElementsinArray abc = new checkElementsinArray();
        System.out.println("Enter the size of the array :");
        int a = sc.nextInt();
        int[] arr = new int[a];
        for(int i = 0;i<a;i++){
            arr[i] = sc.nextInt();
        }
        abc.checkElements(arr);
        sc.close();
     }
}