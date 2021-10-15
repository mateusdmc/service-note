package notavisuart;

import notavisuart.Telas.TelaNovaNota;

public class NotaVisuArt {

    public static void main(String[] args) {
       TelaNovaNota telanovanota = new TelaNovaNota();
       telanovanota.setVisible(true);
       telanovanota.setResizable(false);
       telanovanota.setSize(540, 700);
    }
    
}
