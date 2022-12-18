package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main{
	private static double num1=-1;
	private static double num2=-1;
	private static double result=-696969;
	private static int operUsage=0;
	private static void numReset() {
		num1=-1;
		num2=-1;
	}
	
	private static void initComponents() {
		JFrame frame = new JFrame("Program");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1000, 1000);
        frame.setLayout(null);
        
        JLabel label = new JLabel("Program - File Editor");
        frame.getContentPane().add(label);
        
        JTextField textField = new JTextField();
        textField.setBounds(100, 100, 400, 30);
        frame.getContentPane().add(textField);
        textField.setText("FIRST CHOOSE TWO NUMBERS THEN OPERATOR");
        
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
        
        
        frame.getContentPane().add(bZero);
        frame.getContentPane().add(bOne);
        frame.getContentPane().add(bTwo);
        frame.getContentPane().add(bThree);
        frame.getContentPane().add(bFour);
        frame.getContentPane().add(bFive);
        frame.getContentPane().add(bSix);
        frame.getContentPane().add(bSeven);
        frame.getContentPane().add(bEight);
        frame.getContentPane().add(bNine);
        frame.getContentPane().add(bAdd);
        frame.getContentPane().add(bSubstract);
        frame.getContentPane().add(bMultiply);
        frame.getContentPane().add(bDivide);
        frame.getContentPane().add(bResult);
        frame.getContentPane().add(bReset);
        
        frame.pack();
        frame.setVisible(true);
        
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
        		textField.setText("+ PRESSED");
        		if(num1==-1||num2==-1) {
        			textField.setText("FIRST CHOOSE TWO NUMBERS TO USE OPERATOR");
        		}else {
        			result=num1+num2;
        			numReset();
        			operUsage++;
        		}
        	}
        });
        bSubstract.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("- PRESSED");
        		if(num1==-1||num2==-1) {
        			textField.setText("FIRST CHOOSE TWO NUMBERS TO USE OPERATOR");
        		}else {
        			result=num1-num2;
        			numReset();
        			operUsage++;
        		}
        	}
        });
        bMultiply.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("* PRESSED");
        		if(num1==-1||num2==-1) {
        			textField.setText("FIRST CHOOSE TWO NUMBERS TO USE OPERATOR");
        		}else {
        			result=num1*num2;
        			numReset();
        			operUsage++;
        		}
        	}
        });
        bDivide.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {
        		textField.setText("/ PRESSED");
        		if(num1==-1||num2==-1) {
        			textField.setText("FIRST CHOOSE TWO NUMBERS TO USE OPERATOR");
        		}else {
        			result=num1/num2;
        			numReset();
        			operUsage++;
        		}
        	}
        });
        
	}
    public static void main(String[] args){
        javax.swing.SwingUtilities.invokeLater(new Runnable(){
            public void run(){
                initComponents();
            }
        });
    }
}