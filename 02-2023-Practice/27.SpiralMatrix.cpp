// https://leetcode.com/problems/spiral-matrix/description/
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

class Solution
{
public:
    vector<int> spiralOrder(vector<vector<int>> &matrix)
    {
        vector<int> ans;
        int n = matrix.size(), m = matrix[0].size();
        for (int i = 0, j = 0; i < n && j < m; i++, j++, n--, m--)
        {
            int idx = i, jdx = j;
            while (jdx < m)
            {
                ans.push_back(matrix[idx][jdx]);
                jdx++;
            }
            jdx--;

            idx++;
            while (idx < n)
            {
                ans.push_back(matrix[idx][jdx]);
                idx++;
            }
            idx--;

            jdx--;
            while (jdx >= j && jdx < m)
            {
                ans.push_back(matrix[idx][jdx]);
                jdx--;
            }
            jdx++;

            idx--;
            while (idx > i && idx < n)
            {
                ans.push_back(matrix[idx][jdx]);
                idx--;
            }
            idx++;
        }
        return ans;
    }
};
void printArray(vector<int> arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}
int main()
{
    Solution sol = Solution();
    vector<vector<int>> matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
    vector<int> ans = sol.spiralOrder(matrix);
    printArray(ans);
    return 0;
}
