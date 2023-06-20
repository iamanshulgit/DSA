// Problem Statement: 34: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

#include <iostream>
#include <vector>
using namespace std;

class Solution
{

    int firstOcc(vector<int> &a, int t)
    {
        int s = 0, e = a.size() - 1;
        int m;
        int ans = -1;
        while (s <= e)
        {
            m = s + (e - s) / 2;
            ;
            if (a[m] == t)
            {
                ans = m;
                e = m - 1;
            }
            else if (a[m] < t)
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }
        return ans;
    }

    int lastOcc(vector<int> &a, int t)
    {
        int s = 0, e = a.size() - 1;
        int m;
        int ans = -1;
        while (s <= e)
        {
            m = s + (e - s) / 2;
            ;
            if (a[m] == t)
            {
                ans = m;
                s = m + 1;
            }
            else if (a[m] < t)
            {
                s = m + 1;
            }
            else
            {
                e = m - 1;
            }
        }
        return ans;
    }

public:
    vector<int> searchRange(vector<int> &nums, int target)
    {
        vector<int> ans = {firstOcc(nums, target), lastOcc(nums, target)};

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
    vector<int> a = {0, 0, 1, 1, 1, 1, 2, 3, 4}, ans;
    int target = 1;
    ans = sol.searchRange(a, target);
    printArray(ans);
}
