using HRAPP.Entities;

namespace HRAPP.Views;

public class ListView:IView{

    private List<Employee> _employees;
    public ListView(List<Employee> employees){
        _employees=employees;
    }
    public void Render(){
        Console.WriteLine("*****Company Employees******");
        foreach(Employee emp in _employees)
        {
            Console.WriteLine(emp.Id +"  " + emp.Name);
        }  
    }
}