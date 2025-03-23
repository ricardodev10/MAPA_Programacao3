import javax.swing.JOptionPane;

public class Imovel {
    private int id;
    private String descricao;
    private double metragem;
    private double valorAluguel;

    public void cadastrarImovel() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do imóvel"));
        this.descricao = JOptionPane.showInputDialog("Digite a descrição do imóvel");
        this.metragem = Double.parseDouble(JOptionPane.showInputDialog("Digite a metragem do imóvel"));
        this.valorAluguel = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do aluguel"));
    }

    public String imprimirResumoImovel() {
        String msg = "Id: " + this.id + "\n" + "Descrição: " + this.descricao + "\n" + "Metragem: " + this.metragem
                + "\n" + "Valor Aluguel: " + this.valorAluguel;
        return msg;
    }

    public void atualizarValorAnual(double percentualAjuste) {
        this.valorAluguel += valorAluguel * (percentualAjuste / 100);
    }

    public double getValorAluguel() {
        return this.valorAluguel;
    }
}
