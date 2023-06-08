// Problem Statement: https://leetcode.com/problems/reverse-bits/description/
#include <iostream>
using namespace std;

class Solution {
public:
    uint32_t reverseBits(uint32_t n) {
        long long ans = 0; // long long will help in storing a large data which not crosses limit
        int i=0;
        while(i<32){ //using loop till 32 just to cover all the bits even if its zero

            int bit = n&1; //taking the last bit
            ans = (ans*2)+bit; // converting into decimal, remember its a bit not digit
            n = n >> 1;
            i++;

        }
        return ans;
    }
};

int main(){
    uint32_t n;
    cout<<"Enter the number:";
    cin>>n;
    Solution sol = Solution();
    cout<<sol.reverseBits(n)<<endl;
}
