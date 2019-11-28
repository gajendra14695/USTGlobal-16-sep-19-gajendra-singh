import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObjectArray {
public static void main(String[] args) {
	
int rollno=1;
String name = "Gajendra Singh";
Double db = 34.56;
float fl = 34.56f;
long number = 917607006569l;

Object obj[] = {rollno ,name , db,fl,number };
for (Object object : obj) {
	System.out.println(object);
}


System.out.println("=====================================================================");

List<Object> values = new ArrayList<Object>();
			values.add(1);
			values.add(2);
			values.add(345);
			values.add("Shikha");
			values.add(null);
			values.add(true);
System.out.println("====================================================================");
	

for (Object object : values) {
	System.out.println(object);
}

System.out.println("+++++++++++++++++++++++");

Iterator<Object> it =  values.iterator();
while(it.hasNext()) {
	Object o = it.next();
	System.out.println(o);
}

}
}
