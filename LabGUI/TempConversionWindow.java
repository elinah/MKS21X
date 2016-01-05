import javax.swing.*;
import java.awt.*;//NEW STUFF!
import java.awt.event.*;

public class TempConversionWindow extends JFrame implements ActionListener{
    private Container pane;
    private JTextField t;
    private JTextField t1;

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
        t1 = new JTextField(1);

	pane.add(t);
	pane.add(b);
	pane.add(b2);
	pane.add(t1);
    }

    public static double CtoF(double t){
	return t * (9.0 / 5) + 32;
    }
    public static double FtoC(double t){
	return (t - 32) * (5.0 / 9);
    }

    public void actionPerformed(ActionEvent e){
	String event = e.getActionCommand();
	try{
	    double i = Double.parseDouble(t.getText());
	    if(event.equals("CtoF")){
		t1.setText(Double.toString(CtoF(i)));
	    }
	    if(event.equals("FtoC")){
		t1.setText(Double.toString(FtoC(i)));
		
	    }
	}catch(NumberFormatException ex){
	    t.setText("Invalid input");
	}catch(NullPointerException ex){
	    t.setText("Invalid input");
	}
    }
}
