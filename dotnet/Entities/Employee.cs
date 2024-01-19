namespace HRAPP.Entities;

[Serializable]
public class Employee{
    public Employee(){
        Console.WriteLine("Employee constructor invoked....");
    }
    public int Id{get;set;}
    public string FirstName{get;set;}
    public string LastName{get;set;}
    public string Email{get;set;}
    public string Address{get;set;}

}
