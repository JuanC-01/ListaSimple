package ListaSimple_Java;
 public class Lista {
    private Nodo ini;
    private int tamano;
    
    public boolean Vacia() {
        return ini == null;
    }
    public int getTamano(){
        return tamano;
    }
    public void valor(int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (Vacia()) {
            ini = nuevo;
        } else{
            Nodo aux = ini;
            while(aux.getSiguiente() != null){
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamano++;
    }
    public void insertarvalor(int valorainsert, int valor){
        Nodo nuevo = new Nodo();
        nuevo.setValor(valor);
        if (!Vacia()) {
            if (buscar(valorainsert)) {
                Nodo aux = ini;
                while (aux.getValor() != valorainsert) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(nuevo);
                nuevo.setSiguiente(siguiente);
                tamano++;
            }
        }
    }
    public int getValor(int posicion){
        if(posicion>=0 && posicion<tamano){
            if (posicion == 0) {
                return ini.getValor();
            }else{
                Nodo aux = ini;
                for (int i = 0; i < posicion; i++) {
                    aux = aux.getSiguiente();
                }
                return aux.getValor();
            }

        }
        return posicion;
    }
    public boolean buscar(int valorbus){
        Nodo aux = ini;
        boolean encontrado = false;
        while(aux != null && encontrado != true){
            if (valorbus == aux.getValor()){
                encontrado = true;
            }
            else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
    public int getPosicion(int valorpos){
        if (buscar(valorpos)) {
            Nodo aux = ini;
            int cont = 0;
            while(valorpos != aux.getValor()){
                cont ++;
                aux = aux.getSiguiente();
            }
            return cont;
        }
        return valorpos;
    }
    public void editarvalor(int valorbus, int valor){
        if (buscar(valorbus)) {
            Nodo aux = ini;
            while(aux.getValor() != valorbus){
                aux = aux.getSiguiente();
            }
            aux.setValor(valor);
        }
    }
    public void removerValor(int valorremo){
        if (buscar(valorremo)) {
            if (ini.getValor() == valorremo) {
                ini = ini.getSiguiente();
            } else{
                Nodo aux = ini;
                while(aux.getSiguiente().getValor() != valorremo){
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);  
            }
            tamano--;
        }
    }
    public void removerPosicion(int posicion){
        if(posicion>=0 && posicion<tamano){
            if(posicion == 0){
                ini = ini.getSiguiente();
            }
            else{
                Nodo aux = ini;
                for (int i = 0; i < posicion-1; i++) {
                    aux = aux.getSiguiente();
                }
                Nodo siguiente = aux.getSiguiente();
                aux.setSiguiente(siguiente.getSiguiente());
            }
            tamano--;
        }
    }
    public void eliminar(){
        ini = null;
        tamano = 0;
    }
    public void list(){
        if (!Vacia()) {
            Nodo aux = ini;
            while(aux != null){
                System.out.print("[ "+ aux.getValor() +" ]" + " -> ");
                aux = aux.getSiguiente();
            }
        }
    }
}
