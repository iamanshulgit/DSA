//
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

void printArray(vector<int> arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int minimumLength(vector<int> &a, vector<int> &b)
{
    int i = 0, j = a.size() - 1;
    while (a[i] == b[i] && i < a.size())
    {
        i++;
    }
    if (i == a.size())
    {
        return 0;
    }
    while (a[j] == b[j] && j >= i)
    {
        j--;
    }
    return j - i + 1;
}
int main()
{
    // vector<int> a = {5, 4, 3, 5, 7};
    // vector<int> b = {5, 3, 5, 4, 7};
    // vector<int> a = {1, 1, 2, 1};
    // vector<int> b = {2, 1, 1, 1};
    vector<int> a = {1, 2, 3, 4, 5};
    vector<int> b = {1, 2, 3, 4, 5};
    cout << minimumLength(a, b) << endl;
    return 1;
}
