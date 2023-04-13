
package Classes;

public class Diretor extends Funcionario{
      
      Empresa ustm=new Empresa(821035114);

    public Diretor(String nome, double salarioBase, double salario) {
        super(nome, salarioBase, salario);
        
    }
      
       @Override
      public double calcularSalario(){
          this.setSalario(this.getSalarioBase()+ustm.lucroLiquido*0.5);
          return Diretor.this.getSalario();
      }
  
    
}
