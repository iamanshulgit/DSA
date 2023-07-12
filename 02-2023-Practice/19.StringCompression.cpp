// https://leetcode.com/problems/string-compression/
#include <iostream>
#include <vector>

using namespace std;

void printVector(vector<char> s)
{
    for (auto a : s)
    {
        cout << a << " ";
    }
}
int main()
{
    vector<char> s = {'a', 'a', 'b', 'b', 'b', 'b', 'c', 'c', 'c', 'd'};
    int i = 0, ansIdx = 0;
    while (i < s.size())
    {
        int j = i + 1;
        while (j < s.size() && s[i] == s[j])
        {
            j++;
        }
        s[ansIdx++] = s[i];
        int count = j - i;
        if (count > 1)
        {
            string c = to_string(count);
            for (auto a : c)
            {
                s[ansIdx++] = a;
            }
        }
        i = j;
    }

    cout << endl;
    printVector(s);
    cout << endl
         << ansIdx << endl;
    // return 1;
}