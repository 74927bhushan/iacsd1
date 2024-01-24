#include <iostream>
#include <cstring>

class Person {
public:
    // Constructor
    Person(const char* n) {
        // Dynamically allocate memory for the name
        name = new char[strlen(n) + 1];
        strcpy(name, n);
    }

    // Copy constructor for deep copy
    Person(const Person& other) {
        // Allocate memory for the new object's name
        name = new char[strlen(other.name) + 1];

        // Copy the data from the original object to the new object
        strcpy(name, other.name);
    }

    // Destructor
    ~Person() {
        // Deallocate the dynamically allocated memory
        delete[] name;
    }

    // Display the person's name
    void display() const {
        std::cout << "Name: " << name << std::endl;
    }

private:
    char* name;
};

int main() {
    // Creating an object using the constructor
    Person person1("John");

    // Shallow copy: Copying object without defining a copy constructor
    // This will lead to issues since both objects will share the same 'name'
    Person person2 = person1;

    // Displaying the names to show the issue with shallow copy
    std::cout << "Person 1: ";
    person1.display();

    std::cout << "Person 2: ";
    person2.display();

    // Modifying the name of person2 will affect person1 as well in shallow copy
    person2.display();

    // Deep copy: Using the copy constructor to create a new object with a new 'name'
    Person person3 = person1;  // Calls the copy constructor for deep copy

    // Displaying the names to show deep copy works as expected
    std::cout << "Person 1: ";
    person1.display();

    std::cout << "Person 3: ";
    person3.display();

    return 0;
}
