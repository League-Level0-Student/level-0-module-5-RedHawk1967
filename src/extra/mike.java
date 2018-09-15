package extra;

public class mike {

public static void main(String[] args) {
	
for (int i = 0; i > -1; i++) {
	

String mike = "MIKE";

speak(mike);



}



}
static void speak(String pi) {
	try {
		Runtime.getRuntime().exec("say " + pi).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}


}
