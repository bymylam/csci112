/* #include <iostream>
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
*/

public class CppTranslation {
    public static void main(String[] args) {
        int x = 80;
        int y = 90;
        int z = sum(x, y);

        System.out.println(x + " + " + y + " = " + z);
}
public static int sum(int x, int y) { return x + y; }
}
