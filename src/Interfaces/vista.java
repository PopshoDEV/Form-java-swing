package Interfaces;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Rectangle;
import javax.swing.SpringLayout;
import javax.swing.JLabel;

public class vista extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnAgregar;
	private JButton btnAct;
	private JButton btnRem;
	private JButton btnMos;
	private JLabel lblNewLabel;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vista frame = new vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(750, 190, 782, 425);
		contentPane = new JPanel();
		contentPane.setBounds(new Rectangle(450, 300, 180, 30));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		table = new JTable();
		Object[] columns = {"Nombre","Apellido","Username","Telefono","Contreseña","E-mail", "Confirmar Contraseña"};
		DefaultTableModel model = new DefaultTableModel();
		SpringLayout sl_contentPane = new SpringLayout();
		contentPane.setLayout(sl_contentPane);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAgregar.setBounds(new Rectangle(450, 350, 180, 30));
		btnAgregar.setBounds(450, 350, 180, 30);
		
		contentPane.add(btnAgregar);
		
		
		table.setCellSelectionEnabled(true);
		table.setColumnSelectionAllowed(true);
		table.setBackground(Color.white);
		
		
		
		table.setForeground(Color.black);
		table.setSelectionBackground(Color.red);
		table.setGridColor(Color.red);
		table.setFont(new Font("Tahoma", Font.PLAIN,11));
		table.setRowHeight(30);
		table.setAutoCreateRowSorter(true);
		
		JScrollPane pane = new JScrollPane(table);
		sl_contentPane.putConstraint(SpringLayout.WEST, btnAgregar, 0, SpringLayout.WEST, pane);
		sl_contentPane.putConstraint(SpringLayout.NORTH, pane, 56, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, pane, 61, SpringLayout.WEST, contentPane);
		sl_contentPane.putConstraint(SpringLayout.SOUTH, pane, 301, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.EAST, pane, 689, SpringLayout.WEST, contentPane);
		pane.setForeground(Color.RED);
		pane.setBackground(Color.WHITE);
		pane.setBounds(10,10,729,354);
		getContentPane().add(pane);
		
		btnAct = new JButton("Actualizar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAgregar, 0, SpringLayout.NORTH, btnAct);
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnAct, 22, SpringLayout.SOUTH, pane);
		btnAct.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnAct.setBounds(new Rectangle(450, 350, 180, 30));
		contentPane.add(btnAct);
		
		btnRem = new JButton("Remover");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnRem, 22, SpringLayout.SOUTH, pane);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnAct, -96, SpringLayout.WEST, btnRem);
		sl_contentPane.putConstraint(SpringLayout.EAST, btnRem, 0, SpringLayout.EAST, pane);
		btnRem.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnRem.setBounds(new Rectangle(450, 350, 180, 30));
		contentPane.add(btnRem);
		
		btnMos = new JButton("Mostrar");
		sl_contentPane.putConstraint(SpringLayout.NORTH, btnMos, 22, SpringLayout.SOUTH, pane);
		btnMos.setFont(new Font("Tahoma", Font.PLAIN, 14));
		sl_contentPane.putConstraint(SpringLayout.EAST, btnMos, -109, SpringLayout.WEST, btnAct);
		btnMos.setBounds(new Rectangle(450, 350, 180, 30));
		contentPane.add(btnMos);
		
		lblNewLabel = new JLabel("FORMULARIO");
		sl_contentPane.putConstraint(SpringLayout.NORTH, lblNewLabel, 10, SpringLayout.NORTH, contentPane);
		sl_contentPane.putConstraint(SpringLayout.WEST, lblNewLabel, 302, SpringLayout.WEST, contentPane);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
		contentPane.add(lblNewLabel);
		
		Object[] row = new Object[7];
	}

}
