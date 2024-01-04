using HRAPP.Entities;
using HRAPP.Services;
namespace HRAPP.Controllers;
public class EmployeesController{
    private IEmployeeService _svc;
    public EmployeesController(IEmployeeService svc){
        this._svc=svc;
    }
    //Action Listeners
    //Action Methods
    public List<Employee> GetAll(){
        return this._svc.GetAll();
    }
    public void GetById(int id){
        this._svc.GetById(id);
    }

    public void Insert(Employee emp){
        this._svc.Insert(emp);
    }
    // public void Update(int id){
    //       this._svc.Update(id);
    // }

    public void Delete(int id){
this._svc.Delete(id);
    }
}