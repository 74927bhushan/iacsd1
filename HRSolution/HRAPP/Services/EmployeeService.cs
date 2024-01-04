using System.Data.Common;
using System.Reflection.Metadata.Ecma335;
using HRAPP.Entities;
using HRAPP.Repositories;
namespace HRAPP.Services;

public class EmployeeService:IEmployeeService{
   List<Employee> employees=new List<Employee>();
   
    public List<Employee> GetAll(){
       string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
       /*employees.Add(new Employee{Id=1, Name="Shivam"});
       employees.Add(new Employee{Id=2, Name="Chirag"});
       employees.Add(new Employee{Id=1, Name="Manisha"});
       employees.Add(new Employee{Id=1, Name="shailesh"});*/
       RepositoryManager mgr=new RepositoryManager();
       //string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
       employees=mgr.DeSerialize(fileName);
       return employees;
    }
    public void GetById(int id){
      string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
      RepositoryManager mgr = new RepositoryManager();
      employees = mgr.DeSerialize(fileName);
      foreach(Employee e in employees){
         if(e.Id==id){
            Console.WriteLine("employee found ");
            break;
         }else{
            Console.WriteLine("employee not found");
         }
      }
    }
    public void Insert(Employee emp){
      string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
      RepositoryManager mgr=new RepositoryManager();
      
      employees=mgr.DeSerialize(fileName);
      employees.Add(emp);
      //employees.Add(new Employee { Id = 1, Name = "Bhushan" });
      mgr.Serialize(employees,fileName);
    }
   //   public void Update(int id){
   //     string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
   //     RepositoryManager mgr = new RepositoryManager();
   //     employees=mgr.DeSerialize(fileName);
   //     foreach(Employee e in employees){
   //       if(e.Id==id){
   //          Console.WriteLine("employee found ");
   //       }else{
   //          Console.WriteLine("employee not found");
   //       }
   //    }
   //   }
     public void Delete(int id){
       
       string fileName=@"C:\Users\choud\OneDrive\Desktop\MS DOT.NET\Day4-20240102T171351Z-001\Day4\HRSolution\employees.json";
      RepositoryManager mgr=new RepositoryManager();
      
      employees=mgr.DeSerialize(fileName);
      // Employee employeeToDelete = employees.FirstOrDefault(e => e.Id == id);
      foreach(Employee e in employees){
         if(e.Id==id){
            employees.Remove(e);
            Console.WriteLine("employee removed");
            break;
         }
         else{
            Console.WriteLine("enter correct id ");
         }
      }
     // employees.Remove(employeeToDelete);
      mgr.Serialize(employees,fileName);

     }

}