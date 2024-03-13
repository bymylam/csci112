#include <iostream>
using namespace std;

int main()
{
    cout << "Hello. Let’s calculate your total grade for CSCI 111." << endl;
    cout << endl;
    cout << "Enter Midterm and Final Exam grades as follows:\n"
        << "If you received an 85.2% then enter 85.2";
        
    cout << "\nWhat was your grade for Midterm 1? ";
    double midterm_1;
    cin >> midterm_1;
    
    cout << "\nWhat was your grade for Midterm 2? ";
    double midterm_2;
    cin >> midterm_2;
    
    cout << "\nWhat was your grade for Midterm 3? ";
    double midterm_3;
    cin >> midterm_3;
    
    cout << "\nWhat was your grade for Final Exam? ";
    double final_exam;
    cin >> final_exam;
    
    double grade = (midterm_1*.15) + (midterm_2*.25) + (midterm_3*.25) + (final_exam*.35);
    cout << "Your grade for the course is " << grade;

    return 0;
}