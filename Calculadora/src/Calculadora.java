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

public class Calculadora {

	JFrame jfrPantallaPrincipal=null;
	JPanel jpnPantallaPrincipal=null;
	JPanel jpnPantallaCentro=null;
	JButton jbtboton0=null;
	JButton jbtboton1=null;
	JButton jbtboton2=null;
	JButton jbtboton3=null;
	JButton jbtboton4=null;
	JButton jbtboton5=null;
	JButton jbtboton6=null;
	JButton jbtboton7=null;
	JButton jbtboton8=null;
	JButton jbtboton9=null;
	JButton jbtsuma=null;
	JButton jbtresta=null;
	JButton jbtdivision=null;
	JButton jbtmultiplicacion=null;
	JButton jbtpunto=null;
	JButton jbtclean=null;
	JButton jbtigual=null;
	JTextField jtfResultado=null;
	
	double num1,num2,r;
	char signo;
	
	public Calculadora() {
		inicio();
		jfrPantallaPrincipal.setVisible(true);
	}

	
	public void inicio(){
		
		jfrPantallaPrincipal=new JFrame();
		jfrPantallaPrincipal.setSize(350, 350);
		jfrPantallaPrincipal.setLocationRelativeTo(null);
		jfrPantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/////////PANELES
		
		jpnPantallaPrincipal=new JPanel();
		jpnPantallaPrincipal.setLayout(new BorderLayout());
		jfrPantallaPrincipal.add(jpnPantallaPrincipal);
		
		jpnPantallaCentro=new JPanel();
		jpnPantallaCentro.setLayout(new GridLayout(4,5));
		jpnPantallaPrincipal.add(jpnPantallaCentro);
		
		//////////////CAMPO RESULTADO
		
		jtfResultado=new JTextField();
		jtfResultado.setBackground(Color.WHITE);
		jtfResultado.setFont(new Font("Arial", Font.BOLD, 35));
		jtfResultado.setHorizontalAlignment(JTextField.RIGHT);
		jtfResultado.setEditable(false);
		jpnPantallaPrincipal.add(jtfResultado, "North");
		
		
		//////////BOTONES acho
		
		jbtboton7=new JButton();
		jbtboton7.setText(" 7 ");
		jpnPantallaCentro.add(jbtboton7);
		jbtboton7.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("7");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"7");
				
			}
			
		});
		
		jbtboton8=new JButton();
		jbtboton8.setText(" 8 ");
		jpnPantallaCentro.add(jbtboton8);
		jbtboton8.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("8");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"8");
				
			}
			
		});
		
		jbtboton9=new JButton();
		jbtboton9.setText(" 9 ");
		jpnPantallaCentro.add(jbtboton9);
		jbtboton9.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("9");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"9");
			}
			
		});
		
		jbtdivision=new JButton();
		jbtdivision.setText(" / ");
		jpnPantallaCentro.add(jbtdivision);
		jbtdivision.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					num1=Double.parseDouble(jtfResultado.getText());
					signo='/';
					jtfResultado.setText("0");
			}
		});
			
			
		jbtboton4=new JButton();
		jbtboton4.setText(" 4 ");
		jpnPantallaCentro.add(jbtboton4);
		jbtboton4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("4");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"4");
			}
			
		});
		
		jbtboton5=new JButton();
		jbtboton5.setText(" 5 ");
		jpnPantallaCentro.add(jbtboton5);
		jbtboton5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("5");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"5");
			}
			
		});
		
		jbtboton6=new JButton();
		jbtboton6.setText(" 6 ");
		jpnPantallaCentro.add(jbtboton6);
		jbtboton6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("6");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"6");
			}
			
		});
		
		jbtmultiplicacion=new JButton();
		jbtmultiplicacion.setText(" * ");
		jpnPantallaCentro.add(jbtmultiplicacion);
		jbtmultiplicacion.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					num1=Double.parseDouble(jtfResultado.getText());
					signo='*';
					jtfResultado.setText("0");
			}
		});
				
		jbtboton1=new JButton();
		jbtboton1.setText(" 1 ");
		jpnPantallaCentro.add(jbtboton1);
		jbtboton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("1");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"1");
			}
			
		});
		
		jbtboton2=new JButton();
		jbtboton2.setText(" 2 ");
		jpnPantallaCentro.add(jbtboton2);
		jbtboton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("2");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"2");
			}
			
		});
		
		jbtboton3=new JButton();
		jbtboton3.setText(" 3 ");
		jpnPantallaCentro.add(jbtboton3);
		jbtboton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("3");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"3");
			}
			
		});
		
		jbtresta=new JButton();
		jbtresta.setText(" - ");
		jpnPantallaCentro.add(jbtresta);
		jbtresta.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					num1=Double.parseDouble(jtfResultado.getText());
					signo='-';
					jtfResultado.setText("0");
			}
		});
		
		jbtclean=new JButton();
		jbtclean.setText(" C ");
		jpnPantallaCentro.add(jbtclean);
		jbtclean.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				jtfResultado.setText("0");
			}
			
		});
		
		jbtboton0=new JButton();
		jbtboton0.setText(" 0 ");
		jpnPantallaCentro.add(jbtboton0);
		jbtboton0.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
			   if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText("0");
			   else
				   jtfResultado.setText(jtfResultado.getText()+"0");
			}
			
		});
		
		
				
		jbtigual=new JButton();
		jbtigual.setText(" = ");
		jpnPantallaCentro.add(jbtigual);
		jbtigual.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					num2=Double.parseDouble(jtfResultado.getText());
					calcularResultado();
			}
		});
		
		jbtpunto=new JButton();
		jbtpunto.setText(" . ");
		jpnPantallaPrincipal.add(jbtpunto, "South");
		jbtpunto.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				if (jtfResultado.getText().compareTo("0")==0)
				   jtfResultado.setText(".");
				else
				   jtfResultado.setText(jtfResultado.getText()+".");
			}
		});
		
		jbtsuma=new JButton();
		jbtsuma.setText(" + ");
		jpnPantallaCentro.add(jbtsuma);
		jbtsuma.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
					num1=Double.parseDouble(jtfResultado.getText());
					signo='+';
					jtfResultado.setText("0");
			}
		});
		
		
	}
		
		public void calcularResultado(){
			switch(signo){
			case '+':
				r=num1+num2;
				break;
			case '-':
				r=num1-num2;
				break;
			case '/':
				r=num1/num2;
				break;
			case '*':
				r=num1*num2;
				break;
			}
			jtfResultado.setText(String.valueOf(r));
			
		}
	
	public static void main(String[] args) {
		new Calculadora();

	}

}
