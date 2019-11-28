
public class Btm {
static int totalcount;
int count;
  void swipe()
 {
	 count++;
	 totalcount++;
	 //System.out.println("*"+count);
 }
  int getCount()
  {
	  return count;
  }
  
  int getTotalCount() {
	  return totalcount;
  }
}
