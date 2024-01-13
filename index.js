// Define a base class
class Animal {
  constructor(name, sound) {
    this.name = name;
    this.sound = sound;
  }

  makeSound() {
    console.log(`${this.name} says ${this.sound}`);
  }
}

// Inherit from the base class to create a subclass
class Dog extends Animal {
  constructor(name) {
    // Call the constructor of the base class
    super(name, 'Woof');
  }

  // Override the makeSound method
  makeSound() {
    console.log(`${this.name} barks: ${this.sound}`);
  }

  // New method specific to Dog class
  fetch() {
    console.log(`${this.name} is fetching the ball`);
  }
}

// Another subclass
class Cat extends Animal {
  constructor(name) {
    super(name, 'Meow');
  }

  // Override the makeSound method
  makeSound() {
    console.log(`${this.name} meows: ${this.sound}`);
  }

  // New method specific to Cat class
  scratch() {
    console.log(`${this.name} is scratching`);
  }
}

// Create instances of the classes
const myDog = new Dog('Buddy');
const myCat = new Cat('Whiskers');

// Use methods from the base and subclass
myDog.makeSound();  // Output: Buddy barks: Woof
myDog.fetch();      // Output: Buddy is fetching the ball

myCat.makeSound();  // Output: Whiskers meows: Meow
myCat.scratch();    // Output: Whiskers is scratching

//using oop concepts
