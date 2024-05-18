public class Retangulo {
    private int largura;
    private int altura;
    private String texto;

    public Retangulo(int largura, int altura, String texto) {
        this.largura = largura;
        this.altura = altura;
        this.texto = texto;
    }

    public void desenhar() {
        desenharLinha();
        desenharTexto();
        desenharLinha();
    }

    private void desenharLinha() {
        System.out.println("+" + "-".repeat(largura) + "+");
    }

    private void desenharTexto() {
        int espacosAntes = (largura - texto.length()) / 2;
        int espacosDepois = largura - texto.length() - espacosAntes;
        System.out.println("|" + " ".repeat(espacosAntes) + texto + " ".repeat(espacosDepois) + "|");
    }
}
