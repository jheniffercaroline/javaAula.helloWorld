package javaAula1;

 

public class javaAula1 {

 

    public static void main(String[] args) {
//        System.out.println("Ola mundo de Jheniffer");
        
//        boolean valor = false;

 

        //IF e ELSE para falso ou verdadeiro
//        if(valor == false) {
//        System.out.println("logica verdadeira");
//        
//        } else {
//            System.out.println("logica falsa");
//        }
//    }
        
        //estrutura de repetição WHILE de 1 até 10
//        int valor = 1;
//        while (valor < 10) {
//            valor++;
//            System.out.println(valor);
//            }
//        }
        
        //estrutura de repetição FOR de 1 até 10
//        for (int i = 0; i < 10; i++) {
//              System.out.println(i);
//        }
        
        //Estrutura de condições CASE
        int mes = 7; //mes recebe valor (7)
        switch (mes) {
          case 1:
            System.out.println("janeiro");
            break;
          case 2:
            System.out.println("fevereiro");
            break;
          case 3: //como dia é 3 ele para nesse CASE e imprime quarta
            System.out.println("março");
            break;
          case 4:
            System.out.println("abril");
            break;
          case 5:
            System.out.println("maio");
            break;
          case 6:
            System.out.println("Junho");
            break;
          case 7:
            System.out.println("julho");
            break;
          case 8:
              System.out.println("agosto");
              break;
          default:
            System.out.println("Numero não corresponde a nenhum mes");
        }
        
    }
    
}