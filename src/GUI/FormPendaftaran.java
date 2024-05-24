package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class FormPendaftaran extends JFrame {
    private JTextField namaField, tanggalLahirField, nomorPendaftaranField, noTelpField, emailField;
    private JTextArea alamatArea;
    private JButton submitButton;


    public FormPendaftaran() {
        setTitle("Form Pendaftaran Mahasiswa Baru");
        setSize(550, 620);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(173, 216, 230));


        JPanel formPanel = new JPanel(new GridBagLayout());
        formPanel.setBackground(new Color(173, 216, 230));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(8, 8, 8, 8);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        Font font = new Font("Tahoma", Font.PLAIN, 16);
        addLabelAndField("Nama Lengkap:", namaField = new JTextField(), font, formPanel, gbc, 0);
        addLabelAndField("Tanggal Lahir:", tanggalLahirField = new JTextField(), font, formPanel, gbc, 1);
        addLabelAndField("Nomor Pendaftaran:", nomorPendaftaranField = new JTextField(), font, formPanel, gbc, 2);
        addLabelAndField("No. Telp:", noTelpField = new JTextField(), font, formPanel, gbc, 3);

        JLabel alamatLabel = new JLabel("Alamat:");
        alamatArea = new JTextArea();
        alamatArea.setFont(font);
        alamatArea.setPreferredSize(new Dimension(220, 100));
        alamatArea.setLineWrap(true);
        alamatArea.setWrapStyleWord(true);


        gbc.gridx = 0;
        gbc.gridy = 4;
        formPanel.add(alamatLabel, gbc);
        gbc.gridx = 1;
        formPanel.add(new JScrollPane(alamatArea), gbc);

        addLabelAndField("E-mail:", emailField = new JTextField(), font, formPanel, gbc, 5);

        submitButton = new JButton("Submit");
        submitButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        submitButton.setBackground(new Color(152, 251, 152));
        submitButton.addActionListener(new SubmitAction());

        gbc.gridx = 1;
        gbc.gridy = 6;
        formPanel.add(submitButton, gbc);

        add(formPanel, BorderLayout.CENTER);
        setVisible(true);
    }


    private void addLabelAndField(String labelText, JTextField textField, Font font, JPanel panel, GridBagConstraints gbc, int gridy) {
        JLabel label = new JLabel(labelText);
        textField.setFont(font);
        textField.setPreferredSize(new Dimension(220, 30));
        gbc.gridx = 0;
        gbc.gridy = gridy;
        panel.add(label, gbc);
        gbc.gridx = 1;
        panel.add(textField, gbc);
    }


    private class SubmitAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (areFieldsEmpty()) {
                showMessage("Semua kolom harus diisi!", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                int response = showConfirmDialog("Apakah anda yakin data yang Anda isi sudah benar?");
                if (response == JOptionPane.YES_OPTION) {
                    showDataMahasiswa();
                }
            }
        }


        private boolean areFieldsEmpty() {
            return namaField.getText().isEmpty() || tanggalLahirField.getText().isEmpty() ||
                    nomorPendaftaranField.getText().isEmpty() || noTelpField.getText().isEmpty() ||
                    alamatArea.getText().isEmpty() || emailField.getText().isEmpty();
        }


        private void showMessage(String message, String title, int messageType) {
            JOptionPane.showMessageDialog(FormPendaftaran.this, message, title, messageType);
        }


        private int showConfirmDialog(String message) {
            return JOptionPane.showConfirmDialog(FormPendaftaran.this, message, "Konfirmasi", JOptionPane.YES_NO_OPTION);
        }


        private void showDataMahasiswa() {
            JFrame dataFrame = new JFrame("Data Mahasiswa");
            dataFrame.getContentPane().setBackground(new Color(173, 216, 230));
            dataFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            dataFrame.setSize(550, 620);
            dataFrame.setLayout(new BorderLayout());
            dataFrame.setLocationRelativeTo(null);


            JPanel outputPanel = new JPanel(new GridBagLayout());
            outputPanel.setBackground(Color.WHITE);
            outputPanel.setBorder(BorderFactory.createLineBorder(new Color(173, 216, 230), 10));
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(8, 8, 8, 8);
            gbc.fill = GridBagConstraints.HORIZONTAL;


            Font outputFont = new Font("Tahoma", Font.PLAIN, 16);


            addOutputLabel("Nama: " + namaField.getText(), outputFont, outputPanel, gbc, 0);
            addOutputLabel("Tanggal Lahir: " + tanggalLahirField.getText(), outputFont, outputPanel, gbc, 1);
            addOutputLabel("No. Pendaftaran: " + nomorPendaftaranField.getText(), outputFont, outputPanel, gbc, 2);
            addOutputLabel("No. Telp: " + noTelpField.getText(), outputFont, outputPanel, gbc, 3);
            addOutputLabel("<html>Alamat: " + alamatArea.getText().replaceAll("\n", "<br>") + "</html>", outputFont, outputPanel, gbc, 4);
            addOutputLabel("E-mail: " + emailField.getText(), outputFont, outputPanel, gbc, 5);


            dataFrame.add(outputPanel, BorderLayout.CENTER);
            dataFrame.setVisible(true);
        }


        private void addOutputLabel(String text, Font font, JPanel panel, GridBagConstraints gbc, int gridy) {
            JLabel label = new JLabel(text);
            label.setFont(font);
            gbc.gridx = 0;
            gbc.gridy = gridy;
            panel.add(label, gbc);
        }
    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(FormPendaftaran::new);
    }
}
