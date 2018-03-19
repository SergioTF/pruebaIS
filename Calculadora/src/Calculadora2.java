
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora2 {
	
	JFrame jfrPantallaPrincipal=null;
	JPanel jpnPanelPrincipal=null;
	JPanel jpnPanel2=null;
	JTextField jtfPantallita=null;
	JButton jbtSiete=null;
	JButton jbtOcho=null;
	JButton jbtNueve=null;
	JButton jbtDivision=null;
	JButton jbtCuatro=null;
	JButton jbtCinco=null;
	JButton jbtSeis=null;
	JButton jbtMultiplicacion=null;
	JButton jbtUno=null;
	JButton jbtDos=null;
	JButton jbtTres=null;
	JButton jbtResta=null;
	JButton jbtCero=null;
	JButton jbtPunto=null;
	JButton jbtIgual=null;
	JButton jbtSuma=null;
	JButton jbtC=null;
	JPanel jpnPanel3=null;
	
	int cont;
	double num1, num2, r;
	char signo;

	public Calculadora2() {
		inicio();
		jfrPantallaPrincipal.setVisible(true);
	}

	
	public void inicio(){
		
		//Pantalla Principal

		jfrPantallaPrincipal=new JFrame();
		jfrPantallaPrincipal.setSize(300, 350);
		jfrPantallaPrincipal.setLocationRelativeTo(null);
		jfrPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel Principal

		jpnPanelPrincipal=new JPanel();
		jpnPanelPrincipal.setLayout(new BorderLayout(5,5));
		jfrPantallaPrincipal.add(jpnPanelPrincipal);
		
		
		//Pantalla
		
		jtfPantallita = new JTextField();
		jtfPantallita.setFont(new Font("Arial", Font.BOLD, 25));
		jtfPantallita.setHorizontalAlignment(JTextField.RIGHT);
		jtfPantallita.setEditable(false);
		jtfPantallita.setBackground(Color.WHITE);
		jpnPanelPrincipal.add(jtfPantallita,"North");
		
		
		//Numeros

		jpnPanel2=new JPanel();
		jpnPanel2.setLayout(new GridLayout(4,5,6,6));
		jpnPanelPrincipal.add(jpnPanel2);
		
		jpnPanel3=new JPanel();
		jpnPanelPrincipal.add(jpnPanel3, "South");
		
                ///////////7

		jbtSiete=new JButton("7");
		jpnPanel2.add(jbtSiete);
		jbtSiete.addActionListener(new ActionListener() {
		
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("7"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+7);
			
			}
		});
		
		///////////////8

		jbtOcho=new JButton("8");
		jpnPanel2.add(jbtOcho);
		jbtOcho.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("8"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+8);
			
			}
		});
		
		//////////9

		jbtNueve=new JButton("9");
		jpnPanel2.add(jbtNueve);
		jbtNueve.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("9"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+9);
			
			}
		});
		
		////////Division

		jbtDivision=new JButton("/");
		jpnPanel2.add(jbtDivision);
		jbtDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (cont==0){
					num1=Double.parseDouble(jtfPantallita.getText());
					signo='/';
					jtfPantallita.setText(null);
					cont++;
				}
				else{
					num2=Double.parseDouble(jtfPantallita.getText());
					signo='/';
					jtfPantallita.setText(null);
					calcularesultado();
					num1=Double.parseDouble(jtfPantallita.getText());
					jtfPantallita.setText(null);
				}
			}
				
		});
		
		//////////4

		jbtCuatro=new JButton("4");
		jpnPanel2.add(jbtCuatro);
		jbtCuatro.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("4"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+4);
			
			}
		});
		
		///////5

		jbtCinco=new JButton("5");
		jpnPanel2.add(jbtCinco);
		jbtCinco.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("5"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+5);
			
			}
		});
		
		////////////6

		jbtSeis=new JButton("6");
		jpnPanel2.add(jbtSeis);
		jbtSeis.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("6"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+6);
			
			}
		});
		
		/////////Multiplicacion

		jbtMultiplicacion=new JButton("*");
		jpnPanel2.add(jbtMultiplicacion);
		jbtMultiplicacion.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (cont==0){
					num1=Double.parseDouble(jtfPantallita.getText());
					signo='*';
					jtfPantallita.setText(null);
					cont++;
				}
				else{
					num2=Double.parseDouble(jtfPantallita.getText());
					signo='*';
					jtfPantallita.setText(null);
					calcularesultado();
					num1=Double.parseDouble(jtfPantallita.getText());
					jtfPantallita.setText(null);
				}
			}
				
		});
		
		//////////1

		jbtUno=new JButton("1");
		jpnPanel2.add(jbtUno);
		jbtUno.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("1"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+1);
			
			}
		});
		
		///////////2

		jbtDos=new JButton("2");
		jpnPanel2.add(jbtDos);
		jbtDos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("2"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+2);
			
			}
		});
		
		///////3

		jbtTres=new JButton("3");
		jpnPanel2.add(jbtTres);
		jbtTres.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("3"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+3);
			
			}
		});
		
		///////Resta

		jbtResta=new JButton("-");
		jpnPanel2.add(jbtResta);
		jbtResta.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (cont==0){
				num1=Double.parseDouble(jtfPantallita.getText());
				signo='-';
				jtfPantallita.setText(null);
				cont++;
				}
				else{
					num2=Double.parseDouble(jtfPantallita.getText());
					signo='-';
					jtfPantallita.setText(null);
					calcularesultado();
					num1=Double.parseDouble(jtfPantallita.getText());
					jtfPantallita.setText(null);
				}
			}
				
		});
		
		////////0

		jbtCero=new JButton("0");
		jpnPanel2.add(jbtCero);
		jbtCero.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("0"));
				else
					jtfPantallita.setText(jtfPantallita.getText()+0);
			
			}
		});
		
		////////Punto

		jbtPunto=new JButton(".");
		jpnPanel2.add(jbtPunto);
		jbtPunto.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (jtfPantallita.getText().compareTo("0")==0)
				jtfPantallita.setText(String.valueOf("."));
				else
					jtfPantallita.setText(jtfPantallita.getText()+'.');
			
			}
		});
		
		////////Igual

		jbtIgual=new JButton("=");
		jpnPanel2.add(jbtIgual);
		jbtIgual.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				    num2=Double.parseDouble(jtfPantallita.getText());
					calcularesultado();
					cont=0;
				
			
			}
		});
	
		/////suma
	
		jbtSuma=new JButton("+");
		jpnPanel2.add(jbtSuma);
		jbtSuma.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				if (cont==0){
					num1=Double.parseDouble(jtfPantallita.getText());
					signo='+';
					jtfPantallita.setText(null);
					cont++;
				}
				else{
					num2=Double.parseDouble(jtfPantallita.getText());
					signo='+';
					jtfPantallita.setText(null);
					calcularesultado();
					num1=Double.parseDouble(jtfPantallita.getText());
					jtfPantallita.setText(null);
					
				}
			}
				
		});
	
                ////////C

		jbtC=new JButton("C");
		jpnPanel3.add(jbtC);
		jbtC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				jtfPantallita.setText(null);
				cont=0;				
			}
		});
	}

		public void calcularesultado(){
			switch(signo){
				case'+':
					r=num1+num2;
					break;
				case'-':
					r=num1-num2;
					break;
				case'/':
					r=num1/num2;
					break;
				case'*':
					r=num1*num2;
					break;
					
					
			}
			jtfPantallita.setText(String.valueOf(r));
		
		}
	
	
	public static void main(String[] args) {
		new Calculadora2();

	}

}