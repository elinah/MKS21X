import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JLabel j;
    private JTextField t;

    public TempConversionWindow() {
	this.setTitle("Temperature Converter");
	this.setSize(600,400);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(
				      EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));

	JButton b = new JButton("C to F");
	b.addActionListener(this);
	b.setActionCommand("CtoF");
	JButton b2 = new JButton("F to C");
	b2.addActionListener(this);
	b2.setActionCommand("FtoC");


	t = new JTextField(1);
	JTextfield t1 = new JTextField(1);

	j = new JLabel("Meaning of life is... ");
	pane.add(t1);
	pane.add(b);
	pane.add(b2);
	pane.add(t);
	pane.add(j);
    }

    public static double CtoF(double t){
	return t * (9.0 / 5) + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * (5.0 / 9);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	try(int i = Integer.parseInt(t1.getText())){
		if(event.equals("CtoF")){
		    t.setText(CtoF(i));
		}
		if(event.equals("FtoC")){
		    t.setText(FtoC(i));
  
		}
	    }catch(NumberFormatException e){
	    t.setText("Invalid input");
	}
    }
}