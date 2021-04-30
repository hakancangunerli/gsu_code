#include <iostream>
using namespace std;
int main()
{
    int sum = 0;
    int a = 9;
    int b = 8;
    int x = 15;

    while (x >= 0)
    {
        if ((x != 3) && (x <= a + 3) || (x < (b - 3)))
        {
            x = x - 2;
            sum += 1;
        }
        else
        {
            x = x - 1;
        }
    }

    cout << "value for sum: " << sum;
    cout << "\nvalue for a: " << a;
    cout << "\nvalue for x: " << x;
    cout << "\nvalue for b: " << b;
    return 0;
}