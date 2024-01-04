using HRAPP.Entities;
using HRAPP.Services;
using HRAPP.Controllers;
using HRAPP.Views;
using System.Linq.Expressions;

IEmployeeService svc=new EmployeeService();
EmployeesController controller=new EmployeesController(svc);
List<Employee> model=controller.GetAll();
ListView view=new ListView(model);
view.Render();
Console.WriteLine("Welcome to MVC in C#");


Console.WriteLine("Enter Employee Details");
Employee emp=new Employee(int.Parse(Console.ReadLine()),Console.ReadLine());
svc.Insert(emp);
Console.WriteLine("");
view.Render();
Console.WriteLine("Enter Employee Details to delete ");

svc.Delete(int.Parse(Console.ReadLine()));
view.Render();


Console.WriteLine("Enter Employee ID");
controller.GetById(int.Parse(Console.ReadLine()));

