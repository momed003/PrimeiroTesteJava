
package Classes;

public class Gestor extends Funcionario{
  
     final double bonificar=20000;
     private double bonusAnual;

     @Override
    public double getBonusAnual() {
        return bonusAnual;
    }

     @Override
    public void setBonusAnual(double bonusAnual) {
        this.bonusAnual = bonusAnual;
    }
    
    
    public Gestor(String nome, double salarioBase, double salario) {
        super(nome, salarioBase, salario);
       
    }
    
     @Override
    public double calcularSalario(){
         bonusAnual=((Gestor.this.getSalarioBase()*10)/10)+bonificar;
        Gestor.this.setSalario(this.getSalarioBase()+bonusAnual);
        return Gestor.this.getSalario();
    }
}
