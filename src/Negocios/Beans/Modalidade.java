package Negocios.Beans;

public enum Modalidade {

    CURLING("Curling"),
    ESQUI_ALPINO("Esqui alpino"),
    ESQUI_COUNTRY("Esqui cross-country"),
    ESQUI_LIVRE("Esqui estilo livre"),
    HOQUEI("Hóquei no gelo"),
    PATINACAO_ARTISTICA("Patinação artística"),
    PATINACAO_VELOCIDADE("Patinação de velocidade"),
    SALTO_ESQUI("Salto de esqui"),
    SNOWBOARD("Snowboard");

    private String nomeModalidade;

    Modalidade(String nome) {

        this.nomeModalidade = nome;

    }

    public String getNomeModalidade() {
        return nomeModalidade;
    }

}
