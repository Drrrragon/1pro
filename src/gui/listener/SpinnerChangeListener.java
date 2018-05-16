package gui.listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import gui.OrderFrame;

public class SpinnerChangeListener implements ChangeListener {
	private OrderFrame order1;
	private int countValue;
	public SpinnerChangeListener(OrderFrame order1) {
		this.order1 = order1;
	}
	
	@Override
	public void stateChanged(ChangeEvent e) {
		if (e.getSource() == order1.spinner) {
			System.out.println(order1.spinner.getValue());
			countValue = (int)order1.spinner.getValue();		
		}
	}
	
	public int getCountValue() {
		return countValue;
	}
}