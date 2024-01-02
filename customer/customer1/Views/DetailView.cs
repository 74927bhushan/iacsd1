using System;

namespace customer1.views;

public class DetailView : Iview {

    private Employee _emp;

    public DetailView(Employee employee) {
    
        _emp = employee;

    
    }

    public void Render()
    {
        console.WriteLine("*******Employee Details*******");
        console.WriteLine(_emp.Name + "  " + _emp.empid );
    }
}

