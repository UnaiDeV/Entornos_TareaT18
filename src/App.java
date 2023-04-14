import java.util.Scanner;

public class App {
        public static void main(String[] args) throws Exception {
        
            // RAMA MASTER V1       // RAMA MASTER V2
            // RAMA HOTFIX V1

        
        Scanner lectura = new Scanner(System.in);
                System.out.println("Introduce un número de euros para convertir");
                double b =lectura.nextInt();
                int a = 0;
        do{
            System.out.println("1.-Convertir euros a dólares.");
            System.out.println("2.-Convertir euros a libras.");
            System.out.println("3.-Convertir euros a yenes.");
            System.out.println("4.-Convertir euros a todas las monedas.");
            System.out.println("0.-Salir.");
            System.out.println("Introduce un número para elegir operaciones");
             a =lectura.nextInt();
            if (a>0) {

            
        
                switch (a) {
                    
                    case 1:
                        System.out.println(App.convertirAMonedas(b)[0]);
                        break;

                    case 2:
                        System.out.println(App.convertirAMonedas(b)[1]);
                        break;


                    case 3:
                        System.out.println(App.convertirAMonedas(b)[2]);
                        break;

                    case 4:
                        System.out.println("En dólares serían "+App.convertirAMonedas(b)[0]+ " en libras " +App.convertirAMonedas(b)[1]+ " y en yenes "+App.convertirAMonedas(b)[2]);
                        break;


                    default:
                    System.out.println("Este caso no es válido, vuelve a introducir un número");
                        break;
                
                }
            }
        } while (a!=0);
lectura.close();
    }

    public static double[] convertirAMonedas(double x) {
        
    double[] resultado = new double[3];
    resultado[0]=(x*0.98);
    resultado[1]=(x*0.87);
    resultado[2]=(x*144.73);

    return resultado;




    }
}
        



