package pekan7_2511532021;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TugasSortingGUI_2511532021 extends JFrame {
    private ArrayList<Mahasiswa_2511532021> listMahasiswa_2021;
    
    private JTextField txtNama_2021, txtNim_2021, txtProdi_2021;
    private JComboBox<String> comboSort_2021;
    private JTextArea txtVisualisasi_2021;

    public TugasSortingGUI_2511532021() {
        listMahasiswa_2021 = new ArrayList<>();

        setTitle("Program Sorting Mahasiswa - 2511532021");
        setSize(600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // panel Input (atas)
        JPanel panelInput_2021 = new JPanel(new GridLayout(4, 2, 5, 5));
        panelInput_2021.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        panelInput_2021.add(new JLabel("Nama Mahasiswa:"));
        txtNama_2021 = new JTextField();
        panelInput_2021.add(txtNama_2021);

        panelInput_2021.add(new JLabel("NIM:"));
        txtNim_2021 = new JTextField();
        panelInput_2021.add(txtNim_2021);

        panelInput_2021.add(new JLabel("Program Studi:"));
        txtProdi_2021 = new JTextField();
        panelInput_2021.add(txtProdi_2021);

        JButton btnTambah_2021 = new JButton("Tambah Data");
        JButton btnReset_2021 = new JButton("Reset Data");
        panelInput_2021.add(btnTambah_2021);
        panelInput_2021.add(btnReset_2021);

        add(panelInput_2021, BorderLayout.NORTH);

        // panel tengah (visualisasi dan tabel)
        txtVisualisasi_2021 = new JTextArea();
        txtVisualisasi_2021.setEditable(false);
        txtVisualisasi_2021.setFont(new Font("Monospaced", Font.PLAIN, 12));
        JScrollPane scroll_2021 = new JScrollPane(txtVisualisasi_2021);
        scroll_2021.setBorder(BorderFactory.createTitledBorder("Visualisasi Sorting & Hasil"));
        add(scroll_2021, BorderLayout.CENTER);

        // panel bawah (kontrol sorting)
        JPanel panelKontrol_2021 = new JPanel(new FlowLayout());
        String[] metodeSort_2021 = {"Insertion Sort", "Selection Sort", "Bubble Sort"};
        comboSort_2021 = new JComboBox<>(metodeSort_2021);
        JButton btnSort_2021 = new JButton("Mulai Sorting");

        panelKontrol_2021.add(new JLabel("Pilih Metode: "));
        panelKontrol_2021.add(comboSort_2021);
        panelKontrol_2021.add(btnSort_2021);

        add(panelKontrol_2021, BorderLayout.SOUTH);

        // event listener tombol tambah
        btnTambah_2021.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama_2021 = txtNama_2021.getText();
                String nim_2021 = txtNim_2021.getText();
                String prodi_2021 = txtProdi_2021.getText();

                if (!nama_2021.isEmpty() && !nim_2021.isEmpty() && !prodi_2021.isEmpty()) {
                    listMahasiswa_2021.add(new Mahasiswa_2511532021(nama_2021, nim_2021, prodi_2021));
                    tampilkanDataMentah_2021();
                    txtNama_2021.setText(""); txtNim_2021.setText(""); txtProdi_2021.setText("");
                } else {
                    JOptionPane.showMessageDialog(null, "Isi semua data!");
                }
            }
        });

        // event listener tombol reset
        btnReset_2021.addActionListener(e -> {
            listMahasiswa_2021.clear();
            txtVisualisasi_2021.setText("Data telah di-reset.");
        });

        // event listener tombol sorting
        btnSort_2021.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (listMahasiswa_2021.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data kosong! Tambahkan data dulu.");
                    return;
                }

                // copy data agar array list asli tidak berubah (untuk mengetes algo lain)
                ArrayList<Mahasiswa_2511532021> listCopy_2021 = new ArrayList<>(listMahasiswa_2021);
                String pilihan_2021 = (String) comboSort_2021.getSelectedItem();

                txtVisualisasi_2021.setText("=== " + pilihan_2021.toUpperCase() + " ===\n");
                txtVisualisasi_2021.append("Data Awal: " + dapatkanHanyaNama_2021(listCopy_2021) + "\n\n");

                if (pilihan_2021.equals("Insertion Sort")) {
                    insertionSort_2021(listCopy_2021);
                } else if (pilihan_2021.equals("Selection Sort")) {
                    selectionSort_2021(listCopy_2021);
                } else {
                    bubbleSort_2021(listCopy_2021);
                }

                txtVisualisasi_2021.append("\n=== HASIL AKHIR ===\n");
                for (Mahasiswa_2511532021 mhs_2021 : listCopy_2021) {
                    txtVisualisasi_2021.append(mhs_2021.toString() + "\n");
                }
            }
        });
    }

    private void tampilkanDataMentah_2021() {
        txtVisualisasi_2021.setText("Data Saat Ini:\n");
        for (Mahasiswa_2511532021 mhs_2021 : listMahasiswa_2021) {
            txtVisualisasi_2021.append(mhs_2021.toString() + "\n");
        }
    }

    private String dapatkanHanyaNama_2021(ArrayList<Mahasiswa_2511532021> list_2021) {
        StringBuilder sb_2021 = new StringBuilder("[");
        for (int i = 0; i < list_2021.size(); i++) {
            sb_2021.append(list_2021.get(i).getNama_2021());
            if (i < list_2021.size() - 1) sb_2021.append(", ");
        }
        sb_2021.append("]");
        return sb_2021.toString();
    }

    // algoritma sorting

    private void insertionSort_2021(ArrayList<Mahasiswa_2511532021> arr_2021) {
        int n_2021 = arr_2021.size();
        for (int i_2021 = 1; i_2021 < n_2021; i_2021++) {
            Mahasiswa_2511532021 key_2021 = arr_2021.get(i_2021);
            int j_2021 = i_2021 - 1;

            // compareToIgnoreCase menghasilkan > 0 jika string pertama lebih besar secara alfabetis
            while (j_2021 >= 0 && arr_2021.get(j_2021).getNama_2021().compareToIgnoreCase(key_2021.getNama_2021()) > 0) {
                arr_2021.set(j_2021 + 1, arr_2021.get(j_2021));
                j_2021--;
            }
            arr_2021.set(j_2021 + 1, key_2021);

            txtVisualisasi_2021.append("Langkah " + i_2021 + ": " + dapatkanHanyaNama_2021(arr_2021) + "\n");
        }
    }

    private void selectionSort_2021(ArrayList<Mahasiswa_2511532021> arr_2021) {
        int n_2021 = arr_2021.size();
        for (int i_2021 = 0; i_2021 < n_2021 - 1; i_2021++) {
            int minIdx_2021 = i_2021;
            for (int j_2021 = i_2021 + 1; j_2021 < n_2021; j_2021++) {
                if (arr_2021.get(j_2021).getNama_2021().compareToIgnoreCase(arr_2021.get(minIdx_2021).getNama_2021()) < 0) {
                    minIdx_2021 = j_2021;
                }
            }
            // swap
            Mahasiswa_2511532021 temp_2021 = arr_2021.get(minIdx_2021);
            arr_2021.set(minIdx_2021, arr_2021.get(i_2021));
            arr_2021.set(i_2021, temp_2021);

            txtVisualisasi_2021.append("Pass " + (i_2021 + 1) + ": " + dapatkanHanyaNama_2021(arr_2021) + "\n");
        }
    }

    private void bubbleSort_2021(ArrayList<Mahasiswa_2511532021> arr_2021) {
        int n_2021 = arr_2021.size();
        for (int i_2021 = 0; i_2021 < n_2021 - 1; i_2021++) {
            for (int j_2021 = 0; j_2021 < n_2021 - i_2021 - 1; j_2021++) {
                if (arr_2021.get(j_2021).getNama_2021().compareToIgnoreCase(arr_2021.get(j_2021 + 1).getNama_2021()) > 0) {
                    // Swap
                    Mahasiswa_2511532021 temp_2021 = arr_2021.get(j_2021);
                    arr_2021.set(j_2021, arr_2021.get(j_2021 + 1));
                    arr_2021.set(j_2021 + 1, temp_2021);
                }
            }
            txtVisualisasi_2021.append("Pass " + (i_2021 + 1) + ": " + dapatkanHanyaNama_2021(arr_2021) + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new TugasSortingGUI_2511532021().setVisible(true);
        });
    }
}