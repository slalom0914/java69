package report.ch4;

import javax.swing.JOptionPane;

public class Fibonacci {

	public static void main(String[] args) {
		int a1=1, a2=1, a3=0;
		System.out.print(a1+" "+ a2+" ");
		for(int x=0;x<18;x++) {
			JOptionPane.showMessageDialog(null, "before a1:"+a1+", a2:"+a2);
			a3=a1+a2;
			System.out.print(a3+" ");
			a1 = a2;
			a2 = a3;
			JOptionPane.showMessageDialog(null, "after a1:"+a1+", a2:"+a2);
		}
	}

}
