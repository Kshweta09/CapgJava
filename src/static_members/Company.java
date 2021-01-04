package static_members;

public class Company {

	public static void main(String[] args) 
	{
		System.out.println(Emp.id);
		System.out.println(Emp.name);
        Emp.id=1;
        Emp.name="Prashanth";
        System.out.println("Id is="+Emp.id);
        System.out.println("Name is="+Emp.name);
        Emp.id=2;
        Emp.name="Shweta";
        System.out.println("Id is="+Emp.id);
        System.out.println("Name is="+Emp.name);



	}

}
