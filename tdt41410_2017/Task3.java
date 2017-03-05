public class Task3 {
	int i = 5;
	int j;

	int doSomethingCrazy(int j) {
	  int sum = 0;
	  for (i=0; i<j; i++){
	  	sum += i;
	  } 
	  return j;
	}

	void printItOut() {
		System.out.println(" Value of j is " + j );
	}

	public static void main() {
	  int j;
	  j = doSomethingCrazy(i);
	  ineedj();
	}
}