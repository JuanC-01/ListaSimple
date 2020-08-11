package ListaSimple_Java;

public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.valor(5);
        lista.valor(10);
        lista.valor(4);
        lista.valor(14);
        lista.valor(9);
        
    System.out.println("----------------------- Lista -----------------------------");
        lista.list(); 
        System.out.print("| Tamaño de la Lista:  ");
        System.out.println(lista.getTamano());
        
        System.out.println("\nAgregar un nodo con valor 16 despues del 10");
        lista.insertarvalor(10, 16);
        lista.list();
        System.out.print("| Tamaño: ");
        System.out.println(lista.getTamano());
                
        System.out.println("\nReemplazar el valor 5 del primer nodo por 13");
        lista.editarvalor(5, 13);
        lista.list();
        System.out.print("| Tamaño: ");
        System.out.println(lista.getTamano());
                
        System.out.println("\nEliminar el nodo con el valor 14");
        lista.removerValor(14);        
        lista.list();
        System.out.print("| Tamaño: ");
        System.out.println(lista.getTamano());
        
        System.out.println("\nVerificar si esta el valor 40");
        System.out.println(lista.buscar(40));

        System.out.println("\nVerificar si esta el valor 10");
        System.out.println(lista.buscar(10));

        System.out.println("\nComprobar si la lista está vacia");
        System.out.println(lista.Vacia());
                
        System.out.println("\nEliminar la lista");
        lista.eliminar();
        
        System.out.println("\nConsultar si la lista está vacia");
        System.out.println(lista.Vacia());
    }   
}