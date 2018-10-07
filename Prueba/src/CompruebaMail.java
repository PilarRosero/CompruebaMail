import javax.swing.JOptionPane;

public class CompruebaMail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean arroba=false;
		String mail=JOptionPane.showInputDialog("Introduce mail:");
		
		for(int i=0;i<mail.length();i++) {
			if(mail.charAt(i)=='@') {
				
				arroba=true;
			}
		}
		if(arroba==true) {
			System.out.println("Correcto");
		}else {
			System.out.println("Incorrecto");
		}
	}

}
