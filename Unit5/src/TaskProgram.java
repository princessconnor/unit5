
import java.util.ArrayList;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author conn6070
 */
public class TaskProgram extends javax.swing.JFrame {
    ArrayList list;
    ListIterator li;
    int curtask,tottask;
    Task t;
    /**
     * Creates new form TaskProgram
     */
    public TaskProgram() {
        initComponents();
        list=new ArrayList();
        li=list.listIterator();
        curtask=0;
        tottask=0;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 private void mnureplaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnureplaceActionPerformed
           // TODO add your handling code here:
        if(tottask == 0)
        {
           //popup
            JOptionPane.showMessageDialog(this,"No task to replace this with, use Insert instead");
            return;
        }
        String nm = txtname.getText();
        String d = txtdesc.getText();
        t = new Task(nm, d);
        if(t.validate()==false){
            //error warning
            JOptionPane.showMessageDialog(this, "Error - Must enter all information");
            return;
        }
        li.next();
        li.set(t);
        li.previous();
    }//GEN-LAST:event_mnureplaceActionPerformed

    private void mnuremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuremoveActionPerformed
        // TODO add your handling code here:
        
         if(tottask==0)return;
        li.next();
        li.remove();
        tottask--;
        lblttask.setText(""+tottask);
        if(tottask == 0)
        {
            txtname.setText("");
            txtdesc.setText("");
            curtask = 0;
            lblctask.setText("n/a");
            return;
        }
        if(tottask>1)
        {
            li.next();
            t=(Task)li.previous();
        }
        else if(tottask == 1)
        {
            t = (Task)li.previous();
            curtask = 1;
            lblctask.setText(""+curtask);
        }
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_mnuremoveActionPerformed

    private void mnuclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuclearActionPerformed
        // TODO add your handling code here:
        //clear the txt fields
        txtname.setText("");
        txtdesc.setText("");
        
    }//GEN-LAST:event_mnuclearActionPerformed

    private void mnuafterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuafterActionPerformed
        // TODO add your handling code here:
        String nm = txtname.getText();
        String d = txtdesc.getText();
         t = new Task (nm,d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this,"Error You Must enter all information");
            return;
        }
        if(tottask>0)
        li.next();
        li.add(t);
        li.previous();
        curtask++;
        tottask++;
        lblttask.setText(" " + tottask);
        lblctask.setText(" " + curtask);
        JOptionPane.showMessageDialog(this,"Task has been added");
    }//GEN-LAST:event_mnuafterActionPerformed
    
    private void mnubeforeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnubeforeActionPerformed
        String nm = txtname.getText();
        String d = txtdesc.getText();
        t = new Task(nm, d);
        if(t.validate()==false){
            JOptionPane.showMessageDialog(this, "Error You Must enter all information");
            return;
        }
                
        li.add(t);
        li.previous();
        if(curtask==0)curtask++;
        tottask++;
        lblttask.setText(" " + tottask);
        lblctask.setText(" " + curtask);
        JOptionPane.showMessageDialog(this, "Task has been added");
    }//GEN-LAST:event_mnubeforeActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        // TODO add your handling code here:
        
        if(curtask==1) 
        return;
        int back = curtask -1;
        curtask=1;
        lblctask.setText(" " + curtask);
        for (int x =0;x<back;x++)
        {
            li.previous();
        }
        li.next();
        t = (Task)li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnstartActionPerformed
    
     private void mnushowallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnushowallActionPerformed
        String result = "";
        for(int x=0;x<list.size();x++)
        {
            t=(Task)list.get(x);
            result+="TASK " + (x+1) + ":\n" + t.toString()+ "\n";
        }
        JOptionPane.showMessageDialog(this,result);
    }//GEN-LAST:event_mnushowallActionPerformed
     
    private void btnendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnendActionPerformed
        // TODO add your handling code here:
        if(curtask==tottask)
        return;
       while(li.hasNext())
           li.next();
       t=(Task)li.previous();
       curtask=tottask;
       //update display
       lblctask.setText(""+curtask);
       txtname.setText(t.getName());
       txtdesc.setText(t.getDescription());
        
    }//GEN-LAST:event_btnendActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed
        // TODO add your handling code here:
          if(curtask==tottask)
       return;
       curtask++;
       lblctask.setText(" "+ curtask);
       li.next();
       li.next();
       t=(Task)li.previous();
       txtname.setText(t.getName());
       txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnnextActionPerformed
   
    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
            // TODO add your handling code here:
        if(curtask==1) 
        return;
        curtask--;
        lblctask.setText(" " + curtask);
        t=(Task)li.previous();
        txtname.setText(t.getName());
        txtdesc.setText(t.getDescription());
    }//GEN-LAST:event_btnbackActionPerformed
    
     private void mnuexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuexitActionPerformed
       //closes app
         System.exit(0);
    }//GEN-LAST:event_mnuexitActionPerformed

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
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskProgram.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TaskProgram().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntback;
    private javax.swing.JButton btnend;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnstart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblctask;
    private javax.swing.JLabel lblttask;
    private javax.swing.JMenuItem mnuafter;
    private javax.swing.JMenuItem mnubefore;
    private javax.swing.JMenuItem mnuclear;
    private javax.swing.JMenuItem mnuexit;
    private javax.swing.JMenuItem mnuremove;
    private javax.swing.JMenuItem mnureplace;
    private javax.swing.JMenuItem mnurestore;
    private javax.swing.JMenuItem mnushowall;
    private javax.swing.JTextArea txtdesc;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

