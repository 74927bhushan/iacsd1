using System;

namespace EMP{

    public class Employee{


public Employee(){
            this.empid=0;
            this.name=string.Empty;
            this.basicSalary=00;
            this.IncomeTax=00;
        }

        public Employee(int empid,string name,float basicSalary,float IncomeTax){
            this.empid=empid;
            this.name=name;
            this.basicSalary=basicSalary;
            this.IncomeTax=IncomeTax;
        }

        public int empid{
get;set;
        }
        public string name{
            get;set;
        }

        public float basicSalary{
            get;set;}


             public float IncomeTax{
            get;set;
        }


         public float computepay(){
             return basicSalary=basicSalary-IncomeTax;
        }

        public override string ToString()
        {
            return  "empid" +empid +"name ->" +name + "basicSalary" + computepay() ;
        }

    }


       
       
    }
