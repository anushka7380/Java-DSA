package com.search;
import java.util.Scanner;
import java.util.Arrays;


public class First_and_Last_Position {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target:");
        int target = sc.nextInt();
        First_and_Last_Position result =new First_and_Last_Position();
        System.out.println(Arrays.toString(result.searchRange(nums,target)));
    }


   public int[]  searchRange(int[] nums, int target)
        {
            int[] ans={-1,-1};
            int start =search(nums, target , true);
            int end =search(nums, target , false);
            ans[0]=start;
            ans[1]=end;
            return ans;
        }

        int search(int[] nums, int target, boolean findStartIndex)
        {
            int ans =-1;
            int start = 0;
            int end = nums.length - 1;

            while (start <= end) {
                int mid = start + (end - start) / 2;
                if (target < nums[mid])
                {
                    end = mid - 1;
                } else if (target > nums[mid])
                {
                    start = mid + 1;
                }
                else
                {
                    ans = mid;
                    if (findStartIndex )
                    {
                        end = mid - 1;
                    }
                    else
                    {
                        start = mid + 1;
                    }

                }
            }

return ans;
    }
}
