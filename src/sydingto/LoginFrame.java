/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sydingto;

import sydingto.events.Buttons;
import sydingto.res.Colors;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author satmaxt
 */
public class LoginFrame extends javax.swing.JFrame implements Buttons {

    private Color color = Colors.GRAY3;

    /**
     * Creates new form LoginFrame
     */
    public LoginFrame() {
        initComponents();
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(new Dimension(800, 600));
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        signUpSeparator.setBackground(Color.WHITE);
        
        LoginFrame _that = this;
        
        ArrayList<javax.swing.JLabel> btn = new ArrayList<>();
        btn.add(signInTab);
        btn.add(signUpTab);
        
        btn.forEach((label) -> {
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseExited(MouseEvent me) {
                    _that.onHoverOutButtonTransparent(me, color);
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    color = me.getComponent().getForeground();
                    _that.onHoverButtonTransparent(me);
                }
            });
        });
        
        ArrayList<javax.swing.JLabel> btnPrimary = new ArrayList<>();
        btnPrimary.add(buttonSignIn);
        btnPrimary.add(buttonSignUp);
        btnPrimary.forEach((label) -> {
            label.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseExited(MouseEvent me) {
                    _that.onHoverOutButtonPrimary(me);
                }

                @Override
                public void mouseEntered(MouseEvent me) {
                    _that.onHoverButtonPrimary(me);
                }
            });
        });        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        main_bg = new javax.swing.JPanel();
        ilustration_login = new javax.swing.JLabel();
        main_content = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        signInTab = new javax.swing.JLabel();
        signInSeparator = new javax.swing.JSeparator();
        signUpTab = new javax.swing.JLabel();
        signUpSeparator = new javax.swing.JSeparator();
        authPanel = new javax.swing.JPanel();
        signInPanel = new javax.swing.JPanel();
        usernameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        buttonSignIn = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        usernameSignUpField = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        passwordSignUpField = new javax.swing.JPasswordField();
        buttonSignUp = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        passwordConfirmField = new javax.swing.JPasswordField();
        buttonClose = new javax.swing.JLabel();
        btnAbout = new javax.swing.JLabel();
        buttonMinimize = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        main_bg.setBackground(new java.awt.Color(255, 255, 255));
        main_bg.setMinimumSize(new java.awt.Dimension(800, 600));
        main_bg.setPreferredSize(new java.awt.Dimension(345, 600));
        main_bg.setLayout(null);

        ilustration_login.setBackground(new java.awt.Color(255, 255, 255));
        ilustration_login.setForeground(new java.awt.Color(255, 255, 255));
        ilustration_login.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ilustration_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sydingto/images/ilustration.png"))); // NOI18N
        main_bg.add(ilustration_login);
        ilustration_login.setBounds(0, 0, 583, 600);

        main_content.setBackground(new java.awt.Color(255, 255, 255));
        main_content.setPreferredSize(new java.awt.Dimension(345, 600));

        logo.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        logo.setForeground(new java.awt.Color(0, 223, 191));
        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("Sydingto");

        signInTab.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        signInTab.setForeground(new java.awt.Color(74, 84, 83));
        signInTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signInTab.setText("Sign In");
        signInTab.setToolTipText("");
        signInTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signInTab.setPreferredSize(new java.awt.Dimension(108, 29));
        signInTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signInTabMouseClicked(evt);
            }
        });

        signInSeparator.setBackground(new java.awt.Color(184, 189, 188));
        signInSeparator.setForeground(new java.awt.Color(255, 255, 255));
        signInSeparator.setPreferredSize(new java.awt.Dimension(108, 0));

        signUpTab.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        signUpTab.setForeground(new java.awt.Color(158, 160, 160));
        signUpTab.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        signUpTab.setText("Sign Up");
        signUpTab.setToolTipText("");
        signUpTab.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        signUpTab.setPreferredSize(new java.awt.Dimension(108, 29));
        signUpTab.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpTabMouseClicked(evt);
            }
        });

        signUpSeparator.setBackground(new java.awt.Color(184, 189, 188));
        signUpSeparator.setForeground(new java.awt.Color(255, 255, 255));
        signUpSeparator.setPreferredSize(new java.awt.Dimension(108, 0));

        authPanel.setBackground(new java.awt.Color(255, 255, 255));
        authPanel.setPreferredSize(new java.awt.Dimension(228, 100));
        authPanel.setLayout(new java.awt.CardLayout());

        signInPanel.setBackground(new java.awt.Color(255, 255, 255));
        signInPanel.setPreferredSize(new java.awt.Dimension(228, 100));

        usernameField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        usernameField.setForeground(Colors.HEADING_COLOR);
        usernameField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameField.setToolTipText("Username");
        usernameField.setBorder(new javax.swing.border.LineBorder(Colors.GRAY3, 1, true));
        usernameField.setDisabledTextColor(Colors.GRAY4);
        usernameField.setMinimumSize(new java.awt.Dimension(228, 40));
        usernameField.setName("username"); // NOI18N
        usernameField.setPreferredSize(new java.awt.Dimension(228, 40));

        jLabel1.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel1.setForeground(Colors.GRAY3);
        jLabel1.setLabelFor(usernameField);
        jLabel1.setText("Username");

        jLabel2.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel2.setForeground(Colors.GRAY3);
        jLabel2.setLabelFor(passwordField);
        jLabel2.setText("Password");

        passwordField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        passwordField.setForeground(Colors.HEADING_COLOR);
        passwordField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordField.setToolTipText("Password");
        passwordField.setBorder(new javax.swing.border.LineBorder(Colors.GRAY3, 1, true));
        passwordField.setName("password"); // NOI18N
        passwordField.setPreferredSize(new java.awt.Dimension(228, 40));

        buttonSignIn.setBackground(Colors.PRIMARY_COLOR);
        buttonSignIn.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        buttonSignIn.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignIn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonSignIn.setText("Sign In");
        buttonSignIn.setToolTipText("");
        buttonSignIn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonSignIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignIn.setOpaque(true);
        buttonSignIn.setPreferredSize(new java.awt.Dimension(228, 40));
        buttonSignIn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSignInMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout signInPanelLayout = new javax.swing.GroupLayout(signInPanel);
        signInPanel.setLayout(signInPanelLayout);
        signInPanelLayout.setHorizontalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addGroup(signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(buttonSignIn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(passwordField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signInPanelLayout.setVerticalGroup(
            signInPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signInPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );

        authPanel.add(signInPanel, "card2");

        signUpPanel.setBackground(new java.awt.Color(255, 255, 255));
        signUpPanel.setPreferredSize(new java.awt.Dimension(228, 100));

        usernameSignUpField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        usernameSignUpField.setForeground(Colors.HEADING_COLOR);
        usernameSignUpField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        usernameSignUpField.setToolTipText("Username");
        usernameSignUpField.setBorder(new javax.swing.border.LineBorder(Colors.GRAY3, 1, true));
        usernameSignUpField.setDisabledTextColor(Colors.GRAY4);
        usernameSignUpField.setMinimumSize(new java.awt.Dimension(228, 40));
        usernameSignUpField.setName("username"); // NOI18N
        usernameSignUpField.setPreferredSize(new java.awt.Dimension(228, 40));
        usernameSignUpField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameSignUpFieldActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel3.setForeground(Colors.GRAY3);
        jLabel3.setLabelFor(usernameField);
        jLabel3.setText("Username");

        jLabel4.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel4.setForeground(Colors.GRAY3);
        jLabel4.setLabelFor(passwordField);
        jLabel4.setText("Password");

        passwordSignUpField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        passwordSignUpField.setForeground(Colors.HEADING_COLOR);
        passwordSignUpField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordSignUpField.setToolTipText("Password");
        passwordSignUpField.setBorder(new javax.swing.border.LineBorder(Colors.GRAY3, 1, true));
        passwordSignUpField.setName("password"); // NOI18N
        passwordSignUpField.setPreferredSize(new java.awt.Dimension(228, 40));

        buttonSignUp.setBackground(Colors.PRIMARY_COLOR);
        buttonSignUp.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        buttonSignUp.setForeground(new java.awt.Color(255, 255, 255));
        buttonSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonSignUp.setText("Sign Up");
        buttonSignUp.setToolTipText("");
        buttonSignUp.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        buttonSignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonSignUp.setOpaque(true);
        buttonSignUp.setPreferredSize(new java.awt.Dimension(228, 40));
        buttonSignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonSignUpMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lato", 1, 14)); // NOI18N
        jLabel5.setForeground(Colors.GRAY3);
        jLabel5.setLabelFor(passwordField);
        jLabel5.setText("Confirm Password");

        passwordConfirmField.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        passwordConfirmField.setForeground(Colors.HEADING_COLOR);
        passwordConfirmField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        passwordConfirmField.setToolTipText("Confirm Password");
        passwordConfirmField.setBorder(new javax.swing.border.LineBorder(Colors.GRAY3, 1, true));
        passwordConfirmField.setName("password"); // NOI18N
        passwordConfirmField.setPreferredSize(new java.awt.Dimension(228, 40));
        passwordConfirmField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordConfirmFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout signUpPanelLayout = new javax.swing.GroupLayout(signUpPanel);
        signUpPanel.setLayout(signUpPanelLayout);
        signUpPanelLayout.setHorizontalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(usernameSignUpField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(buttonSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(passwordSignUpField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(passwordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        signUpPanelLayout.setVerticalGroup(
            signUpPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(signUpPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(usernameSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordSignUpField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordConfirmField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(buttonSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        authPanel.add(signUpPanel, "card3");

        buttonClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonClose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sydingto/images/btn_close.png"))); // NOI18N
        buttonClose.setToolTipText("Exit");
        buttonClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonCloseMouseClicked(evt);
            }
        });

        btnAbout.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAbout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sydingto/images/btn_about.png"))); // NOI18N
        btnAbout.setToolTipText("About");
        btnAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAbout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAboutMouseClicked(evt);
            }
        });

        buttonMinimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        buttonMinimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sydingto/images/btn_minimize.png"))); // NOI18N
        buttonMinimize.setToolTipText("Minimize");
        buttonMinimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonMinimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonMinimizeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout main_contentLayout = new javax.swing.GroupLayout(main_content);
        main_content.setLayout(main_contentLayout);
        main_contentLayout.setHorizontalGroup(
            main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_contentLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(authPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(main_contentLayout.createSequentialGroup()
                        .addGroup(main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signInSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signInTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(signUpSeparator, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(signUpTab, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, main_contentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAbout)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonMinimize)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonClose)
                .addGap(30, 30, 30))
            .addGroup(main_contentLayout.createSequentialGroup()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        main_contentLayout.setVerticalGroup(
            main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(main_contentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonClose)
                    .addComponent(btnAbout)
                    .addComponent(buttonMinimize))
                .addGap(58, 58, 58)
                .addComponent(logo)
                .addGap(41, 41, 41)
                .addGroup(main_contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(main_contentLayout.createSequentialGroup()
                        .addComponent(signInTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signInSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(main_contentLayout.createSequentialGroup()
                        .addComponent(signUpTab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(signUpSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(authPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
                .addContainerGap())
        );

        main_bg.add(main_content);
        main_content.setBounds(460, 0, 345, 600);

        getContentPane().add(main_bg);
        main_bg.setBounds(0, 0, 800, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usernameSignUpFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameSignUpFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usernameSignUpFieldActionPerformed

    private void signUpTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signUpTabMouseClicked
        authPanel.removeAll();
        authPanel.repaint();
        authPanel.revalidate();
        
        // add panel
        authPanel.add(signUpPanel);
        authPanel.repaint();
        authPanel.revalidate();
        
        // change button color
        signUpTab.setForeground(Colors.HEADING_COLOR);
        color = Colors.HEADING_COLOR;
        signUpSeparator.setBackground(Colors.GRAY4);
        signInTab.setForeground(Colors.GRAY3);
        signInSeparator.setBackground(Color.WHITE);
    }//GEN-LAST:event_signUpTabMouseClicked

    private void signInTabMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_signInTabMouseClicked
        authPanel.removeAll();
        authPanel.repaint();
        authPanel.revalidate();
        
        // add panel
        authPanel.add(signInPanel);
        authPanel.repaint();
        authPanel.revalidate();
        
        // change button color
        signInTab.setForeground(Colors.HEADING_COLOR);
        color = Colors.HEADING_COLOR;
        signInSeparator.setBackground(Colors.GRAY4);
        signUpTab.setForeground(Colors.GRAY3);
        signUpSeparator.setBackground(Color.WHITE);
    }//GEN-LAST:event_signInTabMouseClicked

    private void passwordConfirmFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordConfirmFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passwordConfirmFieldActionPerformed

    /**
     * Close the frame
     * @param evt 
     */
    private void buttonCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonCloseMouseClicked
        this.dispose();
    }//GEN-LAST:event_buttonCloseMouseClicked

    /**
     * Minimize the frame
     * @param evt 
     */
    private void buttonMinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonMinimizeMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_buttonMinimizeMouseClicked

    private void btnAboutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAboutMouseClicked
        AboutFrame about = new AboutFrame();
        about.setVisible(true);
    }//GEN-LAST:event_btnAboutMouseClicked

    private void buttonSignInMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignInMouseClicked
        String username = usernameField.getText();
        String password = Arrays.toString(passwordField.getPassword());
        
        if(!username.equals("") && !password.equals("")) {
            MainFrame mf = new MainFrame(username);
            mf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username and Password is required");
        }
    }//GEN-LAST:event_buttonSignInMouseClicked

    private void buttonSignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonSignUpMouseClicked
        String username = usernameSignUpField.getText();
        String password = Arrays.toString(passwordSignUpField.getPassword());
        String passwordConfirm = Arrays.toString(passwordConfirmField.getPassword());

        if(!password.equals(passwordConfirm)) {
            JOptionPane.showMessageDialog(this, "Password confirmation not same");
        }
        else if(!username.equals("") && !password.equals("") && !passwordConfirm.equals("")) {
            MainFrame mf = new MainFrame(username);
            mf.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username and Password is required");
        }
    }//GEN-LAST:event_buttonSignUpMouseClicked

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel authPanel;
    private javax.swing.JLabel btnAbout;
    private javax.swing.JLabel buttonClose;
    private javax.swing.JLabel buttonMinimize;
    private javax.swing.JLabel buttonSignIn;
    private javax.swing.JLabel buttonSignUp;
    private javax.swing.JLabel ilustration_login;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel main_bg;
    private javax.swing.JPanel main_content;
    private javax.swing.JPasswordField passwordConfirmField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JPasswordField passwordSignUpField;
    private javax.swing.JPanel signInPanel;
    private javax.swing.JSeparator signInSeparator;
    private javax.swing.JLabel signInTab;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JSeparator signUpSeparator;
    private javax.swing.JLabel signUpTab;
    private javax.swing.JTextField usernameField;
    private javax.swing.JTextField usernameSignUpField;
    // End of variables declaration//GEN-END:variables
}
