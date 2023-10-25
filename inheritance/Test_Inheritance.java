package inheritance;

public class Test_Inheritance {

	public static void main(String[] args) {
	
		Maneger mgr = new Maneger(101,"BALA",102,"HIMA");
        Emp e = new Emp(202,"ash");
		mgr.disMgr();
		e.display();
		
		Emp em = new Maneger (105,"himaa",108,"rama");
		((Maneger) em).disMgr();
		
		mgr.display();
		
	}

}
