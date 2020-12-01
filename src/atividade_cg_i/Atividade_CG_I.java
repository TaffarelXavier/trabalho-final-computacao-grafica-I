package atividade_cg_i;

/*
Item postado em 23 de nov. Editado às 23 de nov.
Atribuído
Complemente o projeto da atividade anterior.

Crie a classe Filtros e implemente os seguintes filtros:
- Escala de Cinza
- Negativo
- Limiarização (Threshold)
- Colorização de Imagem
- Sépia
 */

import javax.swing.*;

/**
 *
 * @author Taffarel Xavier
 * @email taffarelxavier7@gmail.com
 */
public class Atividade_CG_I {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        JOptionPane.showMessageDialog(null, "Olá, professor.\nEste é o trabalho:"
                + "\"Filtros\"\n"
                + "A seguir, aparecerão algumas caixas de diálogos.\n"
                + "Salve as imagens no disco com os nomes desejados. Clique em 'OK' para continuar.");
        
        Filtro pdi = new Filtro();

        pdi.executarPrograma();
    }

   
}
