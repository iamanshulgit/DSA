#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

int main()
{
    vector<int> pages = {2, 4, 3};
    int x = 4, count = 0, i = 0;
    while (i < pages.size())
    {
        if (pages[i] <= x)
        {
            pages[i] = 0;
            i++;
        }
        else
        {
            pages[i] -= x;
        }
        count++;
    }
    cout << "Minimum Number of pages:" << count << endl;

    return 0;
}