using System;
namespace EMP;


public class EmployeeController {

    private IemployeeService svc;

    public EmployeeController()
    {
        this.svc = svc;
    }


    public List<Employee> getAll()
    {
        return this.svc.getAll();
    }


    public void Insert(Employee emp)
    {
        this.svc.insert(emp);
    }

    public void Delete(int empid)
    {

    }






}
