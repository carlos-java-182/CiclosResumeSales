package resumen;

import javax.swing.JOptionPane;

public class Ventas {

	public static void main(String[] args) {
		
		int codigo_art,  facturacion_total = 0, cont = 0;
		float precio_litro, cant_litros, ventaporlitros , litrosuno = 0;
		
		for(int i=1; i<=5; i++) {
			
			codigo_art=Integer.parseInt(JOptionPane.showInputDialog("Digita el código"));
			cant_litros=Integer.parseInt(JOptionPane.showInputDialog("Digita la cantidad de litros"));
			precio_litro=Float.parseFloat(JOptionPane.showInputDialog("Digita el precio por litro"));
			
			
			ventaporlitros= (float )cant_litros*precio_litro;
			facturacion_total+=ventaporlitros;
			
			if(codigo_art==1) {
				litrosuno=cant_litros;
			}
			if(ventaporlitros>600) {
				cont++;
			}
		}
		
		System.out.println("Resumen de ventas");
		System.out.println("Facturación total "+facturacion_total);
		System.out.println("Cantidad de litros vendidos del artículo 1 "+litrosuno);
		System.out.println("Cantidad de facturas mayores a 600 dolares "+cont);
	}

}
