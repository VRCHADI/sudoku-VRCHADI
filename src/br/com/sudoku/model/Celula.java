package br.com.sudoku.model;

public class Celula {
    private int linha;
    private int coluna;
    private int valor;
    private boolean fixo;

    public Celula(int linha, int coluna, int valor, boolean fixo) {
        this.linha = linha;
        this.coluna = coluna;
        this.valor = valor;
        this.fixo = fixo;
    }

    public int getLinha() { return linha; }
    public int getColuna() { return coluna; }
    public int getValor() { return valor; }
    public boolean isFixo() { return fixo; }

    public void setValor(int valor) {
        if (!fixo) this.valor = valor;
    }
}