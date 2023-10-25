package br.senai.jandira.sp.model;

abstract class Funcionarios {
    String nome;
    int ID;
    double salario;

    public Funcionarios(String nome, int ID, double saldo) {
        this.nome = nome;
        this.ID = ID;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}

