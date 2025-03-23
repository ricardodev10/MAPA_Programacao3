import javax.swing.JOptionPane;

public class Aluguel {
    private Imovel imovel;
    private Locatario locatario;

    public void locarImovel() {
        this.imovel = new Imovel();
        imovel.cadastrarImovel();

        this.locatario = new Locatario();
        locatario.cadastrarLocatario();

        if (validarLocacao(this.imovel.getValorAluguel(), this.locatario.getSalario())) {
            JOptionPane.showMessageDialog(null, "Locação efetuada!");
        } else {
            JOptionPane.showMessageDialog(null, "Locação NÃO efetuada!");
        }
    }

    public boolean validarLocacao(double valorAluguel, double salario) {
        boolean resultado = false;
        double valorReferencia = salario * 0.3;

        resultado = valorAluguel <= valorReferencia;

        return resultado;
    }
}
