/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciadordetarefas;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.controller.TarefaController;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.view.MenuPrincipal;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author cimam
 */
public class GerenciadorDeTarefas {

    public static void main(String[] args) {
        TarefaController tarefaController = new TarefaController();
        
        // Tarefas de exemplo:
        tarefaController.addTarefaPrazo("Trabalho Cris", 5, LocalDate.of(2025, Month.MARCH, 4), LocalDate.of(2025, Month.MARCH, 9));
        tarefaController.addTarefaPrazo("Trabalho Rogério", 5, LocalDate.of(2025, Month.MARCH, 1), LocalDate.of(2025, Month.MARCH, 10));
        tarefaController.addTarefaSimples("Tarefa Adriana", 3, LocalDate.of(2025, Month.MARCH, 1));
        
        MenuPrincipal menu = new MenuPrincipal();
        menu.setVisible(true);
    }
}
