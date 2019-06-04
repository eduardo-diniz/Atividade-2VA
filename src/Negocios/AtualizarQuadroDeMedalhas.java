/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;

import Dados.RepositorioDeMedalhas;
import Negocios.Beans.Pais;
import Negocios.Beans.TipoDeMedalhas;
import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Eduar
 */
public class AtualizarQuadroDeMedalhas implements Comparator<Pais> {

   

    @Override
    public int compare(Pais p, Pais p1) {
        int resultado = 0;

        int ouroP1 = RepositorioDeMedalhas.getinstance().contatorMedalhas(p1, TipoDeMedalhas.OURO);
        int prataP1 = RepositorioDeMedalhas.getinstance().contatorMedalhas(p1, TipoDeMedalhas.PRATA);
        int bronzeP1 = RepositorioDeMedalhas.getinstance().contatorMedalhas(p1, TipoDeMedalhas.BRONZE);
        int ouroP = RepositorioDeMedalhas.getinstance().contatorMedalhas(p, TipoDeMedalhas.OURO);
        int prataP = RepositorioDeMedalhas.getinstance().contatorMedalhas(p, TipoDeMedalhas.PRATA);
        int bronzeP = RepositorioDeMedalhas.getinstance().contatorMedalhas(p, TipoDeMedalhas.BRONZE);

        if (ouroP > ouroP1) {

            resultado = - 1;

        } else if (ouroP < ouroP1) {

            resultado = 1;

        } else if (ouroP == ouroP1) {

            if (prataP > prataP1) {

                resultado = - 1;

            } else if (prataP < prataP1) {

                resultado = 1;
            } else if (prataP == prataP1) {

                if (bronzeP > bronzeP1) {

                    resultado = - 1;

                } else if (bronzeP < bronzeP1) {

                    resultado = 1;
                } else if (bronzeP == bronzeP1) {

                    resultado = 0;

                }

            }

        }
        return resultado;
    }
}