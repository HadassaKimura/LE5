package funcionario;

public class Funcionario {
    private int Id;
    private double salario;
    private int numFilhos;

    public Funcionario(int id, double salario, int numFilhos) {
        Id = id;
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public Funcionario() {
        Id = Id;
        this.salario = salario;
        this.numFilhos = numFilhos;
    }

    public void setId(int id) {
        Id = id;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setNumFilhos(int numFilhos) {
        this.numFilhos = numFilhos;
    }

    public int getId() {
        return Id;
    }

    public double getSalario() {
        return salario;
    }

    public int getNumFilhos() {
        return numFilhos;
    }
}
