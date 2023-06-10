#include<iostream>
using namespace std;
int main(){

    int a = 0, b  = 1, next, input;
    cout<<"Enter the number: "<<endl;
    cin>>input;
    cout<< a <<" "<<b<<" ";
    for(int i =3; i<=input; i++){
        next = a + b;
        cout<<next<<" ";
        a = b;
        b = next;
    }
    cout<<endl;
}