

using emp;


person pp=new person();


pp.Id = 1;
pp.Name = "bhushan";
pp.Age = 25;
person pp2 = new person(2,"Choudhary",26);

Console.WriteLine(pp);
Console.WriteLine(pp2);



employee ee1 = new employee(1,"Bhusan",1,3, "anurag","30");
Console.WriteLine(ee1);  