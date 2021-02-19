
class Constr {
	
	Constr(String name , int id)
	{
		System.out.println("name is"+ name +id );
	}
	Constr(int id )
	{
		System.out.println("id is"+id);
		
	}
	Constr(long salary)
	{
		System.out.println("salary is"+salary);
	}
}
class Vikas{
	public static void main(String arg []) {
		
		Constr v = new Constr("vikas", 250);
		Constr v1 = new Constr(25000);
		Constr v2 = new Constr(201565563);		
		
	
}
}