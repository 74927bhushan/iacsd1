using HRAPP.Entities;

namespace HRAPP.Views;

public class DetailsView:IView{
    private Employee _employee;
    public DetailsView(Employee employee){
        _employee=employee;
    }
    public void Render( ){
        Console.WriteLine("****Employee Details*****"); 
            Console.WriteLine(_employee.Id +"  " + _employee.Name);
       
    }
}