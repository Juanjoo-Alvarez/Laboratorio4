package Laboratorio4;

import java.awt.Color;
import java.awt.EventQueue;
import javax.swing.BorderFactory;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.border.Border;

import java.awt.GridBagConstraints;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JRadioButton;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;

public class ClimaB {

	private JFrame frame;
	private JLabel lblEncendido;
	private JButton btnMas;
	private JButton btnMas_1;
	private JLabel lblTempNum;
	private JCheckBox chckbxModoAutomatico;
	private JSlider sliderVentilaciom;
	private JComboBox comboBox_1;
	private JCheckBox chckbxModoEco;
	private JSlider sliderAsientosDelanteros;
	private JSlider sliderAsientosTraseros;
	private JLabel lblMantenimiento;
	private JButton btnHistorial;
	private JButton btnAgendarMantenimiento;
	private JCheckBox chckbxDesempa;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClimaB window = new ClimaB();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClimaB() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 510, 578);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JPanel panel = new JPanel();
		GridBagConstraints gbc_panel = new GridBagConstraints();
		gbc_panel.fill = GridBagConstraints.BOTH;
		gbc_panel.gridx = 0;
		gbc_panel.gridy = 0;
		frame.getContentPane().add(panel, gbc_panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		Border bordeConEspacio = BorderFactory.createEmptyBorder(10, 10, 10, 10); // 10px de espacio alrededor
        Border bordeLinea = BorderFactory.createLineBorder(Color.BLACK, 2); // Borde negro de 2px
        
        lblEncendido = new JLabel("Apagado");
        lblEncendido.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
        GridBagConstraints gbc_lblEncendido = new GridBagConstraints();
        gbc_lblEncendido.anchor = GridBagConstraints.SOUTH;
        gbc_lblEncendido.insets = new Insets(0, 0, 5, 5);
        gbc_lblEncendido.gridheight = 3;
        gbc_lblEncendido.gridx = 2;
        gbc_lblEncendido.gridy = 0;
        panel.add(lblEncendido, gbc_lblEncendido);
        
        JButton btnEncender = new JButton("O");
        btnEncender.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if (lblEncendido.getText().equals("Apagado")) {
        			lblEncendido.setText("Encendido");
        			btnMas.setEnabled(true);
        			lblTempNum.setText(" 25 °C ");
        			btnMas_1.setEnabled(true);
        			chckbxModoAutomatico.setEnabled(true);
        			sliderVentilaciom.setEnabled(true);
        			comboBox_1.setEnabled(true);
        			chckbxModoEco.setEnabled(true);
        			sliderAsientosDelanteros.setEnabled(true);
        			sliderAsientosTraseros.setEnabled(true);
        			btnHistorial.setEnabled(true);
        			btnAgendarMantenimiento.setEnabled(true);
        			chckbxDesempa.setEnabled(true);
        		}
        		else {
        			lblEncendido.setText("Apagado");
        			btnMas.setEnabled(false);
        			lblTempNum.setText("     ");
        			btnMas_1.setEnabled(false);
        			chckbxModoAutomatico.setEnabled(false);
        			sliderVentilaciom.setEnabled(false);
        			comboBox_1.setEnabled(false);
        			chckbxModoEco.setEnabled(false);
        			sliderAsientosDelanteros.setEnabled(false);
        			sliderAsientosTraseros.setEnabled(false);
        			btnHistorial.setEnabled(false);
        			btnAgendarMantenimiento.setEnabled(false);
        			chckbxDesempa.setEnabled(false);
        		} 
        	}
        });
        btnEncender.setFont(new Font("Tahoma", Font.PLAIN, 20));
        GridBagConstraints gbc_btnEncender = new GridBagConstraints();
        gbc_btnEncender.gridheight = 3;
        gbc_btnEncender.insets = new Insets(0, 0, 5, 5);
        gbc_btnEncender.gridx = 3;
        gbc_btnEncender.gridy = 0;
        panel.add(btnEncender, gbc_btnEncender);
		
		JLabel lblTemperatura = new JLabel("Temperatura: ");
		lblTemperatura.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_lblTemperatura = new GridBagConstraints();
		gbc_lblTemperatura.insets = new Insets(0, 0, 5, 5);
		gbc_lblTemperatura.gridx = 2;
		gbc_lblTemperatura.gridy = 3;
		panel.add(lblTemperatura, gbc_lblTemperatura);
		
		btnMas = new JButton("+");
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnMas = new GridBagConstraints();
		gbc_btnMas.insets = new Insets(0, 0, 5, 5);
		gbc_btnMas.gridx = 3;
		gbc_btnMas.gridy = 3;
		panel.add(btnMas, gbc_btnMas);
		btnMas.setEnabled(false);
		
		lblTempNum = new JLabel("        ");
		lblTempNum.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblTempNum.setBorder(BorderFactory.createCompoundBorder(bordeConEspacio, bordeLinea)); // Combina ambos bordes
		GridBagConstraints gbc_lblTempNum = new GridBagConstraints();
		gbc_lblTempNum.anchor = GridBagConstraints.SOUTH;
		gbc_lblTempNum.insets = new Insets(0, 0, 5, 5);
		gbc_lblTempNum.gridx = 4;
		gbc_lblTempNum.gridy = 3;
		panel.add(lblTempNum, gbc_lblTempNum);
		
		btnMas_1 = new JButton("—");
		btnMas_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnMas_1 = new GridBagConstraints();
		gbc_btnMas_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnMas_1.gridx = 5;
		gbc_btnMas_1.gridy = 3;
		panel.add(btnMas_1, gbc_btnMas_1);
		btnMas_1.setEnabled(false);
		
		chckbxModoAutomatico = new JCheckBox("Modo Automático");
		chckbxModoAutomatico.setSelected(true);
		chckbxModoAutomatico.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_chckbxModoAutomatico = new GridBagConstraints();
		gbc_chckbxModoAutomatico.anchor = GridBagConstraints.SOUTH;
		gbc_chckbxModoAutomatico.gridwidth = 3;
		gbc_chckbxModoAutomatico.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxModoAutomatico.gridx = 3;
		gbc_chckbxModoAutomatico.gridy = 4;
		panel.add(chckbxModoAutomatico, gbc_chckbxModoAutomatico);
		chckbxModoAutomatico.setEnabled(false);
		
		JLabel lblVentilacion = new JLabel("Ventilación:");
		lblVentilacion.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_lblVentilacion = new GridBagConstraints();
		gbc_lblVentilacion.gridwidth = 3;
		gbc_lblVentilacion.insets = new Insets(0, 0, 5, 5);
		gbc_lblVentilacion.gridx = 2;
		gbc_lblVentilacion.gridy = 5;
		panel.add(lblVentilacion, gbc_lblVentilacion);
		
		JLabel lblIntensidad = new JLabel("Intensidad");
		lblIntensidad.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		GridBagConstraints gbc_lblIntensidad = new GridBagConstraints();
		gbc_lblIntensidad.gridwidth = 2;
		gbc_lblIntensidad.insets = new Insets(0, 0, 5, 5);
		gbc_lblIntensidad.gridx = 1;
		gbc_lblIntensidad.gridy = 6;
		panel.add(lblIntensidad, gbc_lblIntensidad);
		
		JLabel lblDireccin = new JLabel("Dirección");
		lblDireccin.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		GridBagConstraints gbc_lblDireccin = new GridBagConstraints();
		gbc_lblDireccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccin.gridx = 4;
		gbc_lblDireccin.gridy = 6;
		panel.add(lblDireccin, gbc_lblDireccin);
		
		sliderVentilaciom = new JSlider();
		sliderVentilaciom.setSnapToTicks(true);
		sliderVentilaciom.setMinorTickSpacing(1);
		sliderVentilaciom.setMajorTickSpacing(1);
		sliderVentilaciom.setPaintTicks(true);
		sliderVentilaciom.setPaintLabels(true);
		sliderVentilaciom.setMaximum(3);
		GridBagConstraints gbc_sliderVentilaciom = new GridBagConstraints();
		gbc_sliderVentilaciom.gridheight = 2;
		gbc_sliderVentilaciom.gridwidth = 2;
		gbc_sliderVentilaciom.insets = new Insets(0, 0, 5, 5);
		gbc_sliderVentilaciom.gridx = 1;
		gbc_sliderVentilaciom.gridy = 7;
		panel.add(sliderVentilaciom, gbc_sliderVentilaciom);
		sliderVentilaciom.setEnabled(false);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Todo", "Parabrisas", "Frontal", "Pies"}));
		comboBox_1.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_comboBox_1 = new GridBagConstraints();
		gbc_comboBox_1.gridheight = 2;
		gbc_comboBox_1.gridwidth = 2;
		gbc_comboBox_1.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox_1.gridx = 4;
		gbc_comboBox_1.gridy = 7;
		panel.add(comboBox_1, gbc_comboBox_1);
		comboBox_1.setEnabled(false);
		
		chckbxModoEco = new JCheckBox("Modo Eco");
		chckbxModoEco.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_chckbxModoEco = new GridBagConstraints();
		gbc_chckbxModoEco.gridwidth = 2;
		gbc_chckbxModoEco.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxModoEco.gridx = 1;
		gbc_chckbxModoEco.gridy = 9;
		panel.add(chckbxModoEco, gbc_chckbxModoEco);
		chckbxModoEco.setEnabled(false);
		
		JLabel lblCalefaccin = new JLabel("Calefacción: ");
		lblCalefaccin.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_lblCalefaccin = new GridBagConstraints();
		gbc_lblCalefaccin.gridwidth = 3;
		gbc_lblCalefaccin.insets = new Insets(0, 0, 5, 5);
		gbc_lblCalefaccin.gridx = 2;
		gbc_lblCalefaccin.gridy = 11;
		panel.add(lblCalefaccin, gbc_lblCalefaccin);
		
		JLabel lblAsientosDelanteros = new JLabel("Asientos Delanteros");
		lblAsientosDelanteros.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAsientosDelanteros = new GridBagConstraints();
		gbc_lblAsientosDelanteros.gridwidth = 2;
		gbc_lblAsientosDelanteros.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsientosDelanteros.gridx = 1;
		gbc_lblAsientosDelanteros.gridy = 12;
		panel.add(lblAsientosDelanteros, gbc_lblAsientosDelanteros);
		
		JLabel lblAsientosTraseros = new JLabel("Asientos Traseros");
		lblAsientosTraseros.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		GridBagConstraints gbc_lblAsientosTraseros = new GridBagConstraints();
		gbc_lblAsientosTraseros.gridwidth = 2;
		gbc_lblAsientosTraseros.insets = new Insets(0, 0, 5, 5);
		gbc_lblAsientosTraseros.gridx = 4;
		gbc_lblAsientosTraseros.gridy = 12;
		panel.add(lblAsientosTraseros, gbc_lblAsientosTraseros);
		
		sliderAsientosDelanteros = new JSlider();
		sliderAsientosDelanteros.setSnapToTicks(true);
		sliderAsientosDelanteros.setPaintTicks(true);
		sliderAsientosDelanteros.setPaintLabels(true);
		sliderAsientosDelanteros.setMinorTickSpacing(1);
		sliderAsientosDelanteros.setMaximum(3);
		sliderAsientosDelanteros.setMajorTickSpacing(1);
		GridBagConstraints gbc_sliderAsientosDelanteros = new GridBagConstraints();
		gbc_sliderAsientosDelanteros.gridwidth = 2;
		gbc_sliderAsientosDelanteros.insets = new Insets(0, 0, 5, 5);
		gbc_sliderAsientosDelanteros.gridx = 1;
		gbc_sliderAsientosDelanteros.gridy = 13;
		panel.add(sliderAsientosDelanteros, gbc_sliderAsientosDelanteros);
		sliderAsientosDelanteros.setEnabled(false);
		
		sliderAsientosTraseros = new JSlider();
		sliderAsientosTraseros.setSnapToTicks(true);
		sliderAsientosTraseros.setPaintTicks(true);
		sliderAsientosTraseros.setPaintLabels(true);
		sliderAsientosTraseros.setMinorTickSpacing(1);
		sliderAsientosTraseros.setMaximum(3);
		sliderAsientosTraseros.setMajorTickSpacing(1);
		GridBagConstraints gbc_sliderAsientosTraseros = new GridBagConstraints();
		gbc_sliderAsientosTraseros.gridwidth = 2;
		gbc_sliderAsientosTraseros.insets = new Insets(0, 0, 5, 5);
		gbc_sliderAsientosTraseros.gridx = 4;
		gbc_sliderAsientosTraseros.gridy = 13;
		panel.add(sliderAsientosTraseros, gbc_sliderAsientosTraseros);
		sliderAsientosTraseros.setEnabled(false);
		
		lblMantenimiento = new JLabel("Mantenimiento: ");
		lblMantenimiento.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_lblMantenimiento = new GridBagConstraints();
		gbc_lblMantenimiento.insets = new Insets(0, 0, 5, 5);
		gbc_lblMantenimiento.gridx = 2;
		gbc_lblMantenimiento.gridy = 14;
		panel.add(lblMantenimiento, gbc_lblMantenimiento);
		
		btnHistorial = new JButton("Ver Historial");
		btnHistorial.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_btnHistorial = new GridBagConstraints();
		gbc_btnHistorial.insets = new Insets(0, 0, 5, 5);
		gbc_btnHistorial.gridx = 2;
		gbc_btnHistorial.gridy = 15;
		panel.add(btnHistorial, gbc_btnHistorial);
		btnHistorial.setEnabled(false);
		
		btnAgendarMantenimiento = new JButton("Agendar Mantenimiento");
		btnAgendarMantenimiento.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_btnAgendarMantenimiento = new GridBagConstraints();
		gbc_btnAgendarMantenimiento.insets = new Insets(0, 0, 0, 5);
		gbc_btnAgendarMantenimiento.gridx = 2;
		gbc_btnAgendarMantenimiento.gridy = 16;
		panel.add(btnAgendarMantenimiento, gbc_btnAgendarMantenimiento);
		btnAgendarMantenimiento.setEnabled(false);
		
		chckbxDesempa = new JCheckBox("Desempañador");
		chckbxDesempa.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_chckbxDesempa = new GridBagConstraints();
		gbc_chckbxDesempa.gridwidth = 2;
		gbc_chckbxDesempa.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxDesempa.gridx = 4;
		gbc_chckbxDesempa.gridy = 16;
		panel.add(chckbxDesempa, gbc_chckbxDesempa);
		chckbxDesempa.setEnabled(false);
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (chckbxModoAutomatico.isSelected()) {
			this.lblTempNum.setText(" 25 °C ");
			this.btnMas.setEnabled(false);
			this.btnMas_1.setEnabled(false);}
		if (!chckbxModoAutomatico.isSelected()){
			this.lblTempNum.setText(" 25 °C ");
			this.btnMas.setEnabled(true);
			this.btnMas_1.setEnabled(true); }
		if (chckbxModoEco.isSelected()) {
			this.LabelExtra1.setVisible(false);
			this.TxtExtra1.setVisible(false); 
			this.DropDimExtra1.setVisible(false); }
		if (!chckbxModoEco.isSelected()){
			sliderVentilaciom.setValue(1);
			sliderVentilaciom.setEnabled(false);}
		}

}
