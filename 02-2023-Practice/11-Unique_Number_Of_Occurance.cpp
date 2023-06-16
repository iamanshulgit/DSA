// Problem Statement: 1207. Unique Number of Occurrences - https://leetcode.com/problems/unique-number-of-occurrences/
#include<iostream>
#include<algorithm>
#include<vector>
using namespace std;

class Solution {
public:
    bool uniqueOccurrences(vector<int>& arr) {
        //sorting the array
        sort(arr.begin(),arr.end());

        //This will takes the occurance of each number in the array 
        vector<int> occ;
        // This is 1 because count of any element starts with one. 
        int count = 1; 

        //this for loop is to count the occurance of the number in the array and storing it in vector
        for(int i = 1; i< arr.size(); i++){
            if (arr[i] == arr[i-1])
                count++;
            else{
                occ.push_back(count);
                count=1;
            }
        }
        //Inserting count again as i will increment and reach out of bound to index of arr's size.
        occ.push_back(count);
        sort(occ.begin(), occ.end());
        for(int i = 1; i < occ.size(); i++){
            if(occ[i]==occ[i-1])
                return false;
        }
        return true;

    }
};

int main()
{
    Solution sol = Solution();
}