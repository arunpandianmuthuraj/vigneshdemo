import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefinedMap extends EmployeeDetails {
	public static void main(String[] args) {
		
		Map<Integer,EmployeeDetails>m =new LinkedHashMap();
		
		EmployeeDetails e =new EmployeeDetails();
		e.setEmpId(1607);
		e.setEmpName("M.ArunPandian");
		e.setEmpPhoneNo(9897521595l);
		e.setEmpSalary(56000.700f);
		EmployeeDetails e1 =new EmployeeDetails();
		e1.setEmpId(4785);
		e1.setEmpName("basker");
		e1.setEmpPhoneNo(9597143458l);
		e1.setEmpSalary(58000.985f);
		
		m.put(100, e);
		m.put(200, e1);
		
		Set<Entry<Integer, EmployeeDetails>> x = m.entrySet();
     for (Entry<Integer, EmployeeDetails> entry : x) {
    	 System.out.println(entry.getKey()+"emp inp");
    	 System.out.println(entry.getValue().getEmpId());
    	 System.out.println(entry.getValue().getEmpName());
    	 System.out.println(entry.getValue().getEmpPhoneNo());
    	 System.out.println(entry.getValue().getEmpSalary());
	}
		
		
	}	
		
	}


