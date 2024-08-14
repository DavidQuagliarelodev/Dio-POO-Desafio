package implement;

import interfaces.aparelhoTelefonico.AparelhoTelefonico;
import interfaces.navegadorInternet.NavegadorInternet;
import interfaces.reprodutorMusical.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private String modelo;
    private String cor;
    private int quantCameras;
    private double mpCameras;

    public Iphone(String modelo, String cor, int quantCameras, double mpCameras) {
        this.modelo = modelo;
        this.cor = cor;
        this.quantCameras = quantCameras;
        this.mpCameras = mpCameras;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getQuantCameras() {
        return quantCameras;
    }

    public void setQuantCameras(int quantCameras) {
        this.quantCameras = quantCameras;
    }

    public double getMpCameras() {
        return mpCameras;
    }

    public void setMpCameras(double mpCameras) {
        this.mpCameras = mpCameras;
    }

    @Override
    public void tocar() {
        System.out.println("Tocando musica.....");
    }

    @Override
    public void pausar() {
        System.out.println("Musica Pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Musica " + musica + " Selecionada!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Renderizando " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Adicionada!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Pagina Atualizada");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando Para: " + numero);
        System.out.println("Chamada não atendida");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Telefone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Reproduzindo Correio de voz");
    }
}
