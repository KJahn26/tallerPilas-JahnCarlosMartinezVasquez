package tallerPilas;

public class tallerSolucion {

	public static void main(String[] args) {
		Pila p=new Pila(15);
		p.enpilar(40);
		p.enpilar(78);
		p.enpilar(12);
		p.enpilar(20);
		p.enpilar(10);

		p.imprimirPila();

		eliminarElementos(p,2,4);

		System.out.println();
		p.imprimirPila();

	}

	public static void eliminarElementos(Pila p, int nivelInf, int nivelSup){
		Pila p1= new Pila(p.getSize());

		for(int i=1;i<=nivelSup;i++){
			if(i<nivelInf){
				p1.enpilar(p.desenpilar());
			}else{
				p.desenpilar();
			}
		}
		while(p1.getSize()!=0){
			p.enpilar(p1.desenpilar());
		}


	}


}
