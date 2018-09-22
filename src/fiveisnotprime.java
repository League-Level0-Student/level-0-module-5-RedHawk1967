import javax.swing.JOptionPane;

public class fiveisnotprime {

public static void main(String[] args) {
	String prime =JOptionPane.showInputDialog("Enter a Number And see If It's Prime");
int hi = Integer.parseInt(prime);
	
for (int i = 2; i < hi; i++) {
	


if(hi%i==0) {JOptionPane.showMessageDialog(null,"IT'S PRIME");} else {JOptionPane.showMessageDialog(null,"IT'S NOT PRIME");}
break;}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}	
}
