package Sorting;

public class RotatedaArray {
     public static void main(String [] args) {
         int [] arr = {4,5,6,0,1,2};
         int tarIndex = Search(arr,0,0,arr.length-1);
         System.out.println(tarIndex);

    }
    public static int Search(int [] arr, int tar, int si, int ei){
         int mid = (si+ei)/2;
         if(arr[mid]==tar){
             return mid;
         }
         if(arr[si]<=arr[mid]){
             if(arr[si]<=tar && tar<=arr[mid]){
                 return Search(arr,tar,si,mid-1);
             }
             else {
                 return Search(arr,tar,mid+1,ei);
             }
         } else {
             if(arr[mid]<=tar && tar<=arr[ei]){
                 return Search(arr,tar,mid+1,ei);
             }
             else {
                 return Search(arr,tar,mid-1,ei);
             }
         }
    }
}
