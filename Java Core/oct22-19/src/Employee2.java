
public class Employee2 {
String name;
int id;
long aadharno ;
Employee2(String name,int id, long aadharno)
{
	this.name=name;
	this.id=id;
	this.aadharno=aadharno;
	this.printDetail();
}
Employee2(String name,int id){
	this.name=name;
	this.id=id;
	this.printDetail();
}
Employee2(int id, String name){
	this.name=name;
	this.id=id;
	this.printDetail();
}
void display()
{
	System.out.println("Name of the Employee is ="+this.name);
	System.out.println("ID of the Employeee is = "+this.id);
	System.out.println("Aadharno of the Employee is = "+this.aadharno);
}
void printDetail()
{
	System.out.println("HI " +name +"Welcome  to UST global ");
}

public static void main(String[] args) {
	System.out.println("*********************************");
	Employee2 e =new Employee2("Gajendra",23,644566l);
	e.display();
	System.out.println("*********************************");
	Employee2 e1 =new Employee2("Riya",213);
	e1.display();
	System.out.println("*********************************");
	Employee2 e2 =new Employee2(243,"Shikha");
	e2.display();
}
}
