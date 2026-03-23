package Sorting;

public class lowerBound {

        public static void main( String[] args ) {
            int [] arr = {1,2,3,3,5,5,5,6,7};
            int target = 6;
            int low=0;
            int high=arr.length-1;
            while (low<=high){
                int mid=low+(high-low)/2;
                if(arr[mid]>target){
                    high=mid-1;
                }
                else if(arr[mid]<target){
                    low=mid+1;
                } else{
                    if(mid!=0 && arr[mid-1]==target){
                        high=mid-1;
                    }
                    else {
                        System.out.println(mid);
                        break;
                    }
                }
            }
            if(low>high){
                System.out.println(low);
            }
        }


}
