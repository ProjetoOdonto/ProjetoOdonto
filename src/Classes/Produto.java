package Classes;

public class Produto {
    
    private int codigo;
    private long codigo_barras;
    private String descricao;
    private int tipo;
    private int cod_fornec;   
    private String embalagem;
    private String unidade;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getCodigo_barras() {
        return codigo_barras;
    }

    public void setCodigo_barras(long codigo_barras) {
        this.codigo_barras = codigo_barras;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getCod_fornec() {
        return cod_fornec;
    }

    public void setCod_fornec(int cod_fornec) {
        this.cod_fornec = cod_fornec;
    }

    public String getEmbalagem() {
        return embalagem;
    }

    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
}
