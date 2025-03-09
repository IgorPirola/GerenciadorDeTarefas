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
public abstract class  Tarefa extends Object {

    private String descricao;// descrição da tarefa
    private boolean concluida; //indica se a tarefa foi concluída
    private int prioridade; //nível de prioridade da tarefa (1 a 5)
    private LocalDate dataCriacao;

    //construtor util para realizar consultas
    public Tarefa() {
    }

    //sobrecarregando com dados obrigatórios
    public Tarefa(String descricao, int prioridade, LocalDate dataCriacao) {
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
        this.concluida = false;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    @Override
    public String toString() {
        return "Tarefa:" + "descricao=" + descricao + ", concluida=" + concluida + ", prioridade=" + prioridade + ", dataCriacao=" + dataCriacao ;
    }

    @Override
    public boolean equals(Object obj) {
        //duas tarefas (objetos) são iguais
        //se:
        //1 - tiverem o mesmo endereço
        if (!(this.equals(obj))) {
            return false;
        }

        //2 se tiverem os mesmos valores
        //nos atributos
        if (!(obj instanceof Tarefa)) {
            return false;
        }

        if (!(this.descricao.equals(
                ((Tarefa) obj).descricao))) {
            return false;
        }

        if (this.prioridade
                != ((Tarefa) obj).prioridade) {
            return false;
        }

        if (this.concluida
                != ((Tarefa) obj).concluida) {
            return false;
        }

        if (!(this.dataCriacao.equals(
                ((Tarefa) obj).dataCriacao))) {
            return false;
        }

        return true;
    }
}



