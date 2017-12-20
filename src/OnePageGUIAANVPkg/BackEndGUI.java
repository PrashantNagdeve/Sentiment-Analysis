/*
 * This File contains the gui component and their nevigation
 */
package OnePageGUIAANVPkg;

import java.awt.Color;
import javax.swing.ButtonGroup;

/**
 *This class Contains the GUI design Components 
 * 
 */
public class BackEndGUI extends javax.swing.JFrame {

    /**
     * Creates new form BackEndGUI
     */
    
    ButtonGroup bg=new ButtonGroup();
    static int fileTextFlag;
    public BackEndGUI() {
        initComponents();
  
        this.setTitle("Product Review Sentiment Analysis Using AANV");
        bg.add(rbtnManualInput);
        bg.add(rbtnFileUpload);
        btnaboutus.setBackground(Color.WHITE);
        btnExit.setBackground(Color.WHITE);
        
        btnBrowse.setVisible(false);
        btnUpload.setVisible(false);
        txtFieldFilePath.setVisible(false);
        txtAreaManualInput.setVisible(false);
        btnOK.setVisible(false);
        btnPOSTagging.setEnabled(false);
        btnShowTuple.setEnabled(false);
        btnShowScore.setEnabled(false);
        btnResult.setEnabled(false);
        txtFieldDecision.setVisible(false);
        btnPOSTagging.setBackground(Color.WHITE);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        rbtnManualInput = new javax.swing.JRadioButton();
        rbtnFileUpload = new javax.swing.JRadioButton();
        btnBrowse = new javax.swing.JButton();
        btnUpload = new javax.swing.JButton();
        btnPOSTagging = new javax.swing.JButton();
        btnShowTuple = new javax.swing.JButton();
        btnShowScore = new javax.swing.JButton();
        btnResult = new javax.swing.JButton();
        txtFieldFilePath = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaManualInput = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaInputReview = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaTaggedReview = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaAANV = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaScores = new javax.swing.JTextArea();
        btnOK = new javax.swing.JButton();
        txtFieldDecision = new javax.swing.JTextField();
        btnExit = new javax.swing.JButton();
        btnaboutus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(153, 0, 153));

        rbtnManualInput.setBackground(new java.awt.Color(255, 255, 255));
        rbtnManualInput.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnManualInput.setForeground(new java.awt.Color(153, 0, 153));
        rbtnManualInput.setText("Manual Input");
        rbtnManualInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnManualInputActionPerformed(evt);
            }
        });

        rbtnFileUpload.setBackground(new java.awt.Color(255, 255, 255));
        rbtnFileUpload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        rbtnFileUpload.setForeground(new java.awt.Color(153, 0, 153));
        rbtnFileUpload.setText("File Upload");
        rbtnFileUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFileUploadActionPerformed(evt);
            }
        });

        btnBrowse.setBackground(new java.awt.Color(255, 255, 255));
        btnBrowse.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBrowse.setForeground(new java.awt.Color(153, 0, 153));
        btnBrowse.setText("Browse");
        btnBrowse.setActionCommand("btnBrowse");
        btnBrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBrowseActionPerformed(evt);
            }
        });

        btnUpload.setBackground(new java.awt.Color(255, 255, 255));
        btnUpload.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnUpload.setForeground(new java.awt.Color(153, 0, 153));
        btnUpload.setText("Upload");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        btnPOSTagging.setBackground(new java.awt.Color(255, 255, 255));
        btnPOSTagging.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnPOSTagging.setForeground(new java.awt.Color(153, 0, 153));
        btnPOSTagging.setText("POSTagging");
        btnPOSTagging.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPOSTaggingActionPerformed(evt);
            }
        });

        btnShowTuple.setBackground(new java.awt.Color(255, 255, 255));
        btnShowTuple.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShowTuple.setForeground(new java.awt.Color(153, 0, 153));
        btnShowTuple.setText("Extract Tuples");
        btnShowTuple.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTupleActionPerformed(evt);
            }
        });

        btnShowScore.setBackground(new java.awt.Color(255, 255, 255));
        btnShowScore.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnShowScore.setForeground(new java.awt.Color(153, 0, 153));
        btnShowScore.setText("Show Score");
        btnShowScore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowScoreActionPerformed(evt);
            }
        });

        btnResult.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnResult.setForeground(new java.awt.Color(153, 0, 153));
        btnResult.setText("Result");
        btnResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResultActionPerformed(evt);
            }
        });

        txtFieldFilePath.setForeground(new java.awt.Color(51, 0, 204));

        txtAreaManualInput.setColumns(20);
        txtAreaManualInput.setForeground(new java.awt.Color(51, 0, 204));
        txtAreaManualInput.setRows(5);
        jScrollPane5.setViewportView(txtAreaManualInput);

        txtAreaInputReview.setColumns(20);
        txtAreaInputReview.setForeground(new java.awt.Color(51, 0, 204));
        txtAreaInputReview.setRows(5);
        jScrollPane1.setViewportView(txtAreaInputReview);

        txtAreaTaggedReview.setColumns(20);
        txtAreaTaggedReview.setForeground(new java.awt.Color(51, 0, 204));
        txtAreaTaggedReview.setRows(5);
        jScrollPane3.setViewportView(txtAreaTaggedReview);

        txtAreaAANV.setColumns(20);
        txtAreaAANV.setForeground(new java.awt.Color(51, 0, 204));
        txtAreaAANV.setRows(5);
        jScrollPane2.setViewportView(txtAreaAANV);

        txtAreaScores.setColumns(20);
        txtAreaScores.setForeground(new java.awt.Color(51, 0, 204));
        txtAreaScores.setRows(5);
        jScrollPane4.setViewportView(txtAreaScores);

        btnOK.setBackground(new java.awt.Color(255, 255, 255));
        btnOK.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnOK.setForeground(new java.awt.Color(153, 0, 153));
        btnOK.setText("OK");
        btnOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOKActionPerformed(evt);
            }
        });

        txtFieldDecision.setForeground(new java.awt.Color(51, 0, 204));

        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnExit.setForeground(new java.awt.Color(153, 0, 153));
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnaboutus.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnaboutus.setForeground(new java.awt.Color(153, 0, 153));
        btnaboutus.setText("Help and About Us");
        btnaboutus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaboutusActionPerformed(evt);
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
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnManualInput)
                                    .addComponent(rbtnFileUpload)
                                    .addComponent(btnUpload)
                                    .addComponent(btnPOSTagging)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnBrowse, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtFieldFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnShowTuple)
                                    .addComponent(btnShowScore)
                                    .addComponent(btnResult))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(191, 191, 191)
                                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFieldDecision, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnaboutus)
                                .addGap(60, 60, 60)
                                .addComponent(btnExit)))
                        .addGap(42, 69, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(rbtnManualInput)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtnFileUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBrowse)
                            .addComponent(txtFieldFilePath, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpload)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPOSTagging)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowTuple))
                    .addComponent(jScrollPane5))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnShowScore)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResult)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                            .addComponent(jScrollPane1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jScrollPane4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(btnOK, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnaboutus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFieldDecision, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(183, 183, 183))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This method will upload the browsed file into the textbox
 * @param evt 
 */
    private void rbtnFileUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFileUploadActionPerformed
       if(this.isEnabled())
       {
                fileTextFlag=1;
                btnBrowse.setVisible(true);
                btnUpload.setVisible(true);
                txtFieldFilePath.setVisible(true);   
                rbtnManualInput.setVisible(false);
       }
    }//GEN-LAST:event_rbtnFileUploadActionPerformed
/**
 * It will allow to select the review file to upload
 * @param evt 
 */
    private void btnBrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBrowseActionPerformed
        Browse BrowseObj=new Browse();
        BrowseObj.BrowseFile();
        btnBrowse.setEnabled(false);   
    }//GEN-LAST:event_btnBrowseActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        Upload UploadObj=new Upload();      
        UploadObj.UploadFile();   
        btnUpload.setEnabled(false);
        btnPOSTagging.setEnabled(true);
    }//GEN-LAST:event_btnUploadActionPerformed
/**
 * 
 * @param evt 
 */
    private void rbtnManualInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnManualInputActionPerformed
        txtAreaManualInput.setVisible(true);       
        btnOK.setVisible(true);
        rbtnFileUpload.setVisible(false);
        btnBrowse.setVisible(false);
        btnPOSTagging.setEnabled(true);
    }//GEN-LAST:event_rbtnManualInputActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOKActionPerformed
        Manual ManualObj=new Manual();
        ManualObj.ManualMethod();
        btnOK.setEnabled(false);
        btnUpload.setEnabled(true);
    }//GEN-LAST:event_btnOKActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnPOSTaggingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPOSTaggingActionPerformed
        POStagging pOStaggingObj=new POStagging();
        pOStaggingObj.TagReview();
        btnPOSTagging.setEnabled(false);
        btnShowTuple.setEnabled(true);
    }//GEN-LAST:event_btnPOSTaggingActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnShowTupleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTupleActionPerformed
        ExtractTagText extractTagTextObj=new ExtractTagText();
        extractTagTextObj.ExtractTag();
        extractTagTextObj.ShowTuple();
        btnShowTuple.setEnabled(false);
        btnShowScore.setEnabled(true);
    }//GEN-LAST:event_btnShowTupleActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnShowScoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowScoreActionPerformed
        try{ 
            ScoreRetrival scoreRetrivalObj=new ScoreRetrival();
            scoreRetrivalObj.getScore();
            AlgorithmImplimentation algorithmImplimentationObj=new AlgorithmImplimentation();
            algorithmImplimentationObj.showScore();
            btnShowScore.setEnabled(false);
            btnResult.setEnabled(true);
        }
        catch(Exception ex)
        {}
    }//GEN-LAST:event_btnShowScoreActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResultActionPerformed
        AlgorithmImplimentation algorithmImplimentationObj=new AlgorithmImplimentation();
        //algorithmImplimentationObj.
        
        UnaryAlgorithm unaryAlgorithmObj=new UnaryAlgorithm();
        unaryAlgorithmObj.applyAlgo();
     
        ResultDisplay resultDisplayObj=new ResultDisplay();
        resultDisplayObj.Display();
        btnResult.setEnabled(false);
        //my modification
        //btnOK.setEnabled(true);
        
    }//GEN-LAST:event_btnResultActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnaboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaboutusActionPerformed
        HelpAboutUs hau = new HelpAboutUs();
        hau.setResizable(false);
        hau.setSize(500,300);
        hau.setVisible(true);
        hau.setLocation(450, 200);
    }//GEN-LAST:event_btnaboutusActionPerformed

    
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
            java.util.logging.Logger.getLogger(BackEndGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BackEndGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BackEndGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BackEndGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BackEndGUI().setVisible(true);
            }
        });
    }
    private javax.swing.JFileChooser JfOpenDialog;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnBrowse;
    private javax.swing.JButton btnExit;
    public static javax.swing.JButton btnOK;
    public static javax.swing.JButton btnPOSTagging;
    private javax.swing.JButton btnResult;
    private javax.swing.JButton btnShowScore;
    private javax.swing.JButton btnShowTuple;
    public static javax.swing.JButton btnUpload;
    private javax.swing.JButton btnaboutus;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JRadioButton rbtnFileUpload;
    private javax.swing.JRadioButton rbtnManualInput;
    public static javax.swing.JTextArea txtAreaAANV;
    public static javax.swing.JTextArea txtAreaInputReview;
    public static javax.swing.JTextArea txtAreaManualInput;
    public static javax.swing.JTextArea txtAreaScores;
    public static javax.swing.JTextArea txtAreaTaggedReview;
    public static javax.swing.JTextField txtFieldDecision;
    public static javax.swing.JTextField txtFieldFilePath;
    // End of variables declaration//GEN-END:variables
}
