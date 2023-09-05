import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    private String nomeCandidato;
    private float salarioDesejado;
    float salarioBase = 2000;
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
        if(salario > this.salarioBase){
            System.out.printf("Ligar para candidato e sugerir contraproposta!");
        }else if(this.salarioBase == salario){
            System.out.printf("Ligar para candidato");
        }else{
            System.out.printf("Aguardar inscrição de novos candidatos");
        }
    }
    public static void selecaoCandidato(){
        /*Recebe uma lista de candidatos*/
        String[] candidatosSelecionados = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O"};

        int candidatoAtual = 0;
        int candidatoSelecionado = 0;
        float salarioBase = 2000;

        while(candidatoSelecionado < 5){
            String candidato = candidatosSelecionados[candidatoAtual];
            float salarioPretendido = valorPretendido();

            System.out.printf("O candidato %s possui pretenção de R$ %f", candidato, salarioPretendido);
            candidatoAtual = candidatoAtual+1;
            if (salarioBase >= salarioPretendido){
                candidatoSelecionado++;
            }
        };
    };
    static float valorPretendido(){
        return (float) ThreadLocalRandom.current().nextDouble(1860,2200);
    }
    public static void main(String[] args){
        selecaoCandidato();
    }
}
