package Random;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;
import java.awt.GridLayout;

public class RandomFrame extends JFrame {



	private Random rand=new Random();
	
	public RandomFrame(){
		super("Random window ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(550,300);
		setResizable(true);
		getContentPane().setLayout(new GridLayout(5,2));
		
		JPanel top = new JPanel();
		JLabel welcome=new JLabel("Welcome! Select the questions for the hackathon");
		welcome.setForeground(Color.blue);
		welcome.setFont(new Font("Ariel", Font.BOLD, 20));
		top.add(welcome);
		getContentPane().add(top);
		
		JPanel panelA = new JPanel();
		getContentPane().add(panelA);
		
		JButton A = new JButton(" part A");
		panelA.add(A);
		
		JLabel resA1 = new JLabel("   ");
		panelA.add(resA1);
		
		
		JPanel panelB = new JPanel();
		getContentPane().add(panelB);
		
		JButton B = new JButton("part B");
		panelB.add(B);
		
		JLabel resB1 = new JLabel("   ");
		panelB.add(resB1);
		
		JLabel resB2 = new JLabel("");
		panelB.add(resB2);
		
		JPanel panelC = new JPanel();
		getContentPane().add(panelC);
		
		JButton C = new JButton("part C");
		panelC.add(C);
		
		JLabel resC1 = new JLabel("   ");
		panelC.add(resC1);
		
		JLabel resC2 = new JLabel("");
		panelC.add(resC2);
		
		JPanel panelD = new JPanel();
		getContentPane().add(panelD);
		
		JButton D = new JButton("part D");
		panelD.add(D);
		
		JLabel resD1 = new JLabel("   ");
		panelD.add(resD1);
		
		//pack();
		setVisible(true);
		
		A.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {
	        	
	        	int id[]= {2,0,6,9,0,2,3,5,5};
	        	int idrand1 =  rand.nextInt(9);
	        	int idrand2 =  rand.nextInt(9);
	        	int idrand3 =  rand.nextInt(9);
	        	
	        	int randomNum =  (id[idrand1]+id[idrand2]+id[idrand3])%9+1;
	        	
	        	
	        	
	            resA1.setText(String.valueOf(randomNum));
	            

	        }  
	    });  
		
		
		B.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	
	        	int id[]= {2,0,6,4,9,2,4,4,9};
	        	int idrand1 =  rand.nextInt(9);
	        	int idrand2 =  rand.nextInt(9);
	        	int idrand3 =  rand.nextInt(9);
	        	
	        	int randomNum =  ((id[idrand1]+id[idrand2]+id[idrand3])%9)+10;
	        	
	        	idrand1 =  rand.nextInt(9);
	        	idrand2 =  rand.nextInt(9);
	        	idrand3 =  rand.nextInt(9);
	        	int randomNum2 =  ((id[idrand1]+id[idrand2]+id[idrand3])%9)+10;
	        	while(randomNum2 == randomNum)
	        	{
	        		idrand1 =  rand.nextInt(9);
		        	idrand2 =  rand.nextInt(9);
		        	idrand3 =  rand.nextInt(9);
	        		randomNum2 =  ((id[idrand1]+id[idrand2]+id[idrand3])%9)+10;
	        	}
	        	

	            resB1.setText(String.valueOf(randomNum));
	            resB2.setText(String.valueOf(randomNum2));


	        }  
	    });  
		
		
		C.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	int id[]= {2,0,8,2,0,7,0,6,8};
	        	int idrand1 =  rand.nextInt(9);
	        	int idrand2 =  rand.nextInt(9);
	        	int idrand3 =  rand.nextInt(9);
	        	int randomNum2=0;
	        	
	        	int randomNum =  (id[idrand1]+id[idrand2]+id[idrand3])%3+1;
	        	if(randomNum==1)
	        	{
	        		randomNum2=19;
	        	}
	        	else
	        	{
	        		if(randomNum==2)
	        		{
	        			randomNum2 =  ((id[idrand1]+id[idrand2]+id[idrand3])%9)+20;
	        		}
	        		else
	        		{
	        			randomNum2=30;
	        		}
	        	}
	        	resC1.setText(String.valueOf(randomNum2));
	        	int randomNum3=randomNum2;
	        	while( randomNum3==randomNum2)
	        	{
	        		idrand1 =  rand.nextInt(9);
		        	idrand2 =  rand.nextInt(9);
		        	idrand3 =  rand.nextInt(9);
		        	randomNum =  (id[idrand1]+id[idrand2]+id[idrand3])%3+1;
		        	if(randomNum==1)
		        	{
		        		randomNum3=19;
		        	}
		        	else
		        	{
		        		if(randomNum==2)
		        		{
		        			randomNum3 =  ((id[idrand1]+id[idrand2]+id[idrand3])%9)+20;
		        		}
		        		else
		        		{
		        			randomNum3=30;
		        		}
		        	}
		        	
	        	}
	
	        	resC2.setText(String.valueOf(randomNum3));
	        	
	        }  
	    }); 
		
		
		
		D.addActionListener(new ActionListener() {  
	        public void actionPerformed(ActionEvent e) {     
	        	
	        	int id[]= {2,0,6,4,4,8,3,2,6};
	        	int idrand1 =  rand.nextInt(9);
	        	int idrand2 =  rand.nextInt(9);
	        	int idrand3 =  rand.nextInt(9);
	        	
	        	int randomNum =  ((id[idrand1]+id[idrand2]+id[idrand3])%6)+31;

	            resD1.setText(String.valueOf(randomNum));


	        }  
	    });  
		
		
		setLayout(null);
		setSize(550,300);
		setResizable(true);
		//pack();
		setVisible(true);
	}
		
	public static void main(String[] args) 
	{
		new RandomFrame();

	}

}
