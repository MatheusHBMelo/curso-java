package enumeracoes;

public enum Transportes {
    CARRO(120), MOTO(70), ONIBUS(60), TREM(45), AVIAO(600), BIKE(15);

    final private int speed;

    Transportes(int s){
        this.speed = s;
    }

    public int getSpeed(){
        return speed;
    }
}
