/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.controller;

import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.GerenciaTarefas;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.Tarefa;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaComPrazo;
import br.unifae.engsof.poo3.gerenciadorDeTarefas.model.TarefaSimples;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Igor
 */
public class TarefaController {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    
    public boolean addTarefaSimples(String desc, int prior, LocalDate data){
        Tarefa tarefaSimples = new TarefaSimples(desc, prior, data);
        return GerenciaTarefas.getTarefas().add(tarefaSimples); 
    } 
    
    public boolean addTarefaPrazo(String desc, int prior, LocalDate dataCriacao, LocalDate dataPrazo){
        Tarefa tarefaPrazo = new TarefaComPrazo(desc, prior, dataCriacao, dataPrazo);
        return GerenciaTarefas.getTarefas().add(tarefaPrazo);
    }
    
    public void preencherTabela(JTable jtabela){
        DefaultTableModel dtm = (DefaultTableModel) jtabela.getModel();
        
        dtm.setRowCount(GerenciaTarefas.getTarefas().size());
        jtabela.setModel(dtm);
        
        int posicaoLinha = 0;
        
        for(int i=0; i<GerenciaTarefas.getTarefas().size(); i++){
            Tarefa tarefa = GerenciaTarefas.getTarefas().get(i);
            if (tarefa instanceof TarefaComPrazo tarefaComPrazo) {
                jtabela.setValueAt(tarefaComPrazo.getPrazo().format(formatter), posicaoLinha, 2);
            } else {
                jtabela.setValueAt("Sem prazo", posicaoLinha, 2);
            }
            jtabela.setValueAt(tarefa.getDescricao(), posicaoLinha, 0);
            jtabela.setValueAt(tarefa.getDataCriacao().format(formatter), posicaoLinha, 1);
            jtabela.setValueAt(tarefa.getPrioridade(), posicaoLinha, 3);
            
            posicaoLinha += 1;
        }
    }
    
    public void excluir(JTable jtabela){
        
        if(jtabela.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Selecione um produto da tabela", "Aviso", 0);
        } else {
            int resposta = JOptionPane.showConfirmDialog(
                null,
                "Tem certeza que deseja excluir a tarefa?",
                "Aviso",
                JOptionPane.YES_NO_OPTION
            );
            
            if(resposta == JOptionPane.YES_OPTION){
                GerenciaTarefas.getTarefas().remove(jtabela.getSelectedRow());
                JOptionPane.showMessageDialog(null, "Tarefa excluida com sucesso", "Sucesso", 1);
                
                preencherTabela(jtabela);
            }
        }
    }
    
}
