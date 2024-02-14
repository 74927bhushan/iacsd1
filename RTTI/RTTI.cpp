#include <iostream>
#include <typeinfo>

class Base {
public:
    virtual ~Base() {}
};

class Derived : public Base {
};

int main() {
    Base* basePtr = new Derived();
    
    // typeid operator
    if (typeid(*basePtr) == typeid(Derived)) {
        std::cout << "basePtr points to a Derived object." << std::endl;
    } else {
        std::cout << "basePtr doesn't point to a Derived object." << std::endl;
    }
    
    // dynamic_cast
    Derived* derivedPtr = dynamic_cast<Derived*>(basePtr);
    if (derivedPtr) {
        std::cout << "basePtr successfully casted to Derived pointer." << std::endl;
    } else {
        std::cout << "basePtr cannot be casted to Derived pointer." << std::endl;
    }
    
    delete basePtr;
    return 0;
}
