package lab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame {
	JSpinner s1 = new JSpinner(new SpinnerNumberModel(0.1,0.0,100,0.1));
	JSpinner s2 = new JSpinner(new SpinnerNumberModel(0.1,0.0,100,0.1));
	JSpinner s3 = new JSpinner(new SpinnerNumberModel(0.1,0.0,100,0.1));
	JButton b1;
	JLabel l1, l2;
	JTextField t1, t2, t3;
	double s, i, k, j, p;
	String a;
	eHandler handler=new eHandler();
	
	public Window(String s){
		super(s);
		setLayout(new FlowLayout());
		b1=new JButton("Вычислить площадь");
		l1 =new JLabel("Введите стороны треугольника");
		l2 =new JLabel("");
		add(l1);
		add(s1);
		add(s2);
		add(s3);
		add(b1);
		add(l2);
		b1.addActionListener(handler);
		}
	
	public class eHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==b1){
				i=(double)s1.getValue();
				j=(double)s2.getValue();
				k=(double)s3.getValue();
				if((i+j)>k && (i+k)>j && ((k+j)>i)){
					p=(i+j+k)/2;
					s=Math.sqrt(p*(p - i)*(p - j)*(p - k));
					a="Площадь треугольника : " + String.format("%.2f", s);
					l2.setText(a);
				}
				else{
					 
					JOptionPane.showMessageDialog(null, "Такого треугольника не существует");}
				}
			}
		}
	}


