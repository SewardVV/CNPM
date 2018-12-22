package myjava.mybignumber;

    /**
     * 
     * Author: Nguyen Van Hai
     * 
     */

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class MyBigNumberApplication implements IReceiver{

	private JFrame frame;
	private JTextField num1;
	private JTextField num2;
	private JTextField result;
	private JTextArea textArea;
	private static String strs1 = "";
	private static String strs2 = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyBigNumberApplication window = new MyBigNumberApplication();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		//get two number strings from users
		try {
			if(args.length > 0) {
				strs1 = args[0];
				strs2 = args[1];
			}else {
				strs1 = "0";
				strs2 = "0";
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Create the application.
	 */
	public MyBigNumberApplication() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 608, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		FlowLayout flowLayout = (FlowLayout) panel1.getLayout();
		flowLayout.setAlignment(FlowLayout.LEFT);
		flowLayout.setAlignOnBaseline(true);
		
		JLabel lblApplicationPlusTwo = new JLabel("Application plus two number sequences");
		lblApplicationPlusTwo.setFont(new Font("Tahoma", Font.PLAIN, 13));
		
		JLabel lblAdditional = new JLabel("Additional two numbers and submit");
		
		JLabel lblStepByStep = new JLabel("Step by step");
		
		textArea = new JTextArea();
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
							.addComponent(lblApplicationPlusTwo)
							.addGap(121))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 203, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAdditional))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
								.addComponent(lblStepByStep))
							.addContainerGap())))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblApplicationPlusTwo)
					.addPreferredGap(ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAdditional)
						.addComponent(lblStepByStep))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panel1, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE)
						.addComponent(textArea, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
					.addContainerGap())
		);
		
		JLabel lblNewLabel = new JLabel("The First Number     ");
		lblNewLabel.setLabelFor(frame);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		panel1.add(lblNewLabel);
		
		num1 = new JTextField();
		panel1.add(num1);
		num1.setColumns(10);
		num1.setText(strs1);
		
		JLabel lblTheSecondNumber = new JLabel("The Second Number");
		lblTheSecondNumber.setBackground(new Color(240, 240, 240));
		panel1.add(lblTheSecondNumber);
		
		num2 = new JTextField();
		panel1.add(num2);
		num2.setColumns(10);
		num2.setText(strs2);
		
		JLabel lblNewLabel_1 = new JLabel("Result                      ");
		panel1.add(lblNewLabel_1);
		
		result = new JTextField();
		panel1.add(result);
		result.setColumns(10);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBackground(new Color(255, 255, 204));
		panel1.add(btnSubmit);
		btnSubmit.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				getComments2ActionPerformed(e);
			}
		});
		
		JButton btnClean = new JButton("Clean");
		panel1.add(btnClean);
		btnClean.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent evt) {
				// TODO Auto-generated method stub
				num1.setText(null);
				num2.setText(null);
				result.setText(null);
				textArea.setText(null);
			}
			
		});
		panel1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{lblNewLabel}));
		frame.getContentPane().setLayout(groupLayout);
	}
	
	private void  getComments2ActionPerformed(java.awt.event.ActionEvent evt) {
        String s1 = num1.getText();
        String s2 = num2.getText();
        final Pattern pattern = Pattern.compile("\\D"); //Numerical sequences represent numeric characters [0-9]
	    final Matcher flag1 = pattern.matcher(s1); 
	    final Matcher flag2 = pattern.matcher(s2); 
        
	    //check two number sequences is empty or not
        // if it is null make it = '0'
        if ((s1 == null) || (s1.trim().isEmpty())) {
        	s1 = "0";
        }
        if ((s2 == null) || (s2.trim().isEmpty())) {
        	s2 = "0";
        }
	    
	    //Check whether characters are special characters or characters
	    if (flag1.find() && !flag2.find()) {
	    	JOptionPane.showMessageDialog(textArea, "Please do not include" 
	    	        + " any special characters or characters in string : " + s1);
	    	result.setText(null);
	    }
	    if (flag2.find() && !flag1.find()) {
	    	JOptionPane.showMessageDialog(textArea, "Please do not include" 
	    	        + " any special characters or characters in string : " + s2);
	    	result.setText(null);
	    }
	    if (flag1.find() && flag2.find()) {
	    	JOptionPane.showMessageDialog(textArea, "Please do not include any" 
	    	        + " special characters or characters in string : " + s1 + " and " + s2);
	    	result.setText(null);
	    }
        
        MyBigNumber mybignumber = new MyBigNumber(this);
        String sum = mybignumber.sum(s1,s2);
        result.setText(sum);
	}
	
	@Override
	public void send(String msg) {
		// TODO Auto-generated method stub
		textArea.setText(msg);
		System.out.println(msg);
	}
}
