class node:
    def __init__(self, dato = None, next = None):
        self.dato = dato
        self.next = next

class Listasim: 
    def __init__(self):
        self.head = None

    def anadir(self, dato):
        if not self.head:
            self.head = node(dato=dato)
            return
        curr = self.head
        while curr.next:
            curr = curr.next
        curr.next = node(dato=dato)

    def vacia(self):
        return self.head == None
    
    def eliminar(self, key):
        curr = self.head
        prev = None
        while curr and curr.dato != key:
            prev = curr
            curr = curr.next
        if prev is None:
            self.head = curr.next
        elif curr:
            prev.next = curr.next
            curr.next = None

    def mostar( self ):
        node = self.head
        while node != None:
            print(node.dato, end =" => ")
            node = node.next

l = Listasim()
l.anadir(5)
l.anadir(4) 
l.anadir(6) 
l.anadir(2) 
l.anadir(1) 

if __name__ == "__main__":
    ls = Listasim()
    while(True):
        print ("----- Seleccione una opcion -----\n"+
        "1. Mostrar Lista\n"+
        "2. Añadir dato\n"+
        "3. Eliminar dato\n"+
        "4. Verificar si esta vacia\n")
        num = input("Seleccione la opcion a realizar: ")
        if num == "1":
            print ("La lista es: ")
            l.mostar()
            print ("\n ----------------------------")
        elif num == "2":
            dato = input ("Digite el valor que desea añadir: ")
            l.anadir(dato)
            print ("\n Se ha añadido el dato: "+ dato)
            print ("\n ----------------------------")
          
        elif num == "3":
            dato = input("Ingrese el valor a eliminar: ")
            if (l.eliminar(dato)):
                print ("El valor se ha eliminado")
            else:
                print ("No se ha encontrado el valor que desea eliminar")
                print ("\n ----------------------------")
        elif num == "4":
            print ("La lista esta vacia: ")
            l.vacia()
            print ("\n ----------------------------")