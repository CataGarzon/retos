import java.util.Scanner;

public class Reto2 
{
    /**
     * @param args
     */
    public static void main(String[] args) 
    {
        Scanner scanner= new Scanner(System.in);
        int pesoBebe = 0;
        int mesesBebe = 0;
        int dosisVacuna = 0;

        System.out.println("ingrese porfavor el peso del bebe: ");
		pesoBebe  = scanner.nextInt() + 10;
        System.out.println("ingrese porfavor los meses del bebe: ");
		mesesBebe = scanner.nextInt() * 10;

        dosisVacuna = pesoBebe + mesesBebe * 8;

        System.out.println("la dosis a aplicar es:" + dosisVacuna);
         
      
    }

    
}
