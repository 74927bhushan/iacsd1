using System;
namespace customer1.Services;

public interface IemployeeService
{
    public List<Employee> getAll();

    public void Insert(Employee emp);

}