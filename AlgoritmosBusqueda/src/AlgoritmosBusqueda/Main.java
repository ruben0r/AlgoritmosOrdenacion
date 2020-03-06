package AlgoritmosBusqueda;

import javax.swing.JOptionPane;

public class Main
{
	static int Array[]=new int[99000];
	
	public static void main(String[] args)
	{
		Array=OlgaritmosOrdenacion.Main.RellenarArray(Array);
		OlgaritmosOrdenacion.Main.ImprimirArray(Array);
		JOptionPane.showMessageDialog(null,Lineal(Array));
		OlgaritmosOrdenacion.Main.OrdenacionSeleccion(Array);
		OlgaritmosOrdenacion.Main.ImprimirArray(Array);
		JOptionPane.showMessageDialog(null,Binaria(Array));
	}
	static public int Lineal(int Array[])
	{
		int res=0;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a buscar"));
		System.out.println(System.currentTimeMillis());
		for(int i=0;i<Array.length;i++)
		{
			if(Array[i]==num)
			{
				res=i;
				i=Array.length;
			}
		}
		System.out.println(System.currentTimeMillis());
		return res;
	}
	static public int Binaria(int Array[])
	{
		int res=0;
		int inf=0;
		int sup=Array.length-1;
		int num=Integer.parseInt(JOptionPane.showInputDialog("Introduzca el número a buscar"));
		System.out.println(System.currentTimeMillis());
		while(inf<=sup)
		{
			int centro=(inf+sup)/2;
			if(num==Array[centro])
			{
				res=centro;
				inf=Array.length;
			}
			else if(num<Array[centro])
			{
				sup=centro-1;
			}
			else
			{
				inf=centro+1;
			}
		}
		System.out.println(System.currentTimeMillis());
		return res;
	}
}
