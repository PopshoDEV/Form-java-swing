package Interfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;

public class registrate extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField firstname;
    private JTextField lastname;
    private JTextField email;
    private JTextField username;
    private JTextField mob;
    private JPasswordField passwordField;
    private JButton btnNewButton;


	private Connection connection;
	private PreparedStatement prepare;
	private ResultSet result;
	private JPasswordField confirmed_pass;
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    registrate frame = new registrate();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public registrate() {
    	
    	setLocationRelativeTo(null);
    	
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("Registrar Usuario");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        JLabel lblName = new JLabel("Nombre");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblName.setBounds(58, 152, 99, 43);
        contentPane.add(lblName);

        JLabel lblNewLabel = new JLabel("Apellido");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblNewLabel.setBounds(58, 243, 110, 29);
        contentPane.add(lblNewLabel);

        JLabel lblEmailAddress = new JLabel("Correo Electronico");
        lblEmailAddress.setToolTipText("");
        lblEmailAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblEmailAddress.setBounds(30, 316, 180, 36);
        contentPane.add(lblEmailAddress);

        firstname = new JTextField();
        firstname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        firstname.setBounds(214, 151, 228, 50);
        contentPane.add(firstname);
        firstname.setColumns(10);

        lastname = new JTextField();
        lastname.setFont(new Font("Tahoma", Font.PLAIN, 32));
        lastname.setBounds(214, 235, 228, 50);
        contentPane.add(lastname);
        lastname.setColumns(10);

        email = new JTextField();
        email.setFont(new Font("Tahoma", Font.PLAIN, 32));
        email.setBounds(214, 305, 228, 50);
        contentPane.add(email);
        email.setColumns(10);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(707, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(542, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Contrase\u00F1a");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(542, 245, 120, 24);
        contentPane.add(lblPassword);

        JLabel lblMobileNumber = new JLabel("Telefono");
        lblMobileNumber.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMobileNumber.setBounds(542, 329, 139, 26);
        contentPane.add(lblMobileNumber);

        mob = new JTextField();
        mob.setFont(new Font("Tahoma", Font.PLAIN, 32));
        mob.setBounds(707, 320, 228, 50);
        contentPane.add(mob);
        mob.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(707, 235, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Registrar");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	
            	String firstName = firstname.getText();
                String lastName = lastname.getText();
                String emailId = email.getText();
                String userName = username.getText();
                String mobileNumber = mob.getText();
                		
                int len = mobileNumber.length();
                String password = passwordField.getText();
                String confirmedPass = confirmed_pass.getText();
                

                String msg = "" + firstName;
                msg += " \n";
                
                if (emailId.isEmpty() || lastName.isEmpty() || userName.isEmpty() 
                		|| mobileNumber.isEmpty() || password.isEmpty() 
                		|| confirmedPass.isEmpty() & password == confirmedPass) {
                    JOptionPane.showMessageDialog("Favor de completar todos los campos", "Error Message", JOptionPane.ERROR_MESSAGE);
                }else {
                	
                }
                
            	String query = "INSERT INTO account values('" + firstName + "','" + lastName + "','" + userName + "','" +
                        password + "','" + emailId + "','" + mobileNumber + "', '" + confirmedPass + "')";
            	
            	connection = database.connecDB();
                
            }
        });
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(574, 410, 259, 74);
        contentPane.add(btnNewButton);
        
        JLabel lblconfi_Pass = new JLabel("Confirmar contrase\u00F1a");
        lblconfi_Pass.setToolTipText("");
        lblconfi_Pass.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblconfi_Pass.setBounds(30, 397, 180, 36);
        contentPane.add(lblconfi_Pass);
        
        JButton btnIrAlLogin = new JButton("Ir al login");
        btnIrAlLogin.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        		login loginForm = new login();
        		loginForm.setFocusable(true);
        		loginForm.show();
        		
        		dispose();
        	}
        });
        
        btnIrAlLogin.setBackground(SystemColor.controlLtHighlight);
        btnIrAlLogin.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnIrAlLogin.setBounds(441, 484, 259, 74);
        contentPane.add(btnIrAlLogin);
        
        confirmed_pass = new JPasswordField();
        confirmed_pass.setFont(new Font("Tahoma", Font.PLAIN, 32));
        confirmed_pass.setBounds(214, 383, 228, 50);
        contentPane.add(confirmed_pass);
    }
}