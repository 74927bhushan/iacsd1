namespace HRAPP.Entities;

[Serializable]
public class Employee{
    public int Id{get;set;}
    public string Name{get;set;}

    public Employee(int Id,string name)
    {
        this.Id=Id;
        this.Name=name;
    }
}
