using HRAPP.Entities;

namespace HRAPP.Services;

public interface IEmployeeService{
    public List<Employee> GetAll();
    public void GetById(int id);
    public void Insert(Employee emp);
    //  public void Update(int id);
     public void Delete(int id);
}