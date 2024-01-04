using HRAPP.Entities;
namespace HRAPP.Repositories;

using System.Collections.Generic;
using System.IO;
using System.Text.Json;

public class RepositoryManager{
    public void Serialize(List<Employee> employees,string fileName){

    var options=new JsonSerializerOptions {IncludeFields=true};
    var employeesJson=JsonSerializer.Serialize<List<Employee>>(employees,options);
    File.WriteAllText(fileName,employeesJson);
   
    }
    public List<Employee> DeSerialize(string fileName){
   
         //Deserialize from JSON file
            string jsonString = File.ReadAllText(fileName);
            List<Employee> jsonEmployees = JsonSerializer.Deserialize<List<Employee>>(jsonString);
           /* Console.WriteLine("\n JSON :Deserializing data from json file\n \n");
            foreach( Employee emp in jsonEmployees)
            {
                Console.WriteLine($"{emp.Id} : {emp .Name}");   
            }*/      
        return jsonEmployees;
    }
}