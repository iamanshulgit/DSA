
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int minimum(int sum, vector<int> &num)
{

    // Not a valid case as sum becomes greater than what we want.
    if (sum < 0)
    {
        return INT8_MAX;
    }

    // Sum becomes equal to the target sum.
    if (sum == 0)
    {
        return 0;
    }

    int ans = INT8_MAX;

    for (int i = 0; i < num.size(); i++)
    {
        // Iterate over all the elements and choose one of them which we want to include in our set.
        int val = minimum(sum - num[i], num);
        if (val != INT8_MAX)
        {
            ans = min(ans, 1 + val);
        }
    }

    // Finally return the answer.
    return ans;
}

int minimumElements(vector<int> &num, int x)
{
    int ans = minimum(x, num);

    // Return -1 as it is not possible to make desired sum 'X'.
    if (ans == INT8_MAX)
    {
        return -1;
    }
    return ans;
}

int main()
{
    // vector<int> a = {1, 16, 19, 22, 5, 9, 21, 18, 20, 7, 3, 10};
    // vector<int> a = {2, 1};
    // int x = 86;
    int n;
    cin >> n;
    for (int i = 0; i < n; i++)
    {
        int m, x;
        vector<int> a;
        cin >> m;
        cin >> x;
        for (int j = 0; j < m; j++)
        {
            int z;
            cin >> z;
            a.push_back(z);
        }
        cout << minimumElements(a, x) << endl;
    }
    // cout << minimumElements(a, x) << endl;
}
/*
10
11 65
3 20 21 6 16 4 19 8 7 18 22
12 58
24 21 8 9 3 20 16 19 4 18 2 14          -
12 41
2 17 12 5 1 20 18 10 23 8 9 14
10 20
12 15 8 6 1 7 16 17 5 4                 -
12 13
5 8 11 1 13 16 7 12 15 20 10 9
12 21
8 5 20 18 21 3 11 24 23 19 15 12
12 33
11 13 17 5 2 22 1 9 14 21 6 24
10 72
5 4 17 1 3 13 6 16 11 8
12 81
17 22 1 6 15 23 21 8 14 5 7 19          -
12 86
1 16 19 22 5 9 21 18 20 7 3 10
6 1
13 10 12 16 9 11
-----------------------------
3
3-
2
2-
1
1
2
5
4 -
4
-1
*/