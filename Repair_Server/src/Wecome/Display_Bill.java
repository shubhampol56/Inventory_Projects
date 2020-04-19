package Wecome;


import Wecome.Welcome;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
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
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.DateFormatter;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sonu
 */
public class Display_Bill extends javax.swing.JFrame {

    /**
     * Creates new form Display_Bill
     */

    public Display_Bill() {
       
           
        
        try {
            initComponents();
            setSize(1300, 700);
            Date now  = new Date();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("dd.MM.yyyy");
            date1.setText(dateFormatter.format(now));
            paid_amount.setEnabled(false);
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/repair", "root", "fav1997");
            
            call_id.setText(Welcome.show_ID.getText());
            
            DefaultTableModel model = (DefaultTableModel) spare_table.getModel();
            
            String query = "select HSN,Name,Quantity,price,total from call_spares where Call_ID=\""+ call_id.getText()+"\";";
            String query1 = "select count(*) from call_spares where Call_ID=\""+call_id.getText()+"\";";
            Statement st = con.createStatement();
            Statement st1 = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            ResultSet rs1 = st1.executeQuery(query1);
            int rc=0;
            if(rs1.next())
            {
                rc = rs1.getInt(1);
            }
            model.setRowCount(rc);
            int i=0;
            while(rs.next())
            {
                
            model.setValueAt(rs.getString(1), i, 0);
            model.setValueAt(rs.getString(2), i, 1);
            model.setValueAt(rs.getString(3), i, 2);
            model.setValueAt(rs.getString(4), i, 3);
            model.setValueAt(rs.getString(5), i, 4);
           
            i++;
                
            }
            
            String query2 = "select Department,Product,Prod_sr_num,warranty,PCB_changed,PCB_old,PCB_new,Problem,Action from call_entries where Call_ID=\""+call_id.getText()+"\";";
            String query3 = "select count(*) from call_entries where Call_ID=\""+call_id.getText()+"\";";
            Statement st2 = con.createStatement();
            ResultSet rs2 = st2.executeQuery(query2);
            Statement st3 = con.createStatement();
            ResultSet rs3 = st3.executeQuery(query3);
            DefaultTableModel model1 = (DefaultTableModel) product_table.getModel();
            
            int rc1=0 ;
            if(rs3.next())
            {
                rc1 = rs3.getInt(1);
            }
            model1.setRowCount(rc1);
            int j=0;
            while(rs2.next())
            {
                model1.setValueAt(rs2.getString(2), j, 0);
                model1.setValueAt(rs2.getString(3), j, 1);
                model1.setValueAt(rs2.getString(8), j, 2);
                model1.setValueAt(rs2.getString(9), j, 3);
                model1.setValueAt(rs2.getString(4), j, 4);
                model1.setValueAt(rs2.getString(5), j, 5);
                model1.setValueAt(rs2.getString(6), j, 6);
                model1.setValueAt(rs2.getString(7), j, 7);
                model1.setValueAt(rs2.getString(1), j, 8);
               
              j++;
            }
              
            int tot=0,rcvd=0;
            String getgrandtotal = "select service_charge,grand_total from call_cust_info where Call_ID=\""+ call_id.getText()+"\" limit 1;";
            Statement stgrand = con.createStatement();
            ResultSet rsgrand = stgrand.executeQuery(getgrandtotal);
            while(rsgrand.next())
            {
                service_charge.setText(rsgrand.getString(1));
                total_bill.setText(rsgrand.getString(2));
            }
           
            String query4 = "select Cust_name,User_name,Mobile,Rcvd_amnt,Attendant from call_cust_info where Call_ID=\""+call_id.getText()+"\";";
            Statement st4 = con.createStatement();
            ResultSet rs4 = st4.executeQuery(query4);
            
            while(rs4.next())
            {
                name.setText(rs4.getString(1));
                user_name.setText(rs4.getString(2));
                mobile.setText(rs4.getString(3));
                rcvd=Integer.valueOf(rs4.getString(4));
                engineer.setText(rs4.getString(5));
            }
            tot=Integer.valueOf(total_bill.getText());
            remaining_amount.setText(String.valueOf(tot-rcvd));
            paid_amount.setText(remaining_amount.getText());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display_Bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Display_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    // Print Bill //
    
    public static String rightpad(String str,int num)
                            {   
                              return String.format("%1$-"+num+"s", str);  
                            }
   
    protected static double convert_CM_To_PPI(double cm) {            
	        return toPPI(cm * 0.393600787);            
}
 
protected static double toPPI(double inch) {            
	        return inch * 72d;            
}
    
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
            DefaultTableModel model = (DefaultTableModel) product_table.getModel();
            int rows=model.getRowCount();
            DefaultTableModel model1 = (DefaultTableModel) spare_table.getModel();
            int rows_spares=model1.getRowCount();
            ///////////////// Product names Get ///////////
            
              
            ///////////////// Product names Get ///////////
                
            
            ///////////////// Product price Get ///////////
          
            ///////////////// Product price Get ///////////
                /*
             g2d.setFont(new Font("SansSerif",Font.BOLD,9));
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=yShift;
            g2d.drawString("Shubham Computers                 ",12,y);y+=yShift;
            g2d.drawString("Shubham Computers,masur",12,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("GSTIN: 27ABSPG7355H1Z7              "+date1.getText(), 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("Call ID:    "+call_id.getText(), 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" PRODUCT             Serial No.            Dept.",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
             g2d.setFont(new Font("Monospaced",Font.BOLD,9));
            for(int i=0;i<rows;i++)
            {
                if(product_table.getValueAt(i, 0).toString().length()<15 || product_table.getValueAt(i, 1).toString().length()<3)
                        {
                            
            g2d.drawString(" "+rightpad((String)product_table.getValueAt(i, 0), 15)+" "+rightpad((String)product_table.getValueAt(i, 1),3)+"         "+(String)product_table.getValueAt(i, 8)+"      ",10,y);y+=yShift;                 
                        }
                else{
            g2d.drawString(" "+(String)product_table.getValueAt(i, 0)+"          "+(String)product_table.getValueAt(i, 1)+"            "+(String)product_table.getValueAt(i, 2)+"      ",10,y);y+=yShift;
            }}
            g2d.drawString("-------------------------------------",10,y);y+=yShift;
            
            g2d.drawString(" TOTAL: "+total_bill.getText()+"               ",10,y);y+=yShift;
               g2d.drawString("---------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Remaining: "+remaining_amount.getText()+"RS                 ",10,y);y+=yShift;
               g2d.drawString("---------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Paid: "+paid_amount.getText()+"               ",10,y);y+=yShift;
            g2d.drawString("------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("TERMS: 1.No refund 2.Exchange within",10,y);y+=yShift;
            g2d.drawString("7 days 3.No exchange without bill",10,y);y+=yShift;
            g2d.drawString("------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("          Contact details         ",10,y);y+=yShift;
            g2d.drawString("      Shubham Computers:9850910105             ",10,y);y+=yShift;
            g2d.drawString("**********************************************",10,y);y+=yShift;
            g2d.drawString("             !! THANK YOU !!               ",10,y);y+=yShift;
            g2d.drawString("*************************************",10,y);y+=yShift;
                   */
                
                 g2d.setFont(new Font("SansSerif",Font.BOLD,9));
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=yShift;
            g2d.drawString("Shubham Computers                 ",12,y);y+=yShift;
            g2d.drawString("Shubham Computers,masur",12,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("Contact: 9850910105              "+date1.getText(), 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",12,y);y+=headerRectHeight;
            g2d.drawString("Call ID:    "+call_id.getText(), 12, y);y+=headerRectHeight;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Product         Serial No.         Dept.",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
             g2d.setFont(new Font("Monospaced",Font.BOLD,9));
            for(int i=0;i<rows;i++)
            {
                
                
            g2d.drawString(" "+(String)product_table.getValueAt(i, 0)+"     "+(String)product_table.getValueAt(i, 1)+"   "+(String)product_table.getValueAt(i, 8)+"   ",10,y);y+=yShift;
            }
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.setFont(new Font("SansSerif",Font.BOLD,9));
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Spare               qty         price         total",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
            g2d.setFont(new Font("Monospaced",Font.BOLD,9));
            for(int i=0;i<rows_spares;i++)
            {
                
             g2d.drawString(" "+spare_table.getValueAt(i, 1).toString().substring(0, 8)+"     "+spare_table.getValueAt(i, 2).toString()+"     "+spare_table.getValueAt(i, 3).toString()+"      "+spare_table.getValueAt(i, 4).toString(),10,y);y+=yShift;                 
            }
            g2d.setFont(new Font("SansSerif",Font.BOLD,9));
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=headerRectHeight;
            g2d.drawString(" Service Charge: "+service_charge.getText()+"               ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" TOTAL: "+total_bill.getText()+"               ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString(" Paid: "+paid_amount.getText()+"               ",10,y);y+=yShift;
            g2d.drawString("-------------------------------------------------------------------------------",10,y);y+=yShift;
            g2d.drawString("                        Contact details                               ",10,y);y+=yShift;
            g2d.drawString("              Shubham Computers:9850910105                        ",10,y);y+=yShift;
            g2d.drawString("*******************************************************************************",10,y);y+=yShift;
            g2d.drawString("                        !! THANK YOU !!                               ",10,y);y+=yShift;
            g2d.drawString("*******************************************************************************",10,y);y+=yShift;
           
             
           
            
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
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        product_table = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        spare_table = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        total_bill = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        remaining_amount = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        call_id = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        mobile = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        user_name = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        date1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        engineer = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        service_charge = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        payment = new javax.swing.JComboBox<>();
        paid_amount = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        credit_amount = new javax.swing.JLabel();
        print_bill = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Products Repaired");

        product_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Product", "Sr. Num", "Problem Reported", "Action Taken", "Warranty", "PCB Changed", "PCB Old", "PCB New", "Department"
            }
        ));
        jScrollPane1.setViewportView(product_table);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Spares Used");

        spare_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "HSN", "Name", "Quantity", "Price", "Total"
            }
        ));
        jScrollPane2.setViewportView(spare_table);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Total Bill");

        total_bill.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        total_bill.setForeground(new java.awt.Color(51, 51, 255));
        total_bill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        total_bill.setText("jLabel9");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Remaining Amount");

        remaining_amount.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        remaining_amount.setForeground(new java.awt.Color(51, 51, 255));
        remaining_amount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        remaining_amount.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(301, 301, 301))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(total_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(remaining_amount)
                                .addGap(54, 54, 54)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(total_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(remaining_amount))
                        .addGap(66, 66, 66))))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CALL ID");

        call_id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        call_id.setText("jLabel2");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Name");

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        name.setText("jLabel5");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Mob.");

        mobile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        mobile.setText("jLabel6");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("User Name");

        user_name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user_name.setText("jLabel8");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Date");

        date1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        date1.setText("jLabel13");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Er. Appointed");

        engineer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(engineer, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                    .addGap(36, 36, 36)
                                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(call_id, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(36, 36, 36)
                                            .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(user_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(call_id, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobile, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(date1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(engineer, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addGap(7, 7, 7)))
                .addGap(29, 29, 29))
        );

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Service Charge");

        service_charge.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        service_charge.setText("jLabel10");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Payment");

        payment.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Total", "Partial" }));
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                paymentMouseReleased(evt);
            }
        });
        payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentActionPerformed(evt);
            }
        });

        paid_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        paid_amount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paid_amountActionPerformed(evt);
            }
        });
        paid_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                paid_amountKeyPressed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Credit Amount");

        credit_amount.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        credit_amount.setText("0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(service_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(152, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(service_charge, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paid_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(credit_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        print_bill.setBackground(new java.awt.Color(102, 153, 255));
        print_bill.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        print_bill.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        print_bill.setText("Print Bill");
        print_bill.setOpaque(true);
        print_bill.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                print_billMouseClicked(evt);
            }
        });

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("BACK");
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(print_bill, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void paymentMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMouseReleased
        
    }//GEN-LAST:event_paymentMouseReleased

    private void paid_amountKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_paid_amountKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER)
        {
            int paid= Integer.valueOf(paid_amount.getText());
            int total= Integer.valueOf(remaining_amount.getText());
            int unpaid=total-paid;
            credit_amount.setText(String.valueOf(unpaid));
            
        }
    }//GEN-LAST:event_paid_amountKeyPressed

    private void paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentActionPerformed
        if(payment.getSelectedItem().equals("Total"))
        {
                paid_amount.setEnabled(false);
                paid_amount.setText(total_bill.getText());
                credit_amount.setText("0");
        }       
        if(payment.getSelectedItem().equals("Partial"))
        {
                paid_amount.setEnabled(true);
                paid_amount.setText("0");
                credit_amount.setText(remaining_amount.getText());
        }
    }//GEN-LAST:event_paymentActionPerformed

    private void print_billMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_print_billMouseClicked
        try {
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/repair", "root", "fav1997");
            int yesorno = JOptionPane.showConfirmDialog(null, "Confirm the billing", "Confirmation",JOptionPane.YES_NO_OPTION);
                if(yesorno==0)
                {
            
            int pending_bill=Integer.valueOf(credit_amount.getText());
            String pending="";
            String paid="";
            Statement st = con.createStatement();
            if(pending_bill==0)
            {
                pending="no";
                paid="yes";
                String query7="update call_cust_info set pending=\""+pending+"\",Paid=\""+paid+"\",Rcvd_amnt=\""+this.total_bill.getText()+"\",Paid_date=\""+date1.getText()+"\" where Call_ID=\""+call_id.getText()+"\";";
                st.executeUpdate(query7);
                PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                try {
                    pj.print();
          
                }
                catch (PrinterException ex) {
                    ex.printStackTrace();
                }
                this.setVisible(false);
                new Welcome().setVisible(true);
                
            }
            else if(pending_bill!=0)
            {
                pending="yes";
                paid="no";
                String query8="update call_cust_info set pending=\""+pending+"\",Paid=\""+paid+"\",Rcvd_amnt=\""+paid_amount.getText()+"\" where Call_ID=\""+call_id.getText()+"\";";
                st.executeUpdate(query8);
                
                PrinterJob pj = PrinterJob.getPrinterJob();        
                pj.setPrintable(new BillPrintable(),getPageFormat(pj));
                try {
                         pj.print();
          
                }
                catch (PrinterException ex) {
                        ex.printStackTrace();
                }
                this.setVisible(false);
                new Welcome().setVisible(true);
            }
            
        }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Display_Bill.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Display_Bill.class.getName()).log(Level.SEVERE, null, ex);
        }
                   
        
        
        
    }//GEN-LAST:event_print_billMouseClicked

    private void paid_amountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paid_amountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_paid_amountActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        this.setVisible(false);
        new Welcome().setVisible(true);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Display_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Display_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Display_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Display_Bill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Display_Bill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel call_id;
    private javax.swing.JLabel credit_amount;
    private javax.swing.JLabel date1;
    private javax.swing.JLabel engineer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mobile;
    private javax.swing.JLabel name;
    private javax.swing.JTextField paid_amount;
    private javax.swing.JComboBox<String> payment;
    private javax.swing.JLabel print_bill;
    private javax.swing.JTable product_table;
    private javax.swing.JLabel remaining_amount;
    private javax.swing.JLabel service_charge;
    private javax.swing.JTable spare_table;
    private javax.swing.JLabel total_bill;
    private javax.swing.JLabel user_name;
    // End of variables declaration//GEN-END:variables
}
