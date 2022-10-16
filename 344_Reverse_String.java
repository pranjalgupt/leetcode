public class 344_Reverse_String {
    public void reverseString(char[] s) {
        int right = s.length-1;
        int left=0;
        while(left<right){
        char temp = s[left];
        s[left++] = s[right];
        s[right--] = temp;
        }
        }
    
}
