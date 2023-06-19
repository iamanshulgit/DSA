// Problem Statement: https://leetcode.com/submissions/detail/971876204/
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

class Solution
{
public:
    vector<int> intersect(vector<int> &nums1, vector<int> &nums2)
    {
        vector<int> ans;
        /*
         //Approach 1
         for(int i = 0; i < nums1.size(); i++){
             for(int j = 0 ; j < nums2.size(); j++){
                 if(nums1[i] == nums2[j]){
                     ans.push_back(nums2[j]);
                     nums2.erase(nums2.begin()+j);
                     break;
                 }
             }
         }
         */

        // Approach 2
        int i = 0, j = 0;
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());
        while (i < nums1.size() and j < nums2.size())
        {
            if (nums1[i] == nums2[j])
            {
                ans.push_back(nums2[j]);
                i++;
                j++;
            }
            else if (nums1[i] < nums2[j])
            {
                i++;
            }
            else
                j++;
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
    vector<int> a = {2, 3, 4, 5, 6, 1, 2, 3}, b = {3, 4, 5, 6, 7, 8, 9, 2, 2};
    printArray(sol.intersect(a, b));
}