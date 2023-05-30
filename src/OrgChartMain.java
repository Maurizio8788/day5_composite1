import com.orgchart.model.Employee;

public class OrgChartMain {

	public static void main(String[] args) {
		Employee developer = new Employee("Facundo", "Merighi", "developer");
		Employee techLead = new Employee("Will", "Smith", "tech lead");
		System.out.println(developer.getInformation());
		System.out.println(techLead.getInformation());
	}

}
