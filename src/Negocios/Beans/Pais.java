package Negocio.Beans;

public enum Pais {

BRA("Brasil"), 
ARG("Argentina"), 
CAN ("Canadá"),
CHN ("China"),
USA ("Estados Unidos"),
COL ("Colômbia"),
CUB ("Cuba"),
DEN ("Dinamarca"),
CRO ("Croácia"),
CZE ("República Checa"),
EGY ("Egito"),
ESP ("Espanha"),
PRT ("Portugal"),
PER ("Peru"),
CHL ("Chile"),
FRA ("France"),
ITA ("Italy"),
URY ("Uruguay"),
RUS ("Russia"),
MEX ("Mexico");

private String nomePais;

Pais(String nome) {

this.nomePais = nomePais;

}

public String getNomePais() {
return nomePais;
}
}