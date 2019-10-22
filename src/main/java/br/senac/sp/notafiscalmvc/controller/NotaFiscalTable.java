/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

/**
 *
 * @author lucas
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.senac.sp.notafiscalmvc.DAO.NotaFiscalDAO;
import javax.swing.table.AbstractTableModel;
import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalTable extends AbstractTableModel {
    private String[] columnNames = {"NumNota","ValNota", "NomeProduto"};

    public int getColumnCount() {
        return 3;
    }

    public int getRowCount() {
        //implementar metodo
        return NotaFiscalDAO.conta();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        //implementar metodo      
        NotaFiscal nota;
        nota = NotaFiscalDAO.linha(row);
        if (col == 0) 
            return nota.getValNota();
        
        if (col == 1) 
            return nota.getNomeProduto();
            return nota.getValNota();
        
        
    }

    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

}
