// Calculate the set bit of a&b; if a=2 and b=3 then in bits a = 10 and b = 11 then result should be 3 (count of every 1 bit)
#include <iostream>
using namespace std;

int calc_set_bit(int num){
    int sum=0;
    while(num!=0){
        int bit = num&1;
        // cout<<bit<<endl;
        if (bit == 1){
            sum++;
        } 
        num = num>>1;
    }
    return sum;
}

int main(){
    int a, b;
    cout<<"Enter the 2 numbers: ";
    cin>>a>>b;
    cout<<calc_set_bit(a) + calc_set_bit(b)<<endl;
}