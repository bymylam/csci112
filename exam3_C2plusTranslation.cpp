#include <iostream>
using namespace std;

int sum(int x, int y);

int main()
{
    int x = 80;
    int y = 90;
    
    int z = sum(x, y);
    
    cout << x << " + " << y << " = " << z;

    return 0;
}

int sum(int x, int y) {
    return x+y;
}
