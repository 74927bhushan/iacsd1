using System;

class Vector
{
    public int X { get; set; }
    public int Y { get; set; }

    // Constructor
    public Vector(int x, int y)
    {
        X = x;
        Y = y;
    }

    // Overloading the + operator
    public static Vector operator +(Vector v1, Vector v2)
    {
        return new Vector(v1.X + v2.X, v1.Y + v2.Y);
    }

    // Overriding the ToString method for better output
    public override string ToString()
    {
        return $"({X}, {Y})";
    }
}

class Program
{
    static void Main()
    {
        // Creating two vectors
        Vector v1 = new Vector(1, 2);
        Vector v2 = new Vector(3, 4);

        // Using the overloaded + operator
        Vector result = v1 + v2;

        // Displaying the result
        Console.WriteLine($"Result of v1 + v2: {result}");
    }
}
