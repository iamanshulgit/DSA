// Problem Statement: https://leetcode.com/submissions/detail/971825417/
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

class Solution
{
public:
    vector<int> findDuplicates(vector<int> &nums)
    {
        vector<int> ans;
        sort(nums.begin(), nums.end());
        for (int i = 1; i < nums.size(); i++)
        {
            if (nums[i] == nums[i - 1])
            {
                ans.push_back(nums[i]);
                i++;
            }
        }
        return ans;
    }
};

void printArray(vector<int> arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << endl;
    }
}

int main()
{
    Solution sol = Solution();
    vector<int> a = {1, 2, 3, 4, 5, 1, 2, 3};
    printArray(sol.findDuplicates(a));
}