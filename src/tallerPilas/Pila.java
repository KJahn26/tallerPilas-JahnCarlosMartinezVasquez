package tallerPilas;

public class Pila<E> {

	private Node cima;
	private int size,capacity;

	public Pila(int capacity){
		this.capacity=capacity;
		this.size=0;
	}


	public void enpilar(E dato){
		Node n= new Node(dato);
		if(isEmpty()){
			cima = n;
			size++;
		}
		else if(isFull()){
			System.out.println("no hay más");
		}else{
			n.setNextNode(cima);
			cima=n;
			size++;
		}
	}

	public E desenpilar(){
		E dato= (E) cima.getInformation();
		cima= cima.getNextnode();
		size--;
		return dato;
	}

	public boolean isEmpty(){
		return cima==null;
	}

	public boolean isFull(){
		return size==capacity;
	}

	public void clearStack(){
		cima=null;
		size=0;
	}

	public E cimaPila(){
		return (E) cima.getInformation();
	}


	public int getSize() {
		return size;
	}

	public int getCapacity() {
		return capacity;
	}

	public void imprimirPila(){
		Pila p= new Pila(getCapacity());
		int t=getSize();
		int i=size;
		while(i!=0){
			E dato=(E) desenpilar();
			System.out.println(dato);
			p.enpilar(dato);
			i--;
		}
		while(i<t){
			enpilar((E) p.desenpilar());
			i++;
		}
	}



}
