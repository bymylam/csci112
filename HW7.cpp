#include <iostream>
using namespace std;

int main()
{
    cout<<"Hello! This program will format a message to introduce yourself." << endl;
    //firstname
    string firstName;
    cout << "What is your first name? ";
    cin >> firstName;
    //lastname
    string lastName;
    cout << "Where do you go to school? ";
    cin >> lastName;
    //school
    string school;
    cout << "What is your first name? ";
    cin >> school;
    //email address
    string emailAddress;
    cout << "What is your email address? ";
    cin >> emailAddress;
    
    cout << "\n\nHello, \n\nNice to meet you. My name is "<< firstName << lastName <<
    ".\nI am a student at " << school << ". You may reach me at my \nemail address: " << emailAddress << endl;
    cout << "\nHave a nice day!";

    return 0;
}