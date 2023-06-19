// Problem Statement: https://leetcode.com/submissions/detail/972556089/
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

void printArray(vector<int> arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << endl;
    }
}
class Solution
{
public:
    void sortColors(vector<int> &nums)
    {
        int l = 0, m = 0, r = nums.size() - 1;
        while (m <= r)
        {
            if (nums[m] == 0)
            {
                swap(nums[l], nums[m]);
                l++;
                m++;
            }
            else if (nums[m] == 1)
                m++;
            else
            {
                swap(nums[m], nums[r]);
                r--;
            }
        }
    }
};

int main()
{
    Solution sol = Solution();
    vector<int> a = {2, 0, 2, 1, 1, 0};
    sol.sortColors(a);
    printArray(a);
}