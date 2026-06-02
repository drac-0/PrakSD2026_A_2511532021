package pekan8_2511532021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.lang.reflect.Array;
import java.awt.Dimension;

import javax.swing.border.EmptyBorder;
import javax.swing.*;


public class BubbleSortGUI_2511532021 extends JFrame {

    private static final long serialVersionUID_2021 = 1L;
    private int[] array_2021;
    private JLabel[] labelArray_2021;
    private JButton stepButton_2021, resetButton_2021, setButton_2021;
    private JTextField inputField_2021;
    private JPanel panelArray_2021;
    private JTextArea stepArea_2021;

    private int i_2021 = 1, j_2021;
    private boolean sorting_2021 = false;
    private int stepCount_2021 = 1;

    private JPanel contentPane_2021;

    public BubbleSortGUI_2511532021() {
        setTitle("Insertion Sort Langkah per Langkah");
        setSize(750, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel inputPanel_2021 = new JPanel(new FlowLayout());
        inputField_2021 = new JTextField(30);
        setButton_2021 = new JButton("Set Array");
        inputPanel_2021.add(new JLabel("Masukkan angka (pisahkan dengan koma):"));
        inputPanel_2021.add(inputField_2021);
        inputPanel_2021.add(setButton_2021);

        panelArray_2021 = new JPanel();
        panelArray_2021.setLayout(new FlowLayout());

        JPanel controlPanel_2021 = new JPanel();
        stepButton_2021 = new JButton("Langkah Selanjutnya");
        resetButton_2021 = new JButton("Reset");
        stepButton_2021.setEnabled(false);
        controlPanel_2021.add(stepButton_2021);
        controlPanel_2021.add(resetButton_2021);
        
        
        stepArea_2021 = new JTextArea(8,60);
        stepArea_2021.setEditable(false);
        stepArea_2021.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_2021 = new JScrollPane(stepArea_2021);
        
        add(inputPanel_2021, BorderLayout.NORTH);
        add(panelArray_2021, BorderLayout.CENTER);
        add(controlPanel_2021, BorderLayout.SOUTH);
        add(scrollPane_2021, BorderLayout.EAST);
        
        setButton_2021.addActionListener(e -> setArrayFromInput());
        stepButton_2021.addActionListener(e -> performStep());
        resetButton_2021.addActionListener(e -> reset());
    }
    
    private void setArrayFromInput() {
    	String text_2021 = inputField_2021.getText().trim();
    	if (text_2021.isEmpty())return;
    	String[] parts_2021 = text_2021.split(",");
    	array_2021 = new int[parts_2021.length];
    	
    	try {
    		for (int k_2021 = 0 ; k_2021 < parts_2021.length; k_2021++) {
    			array_2021[k_2021] =Integer.parseInt(parts_2021[k_2021].trim()); 
    		}
    	}catch (NumberFormatException e) {
    		JOptionPane.showMessageDialog(this, "masukkan angka" + "yang dipisahkan koma!", "Error", JOptionPane.ERROR_MESSAGE);
    		return;
    	}
    	
    	i_2021 = 0; j_2021 =0 ;
    	stepCount_2021 = 1;
    	sorting_2021 = true;
    	stepButton_2021.setEnabled(true);
    	stepArea_2021.setText("");
    	panelArray_2021.removeAll();
    	labelArray_2021 = new JLabel[array_2021.length];
    	for (int k_2021 = 0 ; k_2021 < array_2021.length ; k_2021++) {
    		labelArray_2021[k_2021] = new JLabel(String.valueOf(array_2021[k_2021]));
    		labelArray_2021[k_2021].setFont(new Font("Arial", Font.BOLD, 24));
    		labelArray_2021[k_2021].setOpaque(true);
    		labelArray_2021[k_2021].setBackground(Color.WHITE);
    		labelArray_2021[k_2021].setBorder(BorderFactory.createLineBorder(Color.BLACK));
    		labelArray_2021[k_2021].setPreferredSize(new Dimension(50,50));
    		labelArray_2021[k_2021].setHorizontalAlignment(SwingConstants.CENTER);
    		panelArray_2021.add(labelArray_2021[k_2021]);
    	}
    	panelArray_2021.revalidate();
    	panelArray_2021.repaint();
    	
    	
    	
    }
    private void performStep() {

        if (!sorting_2021 || i_2021 >= array_2021.length - 1) {
            sorting_2021 = false;
            stepButton_2021.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting selesai");
            return;
        }

        resetHighlights();

        StringBuilder stepLog = new StringBuilder();

        labelArray_2021[j_2021].setBackground(Color.CYAN);
        labelArray_2021[j_2021 + 1].setBackground(Color.CYAN);

        int nilaiKiri_2021 = array_2021[j_2021];
        int nilaiKanan_2021 = array_2021[j_2021 + 1];

        if (nilaiKiri_2021 > nilaiKanan_2021) {

            // Swap yang benar
            int temp_2021 = array_2021[j_2021];
            array_2021[j_2021] = array_2021[j_2021 + 1];
            array_2021[j_2021 + 1] = temp_2021;

            stepLog.append("Langkah ")
                   .append(stepCount_2021)
                   .append(": Menukar ")
                   .append(nilaiKiri_2021)
                   .append(" dengan ")
                   .append(nilaiKanan_2021)
                   .append("\n");

        } else {

            stepLog.append("Langkah ")
                   .append(stepCount_2021)
                   .append(": Tidak ada pertukaran antara ")
                   .append(nilaiKiri_2021)
                   .append(" dan ")
                   .append(nilaiKanan_2021)
                   .append("\n");
        }

        stepLog.append("Hasil: ")
               .append(arrayToString(array_2021))
               .append("\n\n");

        stepArea_2021.append(stepLog.toString());

        updateLabels();

        j_2021++;

        if (j_2021 >= array_2021.length - i_2021 - 1) {
            j_2021 = 0;
            i_2021++;
        }

        stepCount_2021++;

        if (i_2021 >= array_2021.length - 1) {
            sorting_2021 = false;
            stepButton_2021.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Sorting Selesai");
        }
    }
    private void updateLabels() {
    	for (int k = 0 ; k < array_2021.length; k++) {
    		labelArray_2021[k].setText(String.valueOf(array_2021[k]));
    	}
    }
    
    private void reset() {
    	inputField_2021.setText("");
    	panelArray_2021.removeAll();
    	panelArray_2021.revalidate();
    	panelArray_2021.repaint();
    	stepArea_2021.setText("");
    	stepButton_2021.setEnabled(false);
    	sorting_2021 = false;
    	i_2021 = 1;
    	j_2021 = 1;
    	stepCount_2021 = 1;
    }
    
    private void resetHighlights() {
    	for (JLabel label : labelArray_2021) {
    		label.setBackground(Color.WHITE);
    	}
    }
    
    private String arrayToString(int[] arr) {
    	StringBuilder sb_2021 = new StringBuilder();
    	for (int k = 0; k < arr.length; k++) {
    		sb_2021.append(arr[k]);
    		if (k < arr.length - 1) sb_2021.append(", ");
    		
    	}
    	return sb_2021.toString();
    }
    
    public static void main(String[] args) {
    	SwingUtilities.invokeLater(() -> {
    		BubbleSortGUI_2511532021 gui = new BubbleSortGUI_2511532021();
    		gui.setVisible(true);
    	});
    } 	
}