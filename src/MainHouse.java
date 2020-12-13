
import Command.*;
import Decorator.*;
import Facade.*;
import Strategic.FishFirework;
import Strategic.CrownFirework;
import Strategic.Fly;
import Strategic.Trail;
import Strategic.CrackleFirework;
import Strategic.Sparkle;
import jaco.mp3.player.MP3Player;
import java.io.File;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
public class MainHouse extends javax.swing.JFrame {
public static final String SONG = "src\\song.mpeg";
    MP3Player mp3player = new MP3Player(new File(SONG));
    /**
     * Creates new form MainHouse
     */
    public MainHouse() {
        

        initComponents();
        
        //set the customization to false
        Crackle.setVisible(false);
        Crackle1.setVisible(false); 
        Crackle2.setVisible(false);
        
         Crown.setVisible(false);
        Crown1.setVisible(false); 
        Crown2.setVisible(false);
        
        Fish.setVisible(false);
        Fish1.setVisible(false); 
        Fish2.setVisible(false);
        
        
        KetupatPalas.setVisible(false);
        KetupatPalas1.setVisible(false);
        ketupatbawang.setVisible(false);
        ketupatbawang1.setVisible(false);
        
        lightray.setVisible(false);
        
        NormalPelita.setVisible(false);
        BambooPelita.setVisible(false);
        
    }

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FireButton = new javax.swing.JButton();
        Crackle = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        Crackle1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Crackle2 = new javax.swing.JLabel();
        Crown = new javax.swing.JLabel();
        Crown1 = new javax.swing.JLabel();
        Crown2 = new javax.swing.JLabel();
        Fish = new javax.swing.JLabel();
        Fish1 = new javax.swing.JLabel();
        Fish2 = new javax.swing.JLabel();
        ketupatbawang = new javax.swing.JLabel();
        ketupatbawang1 = new javax.swing.JLabel();
        KetupatPalas = new javax.swing.JLabel();
        KetupatPalas1 = new javax.swing.JLabel();
        KetupatChoose = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        turnonlight = new javax.swing.JButton();
        turnofflight = new javax.swing.JButton();
        lightray = new javax.swing.JLabel();
        BambooPelita = new javax.swing.JLabel();
        NormalPelita = new javax.swing.JLabel();
        backgroundimage = new javax.swing.JLabel();
        ChoosePelita = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Pelitaoil = new javax.swing.JComboBox<>();
        TurnOnAll = new javax.swing.JButton();
        TurnOffAll = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FireButton.setText("Fire");
        FireButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FireButtonActionPerformed(evt);
            }
        });
        getContentPane().add(FireButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, -1));

        Crackle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crackle.png"))); // NOI18N
        getContentPane().add(Crackle, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 60, 60));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Crown", "Crackle", "Fish", "All", "None", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, -1, -1));

        Crackle1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crackle.png"))); // NOI18N
        getContentPane().add(Crackle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 60, 70));

        jLabel3.setText("Choose Firework");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 110, -1));

        Crackle2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crackle.png"))); // NOI18N
        getContentPane().add(Crackle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 60, 60));

        Crown.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crown.png"))); // NOI18N
        getContentPane().add(Crown, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 70, 70));

        Crown1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crown.png"))); // NOI18N
        getContentPane().add(Crown1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 70, 70));

        Crown2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/crown.png"))); // NOI18N
        getContentPane().add(Crown2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 60, 80));

        Fish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fish.png"))); // NOI18N
        getContentPane().add(Fish, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 70, 70));

        Fish1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fish.png"))); // NOI18N
        getContentPane().add(Fish1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 70, 60));

        Fish2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/fish.png"))); // NOI18N
        getContentPane().add(Fish2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 70, 80));
        getContentPane().add(ketupatbawang, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 30, 30));
        getContentPane().add(ketupatbawang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 30, 30));

        KetupatPalas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/palas.png"))); // NOI18N
        getContentPane().add(KetupatPalas, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, -1, -1));

        KetupatPalas1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/palas.png"))); // NOI18N
        getContentPane().add(KetupatPalas1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        KetupatChoose.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ketupat Palas", "Ketupat Bawang", "All", "None" }));
        KetupatChoose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KetupatChooseActionPerformed(evt);
            }
        });
        getContentPane().add(KetupatChoose, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, -1, -1));

        jLabel2.setText("Choose Ketupat");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, -1, -1));

        turnonlight.setText("Turn On Light");
        turnonlight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnonlightActionPerformed(evt);
            }
        });
        getContentPane().add(turnonlight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 270, -1, -1));

        turnofflight.setText("Turn Off Light");
        turnofflight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turnofflightActionPerformed(evt);
            }
        });
        getContentPane().add(turnofflight, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 310, -1, -1));

        lightray.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/ray.png"))); // NOI18N
        lightray.setText("jLabel1");
        getContentPane().add(lightray, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 210, 130));

        BambooPelita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pelita.png"))); // NOI18N
        BambooPelita.setText("jLabel1");
        getContentPane().add(BambooPelita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 190, 100));

        NormalPelita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/pelitabiasa.jpg"))); // NOI18N
        NormalPelita.setText("jLabel1");
        getContentPane().add(NormalPelita, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 220));

        backgroundimage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/hariraya.jpg"))); // NOI18N
        backgroundimage.setText("jLabel1");
        getContentPane().add(backgroundimage, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));

        ChoosePelita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal Pelita", "Bamboo Pelita/Panjut", "None", "All" }));
        ChoosePelita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoosePelitaActionPerformed(evt);
            }
        });
        getContentPane().add(ChoosePelita, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 100, -1));

        jLabel1.setText("Choose Pelita");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, -1));

        jLabel4.setText("Choose Pelita Oil");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 360, -1, -1));

        Pelitaoil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Kerosene", "Palm Oil" }));
        Pelitaoil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PelitaoilActionPerformed(evt);
            }
        });
        getContentPane().add(Pelitaoil, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 360, -1, -1));

        TurnOnAll.setText("Turn All Firework,Ketupat and Pelita On");
        TurnOnAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnOnAllActionPerformed(evt);
            }
        });
        getContentPane().add(TurnOnAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, -1, 20));

        TurnOffAll.setText("Turn All Firework,Ketupat and Pelita Off");
        TurnOffAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TurnOffAllActionPerformed(evt);
            }
        });
        getContentPane().add(TurnOffAll, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 480, -1, 20));

        jLabel5.setText("Play Music");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, -1, -1));

        jButton2.setText("Play");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, -1, -1));

        jButton3.setText("Pause");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, -1, -1));

        jButton4.setText("Stop");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 410, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void FireButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FireButtonActionPerformed
        // TODO add your handling code here:
              String selectedfirework=jComboBox1.getSelectedItem().toString();
        
        if(selectedfirework.equals("Crackle")){
            CrackleFirework crackle=new CrackleFirework();
            crackle.setBehavior(new Fly());
            crackle.performFire();
            JOptionPane.showMessageDialog(null, crackle.performFire());
            
            crackle.setBehavior(new Sparkle());
            crackle.performFire();
            JOptionPane.showMessageDialog(null, crackle.performFire());
            
            Crackle.setVisible(true);
            Crackle1.setVisible(true); 
            Crackle2.setVisible(true);
              
         Crown.setVisible(false);
        Crown1.setVisible(false); 
        Crown2.setVisible(false);
        
        Fish.setVisible(false);
        Fish1.setVisible(false); 
        Fish2.setVisible(false);
            
        } else if(selectedfirework.equals("Fish")){
            Fish.setVisible(true);
            Fish1.setVisible(true); 
            Fish2.setVisible(true);
            
            
            FishFirework fish=new FishFirework();
            fish.setBehavior(new Fly());
            fish.performFire();
            JOptionPane.showMessageDialog(null, fish.performFire());
            fish.setBehavior(new Sparkle());
            fish.performFire();
            JOptionPane.showMessageDialog(null, fish.performFire());
            fish.setBehavior(new Trail());
            fish.performFire();
            JOptionPane.showMessageDialog(null, fish.performFire());
            
             
            
            
             Crackle.setVisible(false);
        Crackle1.setVisible(false); 
        Crackle2.setVisible(false);
        
         Crown.setVisible(false);
        Crown1.setVisible(false); 
        Crown2.setVisible(false);
        
  
            
        } else if(selectedfirework.equals("Crown")){
            CrownFirework crown=new CrownFirework();
            crown.setBehavior(new Fly());
            crown.performFire();
            JOptionPane.showMessageDialog(null, crown.performFire());
            crown.setBehavior(new Sparkle());
            crown.performFire();
            JOptionPane.showMessageDialog(null, crown.performFire());
            
            Crown.setVisible(true);
            Crown1.setVisible(true); 
            Crown2.setVisible(true);
            
             Crackle.setVisible(false);
        Crackle1.setVisible(false); 
        Crackle2.setVisible(false);
       
        
        Fish.setVisible(false);
        Fish1.setVisible(false); 
        Fish2.setVisible(false);
            
            
        } else if(selectedfirework.equals("All")) {
            String all;
            
            CrownFirework crown=new CrownFirework();
            crown.setBehavior(new Fly());
            crown.performFire();
            crown.setBehavior(new Sparkle());
            crown.performFire();
            
             FishFirework fish=new FishFirework();
            fish.setBehavior(new Fly());
            fish.performFire();
            fish.setBehavior(new Sparkle());
            fish.performFire();
            fish.setBehavior(new Trail());
            fish.performFire();
            
            
            
             CrackleFirework crackle=new CrackleFirework();
            crackle.setBehavior(new Fly());
            crackle.performFire();
            crackle.setBehavior(new Sparkle());
            crackle.performFire();
            
            
            JOptionPane.showMessageDialog(null, "Firewall fly, sparkle and leaves a trail");
            
            Crown.setVisible(true);
            Crown1.setVisible(true); 
            Crown2.setVisible(true);
            Fish.setVisible(true);
            Fish1.setVisible(true); 
            Fish2.setVisible(true);
             Crackle.setVisible(true);
            Crackle1.setVisible(true); 
            Crackle2.setVisible(true);
        } else if(selectedfirework.equals("None")) {
               Crackle.setVisible(false);
        Crackle1.setVisible(false); 
        Crackle2.setVisible(false);
        
         Crown.setVisible(false);
        Crown1.setVisible(false); 
        Crown2.setVisible(false);
        
        Fish.setVisible(false);
        Fish1.setVisible(false); 
        Fish2.setVisible(false);
        }
            
    }//GEN-LAST:event_FireButtonActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void KetupatChooseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KetupatChooseActionPerformed
        // TODO add your handling code here:
        
        
        String selectedketupat=KetupatChoose.getSelectedItem().toString();
        
        
        KetupatFactory factory=new KetupatFactory();
        KetupatStore store=new KetupatStore(factory);
        
        
        if(selectedketupat.equals("Ketupat Palas")){
                KetupatPalas.setVisible(true);
                KetupatPalas1.setVisible(true);
                ketupatbawang.setVisible(false);
                ketupatbawang1.setVisible(false);
                
                Ketupat ketupat=store.addKetupat(selectedketupat);
                JOptionPane.showMessageDialog(null, ketupat);
            
        } else if(selectedketupat.equals("Ketupat Bawang")) {
            ketupatbawang.setVisible(true);
                ketupatbawang1.setVisible(true);
                KetupatPalas.setVisible(false);
                KetupatPalas1.setVisible(false);
                
                Ketupat ketupat=store.addKetupat(selectedketupat);
                JOptionPane.showMessageDialog(null, ketupat);
            
        } else if(selectedketupat.equals("None")){
                 KetupatPalas.setVisible(false);
                KetupatPalas1.setVisible(false);
                ketupatbawang.setVisible(false);
                ketupatbawang1.setVisible(false);
        } else if(selectedketupat.equals("All")){
                 KetupatPalas.setVisible(true);
                KetupatPalas1.setVisible(true);
                ketupatbawang.setVisible(true);
                ketupatbawang1.setVisible(true);
                
            }
        
       
       
        
        
        
        
        
        
    }//GEN-LAST:event_KetupatChooseActionPerformed

    private void turnofflightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnofflightActionPerformed
        // TODO add your handling code here:
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light(lightray);
        LightOffCommand lightoff=new LightOffCommand(light);
        
        remote.setCommand(lightoff);
        remote.buttonWasPressed();
    }//GEN-LAST:event_turnofflightActionPerformed

    private void turnonlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_turnonlightActionPerformed
        // TODO add your handling code here:
        
        SimpleRemoteControl remote=new SimpleRemoteControl();
        Light light=new Light(lightray);
        LightOnCommand lighton=new LightOnCommand(light);
        
        remote.setCommand(lighton);
        remote.buttonWasPressed();
        
        
        
    }//GEN-LAST:event_turnonlightActionPerformed

    private void ChoosePelitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoosePelitaActionPerformed
        // TODO add your handling code here:
         String selectedpelita=ChoosePelita.getSelectedItem().toString();
         
         PelitaType normalpelita=new NormalPelita();
         PelitaType bamboopelita=new BambooPelita();
         
         
         if(selectedpelita.equals("Normal Pelita")){
             normalpelita.draw();
             NormalPelita.setVisible(true);
             BambooPelita.setVisible(false);
             
         } else if (selectedpelita.equals("Bamboo Pelita/Panjut")){
             bamboopelita.draw();
             NormalPelita.setVisible(false);
        BambooPelita.setVisible(true);
             
         } else if (selectedpelita.equals("None")){
             NormalPelita.setVisible(false);
        BambooPelita.setVisible(false);
             
         } else if (selectedpelita.equals("All")){
             JOptionPane.showMessageDialog(null, "All selected");
             NormalPelita.setVisible(true);
        BambooPelita.setVisible(true);
         }
        
        
    }//GEN-LAST:event_ChoosePelitaActionPerformed

    private void PelitaoilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PelitaoilActionPerformed
        // TODO add your handling code here: String selectedpelita=Ketupat.getSelectedItem().toString();
        String selectedpelita=ChoosePelita.getSelectedItem().toString(); 
        String selectedoil=Pelitaoil.getSelectedItem().toString();
          
         PelitaType normalpelitakerosene=new KeroseneOilDecorator(new NormalPelita());
         PelitaType bamboopelitakerosene=new KeroseneOilDecorator(new BambooPelita());
         PelitaType normalpelitaPalmoil=new PalmOilDecorator(new NormalPelita());
         PelitaType bamboopelitaPalmoil=new PalmOilDecorator(new BambooPelita());
         
         
         if(selectedpelita.equals("Normal Pelita") && selectedoil.equals("Kerosene") ){
             normalpelitakerosene.draw();
             NormalPelita.setVisible(true);
        BambooPelita.setVisible(false);
             
         } else if(selectedpelita.equals("Normal Pelita") && selectedoil.equals("Palm Oil") ){
             normalpelitaPalmoil.draw();
             NormalPelita.setVisible(true);
        BambooPelita.setVisible(false);
         }  else if(selectedpelita.equals("Bamboo Pelita/Panjut") && selectedoil.equals("Kerosene") ){
             bamboopelitakerosene.draw();
             NormalPelita.setVisible(false);
        BambooPelita.setVisible(true);
             
         } else if(selectedpelita.equals("Bamboo Pelita/Panjut") && selectedoil.equals("Palm Oil") ){
             bamboopelitaPalmoil.draw();
             NormalPelita.setVisible(false);
        BambooPelita.setVisible(true);
         } 
        
    }//GEN-LAST:event_PelitaoilActionPerformed

    private void TurnOnAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnOnAllActionPerformed
        // TODO add your handling code here:
        Firework firework=new Firework(Crackle,Crackle1,Crackle2,Crown,Crown1,Crown2,Fish,Fish1,Fish2);
        KetupatFacade ketupat=new KetupatFacade(KetupatPalas,KetupatPalas1,ketupatbawang1,ketupatbawang);
        LightOn lighton=new LightOn(lightray);
        Pelita pelita=new Pelita(NormalPelita,BambooPelita);
        
        EveryThingOn everything=new EveryThingOn();
        
        
       everything.setFirework(firework);
       everything.setKetupat(ketupat);
       everything.setLightOn(lighton);
       everything.setPelita(pelita);
       everything.drawFirework();
       everything.drawKetupat();
       everything.drawLightOn();
       everything.drawPelita();
       
       
    }//GEN-LAST:event_TurnOnAllActionPerformed

    private void TurnOffAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TurnOffAllActionPerformed
        // TODO add your handling code here:
          Firework firework=new Firework(Crackle,Crackle1,Crackle2,Crown,Crown1,Crown2,Fish,Fish1,Fish2);
        KetupatFacade ketupat=new KetupatFacade(KetupatPalas,KetupatPalas1,ketupatbawang1,ketupatbawang);
        LightOn lighton=new LightOn(lightray);
        Pelita pelita=new Pelita(NormalPelita,BambooPelita);
        
        EveryThingOn everything=new EveryThingOn();
        
        
       everything.setFirework(firework);
       everything.setKetupat(ketupat);
       everything.setLightOn(lighton);
       everything.setPelita(pelita);
       everything.undrawFirework();
       everything.undrawKetupat();
       everything.undrawLightOn();
       everything.undrawPelita();
        
        
    }//GEN-LAST:event_TurnOffAllActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        mp3player.play();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        mp3player.pause();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
         mp3player.stop();
    }//GEN-LAST:event_jButton4ActionPerformed
                        
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
            java.util.logging.Logger.getLogger(MainHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainHouse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new MainHouse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BambooPelita;
    private javax.swing.JComboBox<String> ChoosePelita;
    private javax.swing.JLabel Crackle;
    private javax.swing.JLabel Crackle1;
    private javax.swing.JLabel Crackle2;
    private javax.swing.JLabel Crown;
    private javax.swing.JLabel Crown1;
    private javax.swing.JLabel Crown2;
    private javax.swing.JButton FireButton;
    private javax.swing.JLabel Fish;
    private javax.swing.JLabel Fish1;
    private javax.swing.JLabel Fish2;
    private javax.swing.JComboBox<String> KetupatChoose;
    private javax.swing.JLabel KetupatPalas;
    private javax.swing.JLabel KetupatPalas1;
    private javax.swing.JLabel NormalPelita;
    private javax.swing.JComboBox<String> Pelitaoil;
    private javax.swing.JButton TurnOffAll;
    private javax.swing.JButton TurnOnAll;
    private javax.swing.JLabel backgroundimage;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel ketupatbawang;
    private javax.swing.JLabel ketupatbawang1;
    private javax.swing.JLabel lightray;
    private javax.swing.JButton turnofflight;
    private javax.swing.JButton turnonlight;
    // End of variables declaration//GEN-END:variables
}
