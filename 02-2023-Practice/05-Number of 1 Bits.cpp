// Problem Statement: https://leetcode.com/problems/number-of-1-bits/description/
#include<iostream>
using namespace std;

class Solution {
public:
    int hammingWeight(uint32_t n) {
        int count = 0;
        while(n != 0){
            if(n&1){    // checking if 1&1 =1; 1 means true. It takes the last bit.
                count++;
            }
            n=n>>1;     // doing left shift bit by 1 to remove the left most bit.
        }
        return count;
    }
};

int main(){
    int n;
    cout<<"Enter the number:";
    cin>>n;
    Solution sol = Solution();
    cout<<sol.hammingWeight(n)<<endl;
}