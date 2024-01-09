using HRAPP.Entities;
//using HRAPP.Repositories.Connected;
using HRAPP.Repositories.Connected;
namespace HRAPP.Services;

public class EmployeeService:IEmployeeService{

    public EmployeeService(){
      Console.WriteLine("Employee Service construcctor  is invoked ");
    }
    public List<Employee> GetAll(){
       List<Employee> employees=new List<Employee>();
       /*employees.Add(new Employee{Id=1, Name="Shivam"});
       employees.Add(new Employee{Id=2, Name="Chirag"});
       employees.Add(new Employee{Id=1, Name="Manisha"});
       employees.Add(new Employee{Id=1, Name="shailesh"});*/
       /*RepositoryManager mgr=new RepositoryManager();
       string fileName=@"D:\Ravi\employees.json";
       employees=mgr.DeSerialize(fileName);
      */
       MySqlDBManager mgr=new MySqlDBManager();
       employees=mgr.GetAll();
       return employees;
    }
    public Employee GetById(int id){
     /* List<Employee> employees=new List<Employee>();
      RepositoryManager mgr=new RepositoryManager();
      string fileName=@"D:\Ravi\employees.json";
      employees=mgr.DeSerialize(fileName);
      Employee emp=employees.Find(emp=>emp.Id==id);
     */
      MySqlDBManager mgr=new MySqlDBManager();
      Employee emp=mgr.GetById(id);
      Console.WriteLine("fetching employee using DBMangager");
      return emp;
    }
    public void Insert(Employee emp){}
     public void Update(Employee emp){}
     public void Delete(int id){

     }

}