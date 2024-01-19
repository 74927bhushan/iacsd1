using System.Data;
using HRAPP.Entities;
using MySql.Data.MySqlClient;

namespace HRAPP.Repositories.Disconnected;

public class MySqlDBManager{

    public MySqlDBManager(){

    }
    public List<Employee> GetAll(){
        List<Employee> employees=new List<Employee>();
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=@"server=localhost; port=3306; user=root; password=bala1889; database=transflower";
        MySqlCommand cmd=new MySqlCommand();
        cmd.Connection=con;
        cmd.CommandText="SELECT * from employees;SELECT * from departments";
        try{
            DataSet ds =new DataSet();
            MySqlDataAdapter da=new MySqlDataAdapter();
            da.SelectCommand=cmd;
            da.Fill(ds);
            DataTable empTable=ds.Tables[0];
            DataTable deptTable=ds.Tables[1];
            DataRowCollection empRows=empTable.Rows;
            foreach ( DataRow row in empRows){
                int id= int.Parse(row["id"].ToString());
                string?  firstName= row["firstName"].ToString();
                string?  lastName= row["lastName"].ToString();
                string?  email= row["email"].ToString();
                string?  address= row["address"].ToString();
                Employee emp=new Employee();
                emp.Id=id;
                emp.FirstName=firstName;
                emp.LastName=lastName;
                emp.Address=address;
                emp.Email=email;
                employees.Add(emp);
            }
       }
        catch(Exception e){
           
        }
        finally{
           
        }
        return employees;
    }
    public  Employee GetById(int id){
        Employee emp=new Employee();
        MySqlConnection con=new MySqlConnection();
        con.ConnectionString=@"server=localhost; port=3306; user=root; password=password; database=transflower";
        MySqlCommand cmd=new MySqlCommand();
        cmd.Connection=con;
        cmd.CommandText="SELECT * from employees WHERE id="+ id;
        try{
            
            DataSet ds =new DataSet();
            MySqlDataAdapter da=new MySqlDataAdapter();
            da.SelectCommand=cmd;
            da.Fill(ds);
            DataTable empTable=ds.Tables[0];
            DataRowCollection empRows=empTable.Rows;
            DataRow row=empRows[0];
            int empId= int.Parse(row["id"].ToString());
            string?  firstName= row["firstName"].ToString();
            string?  lastName= row["lastName"].ToString();
            string?  email= row["email"].ToString();
            string?  address= row["address"].ToString();
            emp.Id=empId;
            emp.FirstName=firstName;
            emp.LastName=lastName;
            emp.Address=address;
            emp.Email=email;
        }
        catch(Exception e){
            
        }
        return emp;
    }



}