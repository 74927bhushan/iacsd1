using System;

class Program
{
    static void Main()
    {
        try
        {
            // Code that might throw an exception
            int divisor = 0;
            int result = 10 / divisor; // This will throw a DivideByZeroException
            Console.WriteLine("Result: " + result); // This line won't be executed
        }
        catch (DivideByZeroException ex)
        {
            // Catching a specific type of exception (DivideByZeroException in this case)
            Console.WriteLine("Error: Cannot divide by zero");
            // You can log the exception or perform other error handling here
        }
        catch (Exception ex)
        {
            // Catching any other exceptions that might occur
            Console.WriteLine("An error occurred: " + ex.Message);
        }
        finally
        {
            // The finally block is optional and will execute regardless of whether an exception occurred
            Console.WriteLine("Finally block executed");
        }

        // Other code after exception handling
        Console.WriteLine("Continuing with other operations...");

        
    }
}
