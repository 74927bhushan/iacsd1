using System;

// Define a delegate
public delegate void MyDelegate(string message);

class Program
{
    static void Main()
    {
        // Create an instance of the delegate
        MyDelegate myDelegate = new MyDelegate(PrintMessage);

        // Invoke the delegate
        myDelegate("Hello, delegates!");

        // You can also use the delegate's invocation list to add multiple methods
        myDelegate += new MyDelegate(AnotherPrintMessage);
        myDelegate("Multiple methods!");

        // Remove a method from the invocation list
        myDelegate -= new MyDelegate(AnotherPrintMessage);
        myDelegate("After removing method.");

        Console.ReadLine();
    }

    // Methods that match the delegate signature
    static void PrintMessage(string message)
    {
        Console.WriteLine($"Printing: {message}");
    }

    static void AnotherPrintMessage(string message)
    {
        Console.WriteLine($"Another printing: {message}");
    }
}
