public class Tecnico extends Assistente{
    protected double bonus;
    
    public double getBonus() {
        return bonus;
    }
    
    public Tecnico(String nome, String setor, double salario, String matricula, double bonus) {
        super(nome, setor, salario, matricula);
        this.bonus = bonus;
        this.salario += this.bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
}
