package model;

public class SayajinLendario extends Sayajin{

    public SayajinLendario(String nome) {
        super(nome);
    }
    @Override
    public void transformar(){
        if(this.transformLevel >= 2){
            transformLevel ++;
            System.out.println("Não é mais possivel calcular o poder do " + this.nome);
        }else if(this.transformLevel == 1){
            transformLevel ++;
            System.out.println(this.nome + " emana um ki muito poderoso");
        }else{
            transformLevel ++;
            System.out.println("é melhor ter cuidado, a transformação do " + this.nome + " não é comum");
        }
    }
}
