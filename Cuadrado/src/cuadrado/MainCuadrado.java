	package cuadrado;
	
	import javax.swing.JOptionPane;
	public class MainCuadrado {
		static Cuadrado cua[]=new Cuadrado[5];
		static Cuadrado c=new Cuadrado();
		static int c1[]=new int[2];
		static int c2[]=new int[2];
		static int c3[]=new int[2];
		static int c4[]=new int[2];
		public static void main(String[] args) {	
			Menu();
		}
		public static void Menu() {
			String[] botones= {"Crear cuadrado","Dibujar contorno cuadrado","Dibujar cuadrado con relleno","Dibujar vértices","Comparar cuadrados","Salir del programa"};
			int variable = JOptionPane.showOptionDialog (null, " ¿Qué desea hacer?", "Menú Cuadrado", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null, botones, botones[0]);
			switch (variable) {
			case 0:{
				for (int i=0;i<cua.length;i++) {
					if(cua[i]==null) {
						Introducir(i);
						i=cua.length-1;
					}
					else if(i==cua.length-1) {
						JOptionPane.showMessageDialog(null, "Ya está el máximo de cuadrados hechos: "+cua.length, "Error", JOptionPane.WARNING_MESSAGE, null);
					}
				}
				Menu();
			}	
			break;
			case 1:{
				int op=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el cuadrado a contornear"));
				if(cua[op-1]==null) {
					JOptionPane.showMessageDialog(null, "El cuadrado introducido no está creado", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
				else {
					cua[op-1].Dibujar();
				}
			}
			Menu();
			break;
			case 2:{
				int op=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el cuadrado a colorear"));
				if(cua[op-1]==null) {
					JOptionPane.showMessageDialog(null, "El cuadrado introducido no está creado", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
				else {
					cua[op-1].dibRellenado();
				}	
			}
			Menu();
			break;
			case 3:{
				int op=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el cuadrado a dibujar vértices"));
				if(cua[op-1]==null) {
					JOptionPane.showMessageDialog(null, "El cuadrado introducido no está creado", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
				else {
					cua[op-1].dibujarVertices();
				}	
			}
			Menu();
			break;
			case 4:{
				int op=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el primer cuadrado a comparar "));
				int op1=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el segundo cuadrado a comparar "));
				if(cua[op-1]==null) {
					JOptionPane.showMessageDialog(null, "El cuadrado introducido no está creado", "Error", JOptionPane.ERROR_MESSAGE, null);
				}
				else {
					cua[op-1].compara(cua[op1-1]);
				}
			}
			Menu();
			break;
			case 5:{
				JOptionPane.showMessageDialog(null, "Fin del programa",null,JOptionPane.WARNING_MESSAGE);
			}
			break;
			}
		}
		public static void Introducir(int i) {
			int x;
			int y;
			cua[i]=new Cuadrado();
			for (int a=0;a<4;a++) {
				x=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de x"+(a+1)));
				y=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el valor de y"+(a+1)));
				switch (a) {
				case 0:{
					cua[i].setC1(Transformasao(x,y));
				}
					break;
				case 1:{
					cua[i].setC2(Transformasao(x,y));
				}
				break;
				case 2:{
					cua[i].setC3(Transformasao(x,y));
				}
				break;
				case 3:{
					cua[i].setC4(Transformasao(x,y));
				}
				break;
				}
			}
		}
		public static int[] Transformasao(int a,int b) {
			int c[]= {a,b};
			return c;
		}
	}		