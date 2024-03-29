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

        backButton = new javax.swing.JLabel();
        topIcon = new javax.swing.JLabel();
        mode = new javax.swing.JLabel();
        book = new javax.swing.JLabel();
        quiz = new javax.swing.JLabel();
        notes = new javax.swing.JLabel();
        options = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("NotiQuiz");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backW.png"))); // NOI18N
        backButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backButtonMouseClicked(evt);
            }
        });
        getContentPane().add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 790, -1, -1));

        topIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu.png"))); // NOI18N
        getContentPane().add(topIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmode.png"))); // NOI18N
        mode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modeMouseClicked(evt);
            }
        });
        getContentPane().add(mode, new org.netbeans.lib.awtextra.AbsoluteConstraints(1460, 10, -1, 60));

        book.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookMouseClicked(evt);
            }
        });
        getContentPane().add(book, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 180, 370, 540));

        quiz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                quizMouseClicked(evt);
            }
        });
        getContentPane().add(quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 180, 360, 540));

        notes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                notesMouseClicked(evt);
            }
        });
        getContentPane().add(notes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 370, 540));

        options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/optionsW.png"))); // NOI18N
        getContentPane().add(options, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebackground.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modeMouseClicked
        modeRender();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_modeMouseClicked

    private void backButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backButtonMouseClicked
        Start s = new Start();
        s.setLocationRelativeTo(null);
        s.setResizable(false);
        s.setVisible(true);
        dispose();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_backButtonMouseClicked

    private void bookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookMouseClicked
        Book b = new Book();
        b.setLocationRelativeTo(null);
        b.setResizable(false);
        b.setVisible(true);
        dispose();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_bookMouseClicked

    private void quizMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_quizMouseClicked
        Quiz q = new Quiz();
        q.setLocationRelativeTo(null);
        q.setResizable(false);
        q.setVisible(true);
        dispose();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_quizMouseClicked

    private void notesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_notesMouseClicked
        NotesMenu n = new NotesMenu();
        n.setLocationRelativeTo(null);
        n.setResizable(false);
        n.setVisible(true);
        dispose();
        sfx.playTrack("click.wav");
    }//GEN-LAST:event_notesMouseClicked

    private void modeRender(){
        if(darkmode){
            darkmode = false;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/whitebackground.png")));
            mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lightmode.png")));
            backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backW.png")));
            options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/optionsW.png")));
            d.data.set(0 , "false");
            d.saveData();
        }
        else{
            darkmode = true;
            background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/blackbackground.png")));
            mode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/darkmode.png")));
            backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/backB.png")));
            options.setIcon(new javax.swing.ImageIcon(getClass().getResource("/optionsB.png")));
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
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Start.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Start().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel backButton;
    private javax.swing.JLabel background;
    private javax.swing.JLabel book;
    private javax.swing.JLabel mode;
    private javax.swing.JLabel notes;
    private javax.swing.JLabel options;
    private javax.swing.JLabel quiz;
    private javax.swing.JLabel topIcon;
    // End of variables declaration//GEN-END:variables
}
