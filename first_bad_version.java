public class Solution extends versionControl {
    public int firstBadVersion(int n) {
    int lo = 0, hi = n;
    while(lo<hi){
    int mid = lo + (hi-lo)/2;
    if(isbadversion(mid)){
    hi = mid;
    }
    else{
    lo = mid + 1;
    }
    }
    return lo;
    }
   }
   