/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author fernando
 */
public class TelaInicial extends javax.swing.JFrame {

    /**
     * Crea
     * tes new form TelaInicial
     */
     public void drawCenteredString(Graphics g, String text, Rectangle rect, Font font) {
    // Get the FontMetrics
    FontMetrics metrics = g.getFontMetrics(font);
    // Determine the X coordinate for the text
    int x = rect.x + (rect.width - metrics.stringWidth(text)) / 2;
    // Determine the Y coordinate for the text (note we add the ascent, as in java 2d 0 is top of the screen)
    int y = rect.y + ((rect.height - metrics.getHeight()) / 2) + metrics.getAscent();
    // Set the font
    g.setFont(font);
    // Draw the String
    g.drawString(text, x, y);
    }
    public TelaInicial() {
        initComponents();
        this.setSize(1046,682 );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbtnImagem = new javax.swing.JButton();
        jtfNome = new javax.swing.JTextField();
        lblNomeAtr1 = new javax.swing.JLabel();
        lblNomeAtr = new javax.swing.JLabel();
        lblNomeAtr2 = new javax.swing.JLabel();
        lblNomeAtr3 = new javax.swing.JLabel();
        jlblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(240, 240, 2));
        setResizable(false);
        getContentPane().setLayout(null);

        jbtnImagem.setText("Imagem");
        jbtnImagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnImagemActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnImagem);
        jbtnImagem.setBounds(400, 590, 180, 50);

        jtfNome.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jtfNome.setText("Fernando Cesar dos Santos Conceicao");
        jtfNome.setBorder(null);
        jtfNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNomeActionPerformed(evt);
            }
        });
        getContentPane().add(jtfNome);
        jtfNome.setBounds(180, 110, 660, 40);

        lblNomeAtr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Nome_Rect.png"))); // NOI18N
        getContentPane().add(lblNomeAtr1);
        lblNomeAtr1.setBounds(150, 100, 780, 62);

        lblNomeAtr.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Nome.png"))); // NOI18N
        lblNomeAtr.setText("jLabel1");
        getContentPane().add(lblNomeAtr);
        lblNomeAtr.setBounds(50, 110, 90, 40);

        lblNomeAtr2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Nome_Rect.png"))); // NOI18N
        getContentPane().add(lblNomeAtr2);
        lblNomeAtr2.setBounds(150, 190, 780, 62);

        lblNomeAtr3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Nome.png"))); // NOI18N
        lblNomeAtr3.setText("jLabel1");
        getContentPane().add(lblNomeAtr3);
        lblNomeAtr3.setBounds(50, 200, 90, 40);

        jlblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Fundo.png"))); // NOI18N
        getContentPane().add(jlblBackground);
        jlblBackground.setBounds(0, 0, 1045, 684);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNomeActionPerformed

    private void jbtnImagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnImagemActionPerformed
        // EN - Definition of the rectangle where the Texts will me placed and centered
        // BR - Definimos aqui retangulo onde o texto sera centralizado futuramente
      
        // EN - Assignment of  the size of the image that will be rendered
        // BR - Definicao das medidas(largura e altura) da imagem a ser renderizada
       
    
        
        
             

       // int largura =   842;
      //  int altura =    595;
        int x_rect,y_rect,ys_rect,xs_rect;
        int largura =   1123;
        int altura =    794;
        x_rect= (int) (largura*0.115);
        y_rect=  (int)(altura*0.48);
        xs_rect= (int) (largura*0.78);
        ys_rect=(int)(altura*0.07);
        //  Rectangle nomeRect= new Rectangle(200,270,400,30);
          Rectangle nomeRect= new Rectangle(x_rect,y_rect,xs_rect,ys_rect);
        try{           
            // EN - buffImg is the Bufferedimage that will be printed in the future
            // BR - buffImg e o local onde sera criada uma imagem customizavel. usando as medidas definidas na
            //      largura e altura.
            BufferedImage buffImg= new BufferedImage(largura,altura,BufferedImage.TYPE_INT_ARGB);
         
            // creation of graphics on BuffImg
            Graphics2D g2d= buffImg.createGraphics();
            
            // Load images from the directory and store it 
            BufferedImage fundo = ImageIO.read(new File("imagens/Plano de fundo 1123x794.png"));
            //BufferedImage fundo = ImageIO.read(new File("imagens/Plano de fundo.png"));
            BufferedImage texto = ImageIO.read(new File("imagens/Texto certificado 1123x794.png"));
            
           // Store a font from windows font storage
            //Font font =new Font("Freestyle Script", Font.CENTER_BASELINE, 48);
            Font font =new Font("Freestyle Script", Font.CENTER_BASELINE, 53);
            
        
            //  Draw images onto g2d, though its not visible ( bcuz thats not our intention)
            g2d.drawImage(fundo, 0,0, null);
            g2d.drawImage(texto, 0,0, null);

           
        // Assingn the g2d`s font  and color of the subsequent String renders
            g2d.setFont(font);
            g2d.setColor(Color.BLACK);
            
         // Call of a function that uses the rectangle that we defined as an object that the text drawing will be centered into
            drawCenteredString(g2d,jtfNome.getText(),nomeRect,font);
          

             
            
            
            
        
          
 
            
           // g2d.setFont(font);
            //g2d.setColor(Color.BLACK);
            //g2d.drawString((jtfNome.getText()),400,250);
            g2d.dispose();
            
            //File Saving
            
            File file = new File((jtfNome.getText())+".png");
            ImageIO.write(buffImg,"png", file);
            Desktop.getDesktop().open(file);
            
        }  catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_jbtnImagemActionPerformed

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
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaInicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbtnImagem;
    private javax.swing.JLabel jlblBackground;
    private javax.swing.JTextField jtfNome;
    private javax.swing.JLabel lblNomeAtr;
    private javax.swing.JLabel lblNomeAtr1;
    private javax.swing.JLabel lblNomeAtr2;
    private javax.swing.JLabel lblNomeAtr3;
    // End of variables declaration//GEN-END:variables
}
