#include <iostream>
#include <vector>
using namespace std;

void merge(vector<int> &arr, int left, int right, int mid)
{
    int n1 = mid - left + 1;
    int n2 = right - mid;
    vector<int> leftarr(n1);
    vector<int> rightarr(n2);

    for (int i = 0; i < n1; i++)
    {
        leftarr[i] = arr[left + i];
    }
    for (int i = 0; i < n2; i++)
    {
        rightarr[i] = arr[mid + 1 + i];
    }
    int i = 0;

    // Initial index of second subarray.
    int j = 0;

    // Initial index of merged subarray.
    int k = left;

    while (i < n1 && j < n2)
    {
        if (leftarr[i] <= rightarr[j])
        {
            arr[k] = leftarr[i];
            i++;
        }
        else
        {
            arr[k] = rightarr[j];
            j++;
        }
        k++;
    }

    // Copy the remaining elements of leftarr if there are any.
    while (i < n1)
    {
        arr[k] = leftarr[i];
        i++;
        k++;
    }

    // Copy the remaining elements of rightarr[], if there are any.
    while (j < n2)
    {
        arr[k] = rightarr[j];
        j++;
        k++;
    }
}

void divide(vector<int> &ar, int s, int e)
{
    // Base Case
    if (s >= e)
        return;

    // Get the middle of the array
    int mid = s + (e - s) / 2;

    // printArray(ar);

    // divide the left part
    divide(ar, s, mid);

    // divide the right part
    divide(ar, mid + 1, e);

    // merge the left and right part
    merge(ar, s, e, mid);
}

int main()
{

    vector<int> arr = {5, 4, 3, 2, 1, 5, 4};
    divide(arr, 0, arr.size() - 1);
    return 0;
}