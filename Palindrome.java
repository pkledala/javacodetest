class Solution {
    public boolean isPalindrome(int x) {
        int originalNumber = x;
        int reverseNumber = 0;
        int reminder =0;
        if(x < 0)
            return false;
        while(x > 0) {
            reminder = x%10;
            reverseNumber = (reverseNumber*10)+reminder;
            x=x/10;
        }
        return reverseNumber == originalNumber;
    }
}
