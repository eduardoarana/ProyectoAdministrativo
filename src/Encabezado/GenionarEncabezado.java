/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encabezado;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author aranaVentur
 */
public class GenionarEncabezado implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable jtable, Object valor, boolean isSelected, boolean asFocus, int row, int column) {

        JComponent jComponent = null;
        if (valor instanceof String) {
            jComponent = new JLabel((String) valor);
            ((JLabel) jComponent).setHorizontalAlignment(SwingConstants.CENTER);
            ((JLabel) jComponent).setSize(30, jComponent.getWidth());
            ((JLabel) jComponent).setPreferredSize(new Dimension(6, jComponent.getWidth()));
        }
        jComponent.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1,Color.decode("#292E37") ));
        jComponent.setOpaque(true);
        jComponent.setBackground(Color.decode("#C7DCF4"));
        jComponent.setToolTipText("Encabezado");
        jComponent.setForeground(Color.BLACK);
        return jComponent;
    }
}
