package Interfaces;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login extends JFrame {
    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField username;
    private JPasswordField passwordField;
    private JButton btnNewButton;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login frame = new login();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public login() {
    	
    	//Centraliza el formulario
    	setLocationRelativeTo(null);
    	
        setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\User\\Desktop\\STDM.jpg"));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewUserRegister = new JLabel("login");
        lblNewUserRegister.setFont(new Font("Times New Roman", Font.PLAIN, 42));
        lblNewUserRegister.setBounds(362, 52, 325, 50);
        contentPane.add(lblNewUserRegister);

        username = new JTextField();
        username.setFont(new Font("Tahoma", Font.PLAIN, 32));
        username.setBounds(480, 151, 228, 50);
        contentPane.add(username);
        username.setColumns(10);

        JLabel lblUsername = new JLabel("Username");
        lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblUsername.setBounds(370, 159, 99, 29);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Password");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblPassword.setBounds(370, 245, 99, 24);
        contentPane.add(lblPassword);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 32));
        passwordField.setBounds(480, 235, 228, 50);
        contentPane.add(passwordField);

        btnNewButton = new JButton("Registrate Ahora");
        btnNewButton.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		registrate regForm = new registrate();
        		regForm.setFocusable(true);
        		regForm.show();
        		
        		dispose();
        	}
        });
        
        btnNewButton.addActionListener(new ActionListener() {
            
        	public void actionPerformed(ActionEvent e) {
                
                /*String userName = username.getText();
                String password = passwordField.getText();
                
                String msg = "" + username + password;
                msg += " \n";
                if ( userName == "admin" & password == "87654321`") {
                    JOptionPane.showMessageDialog(btnNewButton, "El usuario es ");
                }else {
                	//return JOptionPane.showMessageDialog( "El usuario que ha ingrsado es incorrecto");
                }
                /*try {
                    
z                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "El usuario no existe");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Bienvenido, " + msg + "Has iniciado sesion de manera satisfactoria");
                    }
                    connection.close();
                    
                } catch (Exception exception) {
                    exception.printStackTrace();
                }*/
            }
        });
        
        btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnNewButton.setBounds(400, 447, 259, 74);
        contentPane.add(btnNewButton);
        
        JButton btnAcceder = new JButton("Acceder");
        btnAcceder.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		
        		String userName = username.getText();
                String password = passwordField.getText();
        		
                String msg = "" + username + passwordField;
                msg += " \n";
        		if(userName == "admin"){      		
        			JOptionPane.showMessageDialog(btnAcceder,
                    "Bienvenido, " + msg + "Has iniciado sesion de manera satisfactoria");
        			
        			vista vistaForm = new vista();
	        		vistaForm.setFocusable(true);
	        		vistaForm.show();
	        		
	        		dispose();
        		}else {
        			JOptionPane.showMessageDialog(btnAcceder,
                    "El Usuario Ingresado, " + msg + "Es Incorrecto");
        		}
        	}
        });
        
        btnAcceder.setFont(new Font("Tahoma", Font.PLAIN, 22));
        btnAcceder.setBounds(450, 350, 180, 30);
        contentPane.add(btnAcceder);
    }
}
