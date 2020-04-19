/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datb;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author sonu
 */
public class db extends javax.swing.JFrame {

    /**
     * Creates new form db
     */
    public db() {
        
                initComponents();
                
        j2017.setBackground(new Color(153,153,153));
                j2017.requestFocus();
            yr.setText("2017");
        
    }
      public void setlblcolor(JLabel lbl)
    {
        lbl.setBackground(new Color(153,153,153));
    }
         public void setlblyrcolor(JLabel lbl)
    {
        lbl.setBackground(new Color(153,153,153));
    }
    
        public void resetsetlblcolor(JLabel lbl)
    {
        lbl.setBackground(new Color(255,255,255));
    }
        public void setj2017clr()
        {
            setlblyrcolor(j2017);
            resetsetlblcolor(j2018);
            j2017.requestFocus();
            yr.setText("2017");
        }
        
        public void setj2018clr()
        {
            setlblyrcolor(j2018);
            resetsetlblcolor(j2017);
            j2018.requestFocus();
            yr.setText("2019");
        }
        
        public void setjanclr()
        {
            setlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(mar);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("01");
            jan.requestFocus();
              j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setfebclr()
        {
             setlblcolor(feb);
            resetsetlblcolor(jan);
            resetsetlblcolor(mar);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
           mon.setText("02");
            feb.requestFocus();
            j29.setEnabled(false);
            j30.setEnabled(false);
            j31.setEnabled(false);
        }
        
        public void setmarclr()
        {
             setlblcolor(mar);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("03");
            mar.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
  
        public void setaprclr()
        {
             setlblcolor(apr);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(mar);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("04");
            apr.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }

        public void setmayclr()
        {
             setlblcolor(may);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(mar);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("05");
            may.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setjunclr()
        {
             setlblcolor(jun);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(mar);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("06");
            jun.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setjulclr()
        {
             setlblcolor(jul);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(mar);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("07");
            jul.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setaugclr()
        {
             setlblcolor(aug);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(mar);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("08");
            aug.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setseptclr()
        {
             setlblcolor(sept);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(mar);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("09");
            sept.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        
        public void setoctclr()
        {
             setlblcolor(oct);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(mar);
            resetsetlblcolor(nov);
            resetsetlblcolor(dec);
            mon.setText("10");
            oct.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        
        public void setnovclr()
        {
             setlblcolor(nov);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(mar);
            resetsetlblcolor(dec);
            mon.setText("11");
            nov.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
        
        public void setdecclr()
        {
             setlblcolor(dec);
            resetsetlblcolor(jan);
            resetsetlblcolor(feb);
            resetsetlblcolor(apr);
            resetsetlblcolor(may);
            resetsetlblcolor(jun);
            resetsetlblcolor(jul);
            resetsetlblcolor(aug);
            resetsetlblcolor(sept);
            resetsetlblcolor(oct);
            resetsetlblcolor(nov);
            resetsetlblcolor(mar);
            mon.setText("12");
            dec.requestFocus();
                 j29.setEnabled(true);
            j30.setEnabled(true);
            j31.setEnabled(true);
        }
    /**
     * 
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        feb = new javax.swing.JLabel();
        jan = new javax.swing.JLabel();
        mar = new javax.swing.JLabel();
        apr = new javax.swing.JLabel();
        may = new javax.swing.JLabel();
        jun = new javax.swing.JLabel();
        jul = new javax.swing.JLabel();
        aug = new javax.swing.JLabel();
        sept = new javax.swing.JLabel();
        oct = new javax.swing.JLabel();
        nov = new javax.swing.JLabel();
        dec = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        j2017 = new javax.swing.JLabel();
        j2018 = new javax.swing.JLabel();
        mon_rec = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        mon = new javax.swing.JLabel();
        yr = new javax.swing.JLabel();
        day = new javax.swing.JLabel();
        date_panel = new javax.swing.JPanel();
        j1 = new javax.swing.JButton();
        j2 = new javax.swing.JButton();
        j3 = new javax.swing.JButton();
        j4 = new javax.swing.JButton();
        j5 = new javax.swing.JButton();
        j6 = new javax.swing.JButton();
        j7 = new javax.swing.JButton();
        j8 = new javax.swing.JButton();
        j9 = new javax.swing.JButton();
        j10 = new javax.swing.JButton();
        j20 = new javax.swing.JButton();
        j19 = new javax.swing.JButton();
        j18 = new javax.swing.JButton();
        j17 = new javax.swing.JButton();
        j16 = new javax.swing.JButton();
        j15 = new javax.swing.JButton();
        j14 = new javax.swing.JButton();
        j13 = new javax.swing.JButton();
        j12 = new javax.swing.JButton();
        j11 = new javax.swing.JButton();
        j21 = new javax.swing.JButton();
        j22 = new javax.swing.JButton();
        j23 = new javax.swing.JButton();
        j24 = new javax.swing.JButton();
        j25 = new javax.swing.JButton();
        j26 = new javax.swing.JButton();
        j27 = new javax.swing.JButton();
        j28 = new javax.swing.JButton();
        j29 = new javax.swing.JButton();
        j30 = new javax.swing.JButton();
        j31 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONTHS");

        feb.setBackground(new java.awt.Color(255, 255, 255));
        feb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        feb.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        feb.setText("FEB");
        feb.setOpaque(true);
        feb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                febMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                febMouseEntered(evt);
            }
        });
        feb.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                febKeyPressed(evt);
            }
        });

        jan.setBackground(new java.awt.Color(255, 255, 255));
        jan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jan.setText("JAN");
        jan.setOpaque(true);
        jan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                janMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                janMouseEntered(evt);
            }
        });
        jan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                janKeyPressed(evt);
            }
        });

        mar.setBackground(new java.awt.Color(255, 255, 255));
        mar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mar.setText("MAR");
        mar.setOpaque(true);
        mar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                marMouseEntered(evt);
            }
        });
        mar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                marKeyPressed(evt);
            }
        });

        apr.setBackground(new java.awt.Color(255, 255, 255));
        apr.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        apr.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        apr.setText("APR");
        apr.setOpaque(true);
        apr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aprMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aprMouseEntered(evt);
            }
        });
        apr.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                aprKeyPressed(evt);
            }
        });

        may.setBackground(new java.awt.Color(255, 255, 255));
        may.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        may.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        may.setText("MAY");
        may.setOpaque(true);
        may.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mayMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mayMouseEntered(evt);
            }
        });
        may.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                mayKeyPressed(evt);
            }
        });

        jun.setBackground(new java.awt.Color(255, 255, 255));
        jun.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jun.setText("JUN");
        jun.setOpaque(true);
        jun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                junMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                junMouseEntered(evt);
            }
        });
        jun.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                junKeyPressed(evt);
            }
        });

        jul.setBackground(new java.awt.Color(255, 255, 255));
        jul.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jul.setText("JUL");
        jul.setOpaque(true);
        jul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                julMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                julMouseEntered(evt);
            }
        });
        jul.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                julKeyPressed(evt);
            }
        });

        aug.setBackground(new java.awt.Color(255, 255, 255));
        aug.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        aug.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        aug.setText("AUG");
        aug.setOpaque(true);
        aug.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                augMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                augMouseEntered(evt);
            }
        });
        aug.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                augKeyPressed(evt);
            }
        });

        sept.setBackground(new java.awt.Color(255, 255, 255));
        sept.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sept.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sept.setText("SEPT");
        sept.setOpaque(true);
        sept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                septMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                septMouseEntered(evt);
            }
        });
        sept.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                septKeyPressed(evt);
            }
        });

        oct.setBackground(new java.awt.Color(255, 255, 255));
        oct.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        oct.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oct.setText("OCT");
        oct.setOpaque(true);
        oct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                octMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                octMouseEntered(evt);
            }
        });
        oct.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                octKeyPressed(evt);
            }
        });

        nov.setBackground(new java.awt.Color(255, 255, 255));
        nov.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nov.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nov.setText("NOV");
        nov.setOpaque(true);
        nov.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                novMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                novMouseEntered(evt);
            }
        });
        nov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                novKeyPressed(evt);
            }
        });

        dec.setBackground(new java.awt.Color(255, 255, 255));
        dec.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dec.setText("DEC");
        dec.setOpaque(true);
        dec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                decMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                decMouseEntered(evt);
            }
        });
        dec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                decKeyPressed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        back.setText("BACK");
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("YEAR");
        jLabel3.setOpaque(true);

        j2017.setBackground(new java.awt.Color(255, 255, 255));
        j2017.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        j2017.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j2017.setText("2017");
        j2017.setOpaque(true);
        j2017.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2017MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j2017MouseEntered(evt);
            }
        });
        j2017.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2017KeyPressed(evt);
            }
        });

        j2018.setBackground(new java.awt.Color(255, 255, 255));
        j2018.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        j2018.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j2018.setText("2019");
        j2018.setOpaque(true);
        j2018.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2018MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                j2018MouseEntered(evt);
            }
        });
        j2018.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2018KeyPressed(evt);
            }
        });

        mon_rec.setBackground(new java.awt.Color(102, 102, 102));
        mon_rec.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mon_rec.setForeground(new java.awt.Color(255, 255, 255));
        mon_rec.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mon_rec.setText("MONTHLY RECORD");
        mon_rec.setOpaque(true);
        mon_rec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mon_recMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jan, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(feb, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(j2017, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(j2018, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(apr, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(may, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jun, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jul, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aug, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(nov, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mon_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(j2018, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(j2017, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(feb, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jan, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apr, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(may, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jun, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(aug, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sept, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oct, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nov, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dec, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mon_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("DAYS");

        mon.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        yr.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        day.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        j1.setText("1");
        j1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j1MouseClicked(evt);
            }
        });
        j1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j1ActionPerformed(evt);
            }
        });
        j1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j1KeyPressed(evt);
            }
        });

        j2.setText("2");
        j2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j2MouseClicked(evt);
            }
        });
        j2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j2KeyPressed(evt);
            }
        });

        j3.setText("3");
        j3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j3MouseClicked(evt);
            }
        });
        j3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j3KeyPressed(evt);
            }
        });

        j4.setText("4");
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        j4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j4KeyPressed(evt);
            }
        });

        j5.setText("5");
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        j5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j5KeyPressed(evt);
            }
        });

        j6.setText("6");
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
        });
        j6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j6KeyPressed(evt);
            }
        });

        j7.setText("7");
        j7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j7MouseClicked(evt);
            }
        });
        j7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j7KeyPressed(evt);
            }
        });

        j8.setText("8");
        j8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j8MouseClicked(evt);
            }
        });
        j8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j8KeyPressed(evt);
            }
        });

        j9.setText("9");
        j9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j9MouseClicked(evt);
            }
        });
        j9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j9ActionPerformed(evt);
            }
        });
        j9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j9KeyPressed(evt);
            }
        });

        j10.setText("10");
        j10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j10MouseClicked(evt);
            }
        });
        j10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j10KeyPressed(evt);
            }
        });

        j20.setText("20");
        j20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j20MouseClicked(evt);
            }
        });
        j20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j20KeyPressed(evt);
            }
        });

        j19.setText("19");
        j19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j19MouseClicked(evt);
            }
        });
        j19.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j19KeyPressed(evt);
            }
        });

        j18.setText("18");
        j18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j18MouseClicked(evt);
            }
        });
        j18.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j18KeyPressed(evt);
            }
        });

        j17.setText("17");
        j17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j17MouseClicked(evt);
            }
        });
        j17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j17KeyPressed(evt);
            }
        });

        j16.setText("16");
        j16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j16MouseClicked(evt);
            }
        });
        j16.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j16KeyPressed(evt);
            }
        });

        j15.setText("15");
        j15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j15MouseClicked(evt);
            }
        });
        j15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j15KeyPressed(evt);
            }
        });

        j14.setText("14");
        j14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j14MouseClicked(evt);
            }
        });
        j14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j14KeyPressed(evt);
            }
        });

        j13.setText("13");
        j13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j13MouseClicked(evt);
            }
        });
        j13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j13KeyPressed(evt);
            }
        });

        j12.setText("12");
        j12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j12MouseClicked(evt);
            }
        });
        j12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j12KeyPressed(evt);
            }
        });

        j11.setText("11");
        j11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j11MouseClicked(evt);
            }
        });
        j11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j11KeyPressed(evt);
            }
        });

        j21.setText("21");
        j21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j21MouseClicked(evt);
            }
        });
        j21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j21KeyPressed(evt);
            }
        });

        j22.setText("22");
        j22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j22MouseClicked(evt);
            }
        });
        j22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j22KeyPressed(evt);
            }
        });

        j23.setText("23");
        j23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j23MouseClicked(evt);
            }
        });
        j23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j23ActionPerformed(evt);
            }
        });
        j23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j23KeyPressed(evt);
            }
        });

        j24.setText("24");
        j24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j24MouseClicked(evt);
            }
        });
        j24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j24KeyPressed(evt);
            }
        });

        j25.setText("25");
        j25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j25MouseClicked(evt);
            }
        });
        j25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j25KeyPressed(evt);
            }
        });

        j26.setText("26");
        j26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j26MouseClicked(evt);
            }
        });
        j26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j26KeyPressed(evt);
            }
        });

        j27.setText("27");
        j27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j27MouseClicked(evt);
            }
        });
        j27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j27KeyPressed(evt);
            }
        });

        j28.setText("28");
        j28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j28MouseClicked(evt);
            }
        });
        j28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j28KeyPressed(evt);
            }
        });

        j29.setText("29");
        j29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j29MouseClicked(evt);
            }
        });
        j29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j29KeyPressed(evt);
            }
        });

        j30.setText("30");
        j30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j30MouseClicked(evt);
            }
        });
        j30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j30KeyPressed(evt);
            }
        });

        j31.setText("31");
        j31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j31MouseClicked(evt);
            }
        });
        j31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j31ActionPerformed(evt);
            }
        });
        j31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                j31KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout date_panelLayout = new javax.swing.GroupLayout(date_panel);
        date_panel.setLayout(date_panelLayout);
        date_panelLayout.setHorizontalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, date_panelLayout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j31)
                    .addGroup(date_panelLayout.createSequentialGroup()
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j10))
                    .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(date_panelLayout.createSequentialGroup()
                            .addComponent(j11)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j13)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j14)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j15)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j17)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j18)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j19)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j20))
                        .addGroup(date_panelLayout.createSequentialGroup()
                            .addComponent(j21)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j22)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j23)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j24)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j25)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j26)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j27)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j28)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j29)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(j30))))
                .addGap(38, 38, 38))
        );
        date_panelLayout.setVerticalGroup(
            date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(date_panelLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j2)
                    .addComponent(j5)
                    .addComponent(j6)
                    .addComponent(j7)
                    .addComponent(j8)
                    .addComponent(j9)
                    .addComponent(j10)
                    .addComponent(j1)
                    .addComponent(j3)
                    .addComponent(j4))
                .addGap(18, 18, 18)
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j11)
                    .addComponent(j12)
                    .addComponent(j13)
                    .addComponent(j14)
                    .addComponent(j15)
                    .addComponent(j16)
                    .addComponent(j17)
                    .addComponent(j18)
                    .addComponent(j19)
                    .addComponent(j20))
                .addGap(18, 18, 18)
                .addGroup(date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(j21)
                        .addComponent(j22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, date_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(j23)
                        .addComponent(j24)
                        .addComponent(j25)
                        .addComponent(j26)
                        .addComponent(j27)
                        .addComponent(j28)
                        .addComponent(j29)
                        .addComponent(j30)))
                .addGap(18, 18, 18)
                .addComponent(j31)
                .addContainerGap(55, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mon, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(yr, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(mon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(yr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(day, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(date_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(433, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setBounds(0, 0, 1000, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void j23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j23ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j23ActionPerformed

    private void j31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j31ActionPerformed

    private void j1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j1ActionPerformed
     
    }//GEN-LAST:event_j1ActionPerformed

    private void j1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j1KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("01");
            day_lists dl = new day_lists();
            day_lists.date.setText(this.day.getText() +" "+ this.mon.getText() +" "+ this.yr.getText());
            this.setVisible(false);
            dl.setVisible(true);
        }
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j2.requestFocus();
        }
        if(j31.isEnabled())
        {
            if(evt.getKeyCode()==KeyEvent.VK_LEFT)
            {
                j31.requestFocus();
            }
        }
        else
        {
            if(evt.getKeyCode()==KeyEvent.VK_LEFT)
            {
            j28.requestFocus();
            }
        }
    }//GEN-LAST:event_j1KeyPressed

    private void j2018KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2018KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setj2017clr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            setjanclr();
        }
    }//GEN-LAST:event_j2018KeyPressed

    private void j2018MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2018MouseEntered
      
    }//GEN-LAST:event_j2018MouseEntered

    private void j2017KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2017KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setj2018clr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            setjanclr();
        }
    }//GEN-LAST:event_j2017KeyPressed

    private void j2017MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2017MouseEntered
       

    }//GEN-LAST:event_j2017MouseEntered

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        this.setVisible(false);
        new home.Home().setVisible(true);
    }//GEN-LAST:event_backMouseClicked

    private void decKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_decKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setjanclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setnovclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_decKeyPressed

    private void decMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_decMouseEntered

    private void novKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_novKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setdecclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setoctclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_novKeyPressed

    private void novMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_novMouseEntered

    private void octKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_octKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setnovclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setseptclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_octKeyPressed

    private void octMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_octMouseEntered
   // TODO add your handling code here:
    }//GEN-LAST:event_octMouseEntered

    private void septKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_septKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setoctclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setaugclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_septKeyPressed

    private void septMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_septMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_septMouseEntered

    private void augKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_augKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setseptclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setjulclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_augKeyPressed

    private void augMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_augMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_augMouseEntered

    private void julKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_julKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setaugclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setjunclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_julKeyPressed

    private void julMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_julMouseEntered
           // TODO add your handling code here:
    }//GEN-LAST:event_julMouseEntered

    private void junKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_junKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setjulclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {

            setmayclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_junKeyPressed

    private void junMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_junMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_junMouseEntered

    private void mayKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mayKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setjunclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setaprclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_mayKeyPressed

    private void mayMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mayMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_mayMouseEntered

    private void aprKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_aprKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setmayclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setmarclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_aprKeyPressed

    private void aprMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprMouseEntered
            // TODO add your handling code here:
    }//GEN-LAST:event_aprMouseEntered

    private void marKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_marKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setaprclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setfebclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_marKeyPressed

    private void marMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marMouseEntered
          // TODO add your handling code here:
    }//GEN-LAST:event_marMouseEntered

    private void janKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_janKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setfebclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setdecclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_janKeyPressed

    private void janMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_janMouseEntered
        
    }//GEN-LAST:event_janMouseEntered

    private void febKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_febKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            setmarclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            setjanclr();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            j1.requestFocus();
        }
    }//GEN-LAST:event_febKeyPressed

    private void febMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_febMouseEntered
      
    }//GEN-LAST:event_febMouseEntered

    private void j18KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j18KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j17.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j19.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("18");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j18KeyPressed

    private void j2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j2KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j1.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j3.requestFocus();
        }
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("02");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j2KeyPressed

    private void j3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j3KeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j2.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j4.requestFocus();
        }
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("03");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j3KeyPressed

    private void j4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j4KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j3.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j5.requestFocus();
        }
           if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("04");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j4KeyPressed

    private void j5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j5KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j4.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j6.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("05");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j5KeyPressed

    private void j6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j6KeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j5.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j7.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("06");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j6KeyPressed

    private void j7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j7KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j6.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j8.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("07");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j7KeyPressed

    private void j8KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j8KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j7.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j9.requestFocus();
        }
         if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("08");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j8KeyPressed

    private void j9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j9ActionPerformed

    private void j9KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j9KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j8.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j10.requestFocus();
        }
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("09");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
         
    }//GEN-LAST:event_j9KeyPressed

    private void j10KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j10KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j9.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j11.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("10");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j10KeyPressed

    private void j11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j11KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j10.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j12.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("11");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        } 
    }//GEN-LAST:event_j11KeyPressed

    private void j12KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j12KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j11.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j13.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("12");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j12KeyPressed

    private void j13KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j13KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j12.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j14.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("13");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j13KeyPressed

    private void j14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j14KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j13.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j15.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("14");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j14KeyPressed

    private void j15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j15KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j14.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j16.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("15");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j15KeyPressed

    private void j16KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j16KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j15.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j17.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("16");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j16KeyPressed

    private void j17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j17KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j16.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j18.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("17");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j17KeyPressed

    private void j19KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j19KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j18.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j20.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("19");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j19KeyPressed

    private void j20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j20KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j19.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j21.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("20");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j20KeyPressed

    private void j21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j21KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j20.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j22.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("21");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j21KeyPressed

    private void j22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j22KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j21.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j23.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("22");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j22KeyPressed

    private void j23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j23KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j22.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j24.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("23");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j23KeyPressed

    private void j24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j24KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j23.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j25.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("24");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j24KeyPressed

    private void j25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j25KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j24.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j26.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("25");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j25KeyPressed

    private void j26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j26KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j25.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j27.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("26");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j26KeyPressed

    private void j27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j27KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j26.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j28.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("27");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j27KeyPressed

    private void j28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j28KeyPressed
       if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j27.requestFocus();
        }
        if(j29.isEnabled())
        {
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j29.requestFocus();
        }}
        else
        {
            j1.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("28");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j28KeyPressed

    private void j29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j29KeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j28.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j30.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("29");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        } 
    }//GEN-LAST:event_j29KeyPressed

    private void j30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j30KeyPressed
         if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j29.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j31.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("30");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j30KeyPressed

    private void j31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_j31KeyPressed
          if(evt.getKeyCode()==KeyEvent.VK_LEFT)
        {
            j30.requestFocus();
        }
        
        if(evt.getKeyCode()==KeyEvent.VK_RIGHT)
        {
            j1.requestFocus();
        }
                if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            day.setText("31");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
        }
    }//GEN-LAST:event_j31KeyPressed

    private void j2017MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2017MouseClicked
        setj2017clr();
        jan.requestFocus();
    }//GEN-LAST:event_j2017MouseClicked

    private void j2018MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2018MouseClicked
        setj2018clr();
        jan.requestFocus();
    }//GEN-LAST:event_j2018MouseClicked

    private void janMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_janMouseClicked
       setjanclr();
       j1.requestFocus();
    }//GEN-LAST:event_janMouseClicked

    private void febMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_febMouseClicked
       setfebclr();
       j1.requestFocus();
    }//GEN-LAST:event_febMouseClicked

    private void marMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marMouseClicked
        setmarclr();
       j1.requestFocus();
    }//GEN-LAST:event_marMouseClicked

    private void aprMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aprMouseClicked
        setaprclr();
       j1.requestFocus();
    }//GEN-LAST:event_aprMouseClicked

    private void mayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mayMouseClicked
       setmayclr();
       j1.requestFocus();
    }//GEN-LAST:event_mayMouseClicked

    private void junMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_junMouseClicked
        setjunclr();
       j1.requestFocus();
    }//GEN-LAST:event_junMouseClicked

    private void julMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_julMouseClicked
       setjulclr();
       j1.requestFocus();
    }//GEN-LAST:event_julMouseClicked

    private void augMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_augMouseClicked
       setaugclr();
       j1.requestFocus();
    }//GEN-LAST:event_augMouseClicked

    private void septMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_septMouseClicked
        setseptclr();
       j1.requestFocus();
    }//GEN-LAST:event_septMouseClicked

    private void octMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_octMouseClicked
        setoctclr();
       j1.requestFocus();
    }//GEN-LAST:event_octMouseClicked

    private void novMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_novMouseClicked
        setnovclr();
       j1.requestFocus();
    }//GEN-LAST:event_novMouseClicked

    private void decMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_decMouseClicked
       setdecclr();
       j1.requestFocus();
    }//GEN-LAST:event_decMouseClicked

    private void j1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j1MouseClicked
        day.setText("01");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);
    }//GEN-LAST:event_j1MouseClicked

    private void j2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j2MouseClicked
 day.setText("02");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j2MouseClicked

    private void j3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j3MouseClicked
 day.setText("03");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j3MouseClicked

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
 day.setText("04");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j4MouseClicked

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
 day.setText("05");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j5MouseClicked

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
 day.setText("06");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j6MouseClicked

    private void j7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j7MouseClicked
 day.setText("07");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j7MouseClicked

    private void j8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j8MouseClicked
day.setText("08");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j8MouseClicked

    private void j9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j9MouseClicked
day.setText("09");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j9MouseClicked

    private void j10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j10MouseClicked
day.setText("10");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j10MouseClicked

    private void j11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j11MouseClicked
day.setText("11");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j11MouseClicked

    private void j12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j12MouseClicked
day.setText("12");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j12MouseClicked

    private void j13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j13MouseClicked
day.setText("13");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_j13MouseClicked

    private void j14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j14MouseClicked
       day.setText("14");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);  
    }//GEN-LAST:event_j14MouseClicked

    private void j15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j15MouseClicked
day.setText("15");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j15MouseClicked

    private void j16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j16MouseClicked
day.setText("16");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j16MouseClicked

    private void j17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j17MouseClicked
day.setText("17");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j17MouseClicked

    private void j18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j18MouseClicked
day.setText("18");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j18MouseClicked

    private void j19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j19MouseClicked
day.setText("19");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j19MouseClicked

    private void j20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j20MouseClicked
day.setText("20");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j20MouseClicked

    private void j21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j21MouseClicked
day.setText("21");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j21MouseClicked

    private void j22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j22MouseClicked
day.setText("22");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j22MouseClicked

    private void j23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j23MouseClicked
day.setText("23");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j23MouseClicked

    private void j24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j24MouseClicked
day.setText("24");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j24MouseClicked

    private void j25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j25MouseClicked
day.setText("25");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j25MouseClicked

    private void j26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j26MouseClicked
day.setText("26");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j26MouseClicked

    private void j27MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j27MouseClicked
day.setText("27");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j27MouseClicked

    private void j28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j28MouseClicked
day.setText("28");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j28MouseClicked

    private void j29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j29MouseClicked
day.setText("29");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j29MouseClicked

    private void j30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j30MouseClicked
day.setText("30");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);          // TODO add your handling code here:
    }//GEN-LAST:event_j30MouseClicked

    private void j31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j31MouseClicked
 day.setText("31");
            day_lists dl = new day_lists();
            
            
            this.setVisible(false);
            dl.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_j31MouseClicked

    private void mon_recMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mon_recMouseClicked
        
        
       
        if(mon.getText()!="")
        {
        this.setVisible(false);
        new monthly_rec().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select the month", "Message", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_mon_recMouseClicked

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
            java.util.logging.Logger.getLogger(db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(db.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new db().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apr;
    private javax.swing.JLabel aug;
    private javax.swing.JLabel back;
    private javax.swing.JPanel date_panel;
    public static javax.swing.JLabel day;
    private javax.swing.JLabel dec;
    private javax.swing.JLabel feb;
    public javax.swing.JButton j1;
    public javax.swing.JButton j10;
    public javax.swing.JButton j11;
    public javax.swing.JButton j12;
    public javax.swing.JButton j13;
    public javax.swing.JButton j14;
    public javax.swing.JButton j15;
    public javax.swing.JButton j16;
    public javax.swing.JButton j17;
    public javax.swing.JButton j18;
    public javax.swing.JButton j19;
    public javax.swing.JButton j2;
    public javax.swing.JButton j20;
    public static javax.swing.JLabel j2017;
    private javax.swing.JLabel j2018;
    public javax.swing.JButton j21;
    public javax.swing.JButton j22;
    public javax.swing.JButton j23;
    public javax.swing.JButton j24;
    public javax.swing.JButton j25;
    public javax.swing.JButton j26;
    public javax.swing.JButton j27;
    public javax.swing.JButton j28;
    public javax.swing.JButton j29;
    public javax.swing.JButton j3;
    public javax.swing.JButton j30;
    public javax.swing.JButton j31;
    public javax.swing.JButton j4;
    public javax.swing.JButton j5;
    public javax.swing.JButton j6;
    public javax.swing.JButton j7;
    public javax.swing.JButton j8;
    public javax.swing.JButton j9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jan;
    private javax.swing.JLabel jul;
    private javax.swing.JLabel jun;
    private javax.swing.JLabel mar;
    private javax.swing.JLabel may;
    public static javax.swing.JLabel mon;
    private javax.swing.JLabel mon_rec;
    private javax.swing.JLabel nov;
    private javax.swing.JLabel oct;
    private javax.swing.JLabel sept;
    public static javax.swing.JLabel yr;
    // End of variables declaration//GEN-END:variables
}
