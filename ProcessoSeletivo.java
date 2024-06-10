/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package análise.de.candidato;

/**
 *
 * @author joaov
 */
public class ProcessoSeletivo {
    public static void main(String[] args){

    }
    
    static void selecaoCandidato(){
        String [] candidatos = {"FELIPE", "ROSA", "RAYANE", "PAMELA", "CHUEL", "LIVIA", "AMANDA", "FABIANA"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000;
        while(candidatosSelecionados < 5){
            System.out.println();
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + "Solicitou esse valor de salario " + salarioPretendido);
            if(salarioBase > salarioPretendido){
                System.out.println("O candidato " + candidato + "Foi selecionado para vaga!");
                candidatoSelecionado ++;
            }
        }
    }
    
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
           System.out.println("LIGAR PARA O CANDIDATO");
        } 
        else if(salarioBase == salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA-PROPOSTA");
        }
        else{
        System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
    }
    }
}
