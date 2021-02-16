/*
 P21- 01/02/2021
  

 */
package PKmonlau;

import java.awt.Color;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class JFrameMain extends javax.swing.JFrame {
//declaraciones globales:

//Constructor:    
    public JFrameMain() {
        initComponents();
        initConfig();  //configurar nuestro Jframe
    }

    //funciones bisiesto
    private int functionBisiesto(int any) {
        int bisiesto = 0;
        if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) {
            bisiesto = 1;
        }
        return bisiesto;
    }

    private int functionDiasalive(int dia, int mes, int any) {

        Calendar start = Calendar.getInstance();
        start.set(any, mes - 1, dia);
        start.set(Calendar.HOUR, 0);
        start.set(Calendar.HOUR_OF_DAY, 0);
        start.set(Calendar.MINUTE, 0);
        start.set(Calendar.SECOND, 0);

        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR, 0);
        now.set(Calendar.HOUR_OF_DAY, 0);
        now.set(Calendar.MINUTE, 0);
        now.set(Calendar.SECOND, 0);

        long end = now.getTimeInMillis();
        long startmes = start.getTimeInMillis();

        int days = (int) ((Math.abs(end - startmes)) / (1000 * 60 * 60 * 24));

        return days;
    }
    private void Programador (int any){
        
        
        
    }

    private String functionDias5000(int dia, int mes, int any) {
      
        String dias=(LocalDate.of(any,mes,dia).plusDays(5000)+"");
        return dias;
    }
     private String functionDias10000(int dia, int mes, int any) {
      
        String dias=(LocalDate.of(any,mes,dia).plusDays(10000)+"");
        return dias;
    }
      private String functionDias20000(int dia, int mes, int any) {
      
        String dias=(LocalDate.of(any,mes,dia).plusDays(20000)+"");
        return dias;
    }
      
      private String functionProgramador(int dia, int Mes, int Any) {
          if (Any % 4 == 0 && (Any % 100 != 0 || Any % 400 == 0)) {
            dia = 12;
        }else dia=13;
          Mes=9;
       
         int a, y, m, d;
        a = (14 - Mes) / 12;
        y = Any - a;
        m = Mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
            
                String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
                
        String res=dia+"-"+Mes+"-"+Any+" "+(ArrayWeek[d]);
       
        return res;
    }

    //Magica;Especial;Alegre
    private void functionRadio(int sum) {
        boolean primo = functionPrimo(sum);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);

        if (primo) {
            //es Magic date
            jRadioButton1.setSelected(true);
        } else if (sum % 2 == 0) {
            //fecha especial
            jRadioButton2.setSelected(true);
        } else {
            //alegre
            jRadioButton3.setSelected(true);
        }
    }

    //function Primo
    private boolean functionPrimo(int num) {

        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    private int diaNacimiento_ZELLER(int dia, int Mes, int Any) {
        int a, y, m, d;
        a = (14 - Mes) / 12;
        y = Any - a;
        m = Mes + 12 * a - 2;
        d = (dia + y + y / 4 - y / 100 + y / 400 + (31 * m) / 12) % 7;
        return d;
    }

    private int functionDiaMes(int Mes, int any) {
        int bisiesto = 0;
        if (any % 4 == 0 && (any % 100 != 0 || any % 400 == 0)) {
            bisiesto = 1;
            
        }

        if (Mes == 0) {
            Mes = 31;
        }
        if (Mes == 1) {
            Mes = 29;
            if (bisiesto == 1) {
                Mes = 28;
            }
        }
        if (Mes == 2) {
            Mes = 31;
        }
        if (Mes == 3) {
            Mes = 30;
        }
        if (Mes == 4) {
            Mes = 31;
        }
        if (Mes == 5) {
            Mes = 30;
        }
        if (Mes == 6) {
            Mes = 31;
        }
        if (Mes == 7) {
            Mes = 30;
        }
        if (Mes == 8) {
            Mes = 30;
        }
        if (Mes == 9) {
            Mes = 31;
        }
        if (Mes == 10) {
            Mes = 30;
        }
        if (Mes == 11) {
            Mes = 31;
        }

        return Mes;
    }

    private void initConfig() {
        //this.getContentPane().setBackground(Color.BLUE);
        this.getContentPane().setBackground(new Color(0, 0, 255));
        this.setExtendedState(JFrameMain.MAXIMIZED_BOTH);
        //configurar jComboBox
        jComboBoxDia.removeAllItems();//borrar toda la lista
        for (int i = 1; i <= 31; i++) {
            jComboBoxDia.addItem(String.valueOf(i));
        }
        jComboBoxMes.removeAllItems();//borrar toda la lista
        for (int i = 1; i <= 12; i++) {
            jComboBoxMes.addItem(String.valueOf(i));
        }
        jComboBoxAny.removeAllItems();//borrar toda la lista
        for (int i = 1900; i <= 2021; i++) {
            jComboBoxAny.addItem(String.valueOf(i));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBoxDia = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxMes = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxAny = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jCheckBoxBisiesto = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jTextFieldDiaNacimiento1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDiaNacimiento2 = new javax.swing.JTextField();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jTextFieldMes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDiaMes = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextFieldDiasVividos = new javax.swing.JTextField();
        jTextField5000 = new javax.swing.JTextField();
        jTextField20000 = new javax.swing.JTextField();
        jTextField10000 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextField20001 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel1.setText("Dia");

        jComboBoxDia.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setText("Mes");

        jComboBoxMes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxMes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel3.setText("Año");

        jComboBoxAny.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxAny.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setBackground(new java.awt.Color(0, 153, 102));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jButton1.setText("Calcular");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jCheckBoxBisiesto.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jCheckBoxBisiesto.setText("Bisiesto");
        jCheckBoxBisiesto.setEnabled(false);
        jCheckBoxBisiesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxBisiestoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(268, 268, 268)
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(jComboBoxAny, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                        .addComponent(jCheckBoxBisiesto)
                        .addGap(20, 20, 20))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55))
                            .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxAny, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCheckBoxBisiesto)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        jTextFieldDiaNacimiento1.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jTextFieldDiaNacimiento1.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldDiaNacimiento1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDiaNacimiento1.setFocusable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel4.setText("Dia");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel5.setText("Dia");

        jTextFieldDiaNacimiento2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jTextFieldDiaNacimiento2.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldDiaNacimiento2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDiaNacimiento2.setFocusable(false);

        jRadioButton3.setText("ALEGRE");
        jRadioButton3.setEnabled(false);

        jRadioButton2.setText("ESPECIAL");
        jRadioButton2.setEnabled(false);

        jRadioButton1.setText("MAGICO");
        jRadioButton1.setEnabled(false);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jTextFieldMes.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jTextFieldMes.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldMes.setFocusable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel6.setText("Mes");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel7.setText("DiaMes");

        jTextFieldDiaMes.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jTextFieldDiaMes.setForeground(new java.awt.Color(255, 0, 0));
        jTextFieldDiaMes.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDiaMes.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextFieldDiaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldDiaNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jTextFieldDiaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jRadioButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jRadioButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDiaNacimiento1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldDiaNacimiento2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldMes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDiaMes, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextFieldDiasVividos.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextFieldDiasVividos.setForeground(new java.awt.Color(204, 0, 51));
        jTextFieldDiasVividos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldDiasVividos.setFocusable(false);
        jPanel3.add(jTextFieldDiasVividos, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 20, 273, 64));

        jTextField5000.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField5000.setForeground(new java.awt.Color(204, 0, 51));
        jTextField5000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5000.setFocusable(false);
        jPanel3.add(jTextField5000, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 102, 273, 64));

        jTextField20000.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField20000.setForeground(new java.awt.Color(204, 0, 51));
        jTextField20000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20000.setFocusable(false);
        jTextField20000.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20000ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField20000, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 273, 64));

        jTextField10000.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField10000.setForeground(new java.awt.Color(204, 0, 51));
        jTextField10000.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField10000.setFocusable(false);
        jPanel3.add(jTextField10000, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 184, 273, 64));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("DIA");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Programer day");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 370, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("DIA 5000");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("DIA 10000");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("DIA 20000");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jTextField20001.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField20001.setForeground(new java.awt.Color(204, 0, 51));
        jTextField20001.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField20001.setFocusable(false);
        jTextField20001.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField20001ActionPerformed(evt);
            }
        });
        jPanel3.add(jTextField20001, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 273, 64));

        jPanel4.setBackground(new java.awt.Color(255, 102, 102));
        jPanel4.setFocusable(false);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PKmonlau/Imagen1.png"))); // NOI18N
        jLabel12.setText("RAUL MENDEZ");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel13.setText("M3-CALENDAR");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel14.setText("2020-2021");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(27, 27, 27))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel14))
                .addGap(70, 70, 70)
                .addComponent(jLabel13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(209, 209, 209)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 488, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dia = Integer.parseInt(jComboBoxDia.getSelectedItem().toString());
        int mes = Integer.parseInt(jComboBoxMes.getSelectedItem().toString());
        int any = Integer.parseInt(jComboBoxAny.getSelectedItem().toString());

        int Diavivid = functionDiasalive(dia, mes, any);
        jTextFieldDiasVividos.setText(String.valueOf(Diavivid));
        String Dia5000 = functionDias5000(dia, mes, any);
        jTextField5000.setText(String.valueOf(Dia5000));
        String Dia10000 = functionDias10000(dia, mes, any);
        jTextField10000.setText(String.valueOf(Dia10000));
        String Dia20000 = functionDias20000(dia, mes, any);
        jTextField20000.setText(String.valueOf(Dia20000));

        int bisiesto = functionBisiesto(any);
        if (bisiesto == 1) {
            jCheckBoxBisiesto.setSelected(true);
        } else {
            jCheckBoxBisiesto.setSelected(false);
        }

        functionRadio(any);

        int d = diaNacimiento_ZELLER(dia, mes, any);
        jTextFieldDiaNacimiento1.setText(String.valueOf(d));
        String[] ArrayWeek = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
        jTextFieldDiaNacimiento2.setText(ArrayWeek[d]);

        String[] ArrayMonth = {"Enero", "Febrero", "Marzo", "Abril", "Mayo",
            "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
        //AJUSTE:
        mes = mes - 1;
        jTextFieldMes.setText(ArrayMonth[mes]);
        int DiaMes = functionDiaMes(mes, any);
        jTextFieldDiaMes.setText(String.valueOf(DiaMes));
        
       String res=functionProgramador(dia, mes, any);
               jTextField20001.setText(res);


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCheckBoxBisiestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxBisiestoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxBisiestoActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField20000ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20000ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20000ActionPerformed

    private void jTextField20001ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField20001ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField20001ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBoxBisiesto;
    private javax.swing.JComboBox<String> jComboBoxAny;
    private javax.swing.JComboBox<String> jComboBoxDia;
    private javax.swing.JComboBox<String> jComboBoxMes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JTextField jTextField10000;
    private javax.swing.JTextField jTextField20000;
    private javax.swing.JTextField jTextField20001;
    private javax.swing.JTextField jTextField5000;
    private javax.swing.JTextField jTextFieldDiaMes;
    private javax.swing.JTextField jTextFieldDiaNacimiento1;
    private javax.swing.JTextField jTextFieldDiaNacimiento2;
    private javax.swing.JTextField jTextFieldDiasVividos;
    private javax.swing.JTextField jTextFieldMes;
    // End of variables declaration//GEN-END:variables
}
