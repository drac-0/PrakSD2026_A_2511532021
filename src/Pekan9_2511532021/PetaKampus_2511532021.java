package Pekan9_2511532021;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.util.List;

public class PetaKampus_2511532021 extends JFrame {

    private Map<String, List<String>> graph_2021 = new LinkedHashMap<>();
    private Map<String, Point> posisi_2021 = new LinkedHashMap<>();

    private List<String> jalur_2021 = new ArrayList<>();
    private Set<String> dikunjungi_2021 = new LinkedHashSet<>();
    private String startNode_2021 = null;
    private String goalNode_2021 = null;

    private GraphPanel_2021 panelGraph_2021;
    private JComboBox<String> comboAwal_2021;
    private JComboBox<String> comboTujuan_2021;
    private JTextArea areaHasil_2021;
    private JButton btnBFS_2021, btnDFS_2021, btnReset_2021;

    public PetaKampus_2511532021() {
        super("PENCARIAN JALUR - PETA KAMPUS UNAND (2511532021)");
        buatGraph_2021();
        buatGUI_2021();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(950, 650);
        setLocationRelativeTo(null);
    }

    private void buatGraph_2021() {
        posisi_2021.put("Gerbang", new Point(60, 280));
        posisi_2021.put("Rektorat", new Point(230, 150));
        posisi_2021.put("Perpustakaan", new Point(230, 400));
        posisi_2021.put("FTI", new Point(420, 400));
        posisi_2021.put("FE", new Point(420, 100));
        posisi_2021.put("FH", new Point(420, 480));
        posisi_2021.put("PKM", new Point(580, 150));
        posisi_2021.put("Masjid", new Point(580, 280));
        posisi_2021.put("GOR", new Point(760, 100));
        posisi_2021.put("Asrama", new Point(760, 280));
        posisi_2021.put("Kantin", new Point(600, 430));
        posisi_2021.put("LabKomputer", new Point(760, 430));

        for (String node_2021 : posisi_2021.keySet()) {
            graph_2021.put(node_2021, new ArrayList<>());
        }

        tambahEdge_2021("Gerbang", "Rektorat");
        tambahEdge_2021("Gerbang", "Perpustakaan");
        tambahEdge_2021("Rektorat", "PKM");
        tambahEdge_2021("Rektorat", "FE");
        tambahEdge_2021("Perpustakaan", "FTI");
        tambahEdge_2021("Perpustakaan", "FH");
        tambahEdge_2021("FTI", "LabKomputer");
        tambahEdge_2021("FTI", "Kantin");
        tambahEdge_2021("FE", "Kantin");
        tambahEdge_2021("FE", "PKM");
        tambahEdge_2021("FH", "Masjid");
        tambahEdge_2021("PKM", "Masjid");
        tambahEdge_2021("PKM", "GOR");
        tambahEdge_2021("GOR", "Asrama");
        tambahEdge_2021("Asrama", "Kantin");
        tambahEdge_2021("Masjid", "Asrama");
        tambahEdge_2021("LabKomputer", "PKM");
    }

    private void tambahEdge_2021(String a_2021, String b_2021) {
        graph_2021.get(a_2021).add(b_2021);
        graph_2021.get(b_2021).add(a_2021);
    }

    private void BFS_2021(String start_2021, String goal_2021) {
        dikunjungi_2021.clear();
        jalur_2021.clear();

        Map<String, String> induk_2021 = new HashMap<>();
        Queue<String> queue_2021 = new LinkedList<>();

        queue_2021.add(start_2021);
        dikunjungi_2021.add(start_2021);

        boolean ditemukan_2021 = false;

        while (!queue_2021.isEmpty()) {
            String current_2021 = queue_2021.poll();

            if (current_2021.equals(goal_2021)) {
                ditemukan_2021 = true;
                break;
            }

            for (String tetangga_2021 : graph_2021.get(current_2021)) {
                if (!dikunjungi_2021.contains(tetangga_2021)) {
                    dikunjungi_2021.add(tetangga_2021);
                    induk_2021.put(tetangga_2021, current_2021);
                    queue_2021.add(tetangga_2021);
                }
            }
        }

        if (ditemukan_2021) {
            String node_2021 = goal_2021;
            while (node_2021 != null) {
                jalur_2021.add(0, node_2021);
                node_2021 = induk_2021.get(node_2021);
            }
        }
    }

    private void DFS_2021(String start_2021, String goal_2021) {
        dikunjungi_2021.clear();
        jalur_2021.clear();
        dfsHelper_2021(start_2021, goal_2021);
    }

    private boolean dfsHelper_2021(String current_2021, String goal_2021) {
        dikunjungi_2021.add(current_2021);
        jalur_2021.add(current_2021);

        if (current_2021.equals(goal_2021)) {
            return true;
        }

        for (String tetangga_2021 : graph_2021.get(current_2021)) {
            if (!dikunjungi_2021.contains(tetangga_2021)) {
                if (dfsHelper_2021(tetangga_2021, goal_2021)) {
                    return true;
                }
            }
        }

        jalur_2021.remove(jalur_2021.size() - 1);
        return false;
    }

    private void displayPath_2021(String namaAlgoritma_2021) {
        StringBuilder sb_2021 = new StringBuilder();
        sb_2021.append("Hasil Pencarian (" + namaAlgoritma_2021 + ")\n");
        sb_2021.append("======================================\n");

        if (jalur_2021.isEmpty()) {
            sb_2021.append("Jalur tidak ditemukan dari ")
                   .append(startNode_2021).append(" ke ").append(goalNode_2021).append("\n");
        } else {
            sb_2021.append("Jalur   : ").append(String.join(" -> ", jalur_2021)).append("\n");
        }

        sb_2021.append("Node Dikunjungi      : ")
               .append(String.join(", ", dikunjungi_2021)).append("\n");
        sb_2021.append("Jumlah Node Dieksplorasi : ").append(dikunjungi_2021.size()).append("\n");

        areaHasil_2021.setText(sb_2021.toString());
        panelGraph_2021.repaint();
    }

    private void resetGraph_2021() {
        jalur_2021.clear();
        dikunjungi_2021.clear();
        startNode_2021 = null;
        goalNode_2021 = null;
        areaHasil_2021.setText("Hasil Pencarian :\nJalur                : \nNode Dikunjungi      : \nJumlah Node Dieksplorasi : 0");
        panelGraph_2021.repaint();
    }

    private void buatGUI_2021() {
        setLayout(new BorderLayout(10, 10));

        JPanel panelAtas_2021 = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
        panelAtas_2021.setBorder(BorderFactory.createTitledBorder("Kontrol Pencarian"));

        Vector<String> daftarNode_2021 = new Vector<>(graph_2021.keySet());
        comboAwal_2021 = new JComboBox<>(daftarNode_2021);
        comboTujuan_2021 = new JComboBox<>(daftarNode_2021);
        comboTujuan_2021.setSelectedIndex(daftarNode_2021.size() - 1);

        btnBFS_2021 = new JButton("BFS");
        btnDFS_2021 = new JButton("DFS");
        btnReset_2021 = new JButton("RESET");

        btnBFS_2021.setBackground(new Color(120, 220, 120));
        btnDFS_2021.setBackground(new Color(250, 200, 100));
        btnReset_2021.setBackground(new Color(240, 120, 120));

        panelAtas_2021.add(new JLabel("Lokasi Awal :"));
        panelAtas_2021.add(comboAwal_2021);
        panelAtas_2021.add(new JLabel("Lokasi Tujuan :"));
        panelAtas_2021.add(comboTujuan_2021);
        panelAtas_2021.add(btnBFS_2021);
        panelAtas_2021.add(btnDFS_2021);
        panelAtas_2021.add(btnReset_2021);

        panelGraph_2021 = new GraphPanel_2021();
        panelGraph_2021.setBorder(BorderFactory.createTitledBorder("Visualisasi Graph - Peta Kampus Unand"));

        areaHasil_2021 = new JTextArea(6, 50);
        areaHasil_2021.setEditable(false);
        areaHasil_2021.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 13));
        resetGraph_2021();

        JScrollPane scrollHasil_2021 = new JScrollPane(areaHasil_2021);
        scrollHasil_2021.setBorder(BorderFactory.createTitledBorder("Hasil Pencarian"));

        add(panelAtas_2021, BorderLayout.NORTH);
        add(panelGraph_2021, BorderLayout.CENTER);
        add(scrollHasil_2021, BorderLayout.SOUTH);

        btnBFS_2021.addActionListener(e -> {
            startNode_2021 = (String) comboAwal_2021.getSelectedItem();
            goalNode_2021 = (String) comboTujuan_2021.getSelectedItem();
            BFS_2021(startNode_2021, goalNode_2021);
            displayPath_2021("BFS - Breadth First Search");
        });

        btnDFS_2021.addActionListener(e -> {
            startNode_2021 = (String) comboAwal_2021.getSelectedItem();
            goalNode_2021 = (String) comboTujuan_2021.getSelectedItem();
            DFS_2021(startNode_2021, goalNode_2021);
            displayPath_2021("DFS - Depth First Search");
        });

        btnReset_2021.addActionListener(e -> resetGraph_2021());
    }

    public void displayGraph_2021() {
        panelGraph_2021.repaint();
    }

    private class GraphPanel_2021 extends JPanel {

        private static final int RADIUS_2021 = 22;

        public GraphPanel_2021() {
            setBackground(Color.WHITE);
        }

        @Override
        protected void paintComponent(Graphics g_2021) {
            super.paintComponent(g_2021);
            Graphics2D g2_2021 = (Graphics2D) g_2021;
            g2_2021.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

            g2_2021.setStroke(new BasicStroke(2));
            for (String node_2021 : graph_2021.keySet()) {
                Point p1_2021 = posisi_2021.get(node_2021);

                for (String tetangga_2021 : graph_2021.get(node_2021)) {
                    Point p2_2021 = posisi_2021.get(tetangga_2021);

                    boolean adaDiJalur_2021 =
                            jalur_2021.contains(node_2021)
                            && jalur_2021.contains(tetangga_2021)
                            && Math.abs(jalur_2021.indexOf(node_2021)
                            - jalur_2021.indexOf(tetangga_2021)) == 1;

                    if (adaDiJalur_2021) {
                        g2_2021.setColor(Color.RED);
                        g2_2021.setStroke(new BasicStroke(3));
                    } else {
                        g2_2021.setColor(Color.GRAY);
                        g2_2021.setStroke(new BasicStroke(1));
                    }

                    g2_2021.drawLine(
                            p1_2021.x, p1_2021.y,
                            p2_2021.x, p2_2021.y
                    );
                }
            }

            for (Map.Entry<String, Point> entry_2021 : posisi_2021.entrySet()) {
                String nama_2021 = entry_2021.getKey();
                Point p_2021 = entry_2021.getValue();

                Color warna_2021 = new Color(225, 225, 225);

                if (dikunjungi_2021.contains(nama_2021))
                    warna_2021 = new Color(255, 190, 80);

                if (jalur_2021.contains(nama_2021))
                    warna_2021 = new Color(255, 110, 110);

                if (nama_2021.equals(startNode_2021))
                    warna_2021 = new Color(110, 220, 110);

                if (nama_2021.equals(goalNode_2021)
                        && !jalur_2021.contains(nama_2021))
                    warna_2021 = new Color(120, 160, 255);

                if (nama_2021.equals(goalNode_2021)
                        && jalur_2021.contains(nama_2021))
                    warna_2021 = new Color(180, 80, 220);

                g2_2021.setColor(warna_2021);
                g2_2021.fillOval(
                        p_2021.x - RADIUS_2021,
                        p_2021.y - RADIUS_2021,
                        RADIUS_2021 * 2,
                        RADIUS_2021 * 2
                );

                g2_2021.setColor(Color.BLACK);
                g2_2021.drawOval(
                        p_2021.x - RADIUS_2021,
                        p_2021.y - RADIUS_2021,
                        RADIUS_2021 * 2,
                        RADIUS_2021 * 2
                );

                FontMetrics fm_2021 = g2_2021.getFontMetrics();
                int lebar_2021 = fm_2021.stringWidth(nama_2021);

                g2_2021.drawString(
                        nama_2021,
                        p_2021.x - lebar_2021 / 2,
                        p_2021.y - RADIUS_2021 - 5
                );
            }
        }

        @Override
        public Dimension getPreferredSize() {
            return new Dimension(880, 540);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PetaKampus_2511532021 frame_2021 = new PetaKampus_2511532021();
            frame_2021.setVisible(true);
            frame_2021.displayGraph_2021();
        });
    }
}