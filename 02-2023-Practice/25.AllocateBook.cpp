// https://www.codingninjas.com/studio/problems/allocate-books_1090540
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool check(vector<int> &arr, int m, int mid)
{
    int s = 0, count = 1;
    for (int i = 0; i < arr.size(); i++)
    {
        if (s + arr[i] > mid)
        {
            count++;
            if (count > m || arr[i] > mid)
            {
                return false;
            }
            s = arr[i];
        }
        else
        {
            s += arr[i];
        }
    }
    return true;
}
int findPages(vector<int> &arr, int n, int m)
{
    if (m > n)
    {
        return -1;
    }
    int sum = 0, ans = -1;
    for (int a : arr)
        sum += a;

    int s = arr[0], e = sum;
    while (s <= e)
    {
        int mid = s + (e - s) / 2;
        if (check(arr, m, mid))
        {
            ans = mid;
            e = mid - 1;
        }
        else
        {
            s = mid + 1;
        }
    }
    return ans;
}

int main()
{
    vector<int> pages = {2, 8, 8, 4, 5};
    int n = pages.size(), m = 6;
    cout << " Answer: " << findPages(pages, n, m) << endl;
    return 0;
}