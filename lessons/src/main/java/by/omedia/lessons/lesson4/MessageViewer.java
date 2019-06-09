package by.omedia.lessons.lesson4;

import javax.swing.JOptionPane;

public class MessageViewer implements IViewer{

	@Override
	public void show(Object ob) {
		JOptionPane.showInputDialog(ob.toString());
		
	}
	
}
