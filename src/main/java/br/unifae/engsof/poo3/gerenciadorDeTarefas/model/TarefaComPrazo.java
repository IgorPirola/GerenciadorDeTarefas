/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.time.LocalDate;

/**
 *
 * @author cimam
 */
public class TarefaComPrazo extends Tarefa {

private LocalDate prazo; // data limite para conclusão da tarefa

    public TarefaComPrazo() {
    }

    public TarefaComPrazo(String descricao, int prioridade, LocalDate dataCriacao, LocalDate prazo) {
        super(descricao, prioridade, dataCriacao);
        this.prazo = prazo;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    @Override
    public String toString() {
        
        return super.toString() + ",prazo=" + prazo;
    }

    @Override
    public boolean equals(Object obj) {
      if(super.equals(obj)){
          if(this.prazo.equals(
                  ((TarefaComPrazo)obj).prazo))
              return true;
      }
      return false;
    }
    
    

    
    

    
}
