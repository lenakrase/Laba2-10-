package lab;

import javax.swing.JFrame;

public class lab {
	public static void main(String args[]){
		Window w=new Window("Площадь");
		w.setVisible(true);
		w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		w.setSize(200, 200);
		w.setResizable(false);
		w.setLocationRelativeTo(null);
	}

}

