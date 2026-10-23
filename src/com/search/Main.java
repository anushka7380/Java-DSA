package com.search;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target:");
        char target = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter the elements:");
        char[] letters = sc.nextLine().toCharArray();
        if(letters.length==0)
        {
            System.out.println("Array is empty");
            return;
        }

        System.out.println(binary_search( letters, target));

    }
       static char binary_search(char[] letters,char target) {
           int start = 0;
           int end = letters.length - 1;


           while (start <= end) {
               int mid = start + (end - start) / 2;
               if (target < letters[mid]) {
                   end = mid - 1;
               } else {
                   start = mid + 1;
               }
           }
           if (start == letters.length) {
               return letters[0];
           }

           return letters[start];
       }

}