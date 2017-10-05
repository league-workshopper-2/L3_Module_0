package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	String name;
	ArrayList<String> names= new ArrayList<String>();
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.buttons();
		
	}
	JFrame frame =new JFrame();
	JPanel panel = new JPanel();
	JButton AddName = new JButton();
	JButton ViewNames = new JButton();
	
	public void buttons() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(150, 100);
		panel.add(AddName);
		panel.add(ViewNames);
		AddName.setText("Add Name");
		ViewNames.setText("View Names");
		AddName.addActionListener(this);
		ViewNames.addActionListener(this);
	}
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	@Override
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==AddName) {
			name=JOptionPane.showInputDialog("Enter Your Name");
			for (int i = 0; i < names.size(); i++) {
				names.add(name);
		}
	
			}
			if (e.getSource()==ViewNames) {
				for (int i = 0; i < names.size(); i++) {
					String n=names.get(i);
					JOptionPane.showMessageDialog(null, "Guest: " + n);
				}
			}
		
	}
}
