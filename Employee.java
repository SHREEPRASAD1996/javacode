package assign;

public class Employee {
	String firstname;
	String lastname;
	double monthlysal;

	Employee(String firstname,String lastname,double monthlysal)
	{
	
	this.firstname=firstname;
	this.lastname=lastname;
	this.monthlysal=monthlysal;
	if(this.monthlysal<0) 
	{
		this.monthlysal=0.0;
	}
	}



	double YearlySal() {
	double yearly=this.monthlysal*12;
	return yearly;
	
}
	}
