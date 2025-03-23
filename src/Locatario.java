import javax.swing.JOptionPane;

public class Locatario {
    private int id;
    private String nome;
    private int idade;
    private double salario;

    public void cadastrarLocatario() {
        this.id = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do locatário"));
        this.nome = JOptionPane.showInputDialog("Digite o nome do locatário");
        this.idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do locatário"));
        this.salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o salário do locatário"));
    }

    public String imprimirResumoLocatario() {
        String msg = "Id: " + this.id + "\n" + "Nome: " + this.nome + "\n" + "Idade: " + this.idade + "\n" + "Sálario: "
                + this.salario;
        return msg;
    }

    public double getSalario() {
        return this.salario;
    }
}
