// www.codingninjas.com/studio/problems/cooking-ninjas_1164174?source=youtube&campaign=love_babbar_codestudio2&utm_source=youtube&utm_medium=affiliate&utm_campaign=love_babbar_codestudio2&leftPanelTab=2
#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

bool check(vector<int> &arr, int m, int mid)
{
    for (int i = 0; i < arr.size(); i++)
    {
        int dish = 1, time = 0;
        while (time + dish * arr[i] <= mid)
        {
            cout << "         rank-> " << i << " m->" << m << " dish->" << dish << " time->" << time << endl;
            if (m == 0)
                return 1;
            time += dish * arr[i];
            dish++;
            m--;
        }
    }
    if (m > 0)
        return false;
    else
        return true;
}
int minCookTime(vector<int> &rank, int m)
{
    int ans = -1;
    sort(rank.begin(), rank.end());
    int lstElement = rank[rank.size() - 1];
    int s = 0, e = lstElement * m * (m + 1) / 2;
    int mid = s + (e - s) / 2;
    ;
    while (s < e - 1)
    {
        cout << "s-> " << s << " e->" << e << " mid->" << mid << endl;
        if (check(rank, m, mid))
        {
            e = mid;
        }
        else
        {
            s = mid + 1;
        }
        mid = s + (e - s) / 2;
    }
    if (check(rank, m, s))
    {
        return s;
    }
    return e;
}
int main()
{
    int m = 11;
    vector<int> rank = {1, 2, 3, 4};
    cout << "Maximum of minimum time to cook dishes " << minCookTime(rank, m) << endl;
    return 0;
}