package extra;

public class stuff {

public static void main(String[] args) {
	

	
	 
	int slast = 0;
	int last = 1;
	for(int i = 0; i < 20; i++) { 
		int current ;
		current = last + slast;
		slast = last;
			last = current;
		System.out.println(current);}
	
	
	
	
	
	
	
	
	
}	
}
