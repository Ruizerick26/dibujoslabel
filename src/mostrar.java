import javax.swing.*;
public class mostrar {
        public static void main(String[] args) {
            //Instancia de la clase panel
            dibujo panel = new dibujo();
            //crear un marco de ventana
            JFrame aplicacion = new JFrame();
            //boton para cerrar ventana
            aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion.add(panel); //agregar panel a la ventana
            aplicacion.setSize(650,650); //settear tamaño de ventana
            aplicacion.setVisible(true); // visualizar ventana

            dibujo2 panel2 = new dibujo2();
            //crear un marco de ventana
            JFrame aplicacion2 = new JFrame();
            //boton para cerrar ventana
            aplicacion2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            aplicacion2.add(panel2); //agregar panel a la ventana
            aplicacion2.setSize(650,650); //settear tamaño de ventana
            aplicacion2.setVisible(true); // visualizar ventana




        }
}
