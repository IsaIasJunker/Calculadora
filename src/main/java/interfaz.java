
import java.awt.Image;
import java.awt.Toolkit;

//Scripts importados para utilizar el motor de java 
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;  

/**
 * Clase donde está el diseño de la intefaz y los modulos para realizar las operaciones correspondientes.
 * @author Isaías Junker
 * @version 2.0
 */
public final class interfaz extends javax.swing.JFrame {
    
    ScriptEngineManager sem = new ScriptEngineManager();
    ScriptEngine se = sem.getEngineByName("JavaScript"); //Importo el motor de JavaScript
    
    /**
     * Constructor donde se llama a un modulo para mostrar un icono seleccionado al momento de ejecutar el programa.
     * @see getIconImage()
     */
    public interfaz() {
        initComponents();
        //Linea de código para colocar el icono personalizado, en el marco de la venta y en la barra de tareas 
        setIconImage(getIconImage());
    }
    
    /**
     * Metodo para colocar un icono personalizado.
     * @return Retorna la imagen que indicamos en la dirección del proyecto. 
     */
    @Override
    public Image getIconImage(){
        //Utilizo una libreria , cargo una clase y le paso la dirección del paquete donde están las imagenes guardadas 
        //En el paquete donde está el icono también están los iconos para los botones 
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("images/icono.png"));
        return retValue;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txt_operacion = new javax.swing.JLabel();
        txt_resultado = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btn_multi = new javax.swing.JButton();
        btn_borrarPantalla = new javax.swing.JButton();
        btn_borrar_un_elemento = new javax.swing.JButton();
        btn_div = new javax.swing.JButton();
        btn_7 = new javax.swing.JButton();
        btn_8 = new javax.swing.JButton();
        btn_9 = new javax.swing.JButton();
        btn_resta = new javax.swing.JButton();
        btn_4 = new javax.swing.JButton();
        btn_5 = new javax.swing.JButton();
        btn_6 = new javax.swing.JButton();
        btn_suma = new javax.swing.JButton();
        btn_1 = new javax.swing.JButton();
        btn_2 = new javax.swing.JButton();
        btn_3 = new javax.swing.JButton();
        btn_igual = new javax.swing.JButton();
        btn_0 = new javax.swing.JButton();
        btn_punto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(23, 24, 26));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_operacion.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        txt_operacion.setForeground(new java.awt.Color(255, 255, 255));
        txt_operacion.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        txt_operacion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(txt_operacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 310, 80));

        txt_resultado.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        txt_resultado.setForeground(new java.awt.Color(255, 255, 255));
        txt_resultado.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(txt_resultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 300, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 210));

        jPanel2.setBackground(new java.awt.Color(23, 24, 26));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_multi.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_multi.setForeground(new java.awt.Color(255, 255, 255));
        btn_multi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_multi.setText("x");
        btn_multi.setBorder(null);
        btn_multi.setBorderPainted(false);
        btn_multi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_multi.setFocusPainted(false);
        btn_multi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_multi.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_press.png"))); // NOI18N
        btn_multi.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_multi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_multiActionPerformed(evt);
            }
        });
        jPanel2.add(btn_multi, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 60, 65, 65));

        btn_borrarPantalla.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_borrarPantalla.setForeground(new java.awt.Color(246, 68, 78));
        btn_borrarPantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_clear_normal.png"))); // NOI18N
        btn_borrarPantalla.setText("C");
        btn_borrarPantalla.setBorder(null);
        btn_borrarPantalla.setBorderPainted(false);
        btn_borrarPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrarPantalla.setFocusPainted(false);
        btn_borrarPantalla.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrarPantalla.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_clear_press.png"))); // NOI18N
        btn_borrarPantalla.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_clear_normal.png"))); // NOI18N
        btn_borrarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarPantallaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrarPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 60, 60));

        btn_borrar_un_elemento.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_borrar_un_elemento.setForeground(new java.awt.Color(255, 255, 255));
        btn_borrar_un_elemento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_borrar_un_elemento.setText("<--");
        btn_borrar_un_elemento.setBorder(null);
        btn_borrar_un_elemento.setBorderPainted(false);
        btn_borrar_un_elemento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_borrar_un_elemento.setFocusPainted(false);
        btn_borrar_un_elemento.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_borrar_un_elemento.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_press.png"))); // NOI18N
        btn_borrar_un_elemento.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_borrar_un_elemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrar_un_elementoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_borrar_un_elemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 65, 65));

        btn_div.setFont(new java.awt.Font("Roboto", 1, 24)); // NOI18N
        btn_div.setForeground(new java.awt.Color(255, 255, 255));
        btn_div.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_div.setText("÷");
        btn_div.setBorder(null);
        btn_div.setBorderPainted(false);
        btn_div.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_div.setFocusPainted(false);
        btn_div.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_div.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_press.png"))); // NOI18N
        btn_div.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_divActionPerformed(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 65, 65));

        btn_7.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_7.setForeground(new java.awt.Color(255, 255, 255));
        btn_7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_7.setText("7");
        btn_7.setBorder(null);
        btn_7.setBorderPainted(false);
        btn_7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_7.setFocusPainted(false);
        btn_7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_7.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_7.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 65, 65));

        btn_8.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_8.setForeground(new java.awt.Color(255, 255, 255));
        btn_8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_8.setText("8");
        btn_8.setBorder(null);
        btn_8.setBorderPainted(false);
        btn_8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_8.setFocusPainted(false);
        btn_8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_8.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 65, 65));

        btn_9.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_9.setForeground(new java.awt.Color(255, 255, 255));
        btn_9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_9.setText("9");
        btn_9.setBorder(null);
        btn_9.setBorderPainted(false);
        btn_9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_9.setFocusPainted(false);
        btn_9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_9.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 130, 65, 65));

        btn_resta.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_resta.setForeground(new java.awt.Color(255, 255, 255));
        btn_resta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_resta.setText("-");
        btn_resta.setBorder(null);
        btn_resta.setBorderPainted(false);
        btn_resta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_resta.setFocusPainted(false);
        btn_resta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_resta.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_press.png"))); // NOI18N
        btn_resta.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_resta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_restaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_resta, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 65, 65));

        btn_4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_4.setForeground(new java.awt.Color(255, 255, 255));
        btn_4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_4.setText("4");
        btn_4.setBorder(null);
        btn_4.setBorderPainted(false);
        btn_4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_4.setFocusPainted(false);
        btn_4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 65, 65));

        btn_5.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_5.setForeground(new java.awt.Color(255, 255, 255));
        btn_5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_5.setText("5");
        btn_5.setBorder(null);
        btn_5.setBorderPainted(false);
        btn_5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_5.setFocusPainted(false);
        btn_5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 65, 65));

        btn_6.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_6.setForeground(new java.awt.Color(255, 255, 255));
        btn_6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_6.setText("6");
        btn_6.setBorder(null);
        btn_6.setBorderPainted(false);
        btn_6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_6.setFocusPainted(false);
        btn_6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_6.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 65, 65));

        btn_suma.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_suma.setForeground(new java.awt.Color(255, 255, 255));
        btn_suma.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_suma.setText("+");
        btn_suma.setBorder(null);
        btn_suma.setBorderPainted(false);
        btn_suma.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suma.setFocusPainted(false);
        btn_suma.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_suma.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_press.png"))); // NOI18N
        btn_suma.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_operacion_normal.png"))); // NOI18N
        btn_suma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sumaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_suma, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 65, 65));

        btn_1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_1.setForeground(new java.awt.Color(255, 255, 255));
        btn_1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_1.setText("1");
        btn_1.setBorder(null);
        btn_1.setBorderPainted(false);
        btn_1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 65, 65));

        btn_2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_2.setForeground(new java.awt.Color(255, 255, 255));
        btn_2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_2.setText("2");
        btn_2.setBorder(null);
        btn_2.setBorderPainted(false);
        btn_2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_2.setFocusPainted(false);
        btn_2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 65, 65));

        btn_3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_3.setForeground(new java.awt.Color(255, 255, 255));
        btn_3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_3.setText("3");
        btn_3.setBorder(null);
        btn_3.setBorderPainted(false);
        btn_3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_3.setFocusPainted(false);
        btn_3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 65, 65));

        btn_igual.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_igual.setForeground(new java.awt.Color(255, 255, 255));
        btn_igual.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_equal_normal.png"))); // NOI18N
        btn_igual.setText("=");
        btn_igual.setBorder(null);
        btn_igual.setBorderPainted(false);
        btn_igual.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_igual.setFocusPainted(false);
        btn_igual.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_igual.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_equal_press.png"))); // NOI18N
        btn_igual.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_equal_normal.png"))); // NOI18N
        btn_igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_igualActionPerformed(evt);
            }
        });
        jPanel2.add(btn_igual, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, 65, 130));

        btn_0.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_0.setForeground(new java.awt.Color(255, 255, 255));
        btn_0.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_cero_normal.png"))); // NOI18N
        btn_0.setText("0");
        btn_0.setBorder(null);
        btn_0.setBorderPainted(false);
        btn_0.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_0.setFocusPainted(false);
        btn_0.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_0.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_cero_press.png"))); // NOI18N
        btn_0.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_cero_normal.png"))); // NOI18N
        btn_0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn_0, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 340, 130, 65));

        btn_punto.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        btn_punto.setForeground(new java.awt.Color(255, 255, 255));
        btn_punto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_punto.setText(".\n");
        btn_punto.setBorder(null);
        btn_punto.setBorderPainted(false);
        btn_punto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_punto.setFocusPainted(false);
        btn_punto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btn_punto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_press.png"))); // NOI18N
        btn_punto.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/btn_interno_normal.png"))); // NOI18N
        btn_punto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_puntoActionPerformed(evt);
            }
        });
        jPanel2.add(btn_punto, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 65, 65));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 330, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_borrar_un_elementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrar_un_elementoActionPerformed
        borrarSoloUnElemento();
    }//GEN-LAST:event_btn_borrar_un_elementoActionPerformed

    private void btn_0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_0ActionPerformed
        addElement("0"); 
    }//GEN-LAST:event_btn_0ActionPerformed

    private void btn_puntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_puntoActionPerformed
        addElement(".");  
    }//GEN-LAST:event_btn_puntoActionPerformed

    private void btn_borrarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarPantallaActionPerformed
        clearElements();
    }//GEN-LAST:event_btn_borrarPantallaActionPerformed

    private void btn_divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_divActionPerformed
        addElement("/"); 
    }//GEN-LAST:event_btn_divActionPerformed

    private void btn_multiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_multiActionPerformed
        addElement("*"); 
    }//GEN-LAST:event_btn_multiActionPerformed

    private void btn_restaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_restaActionPerformed
        addElement("-"); 
    }//GEN-LAST:event_btn_restaActionPerformed

    private void btn_sumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sumaActionPerformed
        addElement("+"); 
    }//GEN-LAST:event_btn_sumaActionPerformed

    private void btn_igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_igualActionPerformed
        igual();
    }//GEN-LAST:event_btn_igualActionPerformed

    private void btn_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_1ActionPerformed
        addElement("1"); 
    }//GEN-LAST:event_btn_1ActionPerformed

    private void btn_2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_2ActionPerformed
        addElement("2"); 
    }//GEN-LAST:event_btn_2ActionPerformed

    private void btn_3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_3ActionPerformed
        addElement("3"); 
    }//GEN-LAST:event_btn_3ActionPerformed

    private void btn_4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_4ActionPerformed
        addElement("4"); 
    }//GEN-LAST:event_btn_4ActionPerformed

    private void btn_5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_5ActionPerformed
        addElement("5"); 
    }//GEN-LAST:event_btn_5ActionPerformed

    private void btn_6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_6ActionPerformed
        addElement("6");
    }//GEN-LAST:event_btn_6ActionPerformed

    private void btn_7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_7ActionPerformed
        addElement("7");
    }//GEN-LAST:event_btn_7ActionPerformed

    private void btn_8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_8ActionPerformed
        addElement("8");
    }//GEN-LAST:event_btn_8ActionPerformed

    private void btn_9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_9ActionPerformed
        addElement("9");
    }//GEN-LAST:event_btn_9ActionPerformed
    
    
    //Modulos  

    /**
     * Modulo para añadir un número o signo.
     * @param digito Es el nombre del parámetro por donde se introducen los números o signos.
     * Si ya hay un elemento añadido se va a concatenar
     */
    public void addElement(String digito){
        txt_operacion.setText(txt_operacion.getText() + digito); 
    }
    
    /**
     * Modulo que elimina todos los elementos de la pantalla.
     * Coloca un texto vacio en los jLabel de la operación y en el resultado.
     */ 
    public void clearElements(){
        txt_resultado.setText("");
        txt_operacion.setText("");  
    }
   
    /**
     * Modulo para borrar de a un solo elemento que se muestra en el jLabel de la operación.
     */ 
    public void borrarSoloUnElemento(){
        /*
        1)- Los numeros ingresados se convierten en cadenas, elimino el último elemento de la derecha y lo almacena en la variable "texto"
        2)- En el jLabel txt_operacion le paso por parámetro que muestre la variable "texto"
        3)- Luego se apreta el boton de "igual" para actualizar el resultado
        */
        String texto = txt_operacion.getText().substring(0,txt_operacion.getText().length()-1); // 1)
        txt_operacion.setText(texto); // 2)
        btn_igual.doClick(); // 3)
    }
    
    /**
     * Modulo que evalua la operación que se va a realizar en la calculadora.
     */
    public void igual(){
        /*
        1) - Evalua la operacion en el jLabel txt_operacion y la guarda en una variable "resultado" 
        2) - Hago que en el jLabel txt_resultado muestre el string "resultado" que contiene el resultado de la operacion 
        3) Si da infinito muestro "Syntax Error"
        4) Si hago 0/0 muestro como resultado "Syntax Error"
        5) Muestro el resultado
        */
        try{
            String resultado = se.eval(txt_operacion.getText()).toString(); // 1)
            if("Infinity".equals(resultado)){
               txt_resultado.setText("Syntax error"); //3) 
            }else{
                if("NaN".equals(resultado)){
                    txt_resultado.setText("Syntax Error");//4)
                }else{
                    txt_resultado.setText(resultado);//5)
                }
            }
        }catch(Exception e){
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_0;
    private javax.swing.JButton btn_1;
    private javax.swing.JButton btn_2;
    private javax.swing.JButton btn_3;
    private javax.swing.JButton btn_4;
    private javax.swing.JButton btn_5;
    private javax.swing.JButton btn_6;
    private javax.swing.JButton btn_7;
    private javax.swing.JButton btn_8;
    private javax.swing.JButton btn_9;
    private javax.swing.JButton btn_borrarPantalla;
    private javax.swing.JButton btn_borrar_un_elemento;
    private javax.swing.JButton btn_div;
    private javax.swing.JButton btn_igual;
    private javax.swing.JButton btn_multi;
    private javax.swing.JButton btn_punto;
    private javax.swing.JButton btn_resta;
    private javax.swing.JButton btn_suma;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel txt_operacion;
    private javax.swing.JLabel txt_resultado;
    // End of variables declaration//GEN-END:variables
}
