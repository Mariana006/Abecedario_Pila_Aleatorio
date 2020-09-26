//Pila LIFO Abecedario aleatorio 
package abecedariopilaaleatorio;
import java.util.Scanner;
public class PilaAleatorio {
//Declaramos el vector llamado  "pilabc"
   char pilabc[]=new char[26];
   //Declaramos variables
 int tope=0; //inicializamos tope en 0 (cero)
 char letra,aux;
 
 //Declarar metodo (llamar pila)
    public void llenarpila() {

        //Declaramos el ciclo for 
        for (int i = 0; i < 26; i++) {
//Declaramos un condicionardor if-else que evaluara cada vuelta que realice el ciclo for 
            if (tope < 26) {
/*usamos el metodo "random" que nos permite mostrar el abecedario de forma aleatoria
declaramos una varibale de tipo char es donde se alacenara las letras del abacedario  , establecemos
hasta que elementos queremos que tome los valores aleatoria poniendo el fin el signo de mas "+"
despues el inico del que va empezar */              
                letra = (char) (Math.random() * 26 + 'a');
//ponemos el nombre del vector dentro de corchetes"[]" se pone la variable "tope" igual a "letra"
                
                pilabc[tope] = letra;
 //la variable "letra" en cada ejecucion se cumpla se aumentara una unidad 
                letra++;
 //la variable "tope" en cada ejecucion se cumpla se aumentara una unidad                 
                tope++;
//En caso contrario no se cumpla imprimira el mensaje y se cerrara al terminar
            } else {
                System.out.println("..... Pila llena .....");
                break;
            }
        }
    }
    //Declaramos el metodo (mostrar pila
  public void mostrarpila(){
 //Declaramos el ciclo  for 
      for(int i=tope-1; i>=0; i--){
//Se imprimira con un espacio entre cada letra 
          System.out.print(" "+pilabc[i]);
      }
  }   
  //Declaramos el metodo (eliminar pila)
  public void eliminarpila(){
      //Ss decrementara en una unidad 
     tope--;
     System.out.println("---- Datos Eliminados ----");
  }
  //Declaramos el metodo (agregar pila)
  public void agregarpila(char dato){
//Declaramos condicionador if , miestra esta se cumpla podra agregar el dato el usuario
      if(tope<26){
//El dato que se guadar en la variable "dato" se la pasara a "tope"       
      pilabc[tope]=dato;
      //aumentara en una unidad
      tope++;
      System.out.print("***** Dato Agregado *****");
      }
      
  }
  //Declaramos el metodo (ordenar pila)
   public void ordenarpila (){
       //Metodo burbuja (aninados) sirve para ordenar 
       //Declaramos el for para que sepa cuantas vuentas va a dar
    for(int i=0; i<tope-1; i++){
//Declaramos el for aninado este va ordenar los elemento
        for(int j=0; j<tope-1; j++){
//Declaramos condicionador if , si numero actual es menor que numero siguente estos se intercambian 
            if (pilabc[j]>pilabc[j+1]){
//Con la ayua de la variable "aux" podremos intercambiar los valores de los elementos 
 //aux es igual al numero actual
         aux=pilabc[j];
//Agregamos el valor actual al valor numero siguiente 
         pilabc[j]=pilabc[j+1];
//El numero siguientes vatener el numero siguiente          
         pilabc [j+1]=aux;
            } 
        }
        
    }
    //imprimimos el arreglo de forma ordenada (crecientemente) con un ciclo for
      for(int i=0; i<tope-1; i++){
      System.out.print(" "+pilabc[i]);
      }
    
  }
  public static void main(String[] args){
      //Creamos un objeto con el nombre "p"
      PilaAleatorio p =new PilaAleatorio();
//Declaramos el "Scanner" para la entrada de datos <son ingresados por el usuario> declarando el objeto con el combre "obj"
    Scanner obj =new Scanner(System.in);
      int opt;
      //"do" nos permite repetir el menu es un cliclo de repetición 
      do{
          //Munu 
         System.out.print("\n1. - Llenar\n"
                  + "2. - Mostrar\n"
                  + "3. - Eliminar\n"
                  + "4. - Agregar\n"
                  + "5. - Ordenar\n"
                  + "6. - Salir\n");
          switch(opt=obj.nextInt()){
             //llenar pila
              case 1:
                  p.llenarpila();
                  break;
                  //Mostrar pila
              case 2:
                  p.mostrarpila();
                  break;
                  //Eliminar pila
              case 3: 
                  p.eliminarpila();
                  break;
                  //Agregar pila 
              case 4:
                  //Solicitamos al usuario que dijite su dato 
                  System.out.println("Ingresa el Dato:\n");
                  char dato=obj.next().charAt(0);
                  p.agregarpila(dato);
                  break;
              case 5:
                  p.ordenarpila();
                  break;

            }

        } 
      while (opt != 6);
    }

}
