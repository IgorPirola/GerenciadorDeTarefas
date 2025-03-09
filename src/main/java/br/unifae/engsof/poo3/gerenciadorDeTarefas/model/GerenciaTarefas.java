/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unifae.engsof.poo3.gerenciadorDeTarefas.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Igor
 */
public class GerenciaTarefas {
    
    private static List<Tarefa> tarefas = null;
    
    private GerenciaTarefas(){}
    
    public static  List<Tarefa> getTarefas(){
        if(tarefas == null){
            tarefas = new ArrayList<>();
        }
        return tarefas;
    }
}
