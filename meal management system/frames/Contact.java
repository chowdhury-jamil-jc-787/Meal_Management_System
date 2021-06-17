package frames;

import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

import repository.*;
import entity.*;


public class Contact extends JFrame //implements ActionListener
{

    private JLabel manNameLabel, manDesignationLabel, manContactLabel;
	private JTextField manNameTF, manDesignationTF, manContactTF;
	private JButton button1,button2,button3,button4,button5;
	private JPanel panel;
	private JTable manTable;
	private JScrollPane manTableSP;
	
	/*private User user;
	private ContactsRepo er;
	private UserRepo ur;*/
	
	
	public Contact(User user)
	{
		super("Contact");
		this.setSize(1000,450);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*this.user = user;
		
		er = new ContactsRepo();
		ur = new UserRepo();*/
		
		panel = new JPanel();
		panel.setLayout(null);
		
		
		String data[][] = {{"", "", ""}};
		
		String head[] = {"Name", "Designation", "Contact"};
		
		manTable = new JTable(data,head);
		manTableSP = new JScrollPane(manTable);
		manTableSP.setBounds(350, 100, 600, 150);
		manTable.setEnabled(false);
		panel.add(manTableSP);

        manNameLabel = new JLabel("Name :");
		manNameLabel.setBounds(100,100,100,30);
		panel.add(manNameLabel);
		
		manNameTF = new JTextField();
		manNameTF.setBounds(220,100,100,30);
		panel.add(manNameTF);
		
		manDesignationLabel = new JLabel("Designation :");
		manDesignationLabel.setBounds(100,150,100,30);
		panel.add(manDesignationLabel);
		
		manDesignationTF = new JTextField();
		manDesignationTF.setBounds(220,150,100,30);
		panel.add(manDesignationTF);
		
		manContactLabel = new JLabel("Contact: ");
		manContactLabel.setBounds(100,200,100,30);
		panel.add(manContactLabel);
		
		manContactTF = new JTextField();
		manContactTF.setBounds(220,200,100,30);
		panel.add(manContactTF);



        button1= new JButton("Delete");
        button1.setBounds(450,300,100,40);
        button1.setBackground(Color.YELLOW);
        //button1.addActionListener(this);
        panel.add(button1);

        button2= new JButton("Back");
        button2.setBounds(50,300,100,40);
        button2.setBackground(Color.YELLOW);
        //button2.addActionListener(this);
        panel.add(button2);
        this.add(panel);

        button3= new JButton("Add");
        button3.setBounds(250,300,100,40);
        button3.setBackground(Color.YELLOW);
        //button3.addActionListener(this);
        panel.add(button3);

        button4= new JButton("Update");
        button4.setBounds(650,300,100,40);
        button4.setBackground(Color.YELLOW);
        //button4.addActionListener(this);
        panel.add(button4);

        button5= new JButton("Exit");
        button5.setBounds(850,300,100,40);
        button5.setBackground(Color.YELLOW);
        //button5.addActionListener(this);
        panel.add(button5);

        this.add(panel);
        }
        /*public void actionPerformed(ActionEvent ae)
	    {
		String command = ae.getActionCommand();
	    if(command.equals(button2.getText()))
		{
			MemberHome eh = new MemberHome(user);
			eh.setVisible(true);
			this.setVisible(false);
		}
		
		else if(command.equals(button1.getText()))
		{
			LoginFrame lf = new LoginFrame();
			lf.setVisible(true);
			this.setVisible(false);
			System.exit(0);
		}
		
		else if(command.equals(button3.getText()))
		{
			Contact e = new Contact();
			User u = new User();
			//Random rd = new Random();
			//int x = rd.nextInt(9999999)+10000000;
			
			
			e.setName(manNameTF.getText());
			e.setDesignation(manDesignationTF.getText());
			e.setContact(Double.parseDouble(ContactTF.getText()));
			
			
			if(((manDesignationTF.getText()).equals("Contact")) || ((manDesignationTF.getText()).equals("contact")))
			{
				u.setStatus(0);
			}
			else
			{
				u.setStatus(1);
			}
			
			er.addInDB(e);
			ur.addUser(u);
			
			JOptionPane.showMessageDialog(this, "Added, Name: "+manNameTF.getText());
			
	
			manNameTF.setText("");
			manDesignationTF.setText("");
			manContactTF.setText("");
			
			button3.setEnabled(true);
			button4.setEnabled(false);
			button5.setEnabled(false);
			
		}
		else if(command.equals(button4.getText()))
		{
			Contact e = new Contact();
			
			e.setName(manNameTF.getText());
			e.setDesignation(manDesignationTF.getText());
			e.setContact(Double.parseDouble(manContact.getText()));
			
			er.updateInDB(e);
			
			JOptionPane.showMessageDialog(this, "Updated");
			
			
			manNameTF.setText("");
			manDesignationTF.setText("");
			manContactTF.setText("");
			
			
			button3.setEnabled(true);
			button4.setEnabled(false);
			button5.setEnabled(false);
			
			
			
			manNameTF.setEnabled(true);
			manDesignationTF.setEnabled(true);
			manContactTF.setEnabled(true);
		}
		else if(command.equals(deleteBtn.getText()))
		{
			er.deleteFromDB(manNameTF.getText());
			ur.deleteUser(manNameTF.getText());
			
			JOptionPane.showMessageDialog(this,"Deleted");
			
			
			manNameTF.setText("");
			manDesignationTF.setText("");
			manContactTF.setText("");
			
		
			manNameTF.setEnabled(true);
			manDesignationTF.setEnabled(true);
			manContactTF.setEnabled(true);
	
			
			button3.setEnabled(true);
			button4.setEnabled(false);
			button5.setEnabled(false);
			
		}
		else{}
	}*/
}
