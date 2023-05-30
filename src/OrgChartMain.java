import com.orgchart.model.Developer;
import com.orgchart.model.Employee;
import com.orgchart.model.TechLead;

public class OrgChartMain {

	public static void main(String[] args) {
		Employee developer = new Developer("Facundo", "Merighi", "developer");
		Employee anotherDev = new Developer("Will", "Smith", "developer");
		TechLead techLead = new TechLead("Maurizio", "Strazzullo", "tech lead");
		TechLead ceo = new TechLead("Bill", "Gates", "CEO");
		ceo.addEmployee(techLead);
		techLead.addEmployee(developer);
		techLead.addEmployee(anotherDev);
		System.out.println(ceo.getInformation());
	}

}
