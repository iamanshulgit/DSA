#include <iostream>
#include <vector>
using namespace std;

void printArray(vector<int> arr)
{
    for (int i = 0; i < arr.size(); i++)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

int partition(vector<int> &ar, int s, int e)
{
    int count = 0;
    for (int i = s + 1; i < e; i++)
        if (ar[s] >= ar[i])
            count++;

    int partitionIndex = s + count;
    swap(ar[s], ar[partitionIndex]);

    while (s < partitionIndex && e > partitionIndex)
    {
        while (s < partitionIndex && ar[s] < ar[partitionIndex])
            s++;
        while (e > partitionIndex && ar[e] > ar[partitionIndex])
            e--;
        if (s < partitionIndex && e > partitionIndex)
            swap(ar[s], ar[e]);
        // s++;
        // e--;
    }
    return partitionIndex;
}

void quickSort(vector<int> &ar, int s, int e)
{
    if (s >= e)
        return;

    // get the partition element
    int p = partition(ar, s, e);

    // left part sorting
    quickSort(ar, s, p);

    // right part sorting
    quickSort(ar, p + 1, e);
}

int main()
{

    vector<int> arr = {5, 4, 3, 2, 1, 5, 4};
    printArray(arr);
    quickSort(arr, 0, arr.size() - 1);
    printArray(arr);
    return 0;
}