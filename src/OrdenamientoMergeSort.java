
public class OrdenamientoMergeSort {
	private final static int SIZE = 10000;
	private final static int MAX = 20;
	private int[] valores,contenedor;
	private int valor;
	/**
	 * @return the valores
	 */
	public int[] getValores() {
		return valores;
	}

	/**
	 * @param valores the valores to set
	 */
	public void setValores(int[] valores) {
		this.valores = valores;
	}

	/**
	 * @return the contenedor
	 */
	public int[] getContenedor() {
		return contenedor;
	}

	/**
	 * @param contenedor the contenedor to set
	 */
	public void setContenedor(int[] contenedor) {
		this.contenedor = contenedor;
	}

	/**
	 * @return the valor
	 */
	public int getValor() {
		return valor;
	}

	/**
	 * @param valor the valor to set
	 */
	public void setValor(int valor) {
		this.valor = valor;
	}

	public void sort(int[] v) {
		this.valores = v;
		valor = v.length;
		this.contenedor = new int[valor];
		mergesort(0, valor - 1);

	}

	private void mergesort(int bajo, int alto) {
		if (bajo < alto) {
			int medio = (bajo + alto) / 2;// Obtener el índice del elemento que está en el medio
			mergesort(bajo, medio);//Ordenar el lado izquierdo del arr
			mergesort(medio + 1, alto);//Ordenar el lado derecho del arr
			merge(bajo, medio, alto);//Combinar ambos

		}

	}
	
	private void merge(int bajo, int mitad, int alto) {

		// Copia ambas partes en el arreglo auxiliar
		for (int i = bajo; i <= alto; i++) {
			contenedor[i] = valores[i];
		}
		int i,j,k;
		i= bajo;
		j = mitad + 1;
		k = bajo;
		
		// Copia los valores más pequeños desde el lado izquierdo o derecho hacia atrás
		// del arr original
		while (i <= mitad && j <= alto) {
			if (contenedor[i] <= contenedor[j]) {
				valores[k] = contenedor[i];
				i++;
				} 
			else {
				valores[k] = contenedor[j];
				j++;
				}
			k++;
		}

		// Copia el resto del lado izquierdo del array en el array de destino
		while (i <= mitad) {
			valores[k] = contenedor[i];
			k++;
			i++;
		}
	}
	
	public void cargarArrAleaorio(int arr[]) {
		for (int i = 0 ; i < SIZE; i++)
			arr[i] = (int)(Math.random()*MAX+1);
		}
	
	public void mostrarArreglo(int[] arr) {
		for (int i=0;i<valor;i++)
			System.out.println(arr[i]);
	}

		
}
