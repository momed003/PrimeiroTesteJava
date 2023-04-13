
package Classes;

public abstract class Funcionario{
    private String nome;
    private double salarioBase;
    private double bonusAnual;

    public double getBonusAnual() {
        return bonusAnual;
    }

    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    private double salario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double  calcularSalario(){
        salario=salarioBase+bonusAnual;
        return salario;
    }

    public Funcionario(String nome, double salarioBase,double salario) {
        this.nome=nome;
        this.salarioBase=salarioBase;
        this.bonusAnual=salarioBase*0.5;
        this.salario=salarioBase+bonusAnual;
    }
    
    
}
