
import java.awt.HeadlessException;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class HiGH_LOW extends javax.swing.JFrame {

    int input = 0;
    int dp = 50;
    int dp1 = 100;
    int dp2 = 500;
    int dpp = 0;
    int w = 0;
    int L = 0;
    int ans = 1000;

    public HiGH_LOW() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jlb1 = new javax.swing.JLabel();
        jlb2 = new javax.swing.JLabel();
        jlb3 = new javax.swing.JLabel();
        jlb4 = new javax.swing.JLabel();
        jlb5 = new javax.swing.JLabel();
        jb1 = new javax.swing.JButton();
        jb2 = new javax.swing.JButton();
        jb3 = new javax.swing.JButton();
        jb4 = new javax.swing.JButton();
        jb5 = new javax.swing.JButton();
        jb6 = new javax.swing.JButton();
        jb7 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        money1 = new java.awt.Label();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("High Low");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(java.awt.Color.white);
        setIconImages(null);

        jlb1.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jlb1.setForeground(new java.awt.Color(255, 51, 51));
        jlb1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb1.setText("BET(เดิมพัน)");

        jlb2.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jlb2.setForeground(new java.awt.Color(255, 51, 51));
        jlb2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb2.setText("MY MONEY");
        jlb2.setToolTipText("");

        jlb3.setBackground(new java.awt.Color(0, 204, 51));
        jlb3.setFont(new java.awt.Font("Angsana New", 0, 60)); // NOI18N
        jlb3.setForeground(new java.awt.Color(51, 51, 51));
        jlb3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlb3.setText("ผลรวม");
        jlb3.setOpaque(true);

        jlb4.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jlb4.setForeground(new java.awt.Color(255, 51, 51));
        jlb4.setText("MY BET(เดิมพันของคุณ)");

        jlb5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jlb5.setForeground(new java.awt.Color(255, 51, 51));
        jlb5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jb1.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jb1.setText("SHAKE");
        jb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb1ActionPerformed(evt);
            }
        });

        jb2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb2.setText("100");
        jb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb2ActionPerformed(evt);
            }
        });

        jb3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb3.setText("50");
        jb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb3ActionPerformed(evt);
            }
        });

        jb4.setBackground(new java.awt.Color(225, 102, 102));
        jb4.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jb4.setText("HIGH");
        jb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb4ActionPerformed(evt);
            }
        });

        jb5.setBackground(new java.awt.Color(255, 102, 102));
        jb5.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jb5.setText("LOW");
        jb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb5ActionPerformed(evt);
            }
        });

        jb6.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jb6.setText("CLEAR");
        jb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb6ActionPerformed(evt);
            }
        });

        jb7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jb7.setText("500");
        jb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb7ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 204, 51));
        jLabel1.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ลูกเต๋า 2");
        jLabel1.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(0, 204, 51));
        jLabel2.setFont(new java.awt.Font("Angsana New", 0, 28)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ลูกเต๋า 1");
        jLabel2.setOpaque(true);

        money1.setAlignment(java.awt.Label.CENTER);
        money1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        money1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        money1.setName(""); // NOI18N
        money1.setText("1000");

        jLabel3.setFont(new java.awt.Font("Angsana New", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("เกมไฮโล");

        jLabel4.setFont(new java.awt.Font("Angsana New", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("?");

        jList1.setFont(new java.awt.Font("Angsana New", 0, 21)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "ขั้นตอนการเล่น", "1.เลือกวางเดิมพัน", "2.เลือกแทงสูงหรือต่ำ", "3.กดปุ่มเขย่า", "4.ลุ้นว่าออกสูงหรือต่ำ", "5.เล่นเสร็จให้กด CLEAR", "GOOD LUCK" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jlb3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(money1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(700, 700, 700)
                        .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addComponent(jlb5, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(470, 470, 470)
                        .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jlb4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jlb3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(jb2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jb3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(320, 320, 320)
                .addComponent(jb1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jb7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jlb1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jlb2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(money1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(400, 400, 400)
                .addComponent(jb6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jlb5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jb4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(360, 360, 360)
                .addComponent(jb5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(440, 440, 440)
                .addComponent(jlb4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb1ActionPerformed
        try {
            Random rd = new Random();
            int a = (int) (rd.nextInt(6) + 1);
            int b = (int) (rd.nextInt(6) + 1);
            int n1 = a + b;
            System.out.println(a + "+" + b + "=" + n1);
            jlb3.setText(Integer.toString(n1));
            jLabel1.setText(Integer.toString(a));
            jLabel2.setText(Integer.toString(b));
            if (n1 <= 6) {
                System.out.println("ต่ำ");
                jLabel4.setText("LOW (ต่ำ)");
            } else {
                System.out.println("สูง");
                jLabel4.setText("HIGH (สูง)");

            }
            if (input == 1 && n1 > 6) {
                System.out.println("ออกสูงชนะ");
                w = 1;
            } else if (input == 1 && n1 <= 6) {
                System.out.println("ออกต่ำแพ้");
                L = 1;

            }
            if (input == 2 && n1 <= 6) {
                System.out.println("ออกต่ำชนะ");
                w = 1;
            } else if (input == 2 && n1 > 6) {
                System.out.println("ออกสูงแพ้");
                L = 1;
            }

            if (dpp == 1 && w == 1) {
                ans = ans + dp;
            } else if (dpp == 1 && L == 1) {
                ans = ans - dp;
            }
            if (dpp == 2 && w == 1) {
                ans = ans + dp1;
            } else if (dpp == 2 && L == 1) {
                ans = ans - dp1;
            }
            if (dpp == 3 && w == 1) {
                ans = ans + dp2;
            } else if (dpp == 3 && L == 1) {
                ans = ans - dp2;
            }
            if (ans <= 0) {
                JOptionPane.showMessageDialog(rootPane, "GAME OVER");
                System.exit(0);

            }
            money1.setText(Integer.toString(ans));
        } catch (HeadlessException e) {
        }
    }//GEN-LAST:event_jb1ActionPerformed

    private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb4ActionPerformed
        input = 1;
    }//GEN-LAST:event_jb4ActionPerformed

    private void jb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb3ActionPerformed
        dpp = 1;
        jlb5.setText(Integer.toString(dp));
        //  try {
        //       if (ans < 50) {
        //          jb3.setEnabled(false);
        //       } else if (ans > 50) {
        //           jb3.setEnabled(true);
        //       }
        //   } catch (Exception e) {
        //   }
    }//GEN-LAST:event_jb3ActionPerformed

    private void jb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb2ActionPerformed
        dpp = 2;
        jlb5.setText(Integer.toString(dp1));
        //     try {
        //      if (ans < 100) {
        //          jb3.setEnabled(false);
        //        } else if (ans > 100) {
        //            jb3.setEnabled(true);
        //         }
        //     } catch (Exception e) {
        //     }
    }//GEN-LAST:event_jb2ActionPerformed

    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb6ActionPerformed
        jlb5.setText("");
        jlb3.setText("ผลรวม");
        jLabel4.setText("?");
        jLabel1.setText("ลูกเต๋า 2");
        jLabel2.setText("ลูกเต๋า 1");
        input = 0;
        w = 0;
        L = 0;
        dpp = 0;
        ans = ans;
    }//GEN-LAST:event_jb6ActionPerformed

    private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb5ActionPerformed
        input = 2;
    }//GEN-LAST:event_jb5ActionPerformed

    private void jb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb7ActionPerformed
        dpp = 3;
        jlb5.setText(Integer.toString(dp2));
        //    try {
        //        if (ans < 500) {
        //         jb3.setEnabled(false);
        //      } else if (ans > 500) {
        //          jb3.setEnabled(true);
        //     }
        //    } catch (Exception e) {
        //   }
    }//GEN-LAST:event_jb7ActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HiGH_LOW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new HiGH_LOW().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jb1;
    private javax.swing.JButton jb2;
    private javax.swing.JButton jb3;
    private javax.swing.JButton jb4;
    private javax.swing.JButton jb5;
    private javax.swing.JButton jb6;
    private javax.swing.JButton jb7;
    private javax.swing.JLabel jlb1;
    private javax.swing.JLabel jlb2;
    private javax.swing.JLabel jlb3;
    private javax.swing.JLabel jlb4;
    private javax.swing.JLabel jlb5;
    private java.awt.Label money1;
    // End of variables declaration//GEN-END:variables
}
