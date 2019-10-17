/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.senac.sp.notafiscalmvc.controller;

import br.senac.sp.notafiscalmvc.model.NotaFiscal;

/**
 *
 * @author lucas
 */
public class NotaFiscalController {

    public static boolean salvar(int numNota, double valNota) {

        System.out.print("agora estou no controller");
        System.out.println(numNota);
        System.out.println(valNota);

        NotaFiscal nota = new NotaFiscal();

        return true;

    }

}
