/*
Homework Requirements:
-Your program should allow users to enter their answers with any form of capitalization, as seen above. 
-Your program should include 3 helper methods:
    1. A function which will handle triangles [V]
    2. A function which will handle rectangles [V]
    3. A function which will handle circles [V]
-Your program's main method will call one of these three functions while running depending upon the user's shape choice. [V]
-All 3 of the above functions should ask the user for the specific dimensions needed to calculate the area. [V]

Optional additions to this homework:
-Could you expand this program to offer addtional shapes? Additional measurements, such as volume, perimeter?
-Could you read these inputs from a file?
-Could you randomly generate these inputs?
-Could you allow the user to continue asking for shape areas until they choose to quit? [V]
*/

#include <iostream>
#include <math.h>

using namespace std;

double rectangleArea(double height, double width);
double triangleArea(double height, double width);
double circleArea(double radius);

int main()
{
    string response;
    
    do {
        cout << "What type of shape would you like the area of" << endl;
        cout << "Options: Rectangle, Triangle, Circle" << endl;
        string answer;
        cin >> answer;
        
        double height, width, radius;
        if (answer == "Rectangle") {
            cout << "Please enter the rectangle height: " << endl;
            cin >> height;
            cout << "Please enter the rectangle width: " << endl;
            cin >> width;
            cout << "The area of the rectangle is " << rectangleArea(height, width) << endl;
        } else if (answer == "Triangle") {
            cout << "Please enter the triangle height: " << endl;
            cin >> height;
            cout << "Please enter the triangle width: " << endl;
            cin >> width;
            cout << "The area of the triangle is " << triangleArea(height, width) << endl;
        } else if (answer == "Circle") {
            cout << "Please enter the circle radius: " << endl;
            cin >> radius;
            cout << "The area of the circle is " << circleArea(radius) << endl;
        }
        
        cout << "Would you like to continue? (Yes/No)" << endl;
        cin >> response;
    } while (response == "Yes");
    return 0;
}

double rectangleArea(double height, double width) {
    return height * width;
}
double triangleArea(double height, double width) {
    return (height + width)/2;
}
double circleArea(double radius) {
    return M_PI*radius*radius;
}