import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController extends CalculatorPane{
	
	private String operation = "";
	
	public class DeleteButton implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			operation = "";
			inputField.setText(operation);
		}
		
	}

	public class EditButton implements ActionListener{
		
		private String editChar;
		
		public EditButton(String s) {
			editChar = s;
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			operation += editChar;
			inputField.setText(operation);
		}
		
	}
	
	public CalculatorController() {
		ceBtn.addActionListener(new DeleteButton());
		leftPBtn.addActionListener(new EditButton("("));
		rightPBtn.addActionListener(new EditButton(")"));
		//changeSignBtn.addActionListener(new EditButton());
		
		sevenBtn.addActionListener(new EditButton("7"));
		eightBtn.addActionListener(new EditButton("8"));
		nineBtn.addActionListener(new EditButton("9"));
		divBtn.addActionListener(new EditButton("/"));

		fourBtn.addActionListener(new EditButton("4"));
		fiveBtn.addActionListener(new EditButton("5"));
		sixBtn.addActionListener(new EditButton("6"));
		multBtn.addActionListener(new EditButton("*"));
		
		oneBtn.addActionListener(new EditButton("1"));
		twoBtn.addActionListener(new EditButton("2"));
		threeBtn.addActionListener(new EditButton("3"));
		subsBtn.addActionListener(new EditButton("-"));
		
		zeroBtn.addActionListener(new EditButton("0"));
		pointBtn.addActionListener(new EditButton("."));
		//equalBtn.addActionListener(new EditButton());
		sumBtn.addActionListener(new EditButton("+"));
	}
	
}
