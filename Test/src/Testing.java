import acm.program.*;
import javax.swing.*;
import java.awt.*;
import acm.gui.*;
import java.awt.event.*;
import java.awt.AWTEvent.*;
import java.awt.event.ActionListener;



public class Testing extends DialogProgram {
	
	//Declaration Section 
	Accumulator acc = new Accumulator();//Creates a new Accumulator to be used in this Class
	DoubleField screen = new DoubleField(); //creates a new DoubleField called screen to visually present numbers and computations 
	
	public void init() { //innit method for the creation and customization of Panels, buttons, and grids.
		
		//Panel Section
		JPanel inputPanel = new JPanel();//creates a new JPanel for input
		  FlowLayout layout = new FlowLayout();//creates a new FlowLayout to be used in this Class
		  inputPanel.setLayout(layout);//sets the layout of inputPanel to the current layout of FlowLayout
		  
		  //Screen Section
		  inputPanel.add(screen);//adds screen to the inputPanel
		  add(inputPanel); //adds to the Panel
		  inputPanel.setLayout(new GridLayout(1,1,1,1));//sets a grid on input panel
		  inputPanel.setSize(1,1);//determines panel size
		  screen.setPreferredSize(new Dimension(200,350));//determines screen size
		  
		  //Creating The Grid and Layout
		  JPanel samplePanel = new JPanel();//makes a new panel
		  GridLayout ButtonLayout = new GridLayout(5, 4);//sets a grid layout for a button layout
		  samplePanel.setLayout(ButtonLayout);//adds the grid layout to the samplePanel
		  
		/*Button Section
		 *1. creates a new button 
		 *2. adds it to the grid
		 *3. adds a listener to wait for an action to be performed
		*/
		  JButton secondPowerButton = new JButton("x^2");
		  samplePanel.add(secondPowerButton);
		  secondPowerButton.addActionListener(this);
		  
		  JButton emptyButton = new JButton(" ");
		  samplePanel.add(emptyButton);
		  
		  JButton deleteButton = new JButton("CE");
		  samplePanel.add(deleteButton);
		  deleteButton.addActionListener(this);
		  
		  JButton emptyButton2 = new JButton(" ");
		  samplePanel.add(emptyButton2);
		  
		  JButton divisionButton = new JButton("/");
		  samplePanel.add(divisionButton);
		  divisionButton.addActionListener(this);
		  
		  JButton powerOfYButton = new JButton("x^y");
		  samplePanel.add(powerOfYButton);
		  powerOfYButton.addActionListener(this);
		  
		  JButton sevenButton = new JButton("7");
		  samplePanel.add(sevenButton);
		  sevenButton.addActionListener(this);
		  
		  JButton eightButton = new JButton("8");
		  samplePanel.add(eightButton);
		  eightButton.addActionListener(this);
		  
		  JButton nineButton = new JButton("9");
		  samplePanel.add(nineButton);
		  nineButton.addActionListener(this);
		  
		  JButton multiplicationButton = new JButton("*");
		  samplePanel.add(multiplicationButton);
		  
		  JButton piButton = new JButton("pi");
		  samplePanel.add(piButton);
		  multiplicationButton.addActionListener(this);
		  
		  JButton fourButton = new JButton("4");
		  samplePanel.add(fourButton);
		  fourButton.addActionListener(this);
		  
		  JButton fiveButton = new JButton("5");
		  samplePanel.add(fiveButton);
		  fiveButton.addActionListener(this);
		  
		  JButton sixButton = new JButton("6");
		  samplePanel.add(sixButton);
		  sixButton.addActionListener(this);
		  
		  JButton subtractionButton = new JButton("-");
		  samplePanel.add(subtractionButton);
		  subtractionButton.addActionListener(this);
		  
		  JButton absoluteButton = new JButton("|x|");
		  samplePanel.add(absoluteButton);
		  absoluteButton.addActionListener(this);
		  
		  JButton oneButton = new JButton("1");
		  samplePanel.add(oneButton);
		  oneButton.addActionListener(this);
		  
		  JButton twoButton = new JButton("2");
		  samplePanel.add(twoButton);
		  twoButton.addActionListener(this);
		  
		  JButton threeButton = new JButton("3");
		  samplePanel.add(threeButton);
		  threeButton.addActionListener(this);
		  
		  JButton additionButton = new JButton("+");
		  samplePanel.add(additionButton);
		  additionButton.addActionListener(this);
		  
		  JButton sqrtButton = new JButton("sqrt");
		  samplePanel.add(sqrtButton);
		  sqrtButton.addActionListener(this);
		  
		  JButton nthsqrtButton = new JButton("nthsqrt(x)");
		  samplePanel.add(nthsqrtButton);
		  nthsqrtButton.addActionListener(this);
		  
		  JButton zeroButton = new JButton("0");
		  samplePanel.add(zeroButton);
		  zeroButton.addActionListener(this);
		  
		  JButton pointButton = new JButton(".");
		  samplePanel.add(pointButton);
		  pointButton.addActionListener(this);
		  
		    
		  JButton equalButton = new JButton("=");
		  samplePanel.add(equalButton);
		  equalButton.addActionListener(this);
		  
		  add(samplePanel);
		  
	} //end of the innit method
	
	
	 	//Listener Section
		public void actionPerformed(ActionEvent e) {
		//When a button is clicked it will perform the respective action in this method	
			
			String clicked = e.getActionCommand();//sets e.getActionCommand() to the String clicked so that it will be able to .equals()
			
			if(clicked.equals("-")) { // checking if clicked equals "-"
				acc.calculate(screen.getValue(), "-"); // looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			
			if(clicked.equals("/")) {// checking if clicked equals "/"
				acc.calculate(screen.getValue(), "/"); //looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			
			if(clicked.equals("+")) {// checking if clicked equals "+" 
				acc.calculate(screen.getValue(), "+"); //looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			
			if(clicked.equals("*")) { //checking if clicked equals "*"
				acc.calculate(screen.getValue(), "*"); //looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			
			if(clicked.equals("sqrt")) { //checking if clicked equals "sqrt"
				acc.calculate(screen.getValue(), "sqrt"); //looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			
			if(clicked.equals("nthsqrt(x)")) { //checking if clicked equals "nthsqrt(x)"
				acc.calculate(screen.getValue(), "nthsqrt(x)"); //looking through the accumulator to perform the operation
				screen.setText(""); //turning the screen blank to prepare for the next number
			}
			
			
			if(clicked.equals("0")) { //checking if clicked equals "0" 
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("1")) { //checking if clicked equals "1" 
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("2")) { //checking if clicked equals "2"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("3")) {//checking if clicked equals "3"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("4")) { //checking if clicked equals "4"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("5")) { //checking if clicked equals "5"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("6")) { //checking if clicked equals "6"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("7")) { //checking if clicked equals "7"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("8")) { //checking if clicked equals "8"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("9")) { //checking if clicked equals "9"
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("pi")) { //checking if clicked equals "pi"
				screen.setText(screen.getText() + Math.PI); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals(".")) { //checking if clicked equals "."
				screen.setText(screen.getText() + clicked); //sets the screen to the current text concatenated with the current value of clicked
				
			}
			
			if(clicked.equals("CE")) { //checking if clicked equals "CE"
				screen.setText(""); //turning the screen blank to prepare for the next number
				acc.resetAccumulator(); //resets the accumulator 
			}
			
			if(clicked.equals("=")) {//checking if clicked equals "CE"
				acc.calculate(screen.getValue(), "="); //calculates the value of screen
				screen.setValue(acc.getValue()); //sets the screen to the result of the accumulator calculation
				acc.resetAccumulator();
				
			}
			
			if(clicked.equals("x^y")) {//checking if clicked equals "x^y"
				//gets the current value on the screen then awaits a second number to put the current number to the power of the second	
				acc.calculate(screen.getValue(), "x^y"); 
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
		
			if(clicked.equals("x^2")) {//checking if clicked equals "x^2" 
				acc.calculate(screen.getValue(), "x^2"); //gets the current value of screen and computes it to the second power
				screen.setText(""); //turning the screen blank to prepare for the next number
				
			}
			if(clicked.equals("|x|")) {//checking if clicked equals "|x|" 
				acc.calculate(screen.getValue(), "|x|"); //gets current value of screen, computes the absolute value of the number
				screen.setText("");//turning the screen blank to prepare for the next number
				
			}
			
		}
		
		
	}//end of the MyCalculator Class



