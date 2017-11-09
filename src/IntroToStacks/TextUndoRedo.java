package IntroToStacks;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TextUndoRedo implements KeyListener {

	public static void main(String[] args) {
		TextUndoRedo redo = new TextUndoRedo();
		redo.stuff();
		redo.keyPressed(null);
		redo.Stack();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public void stuff() {
		frame.add(panel);
		frame.setVisible(true);
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		panel.add(label);
		label.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		String text;
		String remove;
		text = label.getText();
		text += e.getKeyChar();
		label.setText(text);
		if (e.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			remove = label.getText();
			remove = text.replace(0, 0);

		} // else {

		// }

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	void Stack() {
		Stack<Character> letters = new Stack<Character>();

	}
	/*
	 * Create a JFrame with a JPanel and a JLabel.
	 * 
	 * Every time a key is pressed, add that character to the JLabel. It should look
	 * like a basic text editor.
	 * 
	 * Make it so that every time the BACKSPACE key is pressed, the last character
	 * is erased from the JLabel. Save that deleted character onto a Stack of
	 * Characters.
	 * 
	 * Choose a key to be the Undo key. Make it so that when that key is pressed,
	 * the top Character is popped off the Stack and added back to the JLabel.
	 * 
	 */
}
