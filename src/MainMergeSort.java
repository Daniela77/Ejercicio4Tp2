public class MainMergeSort {
	
    private final static int SIZE = 10000;
	public static void main(String[] args) {

				long t_inicial, t_final;
				int arr[]= new int[SIZE];
				OrdenamientoMergeSort oms = new OrdenamientoMergeSort();
				oms.cargarArrAleaorio(arr);
//				oms.mostrarArreglo(arr);
				
				System.out.println(" Se cargó el arreglo con :"+ SIZE + " elementos ");
				System.out.println("------------------------------------------------");
				
				t_inicial = System.currentTimeMillis();
				System.out.println("El tiempo inicial es de : "+t_inicial);
				oms.sort(arr);
				t_final = System.currentTimeMillis();
				System.out.println("El tiempo final es de : "+t_final);
				System.out.println("el ordenamiento de  MergeSort :"+ SIZE + " elementos tardó: "+ (  t_final- t_inicial ) +" milliseconds");
				
				System.out.println("     Arreglo ordenado por MergeSort    ");
				System.out.println("---------------------------------------");
//				oms.mostrarArreglo(arr);
			
		}
}
