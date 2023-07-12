// https://leetcode.com/problems/permutation-in-string/submissions/989279840/
#include <iostream>

using namespace std;
class Solution
{
private:
    bool check(int a1[26], int a2[26])
    {
        for (int i = 0; i < 26; i++)
        {
            if (a1[i] != a2[i])
                return false;
        }
        return true;
    }

public:
    bool checkInclusion(string s1, string s2)
    {
        int a1[26] = {0}, a2[26] = {0};
        // create count of each element in s1
        for (int i = 0; i < s1.length(); i++)
        {
            int idx = s1[i] - 'a';
            a1[idx]++;
        }

        // Setting window size in a2
        int i = 0, windowSize = s1.length();
        while (i < windowSize && i < s2.length())
        {
            int idx = s2[i] - 'a';
            a2[idx]++;
            i++;
        }
        // Check if we got the solution
        if (check(a1, a2))
        {
            return true;
        }

        // Now traverse to next element and remove the lastest old element and then check for the solution
        while (i < s2.length())
        {
            // getting next element from s2 into window
            int idx = s2[i] - 'a';
            a2[idx]++;

            // removing latest old element from the window
            int oldIdx = s2[i - windowSize] - 'a';
            a2[oldIdx]--;

            // checking for the solution
            if (check(a1, a2))
            {
                return true;
            }
            i++;
        }
        return false;
    }
};
int main()
{
    Solution sol = Solution();
    string s1 = "abc", s2 = "eidascgbbcahudf";
    cout << sol.checkInclusion(s1, s2) << endl;
}