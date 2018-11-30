# HighLow
โปรแกรมของเราเกี่ยวกับเกมไฮโลนะครับ

วิธีการเล่น

1.ว่างเดิมพัน

2.เลือกแทงสูงต่ำ

3.กดปุ่มเขย่า

4.ลุ้นว่าออกสูงหรือต่ำ

5.เล่นเสร็จให้กด CLEAR

เราจะมีเงินมาให้ 1000 บาทและถ้าตังเราเหลือ 0 บาท ก็จะแพ้การเล่นของเราก็จะประมาณนี้ครับขอให้สนุกกับการเล่นนะครับ

สำหรับรูปนี้คือการใส่เดิมพันนะครับ(การใช้โค้ด)

![untitled](https://user-images.githubusercontent.com/45460095/49273012-21959600-f4a6-11e8-8fea-3584021540be.png)

 dpp = 1;
        jlb5.setText(Integer.toString(dp));

สำหรับรูปนี้คือการใส่สูงต่ำนะครับ(การใช้โค้ด)

![capture](https://user-images.githubusercontent.com/45460095/49273325-2c9cf600-f4a7-11e8-8a08-15402193b1e4.PNG)

 private void jb4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        input = 1;
}

 private void jb5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        input = 2;
}

สรับรูปนี้คือการกดเขย่าเพื่อนลุ้นว่าออกสูงหรือต่ำ(การใช้โค้ด)

![capture1](https://user-images.githubusercontent.com/45460095/49273538-e1cfae00-f4a7-11e8-9a2e-d311eace142c.PNG)

private void jb1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
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
    }
    
    สำหรับรูปนี้คือการ Cleak (การใช้โค้ด)
    
    
    
    private void jb6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
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
