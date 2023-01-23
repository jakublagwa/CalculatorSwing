package ui;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CalculatorPanel extends JPanel implements ActionListener{

	private static double num1=-1;
	private static double num2=-1;
	private static double result=-696969;
	private static int operUsage=0;
	private static void numReset() {
		num1=-1;
		num2=-1;
	}
	
	JButton bZero = new JButton("0");
    JButton bOne = new JButton("1");
    JButton bTwo = new JButton("2");
    JButton bThree = new JButton("3");
    JButton bFour = new JButton("4");
    JButton bFive = new JButton("5");
    JButton bSix = new JButton("6");
    JButton bSeven = new JButton("7");
    JButton bEight = new JButton("8");
    JButton bNine = new JButton("9");
    JButton bAdd = new JButton("+");
    JButton bSubstract = new JButton("-");
    JButton bMultiply = new JButton("*");
    JButton bDivide = new JButton("/");
    JButton bResult = new JButton("RESULT");
    JButton bReset = new JButton("RESET");
    
  
    
    
	CalculatorPanel(){
		this.add(bOne);
		this.add(bTwo);
		this.add(bThree);
		this.add(bFour);
		this.add(bFive);
		this.add(bSix);
		this.add(bSeven);
		this.add(bEight);
		this.add(bNine);
		this.add(bZero);
		this.add(bAdd);
		this.add(bSubstract);
		this.add(bMultiply);
		this.add(bDivide);
		this.add(bResult);
		this.add(bReset);
		bOne.setBounds(100, 200, 95, 30);
	    bTwo.setBounds(210, 200, 95, 30);
	    bThree.setBounds(320, 200, 95, 30);
	    bFour.setBounds(100, 240, 95, 30);
	    bFive.setBounds(210, 240, 95, 30);
	    bSix.setBounds(320, 240, 95, 30);
	    bSeven.setBounds(100, 280, 95, 30);
	    bEight.setBounds(210, 280, 95, 30);
	    bNine.setBounds(320, 280, 95, 30);
	    bZero.setBounds(210, 320, 95, 30);
	    bAdd.setBounds(430, 200, 95, 30);
	    bSubstract.setBounds(430, 240, 95, 30);
	    bMultiply.setBounds(430, 280, 95, 30);
	    bDivide.setBounds(430, 320, 95, 30);
	    bResult.setBounds(430, 360, 95, 30);
	    bReset.setBounds(320, 360, 95, 30);
	}
	bReset.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			numReset();
			operUsage=0;
			textField.setText("RESETED SUCCESFULLY");
		}
    });
    bResult.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("RESULT PRESSED");
			if(result==-696969) {
				textField.setText("ERROR");
			}
			if(operUsage==0) {
				textField.setText("ZERO ACTIVITIES DONE");
			}
			String s = String.valueOf(result);
			textField.setText(s);
		}
    });
    bZero.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("ZERO PRESSED");
			if(num1==-1&&num2==-1) {
				num1=0;
			}else if(num1!=-1&&num2==-1){
				num2=0;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bOne.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("ONE PRESSED");
			if(num1==-1&&num2==-1) {
				num1=1;
			}else if(num1!=-1&&num2==-1){
				num2=1;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bTwo.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("TWO PRESSED");
			if(num1==-1&&num2==-1) {
				num1=2;
			}else if(num1!=-1&&num2==-1){
				num2=2;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bThree.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("THREE PRESSED");
			if(num1==-1&&num2==-1) {
				num1=3;
			}else if(num1!=-1&&num2==-1){
				num2=3;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bFour.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("FOUR PRESSED");
			if(num1==-1&&num2==-1) {
				num1=4;
			}else if(num1!=-1&&num2==-1){
				num2=4;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bFive.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("FIVE PRESSED");
			if(num1==-1&&num2==-1) {
				num1=5;
			}else if(num1!=-1&&num2==-1){
				num2=5;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bSix.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("SIX PRESSED");
			if(num1==-1&&num2==-1) {
				num1=6;
			}else if(num1!=-1&&num2==-1){
				num2=6;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bSeven.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("SEVEN PRESSED");
			if(num1==-1&&num2==-1) {
				num1=7;
			}else if(num1!=-1&&num2==-1){
				num2=7;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bEight.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("EIGHT PRESSED");
			if(num1==-1&&num2==-1) {
				num1=8;
			}else if(num1!=-1&&num2==-1){
				num2=8;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bNine.addActionListener(new ActionListener(){
		@Override
		public void actionPerformed(ActionEvent e) {
			textField.setText("NINE PRESSED");
			if(num1==-1&&num2==-1) {
				num1=9;
			}else if(num1!=-1&&num2==-1){
				num2=9;
			}else if(num1!=-1&&num2!=-1){
				textField.setText("CHOOSE AN OPERATOR NOT A NUMBER!");
			}
		}
    });
    bAdd.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    	}
    });
    bSubstract.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    	}
    });
    bMultiply.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    	}
    });
    bDivide.addActionListener(new ActionListener() {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    	}
    });

}




	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
