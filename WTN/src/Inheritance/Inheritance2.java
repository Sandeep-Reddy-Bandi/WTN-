package Inheritance;
class person
{
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
class Employee extends person
{
	Double anualsalary;
	int startyear;
	String Insurenceno;
	public String getInsurenceno() {
		return Insurenceno;
	}
	public void setInsurenceno(String insurenceno) {
		Insurenceno = insurenceno;
	}
	public Double getAnualsalary() {
		return anualsalary;
	}
	public void setAnualsalary(Double anualsalary) {
		this.anualsalary = anualsalary;
	}
	public int getStartyear() {
		return startyear;
	}
	public void setStartyear(int startyear) {
		this.startyear = startyear;
	}
	public String getInsuranceno() {
		return insuranceno;
	}
	public void setInsuranceno(String insuranceno) {
		this.insuranceno = insuranceno;
	}
	String insuranceno;
	
}
public class Inheritance2 {
	public static void main(String[] args) {
	person p=new person();
	p.setName("sandeep");
	System.out.println("person name:"+p.getName());
	Employee e=new Employee();
	e.setAnualsalary(1000.00);
	e.setStartyear(1994);
	e.setInsurenceno("10908920");
	e.setName("sandeep");
	System.out.println("person name:"+e.getName());
	System.out.println("person name:"+e.getAnualsalary());
	System.out.println("person name:"+e.getStartyear());
	System.out.println("person name:"+e.getInsurenceno());
	

}
}
