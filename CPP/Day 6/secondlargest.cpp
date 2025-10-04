
#include <iostream>
using namespace std;

int main()
{
    int n;
    cout<<"Enter the size of array :"<<endl;
    cin>>n;
    int array[100];
    cout<<"Enter the elements :"<<endl;
    for (int i = 0; i < n; i++) {
        cin>>array[i];     
    }
    int first = 1, second = 1;
    for (int i = 0; i < n; i++) {
        if (array[i] > first) {
            second = first;
            first = array[i];
        }

        else if (array[i] > second && array[i] < first) {
            second = array[i];
        }
    }
    cout << "Second Largest Element in the Array: "
         << second << endl;
}