import java.io.File;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;

public class StickerGenerator {

  public void create() throws Exception {

    // leitura da imagem
    var imagemOriginal = ImageIO.read(new File("entrada/filme-2.jpg"));

    // criar nova imagem em memoria com transparencia e tamanho novo

    int largura = imagemOriginal.getWidth();
    int altura = imagemOriginal.getHeight();
    int novaAltura = altura + 200;

    BufferedImage novaImagem = new BufferedImage(largura, novaAltura, BufferedImage.TRANSLUCENT);

    // copiar a imagem original para nova imagem
    Graphics2D graphics = (Graphics2D) novaImagem.getGraphics();
    graphics.drawImage(imagemOriginal, 0, 0, null);

    // escrever uma frase na nova imagem

    // escrever a nova imagem em um arquivo

    ImageIO.write(novaImagem, "png", new File("saida/figurinha.png"));

  }

  public static void main(String[] args) throws Exception {
    var geradora = new StickerGenerator();
    geradora.create();
  }

}
