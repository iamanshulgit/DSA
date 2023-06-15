// Problem Statement: 217. Contains Duplicate
#include <vector>
#include <iostream>
#include <algorithm>
// #include <s
using namespace std;

class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        for (int i = 1; i < nums.size(); i++){
            if (nums[i] == nums[i-1]) 
                return true;
        }
        return false;
    }
};

int main(){
    Solution sol = Solution();
    vector <int> test1= {1,1,1,3,3,4,3,2,4,2};
    cout<<sol.containsDuplicate(test1)<<endl;
}