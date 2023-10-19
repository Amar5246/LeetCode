class Solution {
public:
    int reverse(int x) {
        int num=x,rem=0;  
        long int rev=0;
        while(num != 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        if(!(rev>INT_MIN && rev <INT_MAX))
        {
            return 0;
        } 
        else return rev;
    }
};