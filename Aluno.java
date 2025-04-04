public class Aluno {
    float cp1;
    float cp2;
    float cp3;
    float challenge;
    float gs;
    String nome;

    double calcularMediaCp (){
        double mediaCp = (cp1 + cp2 + cp3) / 3 * 0.2 + challenge * 0.2 + gs *0.6;
        return mediaCp;

    }
    double calcularMediaSemestral(){
        double mediaCP = calcularMediaCp();
        double media = mediaCP * 0.2 + challenge * 0.2 + gs * 0.6;
        return media;
    }
}