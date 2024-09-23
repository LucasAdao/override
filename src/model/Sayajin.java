package model;

public class Sayajin {
    protected String nome;
    protected int transformLevel = 0;

    public Sayajin(String nome){
        this.nome = nome;
    }
    public void transformar(){
        this.transformLevel++;
        System.out.println(this.nome + " se transformou em super sayajin " + this.transformLevel);
    }
}
