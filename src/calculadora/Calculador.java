package calculadora;

/**
 *
 * @author Ing.Jon
 */
public class Calculador extends javax.swing.JFrame {
    int iguala,operacion, resultado, igualando;
    Double resul;
    String valor, memoria="";

    public Calculador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pantalla = new javax.swing.JTextField();
        bMultiplicacion = new javax.swing.JButton();
        bNueve = new javax.swing.JButton();
        bOcho = new javax.swing.JButton();
        bDivision = new javax.swing.JButton();
        bSeis = new javax.swing.JButton();
        bCinco = new javax.swing.JButton();
        bSiete = new javax.swing.JButton();
        bCero = new javax.swing.JButton();
        bPunto = new javax.swing.JButton();
        bIgual = new javax.swing.JButton();
        bSuma = new javax.swing.JButton();
        bDos = new javax.swing.JButton();
        bTres = new javax.swing.JButton();
        bResta = new javax.swing.JButton();
        bUno = new javax.swing.JButton();
        bCuatro = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pantalla.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        pantalla.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        bMultiplicacion.setText("*");
        bMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bMultiplicacionActionPerformed(evt);
            }
        });

        bNueve.setText("9");
        bNueve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bNueveActionPerformed(evt);
            }
        });

        bOcho.setText("8");
        bOcho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bOchoActionPerformed(evt);
            }
        });

        bDivision.setText("/");
        bDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDivisionActionPerformed(evt);
            }
        });

        bSeis.setText("6");
        bSeis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSeisActionPerformed(evt);
            }
        });

        bCinco.setText("5");
        bCinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCincoActionPerformed(evt);
            }
        });

        bSiete.setText("7");
        bSiete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSieteActionPerformed(evt);
            }
        });

        bCero.setText("0");
        bCero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCeroActionPerformed(evt);
            }
        });

        bPunto.setText(".");
        bPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPuntoActionPerformed(evt);
            }
        });

        bIgual.setText("=");
        bIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIgualActionPerformed(evt);
            }
        });

        bSuma.setText("+");
        bSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSumaActionPerformed(evt);
            }
        });

        bDos.setText("2");
        bDos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bDosActionPerformed(evt);
            }
        });

        bTres.setText("3");
        bTres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bTresActionPerformed(evt);
            }
        });

        bResta.setText("-");
        bResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRestaActionPerformed(evt);
            }
        });

        bUno.setText("1");
        bUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bUnoActionPerformed(evt);
            }
        });

        bCuatro.setText("4");
        bCuatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCuatroActionPerformed(evt);
            }
        });

        bBorrar.setText("C");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pantalla)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(bCero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(bOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pantalla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bSiete, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bNueve, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bOcho, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(bResta, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCuatro, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bCinco, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bSeis, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bUno, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bDos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bTres, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCero, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCeroActionPerformed
        valor = "0";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bCeroActionPerformed

    private void bUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bUnoActionPerformed
        valor = "1";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bUnoActionPerformed

    private void bDosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDosActionPerformed
        valor = "2";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bDosActionPerformed

    private void bTresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bTresActionPerformed
        valor = "3";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bTresActionPerformed

    private void bCuatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCuatroActionPerformed
        valor = "4";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bCuatroActionPerformed

    private void bCincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCincoActionPerformed
        valor = "5";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bCincoActionPerformed

    private void bSeisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSeisActionPerformed
        valor = "6";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bSeisActionPerformed

    private void bSieteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSieteActionPerformed
        valor = "7";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bSieteActionPerformed

    private void bOchoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bOchoActionPerformed
        valor = "8";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bOchoActionPerformed

    private void bNueveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bNueveActionPerformed
        valor = "9";
        cuandoMemoria(this.pantalla.getText(),valor,operacion);
    }//GEN-LAST:event_bNueveActionPerformed

    private void cuandoMemoria(String num,String num2,int num3){
        if((num3)!=(0)){
            this.pantalla.setText("");
            cuandoNumero(this.pantalla.getText(),num2);
            operacion=0;
        }
        else{
            cuandoNumero(num,num2);
        }
    }
    private void cuandoNumero(String numero, String numero2){
        if(("").equals(numero)||("0").equals(numero)){
            if(("0").equals(numero2)){
            this.pantalla.setText("0");
            }
            else{
            this.pantalla.setText(numero2);
            }
            if((numero).contains(".")){
                this.pantalla.setText("0"+numero);
            }
            else{
                if((numero)!=("")){

    //                this.pantalla.setText("0.");
                    this.pantalla.setText(numero+numero2);
                }
                else{
    //                this.pantalla.setText(numero+numero2);
                    this.pantalla.setText("0.");
                }
            }
        }
        else{
        this.pantalla.setText(numero+numero2);            
        }
    }
    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        operacion = 0;
        resul=0.0;
        this.pantalla.setText("");
        memoria="";
    }//GEN-LAST:event_bBorrarActionPerformed

    private void bPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPuntoActionPerformed
        valor =".";
        cuandoNumero(this.pantalla.getText(),valor);
    }//GEN-LAST:event_bPuntoActionPerformed
        
    private void bSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSumaActionPerformed
        operacion=1;
        queOperacion(operacion);
    }//GEN-LAST:event_bSumaActionPerformed

    private void bRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRestaActionPerformed
        operacion=2;
        queOperacion(operacion);
    }//GEN-LAST:event_bRestaActionPerformed

    private void bMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bMultiplicacionActionPerformed
        operacion=3;
        queOperacion(operacion);
    }//GEN-LAST:event_bMultiplicacionActionPerformed

    private void bDivisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bDivisionActionPerformed
        operacion=4;
        queOperacion(operacion);
    }//GEN-LAST:event_bDivisionActionPerformed
    
    private void queOperacion(int oper){
        switch(oper){
            case 1:
                if(("").equals(memoria)){
                memoria=this.pantalla.getText();
                resultado=1;
                }
                else{
                    if(iguala==1){
                        resultaSumando();
                        memoria="";
                    }
                    else{
                        resultaSumando();
                    }
//                    resultaSumando();
                }
                break;
            case 2:
                if(("").equals(memoria)){
                memoria=this.pantalla.getText();
                resultado=2;
                }
                else{
                    if(iguala==1){
                        resultaRestando();
                        memoria="";
                    }
                    else{
                        resultaRestando();
                    }
//                    resultaRestando();
                }
                break;
            case 3:
                if(("").equals(memoria)){
                memoria=this.pantalla.getText();
                resultado=3;
                }
                else{
                    if(iguala==1){
                        resultaMultiplicando();
                        memoria="";
                    }
                    else{
                        resultaMultiplicando();
                    }
//                    resultaMultiplicando();
                }
                break;
            case 4:
                if(("").equals(memoria)){
                memoria=this.pantalla.getText();
                resultado=4;
                }
                else{
                    if(iguala==1){
                        resultaDividiendo();
                        memoria="";
                    }
                    else{
                        resultaDividiendo();
                    }
//                    resultaDividiendo();
                }
                break;
            default:
                switch (resultado){
                    case 1:
                        resultaSumando();
                        memoria="";
                        break;
                    case 2:
                        resultaRestando();
                        memoria="";
                        break;
                    case 3:
                        resultaMultiplicando();
                        memoria="";
                        break;
                    case 4:
                        resultaDividiendo();
                        memoria="";
                        break;
                }
        }
    }
    private void resultaSumando(){
        resul=Double.parseDouble(memoria) + Double.parseDouble(this.pantalla.getText());
        this.pantalla.setText(String.valueOf(resul));
        memoria=String.valueOf(resul);
        
    }
    private void resultaRestando(){
        resul=Double.parseDouble(memoria) - Double.parseDouble(this.pantalla.getText());
        this.pantalla.setText(String.valueOf(resul));
        memoria=String.valueOf(resul);
    }
    private void resultaMultiplicando(){
        resul=Double.parseDouble(memoria) * Double.parseDouble(this.pantalla.getText());
        this.pantalla.setText(String.valueOf(resul));
        memoria=String.valueOf(resul);
    }
    private void resultaDividiendo(){
        resul=Double.parseDouble(memoria) / Double.parseDouble(this.pantalla.getText());
        this.pantalla.setText(String.valueOf(resul));
        memoria=String.valueOf(resul);
    }
    private void bIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIgualActionPerformed
       igualando=1;
       queOperacion(operacion);
    }//GEN-LAST:event_bIgualActionPerformed

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
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton bCero;
    private javax.swing.JButton bCinco;
    private javax.swing.JButton bCuatro;
    private javax.swing.JButton bDivision;
    private javax.swing.JButton bDos;
    private javax.swing.JButton bIgual;
    private javax.swing.JButton bMultiplicacion;
    private javax.swing.JButton bNueve;
    private javax.swing.JButton bOcho;
    private javax.swing.JButton bPunto;
    private javax.swing.JButton bResta;
    private javax.swing.JButton bSeis;
    private javax.swing.JButton bSiete;
    private javax.swing.JButton bSuma;
    private javax.swing.JButton bTres;
    private javax.swing.JButton bUno;
    private javax.swing.JTextField pantalla;
    // End of variables declaration//GEN-END:variables
}
