using customer1.entities;

namespace customer1.views;

public class ListView : Iview
{
    private List<Employee> _emp;

    public ListView(List<employee> emps) {
    _emp=emps
            }


    public void Render()
    {
        console.WriteLine("*******Company employees*******");
        foreach(employee em in _emp)
        {
            console.WriteLine(em.empid+ " "+ em.name);
        }
    }
}