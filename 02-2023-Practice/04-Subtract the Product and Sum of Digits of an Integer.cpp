// Problem Statement: https://leetcode.com/problems/number-of-1-bits/description/
#include <iostream>
using namespace std;

class Solution {
public:
    int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        while(n != 0){
            int num = n%10;
            sum += num;
            prod *= num;
            n /= 10;
        }
        return prod - sum;
    }
};

int main(){
    Solution sol = Solution();
    int n;
    cout<<"Enter a number:";
    cin>>n;
    cout<< sol.subtractProductAndSum(n)<<endl;
}