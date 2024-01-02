using System;
using EMP;



  class Program
    {
        static void Main(string[] args)
        {
            List<Employee> list = new List<Employee>();

            while (true)
            {
                Console.WriteLine("\nEmployee Menu");
                Console.WriteLine("1. Add employee details");
                Console.WriteLine("2. Show employee list");
                Console.WriteLine("3. Set employees details");
                Console.WriteLine("4. Delete employees");
                Console.WriteLine("5. Exit");

                Console.Write("Enter your choice: ");
                int choice = int.Parse(Console.ReadLine());

                switch (choice)
                {
                    case 1:
                        Console.WriteLine("Enter ID, Name, Basic Salary, and Income Tax of the employee:");
                        Employee emp = new Employee(
                            int.Parse(Console.ReadLine()),
                            Console.ReadLine(),
                            float.Parse(Console.ReadLine()),
                            float.Parse(Console.ReadLine())
                        );
                        list.Add(emp);
                        Console.WriteLine("employee added in the list ");
                        break;

                    case 2:
                        Console.WriteLine("Employee List:");
                        foreach (Employee e in list)
                        {
                            Console.WriteLine(e);
                        }
                        break;

                    case 3:
                        
                        break;

                    case 4:

                    Console.WriteLine("enter empid ");
                    int temp=int.Parse(Console.ReadLine());
                    Employee em = list.Find( s=> s.empid==temp);
                        list.Remove(em);
                        Console.WriteLine("employee removed succesfully");
                        break;

                    case 5:
                        Console.WriteLine("Exiting the program.");
                        return;

                    default:
                        Console.WriteLine("Invalid choice. Please enter a valid option.");
                        break;

                }
                }
                }
                }







