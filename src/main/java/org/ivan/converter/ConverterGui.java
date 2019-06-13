/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ivan.converter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;


/**
 * 轉欓工具(介面是用NetBeans拉的)
 *
 * @author ivan.chen
 */
public class ConverterGui extends javax.swing.JFrame {
    private final Logger logger = LoggerFactory.getLogger(this.getName().getClass());

    /**
     * Creates new form ConverterGui
     */
    public ConverterGui() {
        initComponents();
        initial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        textAreaMessage = new javax.swing.JTextArea();
        panelLeft = new javax.swing.JPanel();
        panelSourceDirectory = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textFieldSourceDirectory = new javax.swing.JTextField();
        butttonSourceDirectorySelect = new javax.swing.JButton();
        panelTargetJsonDirectory = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        textFieldOutputDirectory = new javax.swing.JTextField();
        butttonOutputDirectory = new javax.swing.JButton();
        panelFileList = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableFileList = new javax.swing.JTable();
        buttonConvert = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        textAreaMessage.setEditable(false);
        textAreaMessage.setColumns(20);
        textAreaMessage.setRows(5);
        jScrollPane1.setViewportView(textAreaMessage);

        jLabel1.setText("來源檔案資料夾");

        textFieldSourceDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldSourceDirectoryActionPerformed(evt);
            }
        });

        butttonSourceDirectorySelect.setText("瀏覽");
        butttonSourceDirectorySelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonSourceDirectorySelectActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSourceDirectoryLayout = new javax.swing.GroupLayout(panelSourceDirectory);
        panelSourceDirectory.setLayout(panelSourceDirectoryLayout);
        panelSourceDirectoryLayout.setHorizontalGroup(
                panelSourceDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSourceDirectoryLayout.createSequentialGroup()
                                .addGroup(panelSourceDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelSourceDirectoryLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel1)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(textFieldSourceDirectory, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSourceDirectoryLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(butttonSourceDirectorySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        panelSourceDirectoryLayout.setVerticalGroup(
                panelSourceDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelSourceDirectoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldSourceDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butttonSourceDirectorySelect, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        textFieldSourceDirectory.getAccessibleContext().setAccessibleName("");
        textFieldSourceDirectory.getAccessibleContext().setAccessibleDescription("");
        butttonSourceDirectorySelect.getAccessibleContext().setAccessibleDescription("");

        jLabel2.setText("輸出的資料夾位置");

        textFieldOutputDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldOutputDirectoryActionPerformed(evt);
            }
        });

        butttonOutputDirectory.setText("瀏覽");
        butttonOutputDirectory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butttonOutputDirectoryActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelTargetJsonDirectoryLayout = new javax.swing.GroupLayout(panelTargetJsonDirectory);
        panelTargetJsonDirectory.setLayout(panelTargetJsonDirectoryLayout);
        panelTargetJsonDirectoryLayout.setHorizontalGroup(
                panelTargetJsonDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTargetJsonDirectoryLayout.createSequentialGroup()
                                .addGroup(panelTargetJsonDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(panelTargetJsonDirectoryLayout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(textFieldOutputDirectory, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTargetJsonDirectoryLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(butttonOutputDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );
        panelTargetJsonDirectoryLayout.setVerticalGroup(
                panelTargetJsonDirectoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelTargetJsonDirectoryLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(textFieldOutputDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(butttonOutputDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        tableFileList.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{
                        {null, null}
                },
                new String[]{
                        "確認", "檔案列表"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tableFileList.getTableHeader().setResizingAllowed(false);
        tableFileList.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableFileList.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableFileList.getColumnModel().getColumn(1).setPreferredWidth(560);
        tableFileList.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tableFileList);

        buttonConvert.setText("轉欓");
        buttonConvert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConvertActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFileListLayout = new javax.swing.GroupLayout(panelFileList);
        panelFileList.setLayout(panelFileListLayout);
        panelFileListLayout.setHorizontalGroup(
                panelFileListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFileListLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
        );
        panelFileListLayout.setVerticalGroup(
                panelFileListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelFileListLayout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConvert, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout panelLeftLayout = new javax.swing.GroupLayout(panelLeft);
        panelLeft.setLayout(panelLeftLayout);
        panelLeftLayout.setHorizontalGroup(
                panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLeftLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(panelFileList, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelSourceDirectory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(panelTargetJsonDirectory, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        panelLeftLayout.setVerticalGroup(
                panelLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelLeftLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(panelSourceDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(panelTargetJsonDirectory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 263, Short.MAX_VALUE)
                                .addComponent(panelFileList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(panelLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 597, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(panelLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butttonSourceDirectorySelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonSourceDirectorySelectActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue = chooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File directory = chooser.getSelectedFile();

            // 更新來源檔案路徑的顯示
            textFieldSourceDirectory.setText(directory.getPath());

            updateFileList(directory);
        }
    }//GEN-LAST:event_butttonSourceDirectorySelectActionPerformed

    private void buttonConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConvertActionPerformed
        // TODO add your handling code here:
        convertAll();
    }//GEN-LAST:event_buttonConvertActionPerformed

    private void textFieldSourceDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldSourceDirectoryActionPerformed
        // TODO add your handling code here:
        updateFileList(textFieldSourceDirectory.getText().trim().toLowerCase());

    }//GEN-LAST:event_textFieldSourceDirectoryActionPerformed

    private void textFieldOutputDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldOutputDirectoryActionPerformed
        // TODO add your handling code here:
        String fileDirectory = textFieldOutputDirectory.getText().trim().toLowerCase();

        File directory = new File(fileDirectory);
        if (!directory.isDirectory()) {
            addMessageLine(String.format("資料夾(%s)不存在", fileDirectory));
            return;
        }
    }//GEN-LAST:event_textFieldOutputDirectoryActionPerformed

    private void butttonOutputDirectoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butttonOutputDirectoryActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        int returnValue = chooser.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File directory = chooser.getSelectedFile();

            // 更新來源檔案路徑的顯示
            textFieldOutputDirectory.setText(directory.getPath());
        }
    }//GEN-LAST:event_butttonOutputDirectoryActionPerformed

    /**
     * 更新檔案列表
     *
     * @param directory 資料夾路徑位址
     */
    private void updateFileList(String directory) {
        try {
            updateFileList(new File(directory));
        } catch (Exception e) {
            addMessageLine(e.toString());
        }
    }

    /**
     * 更新檔案列表
     *
     * @param directory 被選取的資料夾
     */
    private void updateFileList(File directory) {
        String[] nameList = new String[0];
        if (!directory.exists() || !directory.isDirectory()) {
            // 因為tableFileList.removeAll()不知道為什麼沒有更新UI, 所以只好塞給他空的資料讓他清空file list
        } else {
            // 取得檔案列表
            nameList = directory.list((File dir, String name) -> {
                if (name.toLowerCase().endsWith(".xlsx")) {
                    return true;
                } else {
                    return false;
                }
            });
        }

        // 更新檔案列表UI
        Object[][] data = new Object[nameList.length][tableFileList.getColumnCount()];
        for (int i = 0; i < nameList.length; ++i) {
            data[i][0] = Boolean.FALSE;
            data[i][1] = String.format("%s/%s", directory.getPath(), nameList[i]);
        }

        tableFileList.setModel(new javax.swing.table.DefaultTableModel(
                data,
                new String[]{
                        "確認", "檔案列表"
                }
        ) {
            Class[] types = new Class[]{
                    java.lang.Boolean.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types[columnIndex];
            }
        });
        tableFileList.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableFileList.getColumnModel().getColumn(0).setPreferredWidth(50);
        tableFileList.getColumnModel().getColumn(1).setPreferredWidth(560);
    }

    /**
     * 新增一行訊息到文字視窗
     *
     * @param message 要新增的訊息文字
     */
    private void addMessageLine(String message) {
        addMessage(message + "\n");
    }

    /**
     * 新增訊息到文字視窗
     *
     * @param message 要新增的訊息文字
     */
    private void addMessage(String message) {
        logger.info(message);
        textAreaMessage.append(message);
    }

    /**
     * 轉換所有檔案
     */
    private void convertAll() {
        textAreaMessage.setText("");

        String outputDirectoryString = textFieldOutputDirectory.getText().trim().toLowerCase();
        File outputDirectory = new File(outputDirectoryString);
        if (!outputDirectory.exists() || !outputDirectory.isDirectory()) {
            showErrorMessage("輸出的資料夾不存在");
            return;
        }

        for (int i = 0; i < tableFileList.getRowCount(); ++i) {
            if (tableFileList.getValueAt(i, 0) == Boolean.FALSE)
                continue;

            String filePath = (String) tableFileList.getValueAt(i, 1);

            addMessageLine(String.format("開始轉換檔案 : %s", filePath));

            String jsonString = generateJsonString(filePath);
            if (jsonString.isEmpty())
                continue;

            try {
                String outFilePath = String.format("%s.json", filePath.substring(0, filePath.length() - 5));

                FileWriter writer = new FileWriter(outFilePath);

                writer.write(jsonString);
                writer.flush();
                writer.close();
            } catch (Exception e) {
                showErrorMessage("寫入檔案錯誤 : {}" + e.toString());
            }

            infoBox("轉欓完成", "");
        }

        updateProperties();
    }

    /**
     * 轉欓
     *
     * @param filePath 要轉換的檔案路徑
     */
    private String generateJsonString(String filePath) {
        File file = new File(filePath);

        try {
            FileInputStream stream = new FileInputStream(file);

            XSSFWorkbook book = new XSSFWorkbook(stream);

            XSSFSheet sheet = book.getSheetAt(0);

            // 因為資料表最後都會多出空白的row或者column, 所以必須手動挑出最後的row跟column數(PS:資料表不能有空值)
            int lastRow = sheet.getPhysicalNumberOfRows() - 1;
            for (; lastRow >= 0; --lastRow) {
                if (!sheet.getRow(lastRow).getCell(0).toString().isEmpty())
                    break;
            }

            if (lastRow <= 0) {
                showErrorMessage("沒有任何Row資料");
                return "";
            }

            addMessageLine(String.format("總共%d筆資料", lastRow + 1));

            Row firstRow = sheet.getRow(0);
            int lastColumn = firstRow.getPhysicalNumberOfCells() - 1;
            for (; lastColumn >= 0; --lastColumn) {
                if (!firstRow.getCell(lastColumn).toString().isEmpty())
                    break;
            }

            if (lastRow <= 0) {
                showErrorMessage("沒有任何Column資料");
                return "";
            }

            addMessageLine(String.format("總共%d個欄位", lastColumn + 1));

            // 儲存欄位的說明文字(row 0)
            List<String> comments = new ArrayList<>();
            // 儲存欄位的型態(row 1)
            List<String> types = new ArrayList<>();
            // 儲存欄位的變數名稱(row 2)
            List<String> variables = new ArrayList<>();
            // 要輸出的所有字串
            StringBuilder builder = new StringBuilder();

            for (int i = 0; i <= lastRow; ++i) {
                Row row = sheet.getRow(i);
                if (row == null)
                    continue;

                addMessageLine(String.format("正在處理第%d筆資料", i + 1));

                for (int j = 0; j <= lastColumn; ++j) {
                    Cell cell = row.getCell(j);
                    if (cell == null) {
                        showErrorMessage(String.format("第%d行, 第%d列 : 沒有資料", i + 1, j + 1));
                        return "";
                    }

                    String value = cell.toString().trim();

                    if (value.isEmpty()) {
                        showErrorMessage(String.format("第%d行, 第%d列 : 沒有資料", i + 1, j + 1));
                        return "";
                    }

                    if (i == 0) {
                        comments.add(value);
                    } else if (i == 1) {
                        if (!value.equals("boolean") && !value.equals("int") && !value.equals("String") && !value.equals("float")) {
                            showErrorMessage(String.format("第%d行, 第%d列 : 資料型態錯誤", i + 1, j + 1));
                            return "";
                        }

                        types.add(value);
                    } else if (i == 2) {
                        if (j == 0) {
                            if (!value.equals("ID")) {
                                showErrorMessage(String.format("第%d行, 第%d列 : 的資料必須為ID", i + 1, j + 1));
                                return "";
                            }
                        }

                        variables.add(cell.toString());
                    } else {
                        if (i == 3 && j == 0) {
                            builder.append("[");
                        }

                        if (j == 0) {
                            if (i > 3)
                                builder.append(", {");
                            else
                                builder.append("{");
                        } else {
                            builder.append(", ");
                        }

                        if (types.get(j).equals("String"))
                            builder.append(String.format("\"%s\" : \"%s\"", variables.get(j), value));
                        else
                            builder.append(String.format("\"%s\" : %s", variables.get(j), value));

                        if (j == lastColumn) {
                            builder.append("}");

                            if (i == lastRow)
                                builder.append("]");
                        }
                    }
                }

            }

            return builder.toString();

        } catch (Exception e) {
            showErrorMessage(e.toString());

            return "";
        }
    }

    /**
     * 更新properties資料
     */
    private void updateProperties() {
        properties.setSourceDirectory(textFieldSourceDirectory.getText());
        properties.setOutputDirectory(textFieldOutputDirectory.getText());
        properties.saveProperties();
    }

    /**
     * 初始化
     */
    private void initial() {
        properties = new MyProperty();
        properties.initial();

        textFieldSourceDirectory.setText(properties.getSourceDirectory());
        textFieldOutputDirectory.setText(properties.getOutputDirectory());

        updateFileList(textFieldSourceDirectory.getText());
    }

    /**
     * 顯示錯誤訊息
     * @param message 要顯示的訊息
     */
    private void showErrorMessage(String message) {
        logger.error(message);
        infoBox(message, "錯誤");
    }

    /**
     * 顯示訊息視窗
     * @param infoMessage 要顯示的訊息
     * @param titleBar 標題
     */
    private void infoBox(String infoMessage, String titleBar)
    {
        JOptionPane.showMessageDialog(null, infoMessage, titleBar, JOptionPane.INFORMATION_MESSAGE);
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
            java.util.logging.Logger.getLogger(ConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConverterGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConverterGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonConvert;
    private javax.swing.JButton butttonOutputDirectory;
    private javax.swing.JButton butttonSourceDirectorySelect;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelFileList;
    private javax.swing.JPanel panelLeft;
    private javax.swing.JPanel panelSourceDirectory;
    private javax.swing.JPanel panelTargetJsonDirectory;
    private javax.swing.JTable tableFileList;
    private javax.swing.JTextArea textAreaMessage;
    private javax.swing.JTextField textFieldOutputDirectory;
    private javax.swing.JTextField textFieldSourceDirectory;
    // End of variables declaration//GEN-END:variables

    private MyProperty properties;
}
