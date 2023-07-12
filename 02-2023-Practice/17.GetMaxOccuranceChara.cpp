
#include <iostream>
using namespace std;

int main()
{
    // Write C++ code here

    string s;
    cin >> s;
    int max = -1, val = -1;
    int ar[26] = {0};
    for (int i = 0; i < s.length(); i++)
    {
        char ch = s[i];
        int number = 0;
        if (ch >= 'a' && ch <= 'z')
        {
            number = ch - 'a';
        }
        else
        {
            number = ch - 'A';
        }
        ar[number]++;
        if (max < ar[number])
        {
            max = ar[number];
            val = number;
        }
    }
    char final = 'a' + val;
    cout << final;
    return 0;
}