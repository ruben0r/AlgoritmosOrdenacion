	package cuadrado;
	public class Cuadrado {
		
		private int[] c1;
		private int[] c2;
		private int[] c3;
		private int[] c4;
		public int[] getC1() {
			return c1;
		}
		public void setC1(int[] c1) {
			this.c1 = c1;
		}
		public int[] getC2() {
			return c2;
		}
		public void setC2(int[] c2) {
			this.c2 = c2;
		}
		public int[] getC3() {
			return c3;
		}
		public void setC3(int[] c3) {
	this.c3 = c3;
		}
	public int[] getC4() {
		return c4;
	}
	public void setC4(int[] c4) {
		this.c4 = c4;
	}
	public Cuadrado(int c1[],int c2[],int c3[],int c4[]){
		this.c1=c1;
		this.c2=c2;
		this.c3=c3;
		this.c4=c4;
	}
	public Cuadrado() {
		int c1[]= {0,0};
		this.c1=c1;
		int c2[]= {0,0};
		this.c2=c2;
		int c3[]= {0,0};
		this.c3=c3;
		int c4[]= {0,0};
		this.c4=c4;
}
	public void Dibujar() {
		for(int a=0;a<c3[0];a++) {
			if(a==0||a==c3[0]-1) {
				for(int i=0;i<c4[0];i++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else if(a<c3[0]-1) {
				for(int j=0;j<c4[0];j++) {
					if(j==0) {
						System.out.print("* ");
					}
					else if(j<c4[0]-1) {
						System.out.print("  ");
					}
					else if(j==c4[0]-1) {
						System.out.print("* ");
						System.out.println();
					}
				}
			}
		}
		System.out.println("");
	}
	public void dibRellenado() {
		for(int a=0;a<c3[0];a++) {
			if(a==0||a==c3[0]-1) {
				for(int i=0;i<c4[0];i++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			else if(a<c3[0]-1) {
				for(int j=0;j<c4[0];j++) {
					if(j==0) {
						System.out.print("* ");
					}
					else if(j<c4[0]-1) {
						System.out.print("* ");
					}
					else if(j==c4[0]-1) {
						System.out.print("* ");
						System.out.println();
					}
				}
			}
		}
		System.out.println("");
	}
	public void dibujarVertices	() {
		for(int a=0;a<c3[0];a++) {
			if(a==0) {
				System.out.print("("+c2[0]+","+c2[1]+")"+"		");
				System.out.print("("+c3[0]+","+c3[1]+")");	
				System.out.println();
			}
			else if(a==c3[0]-1) {
				System.out.print("("+c1[0]+","+c1[1]+")"+"           ");
				System.out.print("("+c4[0]+","+c4[1]+")");	
				
			}
			else if(a<c3[0]-1) {
				System.out.println("");
			}
		}
	}
	public boolean esCuadrado() {
		boolean esc=false;
		int D1= (int) Math.sqrt(Math.pow((c1[0]-c2[0]),2)+Math.pow((c1[1]-c2[1]),2));
		int D2= (int) Math.sqrt(Math.pow((c2[0]-c3[0]),2)+Math.pow((c2[1]-c3[1]),2));
		int D3= (int) Math.sqrt(Math.pow((c3[0]-c4[0]),2)+Math.pow((c3[1]-c4[1]),2));
		int D4= (int) Math.sqrt(Math.pow((c4[0]-c1[0]),2)+Math.pow((c4[1]-c1[1]),2));
		if(D1==D2&&D2==D3&&D3==D4&&D4==D1) {
			esc=true;
		}
		return esc;
	}
	public void compara(Cuadrado cuad) {
		int c1[]= cuad.c1;
		int c2[]= cuad.c2;
		int c4[]= cuad.c4;
		int A1=(c4[0]-c1[0])*(c2[1]-c1[1]);
		int A2=(this.c4[0]-this.c1[0])*(this.c2[1]-this.c1[1]);
		System.out.println("El cuadrado introducido anteriormente tiene un área de: "+A1+" Y el introducido reciente: "+A2);
		
	}
	}
	