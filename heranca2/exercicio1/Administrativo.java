public class Administrativo extends Assistente{
    protected String turno;
    protected double adicionalNoturno;
    
    public Administrativo(String nome, String setor, double salario, String matricula, String turno) {
        super(nome, setor, salario, matricula);
        this.turno = turno;
    }
     
    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    public Administrativo(String nome, String setor, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, setor, salario, matricula);
        this.adicionalNoturno = adicionalNoturno;
        this.salario += this.adicionalNoturno;
        this.turno = turno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }
    
}
