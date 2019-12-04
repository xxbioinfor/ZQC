/*
 * Created by JFormDesigner on Sat Nov 30 20:36:28 CST 2019
 */

package com.company;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DecimalFormat;
import javax.swing.*;

/**
 * @author Xiaoxuan Wang
 */
public class testJFrame extends JFrame {
    public testJFrame() {
        initComponents();
        init();
    }

    private void button1ActionPerformed(ActionEvent e) {
        // TODO add your code here
        // 获取初始值
        String initialValueStr = this.initialValue.getText();
        int initialValue = Integer.parseInt(initialValueStr);
        // 获取输入参数
        String p1Str = this.p1.getText().trim();
        String p2Str = this.p2.getText().trim();
        String p3Str = this.p3.getText().trim();
        String p4Str = this.p4.getText().trim();
        String p5Str = this.p5.getText().trim();
        String p6Str = this.p6.getText().trim();

        String path = this.path.getText().trim();
        File file = new File(path);

        // 判断参数是否齐全
        if (initialValueStr == null || p1Str == null || p2Str == null || p3Str == null || p4Str == null || p5Str == null || path == null){
            JOptionPane.showMessageDialog(this, "请输入全部参数！");
            return;
        }


        // 判断文件是否存在，若不存在则创建新文件
        FileWriter fw = null;
        BufferedWriter bw =null;
        if (!file.exists()){
            try {
                file.createNewFile();
                String header = "I\tMNSI\tII\tGNTI\tⅢ\tMNSII\tⅣ\tGNTII\tⅤ\tUGEI-1\tⅥ\tUGEI-2\tⅦ\n";
                fw = new FileWriter(file,true);
                bw = new BufferedWriter(fw);
                bw.write(header);
                bw.close();
            } catch (IOException e1){
                JOptionPane.showMessageDialog(this, "请检查文件路径！");
                e1.printStackTrace();
            }
        }

        double p1 = Double.parseDouble(p1Str);
        double p2 = Double.parseDouble(p2Str);
        double p3 = Double.parseDouble(p3Str);
        double p4 = Double.parseDouble(p4Str);
        double p5 = Double.parseDouble(p5Str);
        double p6 = Double.parseDouble(p6Str);
        double[] p = new double[]{p1,p2,p3,p4,p5,p6};

        double[] result = new double[7];
        result[0] = initialValue;
        result[1] = result[0] * p[0];
        result[0] = result[0] - result[1];
        result[2] = result[1] * p[1];
        result[1] = result[1] - result[2];
        result[3] = result[2] * p[2];
        result[6] = result[2] * p[5];
        result[2] = result[2] - result[3] - result[6];
        result[4] = result[3] * p[3];
        result[3] = result[3] - result[4];
        result[5] = result[4] * p[4];
        result[4] = result[4] - result[5];

        DecimalFormat df = new DecimalFormat("0.00");

        String output = df.format(result[0])+"\t"+p1+"\t"+df.format(result[1])+"\t"+p2+"\t"+df.format(result[2])+"\t"+p3+"\t"
                +df.format(result[3])+"\t"+p4+"\t" +df.format(result[4])+"\t"+p5+"\t"+df.format(result[5])+"\t"+p6+"\t"+df.format(result[6])+"\n";
        //FileWriter fw = new FileWriter(file,true);

        try {
            fw = new FileWriter(file,true);
            bw = new BufferedWriter(fw);
            bw.write(output);
            bw.close();
        } catch (IOException e2){
            e2.printStackTrace();
        }
        // 首先判断是否输入p6
        //if (p6 == 0) {
        //    String title = "s1\tp1\ts2\tp2\ts3\tp3\ts4\tp4\ts5\tp5\ts6\n";
        //    bw.write(title);
        //    double[] result = new double[6];
        //    result[0] = initialValue;
        //    for (int i = 0; i < 5; i++) {
        //        result[i + 1] = result[i] * p[i];
        //        result[i] -= result[i + 1];
        //    }
        //    String output = result[0]+"\t"+p1+"\t"+result[1]+"\t"+p2+"\t"+result[2]+"\t"+p3+"\t"+result[3]+"\t"+p4+"\t"
        //            +result[4]+"\t"+p5+"\t"+result[5]+"\n";
        //    bw.newLine();
        //    bw.write(output);
        //    System.out.println(output);

        //} else {




        //}

        //fw.close();
        //bw.close();


    }

    private void button2ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.initialValue.setText("");
        this.p1.setText("");
        this.p2.setText("");
        this.p3.setText("");
        this.p4.setText("");
        this.p5.setText("");
        this.p6.setText("");
        this.path.setText("");
        return;
    }

    private void button3ActionPerformed(ActionEvent e) {
        // TODO add your code here
        this.initialValue.setText("100");
        this.p1.setText("0.8");
        this.p2.setText("0.2");
        this.p3.setText("0.4");
        this.p4.setText("0.2");
        this.p5.setText("0.5");
        this.p6.setText("0.5");
        this.path.setText("/Users/xxw/Desktop/test_z.txt");
        //this.path.setText("D:\\path\\filename.txt");
        return;
    }





    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Xiaoxuan Wang
        label1 = new JLabel();
        label2 = new JLabel();
        label3 = new JLabel();
        label4 = new JLabel();
        label5 = new JLabel();
        label6 = new JLabel();
        button1 = new JButton();
        button3 = new JButton();
        p2 = new JTextField();
        p3 = new JTextField();
        p4 = new JTextField();
        p5 = new JTextField();
        p6 = new JTextField();
        label7 = new JLabel();
        label8 = new JLabel();
        label9 = new JLabel();
        label10 = new JLabel();
        label11 = new JLabel();
        label12 = new JLabel();
        label13 = new JLabel();
        p1 = new JTextField();
        label14 = new JLabel();
        initialValue = new JTextField();
        label15 = new JLabel();
        path = new JTextField();
        button2 = new JButton();

        //======== this ========
        var contentPane = getContentPane();
        contentPane.setLayout(null);

        //---- label1 ----
        label1.setText("MNSI");
        contentPane.add(label1);
        label1.setBounds(new Rectangle(new Point(55, 70), label1.getPreferredSize()));

        //---- label2 ----
        label2.setText("GNTI");
        contentPane.add(label2);
        label2.setBounds(125, 70, 36, 16);

        //---- label3 ----
        label3.setText("MNSII");
        contentPane.add(label3);
        label3.setBounds(195, 70, 36, 16);

        //---- label4 ----
        label4.setText("GNTII");
        contentPane.add(label4);
        label4.setBounds(265, 70, 36, 16);

        //---- label5 ----
        label5.setText("UGEI");
        contentPane.add(label5);
        label5.setBounds(340, 70, 36, 16);

        //---- label6 ----
        label6.setText("UGEi");
        contentPane.add(label6);
        label6.setBounds(160, 125, 36, 16);

        //---- button1 ----
        button1.setText("\u786e\u8ba4");
        button1.addActionListener(e -> button1ActionPerformed(e));
        contentPane.add(button1);
        button1.setBounds(new Rectangle(new Point(65, 310), button1.getPreferredSize()));

        //---- button3 ----
        button3.setText("\u4e3e\u4f8b");
        button3.addActionListener(e -> button3ActionPerformed(e));
        contentPane.add(button3);
        button3.setBounds(new Rectangle(new Point(300, 310), button3.getPreferredSize()));
        contentPane.add(p2);
        p2.setBounds(125, 90, 36, 30);
        contentPane.add(p3);
        p3.setBounds(195, 90, 36, 30);
        contentPane.add(p4);
        p4.setBounds(265, 90, 36, 30);
        contentPane.add(p5);
        p5.setBounds(340, 90, 36, 30);
        contentPane.add(p6);
        p6.setBounds(160, 145, 36, 30);

        //---- label7 ----
        label7.setText("I");
        contentPane.add(label7);
        label7.setBounds(35, 95, 10, 20);

        //---- label8 ----
        label8.setText("II");
        contentPane.add(label8);
        label8.setBounds(105, 95, 15, 20);

        //---- label9 ----
        label9.setText("\u2162");
        contentPane.add(label9);
        label9.setBounds(170, 95, 15, 20);

        //---- label10 ----
        label10.setText("\u2163");
        contentPane.add(label10);
        label10.setBounds(240, 95, 15, 20);

        //---- label11 ----
        label11.setText("\u2164");
        contentPane.add(label11);
        label11.setBounds(315, 95, 15, 20);

        //---- label12 ----
        label12.setText("\u2165");
        contentPane.add(label12);
        label12.setBounds(390, 95, 15, 20);

        //---- label13 ----
        label13.setText("\u2166");
        contentPane.add(label13);
        label13.setBounds(165, 185, label13.getPreferredSize().width, 15);
        contentPane.add(p1);
        p1.setBounds(55, 90, 36, 30);

        //---- label14 ----
        label14.setText("\u8bbe\u7f6e I \u7684\u521d\u59cb\u503c\uff1a");
        contentPane.add(label14);
        label14.setBounds(new Rectangle(new Point(30, 30), label14.getPreferredSize()));
        contentPane.add(initialValue);
        initialValue.setBounds(130, 25, 60, initialValue.getPreferredSize().height);

        //---- label15 ----
        label15.setText("\u7ed3\u679c\u4fdd\u5b58\u8def\u5f84\uff1a");
        contentPane.add(label15);
        label15.setBounds(30, 235, 128, 16);
        contentPane.add(path);
        path.setBounds(120, 230, 275, 30);

        //---- button2 ----
        button2.setText("\u6e05\u9664");
        button2.addActionListener(e -> button2ActionPerformed(e));
        contentPane.add(button2);
        button2.setBounds(180, 310, 78, 30);

        {
            // compute preferred size
            Dimension preferredSize = new Dimension();
            for(int i = 0; i < contentPane.getComponentCount(); i++) {
                Rectangle bounds = contentPane.getComponent(i).getBounds();
                preferredSize.width = Math.max(bounds.x + bounds.width, preferredSize.width);
                preferredSize.height = Math.max(bounds.y + bounds.height, preferredSize.height);
            }
            Insets insets = contentPane.getInsets();
            preferredSize.width += insets.right;
            preferredSize.height += insets.bottom;
            contentPane.setMinimumSize(preferredSize);
            contentPane.setPreferredSize(preferredSize);
        }
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    private void init(){
        this.setTitle("测试");
    }
    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Xiaoxuan Wang
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JButton button1;
    private JButton button3;
    private JTextField p2;
    private JTextField p3;
    private JTextField p4;
    private JTextField p5;
    private JTextField p6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JLabel label11;
    private JLabel label12;
    private JLabel label13;
    private JTextField p1;
    private JLabel label14;
    private JTextField initialValue;
    private JLabel label15;
    private JTextField path;
    private JButton button2;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
