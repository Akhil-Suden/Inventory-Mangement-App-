/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AKHIL SUDEN
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Purchase extends javax.swing.JFrame {

    /**
     * Creates new form MyApp
     */
    String invo;
    public Purchase(String invo2) {
        initComponents();
        invoice.setText(invo2);
        table_update(invo2);
        bill_update(invo2);
    }

    Connection con1;
    PreparedStatement pst,pst2;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Show = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        qty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        Enter = new javax.swing.JButton();
        Update = new javax.swing.JButton();
        Delete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Cost = new javax.swing.JLabel();
        cost = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        invoice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Bill = new javax.swing.JTextField();
        Go1 = new javax.swing.JButton();
        purchaseB = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(824, 527));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 153));
        jLabel1.setText("Purchase");

        Show.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Discription", "Cost", "Quantity", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Float.class, java.lang.Integer.class, java.lang.Float.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Show);
        if (Show.getColumnModel().getColumnCount() > 0) {
            Show.getColumnModel().getColumn(1).setPreferredWidth(150);
        }

        jLabel5.setText("Product ID");

        jLabel6.setText("Quantity");

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        id.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                idKeyPressed(evt);
            }
        });

        qty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                qtyActionPerformed(evt);
            }
        });

        jLabel8.setText("Product Name");

        name.setEditable(false);

        Enter.setBackground(new java.awt.Color(153, 255, 0));
        Enter.setText("Enter");
        Enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnterActionPerformed(evt);
            }
        });

        Update.setBackground(new java.awt.Color(255, 255, 51));
        Update.setText("Update");
        Update.setEnabled(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });

        Delete.setBackground(new java.awt.Color(255, 102, 0));
        Delete.setText("Delete");
        Delete.setEnabled(false);
        Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteActionPerformed(evt);
            }
        });

        jLabel2.setText("Invoice No.");

        Cost.setText("Cost");

        cost.setEditable(false);
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 0, 255));

        Add.setBackground(new java.awt.Color(255, 255, 255));
        Add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Add.setForeground(new java.awt.Color(102, 255, 255));
        Add.setText("Add Items");
        Add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("Register");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGap(45, 45, 45)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(409, Short.MAX_VALUE))
        );

        invoice.setText("1255Pqr");
        invoice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                invoiceKeyPressed(evt);
            }
        });

        jLabel3.setText("Customer ID");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
        });

        jLabel7.setText("Customer Name");

        jTextField2.setEditable(false);

        jLabel9.setText("Total Bill Amount(in Rupees)");

        Bill.setEditable(false);
        Bill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BillActionPerformed(evt);
            }
        });

        Go1.setText("Go");
        Go1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Go1ActionPerformed(evt);
            }
        });

        purchaseB.setBackground(new java.awt.Color(51, 255, 51));
        purchaseB.setText("PURCHASE");
        purchaseB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                purchaseBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(Cost))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Go1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(329, 329, 329)
                        .addComponent(jLabel9)
                        .addGap(37, 37, 37)
                        .addComponent(Bill, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(Enter, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(purchaseB)
                        .addGap(64, 64, 64)
                        .addComponent(Update, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(155, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 745, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(invoice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Go1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cost)
                    .addComponent(cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enter)
                    .addComponent(purchaseB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update)
                    .addComponent(Delete))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(Bill, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    ResultSet rs;
    private void table_update(String invoice1)
    {
        int c;
        try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
         pst=con1.prepareStatement("select * from purchase where Invoice_ID=?");
         pst.setString(1,invoice1);
         rs=pst.executeQuery();
         ResultSetMetaData rsd=rs.getMetaData();
         c=rsd.getColumnCount();
         DefaultTableModel d=(DefaultTableModel)Show.getModel();
         d.setRowCount(0);
         while(rs.next())
         { Vector v2;
           v2 = new Vector();
          for(int i=1;i<=c;i++){
              v2.add(rs.getInt(1));
              v2.add(rs.getString(2));
              v2.add(rs.getFloat(3));
              v2.add(rs.getInt(4));
              v2.add(rs.getFloat(5));
          }
             d.addRow(v2);
         }
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddItems.class.getName()).log(Level.SEVERE, null, ex);
        }
         
        
    }
    private void  bill_update(String invoice1){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement("SELECT SUM(Total) FROM purchase where Invoice_ID=? ");
            pst.setString(1,invoice1);
            ResultSet rs=pst.executeQuery();
            if(rs.next()){
            Bill.setText(String.valueOf(rs.getFloat(1)));
        }} catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void qtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_qtyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_qtyActionPerformed

    private void EnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnterActionPerformed
        try{
           int id1=Integer.parseInt(id.getText());
           int qty1=Integer.parseInt(qty.getText());
           float total1=(Float.parseFloat(cost.getText()))*qty1;
           String invoice1=invoice.getText();
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement("select Quantity from items where Product_ID=?");
            pst.setInt(1,id1);
            ResultSet rs2;
            rs2=pst.executeQuery();
            rs2.next();
            if(rs2.getInt(1)<qty1){
            JOptionPane.showMessageDialog(null,"Quantity avalable is only "+rs2.getFloat(1)+" for the product");
            qty.requestFocus();}
            else{
            pst=con1.prepareStatement("insert into purchase(ID,Discription,Cost,Quantity,Total,Invoice_ID)values(?,?,?,?,?,?)");
            pst.setInt(1,rs.getInt(1));
            pst.setString(2,rs.getString(2));
            pst.setFloat(3,rs.getFloat(3));
            pst.setInt(4,qty1);
            pst.setFloat(5,total1);
            pst.setString(6,invoice1);
            pst.executeUpdate();
            table_update(invoice1);
            bill_update(invoice1);
            id.setText("");
            cost.setText("");
            name.setText("");
            qty.setText("");
            id.requestFocus();} }
        
        catch(java.sql.SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null,"Can't add multiple values for same ID");
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(AddItems.class.getName()).log(Level.SEVERE, null, ex);
        }}
        catch(java.lang.NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Invalid Format");
        } catch (SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
      
    }//GEN-LAST:event_EnterActionPerformed

    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
     try{
      DefaultTableModel d=(DefaultTableModel)Show.getModel();
      int row=Show.getSelectedRow();
      id.setText(d.getValueAt(row,0).toString());
      name.setText(d.getValueAt(row,1).toString());
      cost.setText(d.getValueAt(row,2).toString());
      qty.setText(d.getValueAt(row,3).toString());
      id.setEnabled(false);
      Enter.setEnabled(false);
      Update.setEnabled(true);
      Delete.setEnabled(true);
     }
     catch(java.lang.NullPointerException e){};
    }//GEN-LAST:event_ShowMouseClicked

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        DefaultTableModel d=(DefaultTableModel)Show.getModel();
        int row=Show.getSelectedRow();
        int id2=Integer.parseInt(d.getValueAt(row,0).toString());
        int qty2=Integer.parseInt(d.getValueAt(row,3).toString());
        String invo1=invoice.getText();
        try{
           int id1=Integer.parseInt(id.getText());
           int qty1=Integer.parseInt(qty.getText());
           float cost1=Float.parseFloat(cost.getText());
           float total1=cost1*qty1;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement("select Quantity from items where Product_ID=?");
            pst.setInt(1,id1);
            rs=pst.executeQuery();
            rs.next();
            if(rs.getInt(1)<qty1){
            JOptionPane.showMessageDialog(null,"Quantity avalable is only "+rs.getInt(1)+" for the product.");
            qty.requestFocus();
            }
            else{
            pst=con1.prepareStatement("update purchase set Quantity=?,Total=? where ID=? and Invoice_ID=?");
            pst.setInt(1,qty1);
            pst.setFloat(2, total1);
            pst.setInt(3,id2);
            pst.setString(4,invo1);
            pst.executeUpdate();
            table_update(invo1);
            bill_update(invo1);
            JOptionPane.showMessageDialog(null,"Item Updated.");
            id.setText("");
            cost.setText("");
            name.setText("");
            qty.setText("");
            Update.setEnabled(false);
            Delete.setEnabled(false);
            id.setEnabled(true);
            id.requestFocus();}}
        catch(java.sql.SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null,"Can't add multiple values for same ID");
        }}
            
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddItems.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch(java.lang.NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Invalid Format");
        }
        
            
        
    }//GEN-LAST:event_UpdateActionPerformed

    private void DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteActionPerformed
        DefaultTableModel d=(DefaultTableModel)Show.getModel();
        int row=Show.getSelectedRow();
        int id2=Integer.parseInt(d.getValueAt(row,0).toString()); 
        String invoice1=invoice.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement("delete from purchase where ID=?");
            pst.setInt(1,id2);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Item Deleted.");
            table_update(invoice1);
            bill_update(invoice1);
            id.setText("");
            cost.setText("");
            name.setText("");
            qty.setText("");
            Update.setEnabled(false);
            Delete.setEnabled(false);
            id.requestFocus();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddItems.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_DeleteActionPerformed

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_costActionPerformed

    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        invo=invoice.getText();
        AddItems a=new AddItems(invo);
        this.hide();
        a.setVisible(true);
    }//GEN-LAST:event_AddMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
       id.setEnabled(true);
       Update.setEnabled(false);
       Delete.setEnabled(false);
       Enter.setEnabled(true);
       id.setText("");
       cost.setText("");
       name.setText("");
       qty.setText("");
       id.requestFocus();
    }//GEN-LAST:event_formMouseClicked

    private void BillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BillActionPerformed
    }//GEN-LAST:event_BillActionPerformed

    private void Go1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Go1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Go1ActionPerformed

    private void purchaseBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_purchaseBActionPerformed
            String y = invoice.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement(" update items as E set Quantity = Quantity -( select purchase.Quantity from purchase where purchase.ID = Product_ID ) where EXISTS ( select purchase.Quantity from purchase where purchase.ID = Product_ID )");
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null," Items Purchased Successfully. ");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Purchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_purchaseBActionPerformed

    private void invoiceKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_invoiceKeyPressed
        int key = evt.getKeyCode();
        if (key == evt.VK_ENTER) {
            String s=invoice.getText();
            table_update(s);
            bill_update(s);
        }
    }//GEN-LAST:event_invoiceKeyPressed

    private void idKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_idKeyPressed
        int key = evt.getKeyCode();
        if (key == evt.VK_ENTER) {
           try{
          
           int id1=Integer.parseInt(id.getText());
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost/superpos","root","");
            pst=con1.prepareStatement("select * from Items where Product_ID=?");
            pst.setInt(1,id1);
            rs=pst.executeQuery();
            if(rs.next()){
            cost.setText(rs.getString(3));
            name.setText(rs.getString(2));
            id.requestFocus();}
            else
            {JOptionPane.showMessageDialog(null,"Please Enter Valid ID");
             id.setText("");
            }
            } 
        catch(java.sql.SQLIntegrityConstraintViolationException ex){
            JOptionPane.showMessageDialog(null,"Can't add multiple values for same ID");
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(AddItems.class.getName()).log(Level.SEVERE, null, ex);
        }}
        catch(java.lang.NumberFormatException e){
           JOptionPane.showMessageDialog(null,"Invalid Format");
        }
        }
    }//GEN-LAST:event_idKeyPressed

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1KeyPressed

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
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Purchase("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JTextField Bill;
    private javax.swing.JLabel Cost;
    private javax.swing.JButton Delete;
    private javax.swing.JButton Enter;
    private javax.swing.JButton Go1;
    private javax.swing.JTable Show;
    private javax.swing.JButton Update;
    private javax.swing.JTextField cost;
    private javax.swing.JTextField id;
    private javax.swing.JTextField invoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField name;
    private javax.swing.JButton purchaseB;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}
