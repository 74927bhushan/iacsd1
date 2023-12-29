

namespace emp


{

	internal sealed class employee : person
	{
		public employee() : base()
		{
		}


		private int empid;
		private string name1;
		private String deptname;

		public employee(int id, string name, int age,int empid, string name1,string deptname):base(id,name,age)
		{
			this.empid = empid;
			this.name1 = name1;
			this.deptname = deptname;
		}

        public int Emp { get { return empid; } set { empid = value; } }
		public string Name { get { return name1; } set { name1 = value; } }
		public string Deptname { get { return deptname; } set { deptname = value; } }



		public override string ToString()
		{

			return base.ToString()+ " :" + this.empid + " " + this.name1 + " " + this.deptname;
		}
	}
}