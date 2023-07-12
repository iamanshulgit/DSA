// https://www.codingninjas.com/studio/problems/aggressive-cows_1082559?leftPanelTab=1
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool check(vector<int> &arr, int m, int mid)
{
    int count = 1, pi = arr[0];
    for (int i = 0; i < arr.size(); i++)
    {
        if (arr[i] - pi >= mid)
        {
            count++;
            if (count == m)
            {
                return true;
            }
            pi = arr[i];
        }
    }
    return false;
}
int aggressiveCows(vector<int> &stalls, int k)
{
    int ans = -1;
    sort(stalls.begin(), stalls.end());
    int lstElement = stalls[stalls.size() - 1];
    int s = 0, e = lstElement;

    while (s <= e)
    {
        int mid = s + (e - s) / 2;

        if (check(stalls, k, mid))
        {
            ans = mid;
            s = mid + 1;
        }
        else
        {
            e = mid - 1;
        }
    }

    return ans;
}
int main()
{
    vector<int> arr = {0, 3, 4, 7, 10, 9};
    int k = 4;
    cout << "Maximum possible minimum distance is " << aggressiveCows(arr, k) << endl;
    return 0;
}