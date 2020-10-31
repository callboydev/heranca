package jogo;

import java.util.ArrayList;
import java.util.Scanner;

public class JogoAdvinhacao {
    private Jogador jogadorUm;
    private Jogador jogadorDois;
    private int pontuacaoJogadorUm;
    private int pontuacaoJogadorDois;

    public JogoAdvinhacao(Jogador jogadorUm, Jogador jogadorDois, int pontuacaoJogadorUm, int pontuacaoJogadorDois) {
        this.jogadorUm = jogadorUm;
        this.jogadorDois = jogadorDois;
        this.pontuacaoJogadorUm = pontuacaoJogadorUm;
        this.pontuacaoJogadorDois = pontuacaoJogadorDois;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Pergunta> perguntas = new ArrayList();
        
        for(int i = 0; i < 4; i++) {
            System.out.print("Digite a dica da perguta: ");
            String dica = sc.nextLine();
            System.out.print("Digite a resposta: ");
            String resposta = sc.nextLine();
            Pergunta pergunta = new Pergunta(dica, resposta);
            perguntas.add(pergunta);
        }

        for(int i = 0; i < 2; i++){
            System.out.print("Digite a dica 1 da pergunta dificil: ");
            String dica = sc.nextLine();
            System.out.print("Digite a dica 2 da pergunta dificil: ");
            String dica2 = sc.nextLine();
            System.out.print("Digite a resposta: ");
            String resposta = sc.nextLine();
            PerguntaDificil pergunta = new PerguntaDificil(dica2, dica, resposta);
            perguntasDificeis.add(pergunta);
        }
        
        System.out.print("Digite o nome do primeiro jogador: ");
        String nomeJogador1 = sc.nextLine();
        Jogador jogador1 = new Jogador(nomeJogador1, 0);

        System.out.print("Digite o nome do segundo jogador: ");
        String nomeJogador2 = sc.nextLine();
        Jogador jogador2 = new Jogador(nomeJogador2, 0);

        JogoAdvinhacao jogo = new JogoAdvinhacao(jogador1, jogador2, 0, 0);

        for(int i = 0; i < 2; i++){
            jogo.realizarPergunta(perguntas.get(i), jogador1)
        }

        for(int i = 2; i < 4; i++){
            jogo.realizarPergunta(perguntas.get(i+1), jogador2)
        }
        
        if(jogo.obterVencedor() != null) {
            System.out.println("***VENCEDOR*** " + jogo.obterVencedor());
        } else {
            for(int i = 4; i < 6; i++){
                jogo.realizarPergunta(perguntas.get(i), jogador1)
            }

            for(int i = 4; i < 6; i++){
                jogo.realizarPergunta(perguntas.get(i), jogador2)
            }

            if(jogo.obterVencedor() != null) {
                System.out.println("**VENCEDOR** " + jogo.obterVencedor());
            } else {
                System.out.println("Todo mundo é burro e perdeu!");
            }
        }
    }

    public JogoAdvinhacao() {
       
    }

    public void realizarPergunta(Pergunta pergunta, Jogador jogador) {
        Scanner sc = new Scanner(System.in);

        System.out.print(jogador.getNome() + " dica: " + pergunta.getDica() + ": ");
        String resposta = sc.nextLine();

        if(pergunta.getResposta().equals(resposta)){
            int pontos = jogador.getQuantidadePontos();
            pontos += 10;
            jogador.setQuantidadePontos(pontos);
        } else {
            System.out.println("Resposta errada!");
        }
    }

    public void realizarPergunta(PerguntaDificil pergunta, Jogador jogador) {
        Scanner sc = new Scanner(System.in);

        System.out.print(jogador.getNome() + " dica: " + pergunta.getDica() + ": ");
        String resposta = sc.nextLine();

        if(pergunta.getResposta().equals(resposta)){
            int pontos = jogador.getQuantidadePontos();
            pontos += 20;
            jogador.setQuantidadePontos(pontos);
        } else {
            System.out.println(" segunda dica: " + pergunta.getSegundaDica() + ": ");
            String resposta2 = sc.next();
            
            if(pergunta.getResposta().equals(resposta2)){
                int pontos = jogador.getQuantidadePontos();
                pontos += 10;
                jogador.setQuantidadePontos(pontos);
            } else {
                System.out.println("A resposta está errada!");
            }
        } 
    }

    public Jogador getJogadorUm() {
        return jogadorUm;
    }

    public void setJogadorUm(Jogador jogadorUm) {
        this.jogadorUm = jogadorUm;
    }

    public Jogador getJogadorDois() {
        return jogadorDois;
    }

    public void setJogadorDois(Jogador jogadorDois) {
        this.jogadorDois = jogadorDois;
    }

    public int getPontuacaoJogadorUm() {
        return pontuacaoJogadorUm;
    }

    public void setPontuacaoJogadorUm(int pontuacaoJogadorUm) {
        this.pontuacaoJogadorUm = pontuacaoJogadorUm;
    }

    public int getPontuacaoJogadorDois() {
        return pontuacaoJogadorDois;
    }

    public void setPontuacaoJogadorDois(int pontuacaoJogadorDois) {
        this.pontuacaoJogadorDois = pontuacaoJogadorDois;
    }

    public String obterVencedor(){
        if(this.jogadorUm.getQuantidadePontos() >= 20 && this.jogadorDois.getQuantidadePontos() >= 20) {
            return null;
        } else if(this.jogadorUm.getQuantidadePontos() < 20 && this.jogadorDois.getQuantidadePontos() < 20) {
            return null;
        } else if(this.jogadorUm.getQuantidadePontos() >= 20) {
            return this.jogadorUm.getNome();
        } else if(this.jogadorDois.getQuantidadePontos() >= 20) {
            return this.jogadorDois.getNome();
        }
        return null;
    }
    
}
