// https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
#include <iostream>
using namespace std;
int main()
{
    string s;
    int i = 0;
    cin >> s;
    bool count = 0;
    for (int j = i + 1; i < s.length() && j < s.length();)
    {
        if (s[i] == s[j])
        {
            s.erase(i, 2);
            if (i > 0)
            {
                i--;
            }
            j = i + 1;
        }
        else
        {
            i++;
            j = i + 1;
        }
        // cout << s << " " << i << " " << j << " " << count << endl;
    }
    cout << s << endl;
    return 1;
}