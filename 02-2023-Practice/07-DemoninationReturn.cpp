#include <iostream>
using namespace std;
 int main(){
    int num, hun = 0, fifty = 0, twenty=0, ten=0, five=0, one=0;
    cout<<"Enter number: ";
    cin >> num;

    if (num /100 > 0){
        hun += num/100;
        num %= 100;
    }
    if (num/50 > 0){
        fifty +=num/50;
        num %=50;
    }
    if (num/20 > 0){
        twenty +=num/20;
        num %=20;
    }
    if (num/10 > 0){
        ten +=num/10;
        num %=10;
    }
    if (num/5 > 0){
        five +=num/5;
        num %=5;
    }
    if (num/1 > 0){
        one +=num;
    }
    cout<<hun<<" "<<fifty<<" "<<twenty<<" "<<ten<<" "<<five<<" "<<one<endl;

 }