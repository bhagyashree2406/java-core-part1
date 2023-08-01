#include <iostream>

    using namespace std;

        //here &x and &y are holding addresses/pointing of/to 10 and 20 respectively .
        void swapNums(int & x, int & y) {
        //swap the values 10 and 20 using temp variable z.
        int z = x;
        x = y;
        y = z;
        //After this swap &x and &y are pointing to 20 and 10 respectively .
        //Also firstNum and secondNum are pointing to 20 and 10 respectively .
        }

        int main() {

        int firstNum = 10; //here firstNum is holding value 10
        int secondNum = 20; //secondNum is holding value 20

        cout << "Before swap: " << "\n";
        cout << firstNum << "  " << secondNum << "\n"; //this will print 10 and 20 .

        // Now Call the function, which will change the values hold by firstNum and secondNum
        swapNums(firstNum, secondNum);//passing variables

        cout << "After swap: " << "\n";
        cout << firstNum << "  " << secondNum << "\n"; //this will print 20 and 10 .

        return 0;

        }