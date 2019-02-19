
package bank;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ak2049l
 */
public class MainActivity extends javax.swing.JFrame {
    ResultSet res;
    Connection conn;
    PreparedStatement pstmt;
    /**
     * Creates new form NewJFrame
     */
   
    
    public MainActivity() {
        initComponents();
        conn=BankConnection.ConnectDb();
         Calendar();
         Account();
         Account2();
         Account5();
         Table1();//acount list
         Table2(); //transactions table
         Update_Table2();
         Update_Table1();
         Table3 (); //=Statement table
    }

    MainActivity(String newJFrame) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public void Calendar(){
         Calendar cal= new GregorianCalendar();
         int year=cal.get(Calendar.YEAR);
         int month =cal.get(Calendar.MONTH);
         int day =cal.get(Calendar.DAY_OF_MONTH);
         jTextField2.setText(+day+"_"+(month+1)+"_"+year);
            
        }
     
     
     
     public void Table1(){
         
         try{
             String qry="select id, name,contact, accounttype, gender, address from bankaccount";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
     }
     public void Update_Table1(){
         try{
             String qry="select id, name, contact, accounttype, gender, address from bankaccount";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             //jTable1.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
     }
     
     
    public void Table2(){
         
         try{
             String qry="select username, accountno, balance, accounttype,purchases  from bnkbalance";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             jTable2.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
     }
    public void Update_Table2(){
         
         try{
             String qry="select username, accountno, balance, accounttype, purchases  from bnkbalance";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             
            // jTable2.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
     }
    
    public void Table3(){ //Select * from table1 inner join table2 on table1.id = table2.id;


        try{ 
            String qry="select bnkbalance.purchases,balance,username, direct_debit.amount,payee_name from bnkbalance,direct_debit ";
            pstmt=conn.prepareStatement(qry);
            res=pstmt.executeQuery();
            jTable3.setModel(DbUtils.resultSetToTableModel(res));
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }finally{
            try{
                res.close();
                pstmt.close();
            }catch (Exception e){
                
            }
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        CreateAcc = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jTextField15 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jTextField22 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jTextField21 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jTextField27 = new javax.swing.JTextField();
        jTextField28 = new javax.swing.JTextField();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jLabel33 = new javax.swing.JLabel();
        jTextField24 = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jTextField35 = new javax.swing.JTextField();
        jButton17 = new javax.swing.JButton();
        jTextField36 = new javax.swing.JTextField();
        jButton24 = new javax.swing.JButton();
        jTextField49 = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField52 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jButton25 = new javax.swing.JButton();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField55 = new javax.swing.JTextField();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jLabel52 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton22 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jTextField40 = new javax.swing.JTextField();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jTextField41 = new javax.swing.JTextField();
        jLabel39 = new javax.swing.JLabel();
        jTextField42 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton21 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 102));
        setForeground(new java.awt.Color(153, 204, 0));
        setSize(new java.awt.Dimension(5, 5));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/Users/A/Desktop/LaLogo.jpg")); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(153, 153, 255)));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), null), "Banking", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(51, 51, 255))); // NOI18N

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 0, 13), new java.awt.Color(51, 51, 255))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Name:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Customer Id");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Account Type");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Gender");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Address");

        jTextField4.setEditable(false);

        jTextField10.setEditable(false);

        jTextField13.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Contact:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Identification");

        CreateAcc.setBackground(new java.awt.Color(102, 255, 102));
        CreateAcc.setText("CreateAccount");
        CreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateAccActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField6ActionPerformed(evt);
            }
        });

        jTextField7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButton1.setBackground(new java.awt.Color(255, 255, 153));
        jButton1.setText("Edit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(102, 153, 255));
        jButton4.setText("Update");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(66, 66, 66)
                                .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(104, 104, 104)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2)
                                .addGap(40, 40, 40)))
                        .addComponent(CreateAcc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)))
                .addGap(138, 138, 138))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextField13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CreateAcc)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Profile", jPanel2);

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204)));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("User Name:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Name:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Account No:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Available Balance:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Deposit Amount:");

        jTextField5.setEditable(false);

        jTextField8.setEditable(false);

        jTextField9.setEditable(false);
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });

        jButton6.setText("Update Total");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Search..");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton8.setForeground(new java.awt.Color(0, 102, 0));
        jButton8.setText("Deposit");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11)
                        .addComponent(jLabel9)
                        .addComponent(jLabel6)))
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                            .addComponent(jTextField5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addComponent(jTextField9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton7)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(175, 175, 175))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Deposit", jPanel3);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("User Name:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Name:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("Account No:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Available Balance:");

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Transfer Amount:");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Transfer to:");

        jTextField17.setEditable(false);

        jTextField18.setEditable(false);

        jTextField19.setEditable(false);

        jButton9.setText("Search");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setBackground(new java.awt.Color(204, 204, 255));
        jButton10.setText("Remaining balance");
        jButton10.setDoubleBuffered(true);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField22.setEditable(false);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select account" }));
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextField21.setEditable(false);

        jTextField23.setEditable(false);

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton11.setForeground(new java.awt.Color(153, 51, 255));
        jButton11.setText("Transfer");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });

        jButton12.setForeground(new java.awt.Color(255, 102, 102));
        jButton12.setText("Update Balance");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel18)))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(127, 127, 127)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel19)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel20)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField23))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField22)))
                                .addGap(45, 45, 45))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jButton9)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(249, 249, 249)
                        .addComponent(jButton11)))
                .addGap(35, 35, 35))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jTextField16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextField17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10)
                    .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12)
                    .addComponent(jLabel21))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transfer", jPanel4);

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 0, 255)));

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel23.setText("User Name:");

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel24.setText("Name:");

        jLabel25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel25.setText("Account No:");

        jLabel26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel26.setText("Available Balance:");

        jLabel27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel27.setText("Amount:");

        jTextField26.setEditable(false);

        jTextField27.setEditable(false);

        jTextField28.setEditable(false);

        jTextField29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField29ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton13.setForeground(new java.awt.Color(102, 153, 255));
        jButton13.setText("Show Total");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });

        jButton14.setForeground(new java.awt.Color(255, 102, 153));
        jButton14.setText("Withdraw");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField28)
                            .addComponent(jTextField29)
                            .addComponent(jTextField30)
                            .addComponent(jButton14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addComponent(jLabel25)
                            .addGap(39, 39, 39)
                            .addComponent(jTextField27, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel23)
                                    .addGap(42, 42, 42))
                                .addGroup(jPanel5Layout.createSequentialGroup()
                                    .addComponent(jLabel24)
                                    .addGap(67, 67, 67)))
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField25)
                                .addComponent(jTextField26, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 103, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(407, 407, 407))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel23)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel24)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel25)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel26))
                    .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton14)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Withdrawl", jPanel5);

        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 51)));

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("User Name:");

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Name:");

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Account No:");

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Available Balance:");

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Standing Order Amount:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Account" }));
        jComboBox2.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox2PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Select Account To Pay:");

        jTextField31.setEditable(false);

        jTextField32.setEditable(false);

        jTextField33.setEditable(false);
        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jButton15.setText("Search");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jButton16.setForeground(new java.awt.Color(255, 51, 51));
        jButton16.setText("Make Payment");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jButton17.setText("Update Acc");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        jButton24.setText("Remaining Bal");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel31)
                            .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel29))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField32, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                            .addComponent(jTextField31, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField24, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField33)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton24, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(206, 206, 206))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton15))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel31))
                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel32)
                    .addComponent(jButton24)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel33)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton17)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Standing Order", jPanel6);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(102, 153, 255));
        jLabel44.setText("set up Direct debit");

        jLabel45.setText("Payee Name:");

        jLabel46.setText("Account No:");

        jLabel47.setText("Sort Code:");

        jLabel48.setText("Amount:");

        jTextField52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField52ActionPerformed(evt);
            }
        });

        jButton25.setText("Set up");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jLabel49.setText("Account Type");

        jLabel50.setText("Amount:");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select account" }));
        jComboBox3.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox3PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 51, 102));
        jLabel52.setText("Show Accounts & Balance");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel46)
                                .addComponent(jLabel45)
                                .addComponent(jLabel47))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextField50, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jTextField51)
                                .addComponent(jTextField52, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGroup(jPanel12Layout.createSequentialGroup()
                            .addComponent(jLabel48)
                            .addGap(33, 33, 33)
                            .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                                .addComponent(jTextField53, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel49)
                            .addComponent(jLabel50))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField55)))
                    .addComponent(jLabel52, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel45)
                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel46)
                    .addComponent(jTextField51, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel50)
                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel47)
                    .addComponent(jTextField52, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jTextField53, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton25)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Direct Debit", jPanel12);

        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(102, 255, 255)));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 0)));
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
        jScrollPane1.setViewportView(jTable1);

        jButton22.setText("Refresh Table");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(jButton22)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton22)
                .addGap(0, 55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Account List", jPanel7);

        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 0, 255)));

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("User Name:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Name:");

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Available Balance:");

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Top-Up (amount):");

        jTextField38.setEditable(false);

        jTextField39.setEditable(false);

        jButton18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton18.setText("Pull details");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jButton19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton19.setText("Top Up");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setText("Remaining balance");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jTextField41.setEditable(false);

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Mobile Top-Up (name):");

        jTextField42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField42ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel39)
                    .addComponent(jLabel37)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35)
                    .addComponent(jLabel38))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextField42, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField41, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton20, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel35)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(jTextField40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Purchases", jPanel8);

        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 204)));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        jButton21.setText("Refresh Table");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 674, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jButton21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton21)
                .addGap(0, 60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Transactions", jPanel9);

        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel28.setText("User Name:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Name:");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Account No:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("Available Balance:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("Interest Rate(%):");

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Account Type:");

        jTextField44.setEditable(false);

        jTextField45.setEditable(false);
        jTextField45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField45ActionPerformed(evt);
            }
        });

        jTextField46.setEditable(false);

        jTextField47.setEditable(false);

        jTextField48.setEditable(false);
        jTextField48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField48ActionPerformed(evt);
            }
        });

        jButton23.setText("Search");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel40)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel34)
                                .addComponent(jLabel28)))
                        .addGap(14, 14, 14))
                    .addComponent(jLabel41)
                    .addComponent(jLabel43)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField44, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                    .addComponent(jTextField45, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField46)
                    .addComponent(jTextField47)
                    .addComponent(jTextField48)
                    .addComponent(jTextField43))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton23)
                .addContainerGap(333, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28)
                    .addComponent(jTextField43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jTextField44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(jTextField45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(jTextField46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("View Balance", jPanel10);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 66, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Statement", jPanel11);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 19, Short.MAX_VALUE))
        );

        jLabel2.setText("Date:");

        jLabel3.setText("User:");

        jButton5.setText("Find");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here: profile,find button
        String qry="select * from bankaccount where name =?";
        
        try{

       pstmt=conn.prepareStatement(qry);
       pstmt.setString(1, jTextField3.getText());
       res=pstmt.executeQuery();
       if (res.next()){
           String add1=res.getString("id");
           jTextField10.setText(add1);
            String add2=res.getString("name");
           jTextField4.setText(add2);
            String add3=res.getString("address");
           jTextField13.setText(add3);
           String add4=res.getString("contact");
           jTextField6.setText(add4);
            String add5=res.getString("accounttype");
           jTextField11.setText(add5);
            String add6=res.getString("identification");
           jTextField7.setText(add6);
            String add7=res.getString("gender");
            jTextField12.setText(add7);
           res.close();
           pstmt.close();
           
       }else{
           JOptionPane.showMessageDialog(null, "Enter Correct Name");
       }         
        }catch (Exception e){
           out.println("class not found"+e);
        }finally{
        try{
            res.close();
            pstmt.close();
        }catch(Exception e){
            
        }
    }
           
       
        
      
       
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        try{
            String a1=jTextField25.getText();
            String a2=jTextField30.getText();
            String qry="update bnkbalance set balance='"+a2+"' where username='"+a1+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Withdrawal Successfully");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        try{
            String a1=jTextField28.getText();
            String a2=jTextField29.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField30.setText(sum1);
        }catch(Exception e){

        }

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
            String qry="select * from bnkbalance where username=?" ;
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, jTextField25.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField26.setText(add1);
                String add2=res.getString("accountno");
                jTextField27.setText(add2);
                String add3=res.getString("balance");
                jTextField28.setText(add3);
                res.close();
                pstmt.close();
            }else{
                JOptionPane.showMessageDialog(null, "problem with transfer ");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                res.close();
                pstmt.close();

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:

        try{
            String a1=jTextField20.getText();
            String a2=jTextField21.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField23.setText(sum1);
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        TransferA();
        TransferC();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        try{
            String a1=(String)jComboBox1.getSelectedItem();
            String qry="select * from bnkbalance where accounttype=?";
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, a1);
            res=pstmt.executeQuery();
            if(res.next()){
                String add=res.getString("balance");
                jTextField21.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        try{
            String a1=jTextField19.getText();
            String a2=jTextField20.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField22.setText(sum1);
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:

        try{
            String qry="select * from bnkbalance where username=?" ;
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, jTextField16.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField17.setText(add1);
                String add2=res.getString("accountno");
                jTextField18.setText(add2);
                String add3=res.getString("balance");
                jTextField19.setText(add3);
                res.close();
                pstmt.close();
            }else{
                JOptionPane.showMessageDialog(null, "problem with transfer ");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                res.close();
                pstmt.close();

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        try{
            //  Class.forName("org.apache.derby.jdbc.ClientDriver");
            //conn=DriverManager.getConnection("jdbc:derby://localhost:1527/BnkDB","ha07","ha07");
            String value1=jTextField1.getText();
            String value2=jTextField15.getText();
            String qry="update BNKBALANCE set balance='"+value2+"' where username='"+value1+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
            JOptionPane.showMessageDialog(null,"Successfully Deposited");
            jTextField1.setText("");
            jTextField5.setText("");
            jTextField8.setText("");
            jTextField9.setText("");
            jTextField14.setText("");
            jTextField15.setText("");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:

        try{
            String qry="select * from BNKBALANCE where username =?";
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, jTextField1.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField5.setText(add1);
                String add2=res.getString("Accountno");
                jTextField8.setText(add2);
                String add3=res.getString("balance");
                jTextField9.setText(add3);
                res.close();
                pstmt.close();
            }else{
                JOptionPane.showMessageDialog(null,"Enter Correct Name !");
            }
        }catch (Exception e){
            out.println("Exception abort"+e);
        }finally{
            try{
                res.close();
                pstmt.close();
            }catch(Exception e){
                out.println("exception depost"+e);
            }
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        try{
            String a1=jTextField9.getText();
            String a2=jTextField14.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField15.setText(sum1);
        }catch(Exception e){
            out.println("sql"+e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
                        //save button
        try{
           // Class.forName("org.apache.derby.jdbc.ClientDriver");
         //   conn=DriverManager.getConnection("jdbc:derby://localhost:1527/sampleDB","app","app");
            String value1=jTextField13.getText(); //address
            String value2=jTextField12.getText();//gender
            String value3=jTextField6.getText(); //contact
            // String value5=jTextField11.getText();
           String value4=jTextField7.getText();

            String qry="update bankaccount set address='"+value1+"',gender='"+value2+"', contact='"+value3+"'  where identification='"+value4+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Profile Updated  !!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: Edit button

        jTextField6.setEditable(true);
         jTextField7.setEditable(true);
        jTextField8.setEditable(true);
          jTextField10.setEditable(true);
        jTextField11.setEditable(true);
        jTextField12.setEditable(true);
        jTextField13.setEditable(true);
        // jTextField2.setEditable(true);
        //  jTextField3.setEditable(true);
        //   jTextField4.setEditable(true);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        BnkAccount ca =new BnkAccount();
        ca.setVisible (true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void CreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateAccActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        BnkAccount bk = new BnkAccount();
        bk.setVisible(true);
    }//GEN-LAST:event_CreateAccActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed
    public void Account2(){
        try{
            String qry="select * from bnkbalance ";
            pstmt=conn.prepareStatement(qry);
            res=pstmt.executeQuery();
            while (res.next()){
                String account =res.getString("accounttype");
                jComboBox2.addItem(account);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }    
    public void StandingOrderA(){
        try{
         String value1=(String) jComboBox2.getSelectedItem();  
         String value2=jTextField35.getText();
         String qry="update bnkbalance set balance='"+value2+"' where accounttype ='"+value1+"'";
         pstmt=conn.prepareStatement(qry);
         pstmt.execute();
         JOptionPane.showMessageDialog(null, "Successfully Paid Standing order");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void StandingOrderB(){
        try{
            String value1=jTextField24.getText();
            String value2=jTextField49.getText();
            String qry="update bnkbalance set balance='"+value2+"' where username='"+value1+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        StandingOrderA();
        StandingOrderB();
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:stand order search button
        
          try{
            String qry="select * from bnkbalance where username=?" ;
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, jTextField24.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField31.setText(add1);
                String add2=res.getString("accountno");
                jTextField32.setText(add2);
                String add3=res.getString("balance");
                jTextField33.setText(add3);
                res.close();
                pstmt.close();
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Entry ");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                res.close();
                pstmt.close();

            }catch(Exception e){

            }
        }
        
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField29ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField29ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
         try{
            String a1=jTextField34.getText();
            String a2=jTextField36.getText();
            int sum=Integer.parseInt(a1)+Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField35.setText(sum1);
        }catch(Exception e){

        }
         
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
         
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox2PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox2PopupMenuWillBecomeInvisible
        // TODO add your handling code here:standing order
         try{
            String a1=(String)jComboBox2.getSelectedItem();
            String qry="select * from bnkbalance where accounttype=?";
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, a1);
            res=pstmt.executeQuery();
            if(res.next()){
                String add=res.getString("balance");
                jTextField36.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jComboBox2PopupMenuWillBecomeInvisible

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:search in purchase
        try{
            String qry="select * from bnkbalance where username=?" ;
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, jTextField37.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField38.setText(add1);
                
                String add2=res.getString("balance");
                jTextField39.setText(add2);
                res.close();
                pstmt.close();
            }else{
                JOptionPane.showMessageDialog(null, "Incorrect Details ");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }finally{
            try{
                res.close();
                pstmt.close();

            }catch(Exception e){

            }
        }
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here://make payment purchase
        try{
            String a1=jTextField37.getText();
            String a2=jTextField41.getText();
            String a3=jTextField42.getText();
            String qry="update bnkbalance set balance ='"+a2+"',purchases='"+a3+"' where username='"+a1+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
            JOptionPane.showMessageDialog(null,"Paid Successfully !");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here: total button purchase
          try{
            String a1=jTextField39.getText();
            String a2=jTextField40.getText();
            int sum=Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField41.setText(sum1);
        }catch(Exception e){

        }
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jTextField42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField42ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField42ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:refresh button table 2
//select username, accountno, balance, accounttype,payingfor  from bnkbalance
         try{  
             String qry="select username, accountno, balance, accounttype, purchases  from bnkbalance";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             jTable2.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
     //}
        
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        //update button bankaccount
        
        try{
             String qry="select id, name, contact, accounttype, gender, address from bankaccount";
             pstmt=conn.prepareStatement(qry);
             res=pstmt.executeQuery();
             jTable1.setModel(DbUtils.resultSetToTableModel(res));
         }catch (Exception e){
             JOptionPane.showMessageDialog(null, e);
         }finally{
             try{
                 res.close();
                 pstmt.close();
             }catch(Exception e){
                 
             }
         }
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:search view balance

        String qry="select * from bnkbalance where username=?";
        try{
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1,jTextField43.getText());
            res=pstmt.executeQuery();
            if (res.next()){
                String add1=res.getString("name");
                jTextField44.setText(add1);
                
                String add2=res.getString("accountno");
                jTextField45.setText(add2);
                
                String add3=res.getString("balance");
                jTextField46.setText(add3);
                
                String add4=res.getString("accounttype");
                jTextField47.setText(add4);
               // String add5=res.getString("");
                jTextField48.setText("5%");
                

            }else{
                JOptionPane.showMessageDialog(null,"Incorrect Username !");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jTextField48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField48ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField48ActionPerformed

    private void jTextField45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField45ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField45ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        try{
            String a1=jTextField33.getText();
            String a2=jTextField34.getText();
            int sum= Integer.parseInt(a1)-Integer.parseInt(a2);
            String sum1=String.valueOf(sum);
            jTextField49.setText(sum1);
        }catch (Exception e){
           // JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jTextField52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField52ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField52ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        try{
            String qry="insert into Direct_Debit(payee_name,accountno,sortcode,amount) values(?,?,?,?)";
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1,jTextField50.getText());
            pstmt.setString(2,jTextField51.getText());
            pstmt.setString(3,jTextField52.getText());
            pstmt.setString(4,jTextField53.getText());
            
            pstmt.execute();
            JOptionPane.showMessageDialog(null, "Direct debit setup Successfully !");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
    }//GEN-LAST:event_jButton25ActionPerformed
          
    private void jComboBox3PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox3PopupMenuWillBecomeInvisible
        // TODO add your handling code here: //box standing_order
        try{
            String a4=(String)jComboBox3.getSelectedItem();
            String qry="select * from bnkbalance where accounttype=?";
            pstmt=conn.prepareStatement(qry);
            pstmt.setString(1, a4);
            res=pstmt.executeQuery();
            if(res.next()){
                String add=res.getString("balance");
                jTextField55.setText(add);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }//GEN-LAST:event_jComboBox3PopupMenuWillBecomeInvisible
 
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jComboBox3ActionPerformed
  

    //standing_order
    public void Account5(){
        try{
            String qry="select * from bnkbalance ";
            pstmt=conn.prepareStatement(qry);
            res=pstmt.executeQuery();
            while (res.next()){
                String account =res.getString("accounttype");
                jComboBox3.addItem(account);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }

//transfer among accounts
   
       public void Account(){
        try{
            String qry="select * from bnkbalance ";
            pstmt=conn.prepareStatement(qry);
            res=pstmt.executeQuery();
            while (res.next()){
                String account =res.getString("accounttype");
                jComboBox1.addItem(account);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }    public void TransferC(){
        try{
         String value1=(String) jComboBox1.getSelectedItem();  
         String value2=jTextField23.getText();
         String qry="update bnkbalance set balance='"+value2+"' where accounttype ='"+value1+"'";
         pstmt=conn.prepareStatement(qry);
         pstmt.execute();
         JOptionPane.showMessageDialog(null, "Successfully Transferred");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public void TransferA(){
        try{
            String value1=jTextField16.getText();
            String value2=jTextField22.getText();
            String qry="update bnkbalance set balance='"+value2+"' where username='"+value1+"'";
            pstmt=conn.prepareStatement(qry);
            pstmt.execute();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainActivity().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CreateAcc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField40;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField52;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
