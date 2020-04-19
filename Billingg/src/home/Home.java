/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import com.sun.org.apache.xpath.internal.compiler.Keywords;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.DateFormatter;

/**
 *
 * @author sonu
 */
public class Home extends javax.swing.JFrame {

     DefaultTableModel model;
     String uid;
    public Home() {
        
        initComponents();
        JFrame jfrm = new JFrame();
          
       
        gt.setVisible(false);
        
        Date now  = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
        date.setText(dateFormatter.format(now));
        if(gt.getText()=="----")
        {
            submit.setEnabled(false);
        }
        
    }
    
    
    
                                public static String rightpad(String str,int num)
                            {   
                              return String.format("%1$-"+num+"s", str);  
                            }


    
    ////////////////////////////////PRINTING//////////////////////////////////////////////////////////////
    
    
        public PageFormat getPageFormat(PrinterJob pj)
{
    
    PageFormat pf = pj.defaultPage();
    Paper paper = pf.getPaper();    

    double middleHeight =100.0;  
    double headerHeight = 2.0;                  
    double footerHeight = 2.0;                  
    double width = convert_CM_To_PPI(8);      //printer know only point per inch.default value is 72ppi
    double height = convert_CM_To_PPI(headerHeight+middleHeight+footerHeight); 
    paper.setSize(width, height);
    paper.setImageableArea(                    
        0,
        10,
        width,            
        height - convert_CM_To_PPI(1)
    );   //define boarder size    after that print area width is about 180 points
            
    pf.setOrientation(PageFormat.PORTRAIT);           //select orientation portrait or landscape but for this time portrait
    pf.setPaper(paper);    

    return pf;
}
    
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}






public class BillPrintable implements Printable {
    
   
    
    
  public int print(Graphics graphics, PageFormat pageFormat,int pageIndex) 
  throws PrinterException 
  {    
      
                
        
      int result = NO_SUCH_PAGE;    
        if (pageIndex == 0) {                    
        
            Graphics2D g2d = (Graphics2D) graphics;                    

            double width = pageFormat.getImageableWidth();                    
           
            g2d.translate((int) pageFormat.getImageableX(),(int) pageFormat.getImageableY()); 

            ////////// code by alqama//////////////

            FontMetrics metrics=g2d.getFontMetrics(new Font("Arial",Font.BOLD,7));
        //    int idLength=metrics.stringWidth("000000");
            //int idLength=metrics.stringWidth("00");
            int idLength=metrics.stringWidth("000");
            int amtLength=metrics.stringWidth("000000");
            int qtyLength=metrics.stringWidth("00000");
            int priceLength=metrics.stringWidth("000000");
            int prodLength=(int)width - idLength - amtLength - qtyLength - priceLength-17;

        //    int idPosition=0;
        //    int productPosition=idPosition + idLength + 2;
        //    int pricePosition=productPosition + prodLength +10;
        //    int qtyPosition=pricePosition + priceLength + 2;
        //    int amtPosition=qtyPosition + qtyLength + 2;
            
            int productPosition = 0;
            int discountPosition= prodLength+5;
            int pricePosition = discountPosition +idLength+10;
            int qtyPosition=pricePosition + priceLength + 4;
            int amtPosition=qtyPosition + qtyLength;
            
            
              
        try{
            /*Draw Header*/
            int y=20;
            int yShift = 10;
            int headerRectHeight=15;
            int headerRectHeighta=40;
            DefaultTableModel model = (DefaultTableModel) products.getModel();
            int rows=model.getRowCount();
            ///////////////// Product names Get ///////////
            
              
            ///////////////// Product names Get ///////////
                
            
            ///////////////// Product price Get ///////////
          
            ///////////////// Product price Get ///////////
                
             g2d.setFont(new Font("SansSerif",Font.BOLD,9));
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=yShift;
            g2d.drawString("SAAJ FASHIONS                 ",12,y);y+=yShift;
            g2d.drawString("SAAJ FASHIONS,SANGAMNER ROAD,LONI",12,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("GSTIN: 27ABSPG7355H1Z7              "+date.getText(), 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("ORDER ID:    "+uid, 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" PRODUCT             QUANTITY            PRICE",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
             g2d.setFont(new Font("Monospaced",Font.BOLD,9));
            for(int i=0;i<rows;i++)
            {
                if(products.getValueAt(i, 0).toString().length()<15 || products.getValueAt(i, 1).toString().length()<3)
                        {
                            
            g2d.drawString(" "+rightpad((String)products.getValueAt(i, 0), 15)+" "+rightpad((String)products.getValueAt(i, 1),3)+"         "+(String)products.getValueAt(i, 2)+"      ",10,y);y+=yShift;                 
                        }
                else{
            g2d.drawString(" "+(String)products.getValueAt(i, 0)+"          "+(String)products.getValueAt(i, 1)+"            "+(String)products.getValueAt(i, 2)+"      ",10,y);y+=yShift;
            }}
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            
            g2d.drawString(" TOTAL: "+total.getText()+"               ",10,y);y+=yShift;
               g2d.drawString("---------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Discount: "+dscount.getText()+"  "+dstype.getText()+"               ",10,y);y+=yShift;
               g2d.drawString("---------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" GRAND TOTAL: "+gt.getText()+"               ",10,y);y+=yShift;
            g2d.drawString("------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("TERMS: 1.No refund 2.Exchange within",10,y);y+=yShift;
            g2d.drawString("7 days 3.No exchange without bill",10,y);y+=yShift;
            g2d.drawString("------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("          Contact details         ",10,y);y+=yShift;
            g2d.drawString("      SAAJ FASHIONS:9970645544             ",10,y);y+=yShift;
            g2d.drawString("**********************************************",10,y);y+=yShift;
            g2d.drawString("      !! THANK YOU !! VISIT AGAIN !!    ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
                   
           
             
           
            
//            g2d.setFont(new Font("Monospaced",Font.BOLD,10));
//            g2d.drawString("Customer Shopping Invoice", 30,y);y+=yShift; 
          

    }
    catch(Exception r){
    r.printStackTrace();
    }

              result = PAGE_EXISTS;    
          }    
          return result;    
      }
   }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    ////////////////////////////////////////////PRINTING///////////////////////////////////////////////
    public void get_sum()
    {
        int sum=0;
        for(int i=0;i<products.getRowCount();i++)
        {
            sum=sum+Integer.parseInt(products.getValueAt(i, 3).toString());
        }
        total.setText(Integer.toString(sum));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        prods = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        quant = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        price = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        add = new javax.swing.JLabel();
        ScrollPane = new javax.swing.JScrollPane();
        products = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        db = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        dscount = new javax.swing.JTextField();
        sym = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dstype = new javax.swing.JToggleButton();
        jLabel7 = new javax.swing.JLabel();
        gt = new javax.swing.JLabel();
        submit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Products:");

        prods.setBorder(null);
        prods.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                prodsKeyPressed(evt);
            }
        });

        quant.setBorder(null);
        quant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantActionPerformed(evt);
            }
        });
        quant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                quantKeyPressed(evt);
            }
        });

        price.setBorder(null);
        price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceActionPerformed(evt);
            }
        });
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                priceKeyPressed(evt);
            }
        });

        jLabel4.setText("Price:");

        jLabel3.setText("Quantity:");

        add.setBackground(new java.awt.Color(0, 153, 255));
        add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add.setText("ADD");
        add.setOpaque(true);
        add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addMouseClicked(evt);
            }
        });
        add.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                addKeyPressed(evt);
            }
        });

        products.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product", "Quantity", "Payable", "Price Per piece"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        products.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                productsKeyPressed(evt);
            }
        });
        ScrollPane.setViewportView(products);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("DATE:");

        date.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date.setText("jLabel8");

        db.setBackground(new java.awt.Color(153, 255, 0));
        db.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        db.setForeground(new java.awt.Color(51, 51, 255));
        db.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        db.setText("DATABASE");
        db.setOpaque(true);
        db.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dbMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("TOTAL:");
        jLabel1.setPreferredSize(new java.awt.Dimension(100, 50));

        total.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        total.setText("--");

        dscount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dscountKeyPressed(evt);
            }
        });

        sym.setText("%");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Discount:");

        dstype.setText("Percentage");
        dstype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dstypeActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Grand Total:");

        gt.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        gt.setText("----");

        submit.setBackground(new java.awt.Color(0, 153, 255));
        submit.setForeground(new java.awt.Color(255, 255, 255));
        submit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        submit.setText("SUBMIT");
        submit.setOpaque(true);
        submit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                submitMouseClicked(evt);
            }
        });
        submit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                submitKeyPressed(evt);
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
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSeparator5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(prods, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(quant, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(63, 63, 63)
                                        .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(dscount, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(sym))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(281, 281, 281)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(dstype, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(261, 261, 261))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(95, 95, 95))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(prods, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quant, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(total))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dscount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sym)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addComponent(dstype)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(gt, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(submit, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(163, 163, 163))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(db, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        setBounds(0, 0, 999, 1000);
    }// </editor-fold>//GEN-END:initComponents

    private void quantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantActionPerformed

    private void addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addMouseClicked
       if(prods.getText().equals("") || quant.getText().equals("") || price.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null , "Kindly fill reqired information", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
        float pri=Float.valueOf(price.getText());
       int qu = Integer.valueOf(quant.getText());
       float p=pri*qu;
       
     
       model = (DefaultTableModel) products.getModel();
       model.addRow(new Object[]{prods.getText(),quant.getText(),Float.toString(p),Float.toString(pri)});
              float sum=0;
        for(int i=0;i<products.getRowCount();i++)
        {
            sum=sum+Float.valueOf(products.getValueAt(i, 2).toString());
        }
        total.setText(Float.toString(sum));
        
        prods.setText("");
        quant.setText("");
        price.setText("");
        prods.requestFocus();
       }
    }//GEN-LAST:event_addMouseClicked

    private void prodsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_prodsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            quant.requestFocus();
        }
    }//GEN-LAST:event_prodsKeyPressed

    private void quantKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            price.requestFocus();
        }
    }//GEN-LAST:event_quantKeyPressed

    private void submitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_submitMouseClicked
            float i=1000;
            
            Date now  = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
           
            
            
            
            if(products.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(null, "You have not selected products for billing", "alert message", JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                int yesorno = JOptionPane.showConfirmDialog(null, "Confirm the billing", "Confirmation",JOptionPane.YES_NO_OPTION);
                if(yesorno==0)
                {
           
                    
            
        try {
            int rows = products.getRowCount();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tejas", "root", "fav1997");
            Statement st5 = con.createStatement();
            String querry = "select count(ORDER_ID)+1 from orders;";
            ResultSet rs5 = st5.executeQuery(querry);
            int val=0;
            if(rs5.next())
            {
                val=Integer.parseInt(rs5.getString(1));
            }
           
            String uidtemp =dateFormatter.format(now);
            uid ="S"+ uidtemp.substring(0, 2)+uidtemp.substring(3, 5)+uidtemp.substring(6)+Integer.toString(val);
            
            
                     
             PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
            
            
            Statement st = con.createStatement();
            
            String query = "insert into ORDERS values(\""+uid+"\",\""+total.getText()+"\",\""+dscount.getText()+"\",\""+dstype.getText()+"\",\""+gt.getText()+"\",\""+dateFormatter.format(now)+"\");";
            st.executeUpdate(query);
            String query1 = "create table "+uid+" (Product char(200),"+
                    " Quantity char(200),"+
                    " Payable char(100),"+
                    " price_per_piece char(100));";
            st.executeUpdate(query1);
            String query2 = "insert into "+uid+" values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(query2);
          
            for(int row=0;row<rows;row++)
            {
                String pr = (String)products.getValueAt(row, 0);
                String qu = (String)products.getValueAt(row, 1);
                String pay= (String)products.getValueAt(row, 2);
                String ppp= (String)products.getValueAt(row, 3);
          
                pst.setString(1, pr);
                pst.setString(2, qu);
                pst.setString(3, pay);
                pst.setString(4, ppp);
                
                pst.executeUpdate();
            }
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
                dscount.setText("");
                    total.setText("--");
                    gt.setText("----");
                    prods.requestFocus();
                DefaultTableModel model = (DefaultTableModel) products.getModel();
                model.setRowCount(0);
                }}
        
    }//GEN-LAST:event_submitMouseClicked

    private void priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_priceActionPerformed

    private void dscountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dscountKeyPressed
       
        if(evt.getKeyCode()==KeyEvent.VK_ENTER && sym.getText()=="%")
        {
            
           
            if(Integer.parseInt(dscount.getText())>100)
            {
                JOptionPane.showMessageDialog(null, "Enter valid discount rate", "Alert message", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                 submit.setEnabled(true);
            submit.requestFocus();
            float i=Float.valueOf(total.getText());
            float gtt=0,temp=0;
            float ds=Float.valueOf(dscount.getText());
            
            temp=(ds*i)/100;
            gtt=i-temp;
            String grt  = String.valueOf(gtt);
            gt.setText(grt);
            gt.setVisible(true);
        }}
        if(evt.getKeyCode()==KeyEvent.VK_ENTER && sym.getText()=="Rs")
        {
            
            if(Integer.parseInt(dscount.getText())>Float.valueOf(total.getText()))
            {
               JOptionPane.showMessageDialog(null, "Enter valid discount rate", "Alert message", JOptionPane.WARNING_MESSAGE);
            }
            else
            {
                  submit.setEnabled(true);
              submit.requestFocus();
            float i=Float.valueOf(total.getText());
            float gtt=0,temp=0;
            float ds=Float.valueOf(dscount.getText());
            
            
            gtt=i-ds;
            String grt  = String.valueOf(gtt);
            gt.setText(grt);
            gt.setVisible(true);
        }}
    }//GEN-LAST:event_dscountKeyPressed

    private void dstypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dstypeActionPerformed

        if(dstype.isSelected())
        {
            sym.setText("Rs");
            dstype.setText("Rupees");
            
            
        }
        else
        {
            sym.setText("%");
            dstype.setText("Percentage");
        }
    }//GEN-LAST:event_dstypeActionPerformed

    private void dbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dbMouseClicked
        this.setVisible(false);
        new datb.db().setVisible(true);
        
        
    }//GEN-LAST:event_dbMouseClicked

    private void addKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_addKeyPressed

        
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            if(prods.getText().equals("") || quant.getText().equals("") || price.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null , "Kindly fill reqired information", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else{
            float pri=Float.valueOf(price.getText());
       int qu = Integer.valueOf(quant.getText());
       float p=pri*qu;
       
        DefaultTableModel model = (DefaultTableModel) products.getModel();
       model.addRow(new Object[]{prods.getText(),quant.getText(),Float.toString(p),Float.toString(pri)});
              float sum=0;
        for(int i=0;i<products.getRowCount();i++)
        {
            sum=sum+Float.valueOf(products.getValueAt(i, 2).toString());
        }
        total.setText(Float.toString(sum));
        
        prods.setText("");
        quant.setText("");
        price.setText("");
        prods.requestFocus();
       
        }}
    }//GEN-LAST:event_addKeyPressed

    private void priceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyPressed
    if(evt.getKeyCode()==KeyEvent.VK_ENTER)
    {
        add.requestFocus();
    }
    }//GEN-LAST:event_priceKeyPressed

    private void productsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_productsKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_DELETE)
        {
            int yesorno = JOptionPane.showConfirmDialog(null, "Sure to delete the entry", "Confirmation", JOptionPane.YES_NO_OPTION);
            if(yesorno==0)
            {
            model = (DefaultTableModel) products.getModel();
            int i = products.getSelectedRow();
            model.removeRow(i);
        }}
    }//GEN-LAST:event_productsKeyPressed

    private void submitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_submitKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
                  float i=1000;
            
            Date now  = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
           
            
            
            
            if(products.getRowCount()==0)
            {
                JOptionPane.showMessageDialog(null, "You have not selected products for billing", "alert message", JOptionPane.WARNING_MESSAGE);
            }
            
            else{
                int yesorno = JOptionPane.showConfirmDialog(null, "Confirm the billing", "Confirmation",JOptionPane.YES_NO_OPTION);
                if(yesorno==0)
                {
           
                    
            
        try {
            int rows = products.getRowCount();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/tejas?useSSL=false", "root", "fav1997");
            Statement st5 = con.createStatement();
            String querry = "select count(ORDER_ID)+1 from orders;";
            ResultSet rs5 = st5.executeQuery(querry);
            int val=0;
            if(rs5.next())
            {
                val=Integer.parseInt(rs5.getString(1));
            }
            
            String uidtemp =dateFormatter.format(now);
            uid ="S"+uidtemp.substring(0, 2)+uidtemp.substring(3, 5)+uidtemp.substring(6)+Integer.toString(val);
            
            
                     
             PrinterJob pj = PrinterJob.getPrinterJob();        
        pj.setPrintable(new BillPrintable(),getPageFormat(pj));
        try {
             pj.print();
          
        }
         catch (PrinterException ex) {
                 ex.printStackTrace();
        }
            
            
            Statement st = con.createStatement();
            
            String query = "insert into ORDERS values(\""+uid+"\",\""+total.getText()+"\",\""+dscount.getText()+"\",\""+dstype.getText()+"\",\""+gt.getText()+"\",\""+dateFormatter.format(now)+"\");";
            st.executeUpdate(query);
            String query1 = "create table "+uid+" (Product char(200),"+
                    " Quantity char(200),"+
                    " Payable char(100),"+
                    " price_per_piece char(100));";
            st.executeUpdate(query1);
            String query2 = "insert into "+uid+" values(?,?,?,?);";
            PreparedStatement pst = con.prepareStatement(query2);
          
            for(int row=0;row<rows;row++)
            {
                String pr = (String)products.getValueAt(row, 0);
                String qu = (String)products.getValueAt(row, 1);
                String pay= (String)products.getValueAt(row, 2);
                String ppp= (String)products.getValueAt(row, 3);
          
                pst.setString(1, pr);
                pst.setString(2, qu);
                pst.setString(3, pay);
                pst.setString(4, ppp);
                
                pst.executeUpdate();
            }
            
            
            
            
            
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Home.class.getName()).log(Level.SEVERE, null, ex);
        }
                dscount.setText("");
                    total.setText("--");
                    gt.setText("----");
                    prods.requestFocus();
                DefaultTableModel model = (DefaultTableModel) products.getModel();
                model.setRowCount(0);

                
                }}
      
        }
    }//GEN-LAST:event_submitKeyPressed

    
    
    
 
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JLabel add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel date;
    private javax.swing.JLabel db;
    private javax.swing.JTextField dscount;
    private javax.swing.JToggleButton dstype;
    private javax.swing.JLabel gt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTextField price;
    private javax.swing.JTextField prods;
    private javax.swing.JTable products;
    private javax.swing.JTextField quant;
    private javax.swing.JLabel submit;
    private javax.swing.JLabel sym;
    private javax.swing.JLabel total;
    // End of variables declaration//GEN-END:variables
}
