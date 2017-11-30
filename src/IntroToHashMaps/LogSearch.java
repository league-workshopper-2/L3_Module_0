package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.naming.directory.SearchControls;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	HashMap<Integer, String> search = new HashMap<Integer, String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	 // Crate a HashMap of Integers for the keys and Strings for the values.
	public static void main(String[] args) {
		LogSearch log = new LogSearch();
		log.stuff();
	}
	public void stuff() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.setSize(200, 160);
		button1.setText("Add Entry");
		button2.setText("Search by ID");
		button3.setText("View List");
		button4.setText("Remove Entry");
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
	}
	 // Create a GUI with three buttons. 
	 // Button 1: Add Entry
	 // 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 // 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 // 				Add this information as a new entry to your HashMap.
	 // 
	 // Button 2: Search by ID
	 // 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 // 				If that ID exists, display that name to the user.
	 // 				Otherwise, tell the user that that entry does not exist.
	 // 
	 // Button 3: View List
	 // 				When this button is clicked, display the entire list in a message dialog in the following format:
	 // 				ID: 123  Name: Harry Howard
	 // 				ID: 245  Name: Polly Powers
	 // 				ID: 433  Name: Oliver Ortega
	 // 				etc...
	 // 
	 // When this is complete, add a fourth button to your window.
	 // Button 4: Remove Entry
	 // 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 // 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 // 				is not in the list. 
	//
	@Override
	public void actionPerformed(ActionEvent e) {
		String identification;
		int id = 0;
		String name = "";
		String ident = "";
		int identity = 0;
		String total = "";
		String nam = "";
		int nams = 0;
		// TODO Auto-generated method stub
		if (e.getSource()==button1) {
		identification = JOptionPane.showInputDialog("Enter an ID number");
		id =Integer.parseInt(identification);
		name = JOptionPane.showInputDialog("Enter a name");
		search.put(id, name);
		}
		if (e.getSource()==button2) {
			ident = JOptionPane.showInputDialog("Enter an ID number");
			identity = Integer.parseInt(ident);
			if (search.keySet().contains(identity)) {
				JOptionPane.showMessageDialog(null, search.get(identity));
			}
			else {
				JOptionPane.showMessageDialog(null, "Entry does not exist");
			}
		}
		if (e.getSource()==button3) {
			for (int i = 1; i < search.size(); i++) {
				total += "ID: " + i + " Name: " + search.get(i) + "\n";
			}
			JOptionPane.showMessageDialog(null, total);
		}
		if (e.getSource()==button4) {
			nam = JOptionPane.showInputDialog("Enter an ID number");
			nams = Integer.parseInt(nam);
			if (search.keySet().contains(nams)) {
				search.remove(nams);
			}
		}
	}
}
