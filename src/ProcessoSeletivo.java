public class ProcessoSeletivo {
    private String nomeCandidato;
    private float salarioDesejado;

    public ProcessoSeletivo(String nomeCandidato, float salarioDesejado){
        this.nomeCandidato = nomeCandidato;
        this.salarioDesejado = salarioDesejado;
    }
    public String getNomeCandidato() {
        return nomeCandidato;
    }
    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }
    public float getSalarioDesejado() {
        return salarioDesejado;
    }
    public void setSalarioDesejado(float salarioDesejado) {
        this.salarioDesejado = salarioDesejado;
    }
    public void analisaCandidato(){
        float salario = getSalarioDesejado();
        float salarioBase = 2000;
        if(salario > salarioBase){
            System.out.printf("Ligar para candidato e sugerir contraproposta!");
        }else if(salarioBase == salario){
            System.out.printf("Ligar para candidato");
        }else{
            System.out.printf("Aguardar inscrição de novos candidatos");
        }
    }
}
