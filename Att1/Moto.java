package Att1;

public class Moto extends Veiculo {
    private boolean possuiCarenagem;

    public Moto(String cor, String modelo, int ano, boolean possuiCarenagem) {
        super(cor, modelo, ano);  // Chama o construtor da classe mãe
        this.possuiCarenagem = possuiCarenagem;
    }
    @Override
    public String mostrarDetalhes() {
        return "A Cor é: " + getCor() + ", O Modelo é: " + getModelo() + ", O Ano é: " + getAno();
    }
    public boolean isPossuiCarenagem() {
        return possuiCarenagem;
    }

    public void setPossuiCarenagem(boolean possuiCarenagem) {
        this.possuiCarenagem = possuiCarenagem;
    }
}
