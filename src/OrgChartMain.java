import com.orgchart.model.Developer;
import com.orgchart.model.Employee;
import com.orgchart.model.TechManager;

public class OrgChartMain {

	public static void main(String[] args) {
		Employee developer = new Developer("Facundo", "Merighi", "developer");
		Employee anotherDeveloper = new Developer("John", "Laslo", "developer");
		TechManager techManager = new TechManager("Will", "Smith", "tech lead");
		TechManager ceo = new TechManager("Bill", "Gates", "ceo");
		techManager.addEmployee(developer);
		techManager.addEmployee(anotherDeveloper);
		ceo.addEmployee(techManager);
		System.out.println(ceo.getOrganizationInformation());
	}

}
