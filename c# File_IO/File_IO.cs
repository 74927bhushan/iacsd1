using System;
using System.IO;

class Program
{
    static void Main()
    {
        Console.WriteLine("Choose an option:");
        Console.WriteLine("1. Create a new file");

        int choice;
        if (int.TryParse(Console.ReadLine(), out choice))
        {
            switch (choice)
            {
                case 1:
                    CreateFile();
                    break;
                default:
                    Console.WriteLine("Invalid choice. Please select a valid option.");
                    break;
            }
        }
        else
        {
            Console.WriteLine("Invalid input. Please enter a valid number.");
        }
    }

    static void CreateFile()
    {
        Console.WriteLine("Enter the file name to create:");
        string fileName = Console.ReadLine();

        try
        {
            // Check if the file already exists
            if (File.Exists(fileName))
            {
                Console.WriteLine("File already exists.");
                return;
            }

            // Create a new file and write content
            using (StreamWriter sw = File.CreateText(fileName))
            {
                sw.WriteLine("This is a sample file created using C# File IO.");
            }

            Console.WriteLine($"File '{fileName}' created successfully.");
        }
        catch (Exception ex)
        {
            Console.WriteLine($"Error creating the file: {ex.Message}");
        }
    }
}
