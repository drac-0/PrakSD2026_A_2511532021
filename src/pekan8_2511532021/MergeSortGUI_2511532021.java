package pekan8_2511532021;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class MergeSortGUI_2511532021 extends JFrame {

    private static final long serialVersionUID_2021 = 1L;

    private int[] array_2021;
    private JLabel[] labelArray_2021;
    private JButton stepButton_2021, resetButton_2021, setButton_2021;
    private JTextField inputField_2021;
    private JPanel panelArray_2021;
    private JTextArea stepArea_2021;

    private int i_2021, j_2021, k_2021;
    private int left_2021, mid_2021, right_2021;
    private int[] temp_2021;

    private boolean isMerging_2021 = false;
    private boolean copying_2021 = false;
    private int stepCount_2021 = 1;

    private Queue<int[]> mergeQueue_2021 = new LinkedList<>();

    public MergeSortGUI_2511532021() {
        setTitle("Merge Sort Langkah per Langkah");
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

        stepArea_2021 = new JTextArea(8, 60);
        stepArea_2021.setEditable(false);
        stepArea_2021.setFont(new Font("Monospaced", Font.PLAIN, 14));
        JScrollPane scrollPane_2021 = new JScrollPane(stepArea_2021);

        add(inputPanel_2021, BorderLayout.NORTH);
        add(panelArray_2021, BorderLayout.CENTER);
        add(controlPanel_2021, BorderLayout.SOUTH);
        add(scrollPane_2021, BorderLayout.EAST);

        setButton_2021.addActionListener(e_2021 -> setArrayFromInput_2021());
        stepButton_2021.addActionListener(e_2021 -> performStep_2021());
        resetButton_2021.addActionListener(e_2021 -> reset_2021());
    }

    private void setArrayFromInput_2021() {
        String text_2021 = inputField_2021.getText().trim();
        if (text_2021.isEmpty()) return;

        String[] parts_2021 = text_2021.split(",");
        array_2021 = new int[parts_2021.length];

        try {
            for (int i_2021 = 0; i_2021 < parts_2021.length; i_2021++) {
                array_2021[i_2021] = Integer.parseInt(parts_2021[i_2021].trim());
            }
        } catch (NumberFormatException e_2021) {
            JOptionPane.showMessageDialog(this, "Masukkan hanya angka!",
                    "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        labelArray_2021 = new JLabel[array_2021.length];
        panelArray_2021.removeAll();

        for (int i_2021 = 0; i_2021 < array_2021.length; i_2021++) {
            labelArray_2021[i_2021] = new JLabel(String.valueOf(array_2021[i_2021]));
            labelArray_2021[i_2021].setFont(new Font("Arial", Font.BOLD, 24));
            labelArray_2021[i_2021].setOpaque(true);
            labelArray_2021[i_2021].setBackground(Color.WHITE);
            labelArray_2021[i_2021].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            labelArray_2021[i_2021].setPreferredSize(new Dimension(50, 50));
            labelArray_2021[i_2021].setHorizontalAlignment(SwingConstants.CENTER);
            panelArray_2021.add(labelArray_2021[i_2021]);
        }

        mergeQueue_2021.clear();
        generateMergeSteps_2021(0, array_2021.length - 1);

        stepButton_2021.setEnabled(true);
        stepArea_2021.setText("");
        stepCount_2021 = 1;
        isMerging_2021 = false;
        copying_2021 = false;

        panelArray_2021.revalidate();
        panelArray_2021.repaint();
    }

    private void generateMergeSteps_2021(int left_2021, int right_2021) {
        if (left_2021 < right_2021) {
            int mid_2021 = left_2021 + (right_2021 - left_2021) / 2;

            generateMergeSteps_2021(left_2021, mid_2021);
            generateMergeSteps_2021(mid_2021 + 1, right_2021);

            mergeQueue_2021.add(new int[] { left_2021, mid_2021, right_2021 });
        }
    }

    private void performStep_2021() {
        resetHighlights_2021();

        if (!isMerging_2021 && !mergeQueue_2021.isEmpty()) {
            int[] range_2021 = mergeQueue_2021.poll();

            left_2021 = range_2021[0];
            mid_2021 = range_2021[1];
            right_2021 = range_2021[2];

            temp_2021 = new int[right_2021 - left_2021 + 1];

            i_2021 = left_2021;
            j_2021 = mid_2021 + 1;
            k_2021 = 0;

            copying_2021 = false;
            isMerging_2021 = true;

            stepArea_2021.append(
                    "Langkah " + stepCount_2021++
                            + ": Mulai merge dari "
                            + left_2021 + " ke "
                            + right_2021 + "\n"
            );

            return;
        }

        if (isMerging_2021 && !copying_2021) {
            if (i_2021 <= mid_2021 && j_2021 <= right_2021) {
                labelArray_2021[i_2021].setBackground(Color.CYAN);
                labelArray_2021[j_2021].setBackground(Color.CYAN);

                if (array_2021[i_2021] <= array_2021[j_2021]) {
                    temp_2021[k_2021++] = array_2021[i_2021++];
                } else {
                    temp_2021[k_2021++] = array_2021[j_2021++];
                }

                stepArea_2021.append(
                        "Langkah " + stepCount_2021++
                                + ": Bandingkan dan salin elemen\n"
                );

                return;

            } else if (i_2021 <= mid_2021) {
                temp_2021[k_2021++] = array_2021[i_2021++];

                stepArea_2021.append(
                        "Langkah " + stepCount_2021++
                                + ": Salin sisa kiri\n"
                );

                return;

            } else if (j_2021 <= right_2021) {
                temp_2021[k_2021++] = array_2021[j_2021++];

                stepArea_2021.append(
                        "Langkah " + stepCount_2021++
                                + ": Salin sisa kanan\n"
                );

                return;

            } else {
                copying_2021 = true;
                k_2021 = 0;
                return;
            }
        }

        if (copying_2021 && k_2021 < temp_2021.length) {
            array_2021[left_2021 + k_2021] = temp_2021[k_2021];
            labelArray_2021[left_2021 + k_2021].setText(String.valueOf(temp_2021[k_2021]));
            labelArray_2021[left_2021 + k_2021].setBackground(Color.GREEN);
            k_2021++;

            stepArea_2021.append("Langkah " + stepCount_2021++ + ": Tempelkan ke array utama\n");
            return;
        }

        if (copying_2021 && k_2021 == temp_2021.length) {
            isMerging_2021 = false;
            copying_2021 = false;
        }

        if (mergeQueue_2021.isEmpty() && !isMerging_2021) {
            stepArea_2021.append("Selesai.\n");
            stepButton_2021.setEnabled(false);
            JOptionPane.showMessageDialog(this, "Merge Sort selesai!");
        }
    }

    private void resetHighlights_2021() {
        if (labelArray_2021 == null) return;

        for (JLabel label_2021 : labelArray_2021) {
            label_2021.setBackground(Color.WHITE);
        }
    }

    private void reset_2021() {
        inputField_2021.setText("");
        panelArray_2021.removeAll();
        panelArray_2021.revalidate();
        panelArray_2021.repaint();
        stepArea_2021.setText("");
        stepButton_2021.setEnabled(false);
        mergeQueue_2021.clear();
        isMerging_2021 = false;
        copying_2021 = false;
        stepCount_2021 = 1;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MergeSortGUI_2511532021 frame_2021 = new MergeSortGUI_2511532021();
            frame_2021.setVisible(true);
        });
    }
}