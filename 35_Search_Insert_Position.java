class Solution {
    public int searchInsert(int[] nums, int target) {
    return binarySearch(nums,0,nums.length-1,target);
    }
    public static int binarySearch(int arr[], int first, int last, int 
   key){
    int mid = (first + last)/2;
    while( first <= last ){
    if ( arr[mid] < key ) first = mid + 1;
    else if ( arr[mid] == key ) break;
    else last = mid - 1;
    mid = (first + last)/2;
    }
    if ( first > last )
    return first;
    return mid;
    }
   }