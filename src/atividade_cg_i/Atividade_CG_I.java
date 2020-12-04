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
import java.awt.image.BufferedImage;
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

        Filtro pdi = new Filtro();
        
        BufferedImage bufferIn, bufferOut;

        bufferIn = pdi.carregarImagem("filename.jpg");
        
        bufferOut = pdi.setColorizacao(bufferIn);
        
        pdi.save(bufferOut, "taffarel.jpeg");
        // pdi.executarPrograma();
    }

}
