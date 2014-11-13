package Deporte;

import Deporte.Salud;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.util.*;
public class DeporteGrafico extends JFrame { 

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField tfEdad;
	private JTextField tfReposo;
	private JTextField tfFCM;
	private JTextField tfADesde;
	private JTextField tfAHasta;
	private JTextField tfBDesde;
	private JTextField tfBHasta;
	private JTextField tfCDesde;
	private JTextField tfCHasta;
	private JTextField tfDDesde;
	private JTextField tfDHasta;
	private JRadioButton rdbtnMujer;
	private JRadioButton rdbtnHombre;

	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DeporteGrafico frame = new DeporteGrafico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DeporteGrafico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPulsacionesEnReposo = new JLabel("Pulsaciones en reposo");
		lblPulsacionesEnReposo.setHorizontalAlignment(SwingConstants.TRAILING);
		lblPulsacionesEnReposo.setBounds(10, 136, 142, 14);
		contentPane.add(lblPulsacionesEnReposo);

		JLabel lblEdad = new JLabel("Edad");
		lblEdad.setHorizontalAlignment(SwingConstants.TRAILING);
		lblEdad.setBounds(11, 80, 142, 14);
		contentPane.add(lblEdad);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Sexo", TitledBorder.LEADING,
				TitledBorder.TOP, null, null));
		panel.setBounds(33, 11, 175, 55);
		contentPane.add(panel);

		rdbtnHombre = new JRadioButton("Hombre");
		buttonGroup.add(rdbtnHombre);
		rdbtnHombre.setSelected(true);
		panel.add(rdbtnHombre);

		rdbtnMujer = new JRadioButton("Mujer");
		buttonGroup.add(rdbtnMujer);
		panel.add(rdbtnMujer);

		tfEdad = new JTextField();
		tfEdad.setBounds(159, 77, 50, 20);
		contentPane.add(tfEdad);
		tfEdad.setColumns(10);

		tfReposo = new JTextField();
		tfReposo.setBounds(159, 133, 50, 20);
		contentPane.add(tfReposo);
		tfReposo.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int fcr = Integer.parseInt(tfReposo.getText());
					int edad = Integer.parseInt(tfEdad.getText());
					char sexo = 'H';
					if (rdbtnMujer.isSelected())
						sexo = 'M';

					int fcm = Salud.calcularFCM(edad, sexo);
					tfFCM.setText(String.valueOf(fcm));

					int fce = (int) Salud.calcularFCE(edad, sexo, fcr, 50);
					tfADesde.setText(String.valueOf(fce));

					fce = (int) Salud.calcularFCE(edad, sexo, fcr, 60);
					tfAHasta.setText(String.valueOf(fce));
					tfBDesde.setText(String.valueOf(fce));

					fce = (int) Salud.calcularFCE(edad, sexo, fcr, 70);
					tfBHasta.setText(String.valueOf(fce));
					tfCDesde.setText(String.valueOf(fce));

					fce = (int) Salud.calcularFCE(edad, sexo, fcr, 80);
					tfCHasta.setText(String.valueOf(fce));
					tfDDesde.setText(String.valueOf(fce));

					fce = (int) Salud.calcularFCE(edad, sexo, fcr, 90);
					tfDHasta.setText(String.valueOf(fce));
				} catch (InputMismatchException e) {
				} catch (NumberFormatException e){
					
				}
			}
		});
		btnCalcular.setBounds(237, 27, 91, 23);
		contentPane.add(btnCalcular);

		JButton btnBorrar = new JButton("Borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tfADesde.setText("");
				tfAHasta.setText("");
				tfBDesde.setText("");
				tfBHasta.setText("");
				tfCDesde.setText("");
				tfCHasta.setText("");
				tfDDesde.setText("");
				tfDHasta.setText("");
				tfEdad.setText("");
				tfFCM.setText("");
				tfReposo.setText("");
			}
		});
		btnBorrar.setBounds(338, 27, 91, 23);
		contentPane.add(btnBorrar);

		JLabel lblFrecuenciaCardiacaMxima = new JLabel(
				"Frec. cardiaca m\u00E1xima");
		lblFrecuenciaCardiacaMxima
				.setHorizontalAlignment(SwingConstants.TRAILING);
		lblFrecuenciaCardiacaMxima.setBounds(10, 108, 142, 14);
		contentPane.add(lblFrecuenciaCardiacaMxima);

		tfFCM = new JTextField();
		tfFCM.setEditable(false);
		tfFCM.setEnabled(false);
		tfFCM.setBounds(159, 105, 50, 20);
		contentPane.add(tfFCM);
		tfFCM.setColumns(10);

		JLabel lblseCalculaA = new JLabel("(Se calcula a partir de la edad)");
		lblseCalculaA.setBounds(219, 108, 200, 14);
		contentPane.add(lblseCalculaA);

		JLabel lblRango = new JLabel("Rango");
		lblRango.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRango.setHorizontalAlignment(SwingConstants.CENTER);
		lblRango.setBounds(33, 195, 46, 14);
		contentPane.add(lblRango);

		JLabel lblIntensidad = new JLabel("Intensidad");
		lblIntensidad.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblIntensidad.setHorizontalAlignment(SwingConstants.CENTER);
		lblIntensidad.setBounds(89, 195, 67, 14);
		contentPane.add(lblIntensidad);

		JLabel lblRecomendacin = new JLabel("Recomendaci\u00F3n");
		lblRecomendacin.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecomendacin.setBounds(166, 195, 118, 14);
		contentPane.add(lblRecomendacin);

		JLabel lblPulsaciones = new JLabel("Pulsaciones");
		lblPulsaciones.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPulsaciones.setBounds(342, 195, 81, 14);
		contentPane.add(lblPulsaciones);

		JLabel lblA = new JLabel("A");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setBounds(33, 220, 46, 14);
		contentPane.add(lblA);

		JLabel lblNewLabel = new JLabel("B");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(33, 245, 46, 14);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("C");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(33, 270, 46, 14);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("D");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(33, 295, 46, 14);
		contentPane.add(lblNewLabel_2);

		JLabel label = new JLabel("50 - 60 %");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(89, 220, 64, 14);
		contentPane.add(label);

		JLabel label_1 = new JLabel("60 - 70 %");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setBounds(89, 245, 64, 14);
		contentPane.add(label_1);

		JLabel label_2 = new JLabel("70 - 80 %");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setBounds(89, 270, 64, 14);
		contentPane.add(label_2);

		JLabel label_3 = new JLabel("80 - 90 %");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(89, 295, 64, 14);
		contentPane.add(label_3);

		JLabel lblAcondicionamientoBsico = new JLabel(
				"Acondicionamiento b\u00E1sico");
		lblAcondicionamientoBsico.setBounds(166, 220, 200, 14);
		contentPane.add(lblAcondicionamientoBsico);

		JLabel lblNewLabel_5 = new JLabel("Mantenimiento f\u00EDsico y salud");
		lblNewLabel_5.setBounds(166, 245, 162, 14);
		contentPane.add(lblNewLabel_5);

		JLabel lblDeportistasConBuena = new JLabel("Buena cond. f\u00EDsica");
		lblDeportistasConBuena.setBounds(166, 270, 135, 14);
		contentPane.add(lblDeportistasConBuena);

		JLabel lblDeportistasDeAlto = new JLabel("Deportistas de alto nivel");
		lblDeportistasDeAlto.setBounds(166, 295, 142, 14);
		contentPane.add(lblDeportistasDeAlto);

		tfADesde = new JTextField();
		tfADesde.setBounds(339, 214, 50, 20);
		contentPane.add(tfADesde);
		tfADesde.setColumns(10);

		JLabel label_4 = new JLabel("-");
		label_4.setBounds(393, 214, 4, 14);
		contentPane.add(label_4);

		tfAHasta = new JTextField();
		tfAHasta.setColumns(10);
		tfAHasta.setBounds(399, 214, 50, 20);
		contentPane.add(tfAHasta);

		tfBDesde = new JTextField();
		tfBDesde.setColumns(10);
		tfBDesde.setBounds(339, 239, 50, 20);
		contentPane.add(tfBDesde);

		JLabel label_5 = new JLabel("-");
		label_5.setBounds(393, 239, 4, 14);
		contentPane.add(label_5);

		tfBHasta = new JTextField();
		tfBHasta.setColumns(10);
		tfBHasta.setBounds(399, 239, 50, 20);
		contentPane.add(tfBHasta);

		tfCDesde = new JTextField();
		tfCDesde.setColumns(10);
		tfCDesde.setBounds(339, 264, 50, 20);
		contentPane.add(tfCDesde);

		JLabel label_6 = new JLabel("-");
		label_6.setBounds(393, 264, 4, 14);
		contentPane.add(label_6);

		tfCHasta = new JTextField();
		tfCHasta.setColumns(10);
		tfCHasta.setBounds(399, 264, 50, 20);
		contentPane.add(tfCHasta);

		tfDDesde = new JTextField();
		tfDDesde.setColumns(10);
		tfDDesde.setBounds(339, 289, 50, 20);
		contentPane.add(tfDDesde);

		JLabel label_7 = new JLabel("-");
		label_7.setBounds(393, 289, 4, 14);
		contentPane.add(label_7);

		tfDHasta = new JTextField();
		tfDHasta.setColumns(10);
		tfDHasta.setBounds(399, 289, 50, 20);
		contentPane.add(tfDHasta);
	}
}
