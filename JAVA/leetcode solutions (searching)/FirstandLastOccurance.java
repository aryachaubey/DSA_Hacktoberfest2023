package com.example.BinarySearch;

import java.util.Arrays;


// This program is a solution for Leetcode problem no.34 
//In this program we are returning the index of first and last occurance of a given target element.

public class firstNlastOccurance {
    public static void main(String[] args) {

        int [] arr = {2,3,4,4,4,8};
        int target = 4;

     int [] ans = answer(arr,target);
        System.out.println(Arrays.toString(ans));
    }

    static int []answer ( int [] arr,int target){

        int first = firstOccurance(arr,target);
        int last  = lastOccurance(arr,target);

        int [] ans = {-1,-1};

        ans[0] = first;
        ans[1] = last;

        return ans ;
    }



    static int firstOccurance(int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        int mid = start + (end-start)/2;

        while(start<=end){
            if(arr[mid]==target){
                end = mid-1;
                 ans = mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else{
                start = mid +1;
            }
            mid = start + (end-start)/2;
        }

        return ans;
    }

    static int lastOccurance(int [] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        int ans = -1;
        int mid = start + (end-start)/2;

        while(start<=end){
            if(arr[mid]==target){
                start=mid+1;
                ans = mid;
            }else if(target<arr[mid]){
                end= mid-1;
            }else{
                start = mid +1;
            }
            mid = start + (end-start)/2;
        }

        return ans;
    }

    static int [] ansreturn(int a,int b){
        int [] ans = {-1,-1};
        ans[0] = a;
        ans[1] = b;

        return ans;
    }




}
