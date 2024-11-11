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

public class ClimaB {

	private JFrame frame;
	private JRadioButton rdbtnFrontal;

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
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		Border bordeConEspacio = BorderFactory.createEmptyBorder(10, 10, 10, 10); // 10px de espacio alrededor
        Border bordeLinea = BorderFactory.createLineBorder(Color.BLACK, 2); // Borde negro de 2px
        
        JLabel lblEncendido = new JLabel("Encendido");
        lblEncendido.setFont(new Font("Palatino Linotype", Font.BOLD, 25));
        GridBagConstraints gbc_lblEncendido = new GridBagConstraints();
        gbc_lblEncendido.anchor = GridBagConstraints.SOUTH;
        gbc_lblEncendido.insets = new Insets(0, 0, 5, 5);
        gbc_lblEncendido.gridheight = 3;
        gbc_lblEncendido.gridx = 2;
        gbc_lblEncendido.gridy = 0;
        panel.add(lblEncendido, gbc_lblEncendido);
        
        JButton btnEncender = new JButton("O");
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
		
		JButton btnMas = new JButton("+");
		btnMas.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnMas = new GridBagConstraints();
		gbc_btnMas.insets = new Insets(0, 0, 5, 5);
		gbc_btnMas.gridx = 3;
		gbc_btnMas.gridy = 3;
		panel.add(btnMas, gbc_btnMas);
		
		JLabel lblTempNum = new JLabel("   24.2 ° C    ");
		lblTempNum.setFont(new Font("Palatino Linotype", Font.PLAIN, 20));
		lblTempNum.setBorder(BorderFactory.createCompoundBorder(bordeConEspacio, bordeLinea)); // Combina ambos bordes
		GridBagConstraints gbc_lblTempNum = new GridBagConstraints();
		gbc_lblTempNum.anchor = GridBagConstraints.SOUTH;
		gbc_lblTempNum.insets = new Insets(0, 0, 5, 5);
		gbc_lblTempNum.gridx = 4;
		gbc_lblTempNum.gridy = 3;
		panel.add(lblTempNum, gbc_lblTempNum);
		
		JButton btnMas_1 = new JButton("—");
		btnMas_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		GridBagConstraints gbc_btnMas_1 = new GridBagConstraints();
		gbc_btnMas_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnMas_1.gridx = 5;
		gbc_btnMas_1.gridy = 3;
		panel.add(btnMas_1, gbc_btnMas_1);
		
		JCheckBox chckbxModoAutomatico = new JCheckBox("Modo Automático");
		chckbxModoAutomatico.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_chckbxModoAutomatico = new GridBagConstraints();
		gbc_chckbxModoAutomatico.anchor = GridBagConstraints.SOUTH;
		gbc_chckbxModoAutomatico.gridwidth = 3;
		gbc_chckbxModoAutomatico.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxModoAutomatico.gridx = 3;
		gbc_chckbxModoAutomatico.gridy = 4;
		panel.add(chckbxModoAutomatico, gbc_chckbxModoAutomatico);
		
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
		
		JSlider sliderVentilaciom = new JSlider();
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
		
		JRadioButton rdbtnParabrisas = new JRadioButton("Parabrisas");
		rdbtnParabrisas.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_rdbtnParabrisas = new GridBagConstraints();
		gbc_rdbtnParabrisas.anchor = GridBagConstraints.WEST;
		gbc_rdbtnParabrisas.gridwidth = 3;
		gbc_rdbtnParabrisas.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnParabrisas.gridx = 4;
		gbc_rdbtnParabrisas.gridy = 7;
		panel.add(rdbtnParabrisas, gbc_rdbtnParabrisas);
		
		rdbtnFrontal = new JRadioButton("Frontal");
		rdbtnFrontal.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_rdbtnFrontal = new GridBagConstraints();
		gbc_rdbtnFrontal.anchor = GridBagConstraints.WEST;
		gbc_rdbtnFrontal.gridwidth = 3;
		gbc_rdbtnFrontal.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnFrontal.gridx = 4;
		gbc_rdbtnFrontal.gridy = 8;
		panel.add(rdbtnFrontal, gbc_rdbtnFrontal);
		
		JCheckBox chckbxModoEco = new JCheckBox("Modo Eco");
		chckbxModoEco.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_chckbxModoEco = new GridBagConstraints();
		gbc_chckbxModoEco.gridwidth = 2;
		gbc_chckbxModoEco.insets = new Insets(0, 0, 5, 5);
		gbc_chckbxModoEco.gridx = 1;
		gbc_chckbxModoEco.gridy = 9;
		panel.add(chckbxModoEco, gbc_chckbxModoEco);
		
		JRadioButton rdbtnPies = new JRadioButton("Pies");
		rdbtnPies.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_rdbtnPies = new GridBagConstraints();
		gbc_rdbtnPies.anchor = GridBagConstraints.WEST;
		gbc_rdbtnPies.gridwidth = 2;
		gbc_rdbtnPies.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnPies.gridx = 4;
		gbc_rdbtnPies.gridy = 9;
		panel.add(rdbtnPies, gbc_rdbtnPies);
		
		JRadioButton rdbtnTodos = new JRadioButton("Todos");
		rdbtnTodos.setFont(new Font("Palatino Linotype", Font.PLAIN, 15));
		GridBagConstraints gbc_rdbtnTodos = new GridBagConstraints();
		gbc_rdbtnTodos.anchor = GridBagConstraints.SOUTHWEST;
		gbc_rdbtnTodos.gridwidth = 2;
		gbc_rdbtnTodos.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnTodos.gridx = 4;
		gbc_rdbtnTodos.gridy = 10;
		panel.add(rdbtnTodos, gbc_rdbtnTodos);
		
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
		
		JSlider sliderAsientosDelanteros = new JSlider();
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
		
		JSlider sliderAsientosTraseros = new JSlider();
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
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Mantenimiento", "Ver Historial ", "Agendar Mantenimiento"}));
		comboBox.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.gridwidth = 3;
		gbc_comboBox.insets = new Insets(0, 0, 0, 5);
		gbc_comboBox.gridx = 1;
		gbc_comboBox.gridy = 15;
		panel.add(comboBox, gbc_comboBox);
		
		JCheckBox chckbxDesempa = new JCheckBox("Desempañador");
		chckbxDesempa.setFont(new Font("Palatino Linotype", Font.BOLD, 20));
		GridBagConstraints gbc_chckbxDesempa = new GridBagConstraints();
		gbc_chckbxDesempa.gridwidth = 2;
		gbc_chckbxDesempa.insets = new Insets(0, 0, 0, 5);
		gbc_chckbxDesempa.gridx = 4;
		gbc_chckbxDesempa.gridy = 15;
		panel.add(chckbxDesempa, gbc_chckbxDesempa);
	}

}
