#include <iostream>
using namespace std;

int main() {
    double P; 
    double r; 
    int n;   
    int t;  

    cout << "Enter the principal amount (P): ";
    cin >> P;

    cout << "Enter the annual interest rate (as a decimal, e.g., 0.05 for 5%): ";
    cin >> r;

    cout << "Enter the number of times interest is compounded per year (n): ";
    cin >> n;

    cout << "Enter the time in years (t): ";
    cin >> t;

    double base = 1.0 + (r / n);
    int exponent = n * t;
    double result = 1.0;

    for (int i = 0; i < exponent; ++i) {
        result *= base;
    }

    double A = P * result;
    cout << "The total amount (A) after " << t << " years is: " << A <<endl;

}