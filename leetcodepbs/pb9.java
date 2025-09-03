class Solution {
    public boolean isPalindrome(int x) {
    int tmep=x;
    int ans=0;
    if(x<0){
        return false;
    }
    while(x>0){
        int rem=x%10;
        ans=ans*10+rem;
        x/=10;
    }
    if(ans==tmep){
        return true;
    }else{
        return false;
    }
    }
}
