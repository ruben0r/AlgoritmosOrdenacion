package OlgaritmosOrdenacion;
import javax.swing.JOptionPane;
public class Main 
{
	static int[][] Matriz=new int[4][4];
	static int[] Array=new int[2000];
	public static void main(String[] args) 
	{
//		RellenarArray();
//		ImprimirArray();
//		OrdenacionInsercion();
//		ImprimirArray();
//		RellenarArray();
//		ImprimirArray();
//		OrdenacionSeleccion();
//		ImprimirArray();
//		RellenarArray();
//		ImprimirArray();
//		OrdenacionBurbuja();
//		ImprimirArray();
	}

	public static int[] RellenarArray(int[] Array)
	{
		for (int i=0;i<Array.length;i++) 
		{
				Array[i]=(int) Math.floor(Math.random()*100+1);
		}
		return Array;
	}
	public static void ImprimirArray(int[] Array) 
	{
		String aux="";
		for (int i=0;i<Array.length;i++) 
		{
				aux+=String.valueOf(Array[i]+", ");
		}
		System.out.println(aux);
	}
	public static int[][] RellenarMatriz()
	{
		for (int i=0;i<4;i++) 
		{
			for(int j=0;j<4;j++)
			{
				Matriz[i][j]=(int) Math.floor(Math.random()*1000+1);
			}
		}
		return Matriz;
	}
	
	public static void ImprimirMatriz() 
	{
		String aux="";
		for (int i=0;i<4;i++) 
		{
			for(int j=0;j<4;j++)
			{
				aux+=String.valueOf(Matriz[i][j]+", ");
			}
			aux+="\n";
		}
		JOptionPane.showMessageDialog(null,aux);
	}
	
	public static int[] OrdenacionSeleccion(int[] Array) 
	{
		for (int i=0;i<=Array.length;i++) 
		{
			int aux=0;
			for(int j=i+1;j<Array.length;j++)
			{
				if(Array[j]<Array[i])
				{
					aux=Array[j];
					Array[j]=Array[i];
					Array[i]=aux;
				}
			}
		}
		return Array;
	}
	
	public static void OrdenacionInsercion()
	{
		System.out.println(System.currentTimeMillis());
		for (int i=1;i<Array.length;i++)
		{
			int aux=Array[i];
			int j=i-1;
			while(j>=0 && aux<Array[j])
			{
				Array[j+1]=Array[j];
				j--;
			}
			Array[j+1]=aux;
		}
		System.out.println(System.currentTimeMillis());
	}
	
	public static void OrdenacionBurbuja() 
	{
		System.out.println(System.currentTimeMillis());
		for (int i=0;i<=Array.length;i++) 
		{
			int aux=0;
			for(int j=0;j<=Array.length-i-2;j++)
			{
				if(Array[j]>Array[j+1])
				{
					aux=Array[j];
					Array[j]=Array[j+1];
					Array[j+1]=aux;
				}
			}
		}
		System.out.println(System.currentTimeMillis());
	}
}
