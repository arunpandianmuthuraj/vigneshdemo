import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {
public static void main(String[] args) {
	Map<Integer,String> m =new LinkedHashMap<>();
	m.put(10, "arun");
	m.put(20, "arun");
	m.put(30, "arun");
	m.put(40, "arun");
	
System.out.println(m.values());
	
}
}
