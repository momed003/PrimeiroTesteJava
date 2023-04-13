
package Classes;

//funcionario comum
public class Funcion extends Funcionario{
     private double salarioBase;
    private double bonusAnual=0.5*salarioBase;
    
    public Funcion(String nome, double salarioBase, double salario) {
        super(nome, salarioBase, salario);
    }
    
     @Override
     public double  calcularSalario(){
        Funcion.this.setSalario(salarioBase+bonusAnual);
        return Funcion.this.getSalario();
    }
     
}
