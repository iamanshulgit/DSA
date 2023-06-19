// Problem Statement: Contains Duplicate - https://leetcode.com/submissions/detail/971474890/
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

class Solution
{
public:
    bool containsDuplicate(vector<int> &nums)
    {

        sort(nums.begin(), nums.end());

        for (int i = 1; i < nums.size(); ++i)
        {
            if (nums[i] == nums[i - 1])
                return true;
        }
        return false;
    }
};

int main()
{
    Solution sol = Solution();
    vector<int> a = {1, 2, 3, 4, 5};
    if (sol.containsDuplicate(a))
    {
        cout << "Found Duplicate" << endl;
    }
    else
    {
        cout << "No Duplicate" << endl;
    }
}