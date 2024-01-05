
import javax.swing.ImageIcon;

public class Menu extends javax.swing.JFrame {
    Data d = new Data();
    SoundEffects sfx = new SoundEffects();
    boolean darkmode;
    /**
     * Creates new form GUI
     */
    public Menu() {
        d.renderData();
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/icon.png")).getImage());
        if(d.data.get(0).equals("false")){
            darkmode = true;
        }
        else{
            darkmode = false;
        }
        modeRender();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitButton = new javax.swing.JLabel();
        playButton = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotiQuiz");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitW.png"))); // NOI18N
        exitButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitButtonMouseClicked(evt);
            }
        });
        getContentPane().add(exitButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, -1));

        playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playW.png"))); // NOI18N
        playButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                playButtonMouseClicked(evt);
            }
        });
        getContentPane().add(playButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmode.png"))); // NOI18N
        mode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeMouseClicked(evt);
            }
        });
        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, -1, 60));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebackground.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeMouseClicked
        modeRender();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_modeMouseClicked

    private void exitButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitButtonMouseClicked
        sfx.playTrack("click.wav");
        try{
            Thread.sleep(1000);
            System.exit(0);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_exitButtonMouseClicked

    private void playButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_playButtonMouseClicked
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_playButtonMouseClicked

    private void modeRender(){
        if(darkmode){
            darkmode = false;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebackground.png")));
            mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmode.png")));
            playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playW.png")));
            exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitW.png")));
            d.data.set(0 , "false");
            d.saveData();
        }
        else{
            darkmode = true;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackbackground.png")));
            mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/darkmode.png")));
            playButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/playB.png")));
            exitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/exitB.png")));
            d.data.set(0 , "true");
            d.saveData();
        }
    }
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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel exitButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel mode;
    private javax.swing.JLabel playButton;
    // End of variables declaration//GEN-END:variables
}
