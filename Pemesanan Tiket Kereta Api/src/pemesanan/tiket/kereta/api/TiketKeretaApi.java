package pemesanan.tiket.kereta.api;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
import javax.swing.SpinnerModel;

/*
 * TiketKeretaApi.java
 *
 * Created on Jun 5, 2021, 10:03:26 PM
 */
/**
 *
 * @author lynlala
 */
public class TiketKeretaApi extends javax.swing.JFrame {
    String nama = "";
    String umur = "";
    String dari = "";
    String tujuan = "";
//    String jml = "";
    String harga = "";
    String kelas = "";
    /** Creates new form TiketKeretaApi */
    public TiketKeretaApi() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kelas = new javax.swing.ButtonGroup();
        Harga = new javax.swing.ButtonGroup();
        Dari = new javax.swing.ButtonGroup();
        Tujuan = new javax.swing.ButtonGroup();
        FormTiket = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Namapenumpang = new javax.swing.JTextField();
        Usia = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Jakarta = new javax.swing.JRadioButton();
        Bandung = new javax.swing.JRadioButton();
        Solo = new javax.swing.JRadioButton();
        Malang = new javax.swing.JRadioButton();
        Yogyakarta = new javax.swing.JRadioButton();
        Semarang = new javax.swing.JRadioButton();
        Kebumen = new javax.swing.JRadioButton();
        Tegal = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jakarta = new javax.swing.JRadioButton();
        bandung = new javax.swing.JRadioButton();
        solo = new javax.swing.JRadioButton();
        malang = new javax.swing.JRadioButton();
        yogyakarta = new javax.swing.JRadioButton();
        semarang = new javax.swing.JRadioButton();
        kebumen = new javax.swing.JRadioButton();
        tegal = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        Jumlahpenumpang = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        Ekonomi = new javax.swing.JCheckBox();
        Bisnis = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        empatpuluhlima = new javax.swing.JRadioButton();
        enampuluhlima = new javax.swing.JRadioButton();
        delapanpuluhlima = new javax.swing.JRadioButton();
        seratuslimapuluh = new javax.swing.JRadioButton();
        limapuluhlima = new javax.swing.JRadioButton();
        tujuhpuluhlima = new javax.swing.JRadioButton();
        sembilanpuluh = new javax.swing.JRadioButton();
        seratustujuhpuluh = new javax.swing.JRadioButton();
        Pesan = new javax.swing.JButton();
        Batal = new javax.swing.JButton();
        usiaHelp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FormTiket.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Train Ticket");

        jLabel2.setText("Nama Penumpang");

        jLabel3.setText("Usia");

        Namapenumpang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamapenumpangActionPerformed(evt);
            }
        });

        Usia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                UsiaKeyPressed(evt);
            }
        });

        jLabel4.setText("Dari");

        Dari.add(Jakarta);
        Jakarta.setText("Jakarta");
        Jakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JakartaActionPerformed(evt);
            }
        });

        Dari.add(Bandung);
        Bandung.setText("Bandung");
        Bandung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BandungActionPerformed(evt);
            }
        });

        Dari.add(Solo);
        Solo.setText("Solo");
        Solo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoloActionPerformed(evt);
            }
        });

        Dari.add(Malang);
        Malang.setText("Malang");
        Malang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MalangActionPerformed(evt);
            }
        });

        Dari.add(Yogyakarta);
        Yogyakarta.setText("Yogyakarta");
        Yogyakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YogyakartaActionPerformed(evt);
            }
        });

        Dari.add(Semarang);
        Semarang.setText("Semarang");
        Semarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SemarangActionPerformed(evt);
            }
        });

        Dari.add(Kebumen);
        Kebumen.setText("Kebumen");
        Kebumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KebumenActionPerformed(evt);
            }
        });

        Dari.add(Tegal);
        Tegal.setText("Tegal");
        Tegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TegalActionPerformed(evt);
            }
        });

        jLabel5.setText("Tujuan");

        Tujuan.add(jakarta);
        jakarta.setText("Jakarta");
        jakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jakartaActionPerformed(evt);
            }
        });

        Tujuan.add(bandung);
        bandung.setText("Bandung");
        bandung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandungActionPerformed(evt);
            }
        });

        Tujuan.add(solo);
        solo.setText("solo");
        solo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soloActionPerformed(evt);
            }
        });

        Tujuan.add(malang);
        malang.setText("Malang");
        malang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                malangActionPerformed(evt);
            }
        });

        Tujuan.add(yogyakarta);
        yogyakarta.setText("Yogyakarta");
        yogyakarta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogyakartaActionPerformed(evt);
            }
        });

        Tujuan.add(semarang);
        semarang.setText("Semarang");
        semarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semarangActionPerformed(evt);
            }
        });

        Tujuan.add(kebumen);
        kebumen.setText("Kebumen");
        kebumen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kebumenActionPerformed(evt);
            }
        });

        Tujuan.add(tegal);
        tegal.setText("Tegal");
        tegal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tegalActionPerformed(evt);
            }
        });

        jLabel6.setText("Jumlah Penumpang");

        jLabel7.setText("Kelas");

        Kelas.add(Ekonomi);
        Ekonomi.setText("Ekonomi");
        Ekonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EkonomiActionPerformed(evt);
            }
        });

        Kelas.add(Bisnis);
        Bisnis.setText("Bisnis");
        Bisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BisnisActionPerformed(evt);
            }
        });

        jLabel8.setText("Harga");

        Harga.add(empatpuluhlima);
        empatpuluhlima.setText("Rp.45.000");
        empatpuluhlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatpuluhlimaActionPerformed(evt);
            }
        });

        Harga.add(enampuluhlima);
        enampuluhlima.setText("Rp.65.000");
        enampuluhlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enampuluhlimaActionPerformed(evt);
            }
        });

        Harga.add(delapanpuluhlima);
        delapanpuluhlima.setText("Rp.85.000");
        delapanpuluhlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanpuluhlimaActionPerformed(evt);
            }
        });

        Harga.add(seratuslimapuluh);
        seratuslimapuluh.setText("Rp.150.000");
        seratuslimapuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seratuslimapuluhActionPerformed(evt);
            }
        });

        Harga.add(limapuluhlima);
        limapuluhlima.setText("Rp.55.000");
        limapuluhlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limapuluhlimaActionPerformed(evt);
            }
        });

        Harga.add(tujuhpuluhlima);
        tujuhpuluhlima.setText("Rp.75.000");
        tujuhpuluhlima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhpuluhlimaActionPerformed(evt);
            }
        });

        Harga.add(sembilanpuluh);
        sembilanpuluh.setText("Rp.90.000");
        sembilanpuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanpuluhActionPerformed(evt);
            }
        });

        Harga.add(seratustujuhpuluh);
        seratustujuhpuluh.setText("Rp.170.000");
        seratustujuhpuluh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seratustujuhpuluhActionPerformed(evt);
            }
        });

        Pesan.setText("Pesan");
        Pesan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesanActionPerformed(evt);
            }
        });

        Batal.setText("Batal");
        Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BatalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout FormTiketLayout = new javax.swing.GroupLayout(FormTiket);
        FormTiket.setLayout(FormTiketLayout);
        FormTiketLayout.setHorizontalGroup(
            FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormTiketLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(usiaHelp)
                    .addComponent(Namapenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Usia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Bandung)
                            .addComponent(Jakarta)
                            .addComponent(bandung)
                            .addComponent(jakarta))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormTiketLayout.createSequentialGroup()
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(malang)
                                    .addComponent(solo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(yogyakarta)
                                    .addComponent(semarang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tegal)
                                    .addComponent(kebumen)))
                            .addGroup(FormTiketLayout.createSequentialGroup()
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Malang)
                                    .addComponent(Solo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Yogyakarta)
                                    .addComponent(Semarang))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Tegal)
                                    .addComponent(Kebumen)))))
                    .addComponent(Jumlahpenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addComponent(empatpuluhlima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(enampuluhlima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delapanpuluhlima)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seratuslimapuluh))
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addComponent(Ekonomi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Bisnis))
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(FormTiketLayout.createSequentialGroup()
                                .addComponent(limapuluhlima)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tujuhpuluhlima))
                            .addGroup(FormTiketLayout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(Pesan)))
                        .addGap(2, 2, 2)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sembilanpuluh)
                            .addComponent(Batal))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(seratustujuhpuluh))
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(410, Short.MAX_VALUE))
        );
        FormTiketLayout.setVerticalGroup(
            FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FormTiketLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Namapenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Usia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usiaHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Jakarta)
                    .addComponent(Solo)
                    .addComponent(Yogyakarta)
                    .addComponent(Kebumen))
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Bandung)
                            .addComponent(Malang)
                            .addComponent(Semarang)
                            .addComponent(Tegal))
                        .addGap(19, 19, 19)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jakarta)
                            .addComponent(solo)
                            .addComponent(yogyakarta)
                            .addComponent(kebumen))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bandung)
                            .addComponent(malang)
                            .addComponent(tegal)
                            .addComponent(semarang)))
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5)))
                .addGap(11, 11, 11)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel7))
                    .addGroup(FormTiketLayout.createSequentialGroup()
                        .addComponent(Jumlahpenumpang, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Ekonomi)
                            .addComponent(Bisnis))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(empatpuluhlima)
                    .addComponent(enampuluhlima)
                    .addComponent(delapanpuluhlima)
                    .addComponent(seratuslimapuluh))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(limapuluhlima)
                    .addComponent(tujuhpuluhlima)
                    .addComponent(sembilanpuluh)
                    .addComponent(seratustujuhpuluh))
                .addGap(32, 32, 32)
                .addGroup(FormTiketLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Batal)
                    .addComponent(Pesan))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FormTiket, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void NamapenumpangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamapenumpangActionPerformed
// TODO add your handling code here:
    nama = evt.getActionCommand();
}//GEN-LAST:event_NamapenumpangActionPerformed

private void JakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JakartaActionPerformed
// TODO add your handling code here:
    dari = evt.getActionCommand();
}//GEN-LAST:event_JakartaActionPerformed

private void BandungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BandungActionPerformed
// TODO add your handling code here:
    dari = evt.getActionCommand();
}//GEN-LAST:event_BandungActionPerformed

private void EkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EkonomiActionPerformed
// TODO add your handling code here:
    kelas = evt.getActionCommand();
}//GEN-LAST:event_EkonomiActionPerformed

private void PesanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesanActionPerformed
// TODO add your handling code here:
    nama = Namapenumpang.getText();
    umur = Usia.getText();
    SpinnerModel jml = Jumlahpenumpang.getModel();
    
    JOptionPane.showMessageDialog(this, "Nama: " + nama + "\nUmur: " + umur + "\nDari: " + dari + "\nTujuan: " + tujuan + "\nJumlah penumpang: " + jml.getValue() + "\nKelas: " + kelas + "\nHarga: " + harga);
}//GEN-LAST:event_PesanActionPerformed

private void empatpuluhlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatpuluhlimaActionPerformed
// TODO add your handling code here:
    harga = evt.getActionCommand();
}//GEN-LAST:event_empatpuluhlimaActionPerformed

private void BisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BisnisActionPerformed
// TODO add your handling code here:
    kelas = evt.getActionCommand();
}//GEN-LAST:event_BisnisActionPerformed

    private void SoloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoloActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_SoloActionPerformed

    private void YogyakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YogyakartaActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_YogyakartaActionPerformed

    private void KebumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KebumenActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_KebumenActionPerformed

    private void MalangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MalangActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_MalangActionPerformed

    private void SemarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SemarangActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_SemarangActionPerformed

    private void TegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TegalActionPerformed
        // TODO add your handling code here:
        dari = evt.getActionCommand();
    }//GEN-LAST:event_TegalActionPerformed

    private void jakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jakartaActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_jakartaActionPerformed

    private void soloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soloActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_soloActionPerformed

    private void yogyakartaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yogyakartaActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_yogyakartaActionPerformed

    private void kebumenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kebumenActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_kebumenActionPerformed

    private void bandungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandungActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_bandungActionPerformed

    private void malangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_malangActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_malangActionPerformed

    private void semarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semarangActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_semarangActionPerformed

    private void tegalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tegalActionPerformed
        // TODO add your handling code here:
        tujuan = evt.getActionCommand();
    }//GEN-LAST:event_tegalActionPerformed

    private void enampuluhlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enampuluhlimaActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_enampuluhlimaActionPerformed

    private void delapanpuluhlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanpuluhlimaActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_delapanpuluhlimaActionPerformed

    private void seratuslimapuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seratuslimapuluhActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_seratuslimapuluhActionPerformed

    private void limapuluhlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limapuluhlimaActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_limapuluhlimaActionPerformed

    private void tujuhpuluhlimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhpuluhlimaActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_tujuhpuluhlimaActionPerformed

    private void sembilanpuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanpuluhActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_sembilanpuluhActionPerformed

    private void seratustujuhpuluhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seratustujuhpuluhActionPerformed
        // TODO add your handling code here:
        harga = evt.getActionCommand();
    }//GEN-LAST:event_seratustujuhpuluhActionPerformed

    private void BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BatalActionPerformed
        // TODO add your handling code here:
        Namapenumpang.setText(nama);
        Usia.setText("");
        Dari.clearSelection();
        Tujuan.clearSelection();
        Jumlahpenumpang.getModel().setValue(0);
        Kelas.clearSelection();
        Harga.clearSelection();
    }//GEN-LAST:event_BatalActionPerformed

    private void UsiaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsiaKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9') {
            usiaHelp.setText("");
        } else {
            if (evt.getKeyChar() <= '9') {
                usiaHelp.setText("");
            } else {
                usiaHelp.setText("Please enter only number!!!");
            }
        }
    }//GEN-LAST:event_UsiaKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TiketKeretaApi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new TiketKeretaApi().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Bandung;
    private javax.swing.JButton Batal;
    private javax.swing.JCheckBox Bisnis;
    private javax.swing.ButtonGroup Dari;
    private javax.swing.JCheckBox Ekonomi;
    private javax.swing.JPanel FormTiket;
    private javax.swing.ButtonGroup Harga;
    private javax.swing.JRadioButton Jakarta;
    private javax.swing.JSpinner Jumlahpenumpang;
    private javax.swing.JRadioButton Kebumen;
    private javax.swing.ButtonGroup Kelas;
    private javax.swing.JRadioButton Malang;
    private javax.swing.JTextField Namapenumpang;
    private javax.swing.JButton Pesan;
    private javax.swing.JRadioButton Semarang;
    private javax.swing.JRadioButton Solo;
    private javax.swing.JRadioButton Tegal;
    private javax.swing.ButtonGroup Tujuan;
    private javax.swing.JTextField Usia;
    private javax.swing.JRadioButton Yogyakarta;
    private javax.swing.JRadioButton bandung;
    private javax.swing.JRadioButton delapanpuluhlima;
    private javax.swing.JRadioButton empatpuluhlima;
    private javax.swing.JRadioButton enampuluhlima;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JRadioButton jakarta;
    private javax.swing.JRadioButton kebumen;
    private javax.swing.JRadioButton limapuluhlima;
    private javax.swing.JRadioButton malang;
    private javax.swing.JRadioButton semarang;
    private javax.swing.JRadioButton sembilanpuluh;
    private javax.swing.JRadioButton seratuslimapuluh;
    private javax.swing.JRadioButton seratustujuhpuluh;
    private javax.swing.JRadioButton solo;
    private javax.swing.JRadioButton tegal;
    private javax.swing.JRadioButton tujuhpuluhlima;
    private javax.swing.JLabel usiaHelp;
    private javax.swing.JRadioButton yogyakarta;
    // End of variables declaration//GEN-END:variables
}
