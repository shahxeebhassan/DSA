#include <iostream>
#include <stack>
using namespace std;

int main(){
    stack<int> s;
    // Pushing elements into stack
    s.push(26);
    s.push(26);
    s.push(29);
    s.push(23);
    s.push(19);

    // Printing the size of stack
    cout << "Size of stack: " << s.size() << endl;

    // Printing the top element of stack
    cout << "Top element of stack: " << s.top() << endl;

    // Printing the elements of stack
    cout << "Elements of stack: ";
    while(!s.empty()){
        cout << s.top() << " ";
        s.pop();
    }

    // popping elements from stack
    s.pop();
    s.pop();

    return 0;

}