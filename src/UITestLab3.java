
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Erick Cordero
 */
import java.io.*;
import java.util.ArrayList;
public class UITestLab3
{
    /**
     * @param args the command line arguments
     */
    static BufferedReader in  =  new BufferedReader(new InputStreamReader(System.in));
    static PrintStream    out =  System.out;
    static ArrayList<Cliente> clientes= new ArrayList<Cliente>();
    static int contBicisMontania=0;
      
    public static void main(String[] args)throws java.io.IOException
    {
        
        /*Bicycle miBici;
        miBici = new Bicycle(12,23,35);
        
        MountainBike miMountain;
        miMountain = new MountainBike(23,32,34,"Delantera");
        
        RoadBike miRuta;
        miRuta = new RoadBike(22,33,45,12);
        
        Cliente miCliente;
        miCliente = new Cliente("503150579","Erick");
        
        
        Object[] miObjeto = new Object[3];
        
        miObjeto[0] = miBici;
        miObjeto[1] = miMountain;
        miObjeto[2] = miRuta;
        //miObjeto[3] = miCliente;
        
        for(int i=0;i<miObjeto.length;i++)
        {
            out.println(miObjeto[i].toString());
        }*/
        
        boolean continuar=true;
        char opcion;
        
        do{
            String [] lista;
            lista= opcionesMenu();
            menu(lista);
            opcion=seleccionarOpcionMenu();
            continuar=procesarOpcionMenu(opcion);
        }while(continuar);
    }
    
    static String[] opcionesMenu()
    {
        String[] lista ={"====== MENU PRINCIPAL ======",
                         "[1] Llenar los datos de las Bicicletas",
                         "[2] Llenar los datos de las Bicicletas de Montaña",
                         "[3] Llenar los datos de las Bicicletas de Ruta",
                         "[4] Imprimir la Informacion de las Bicis",
                         "[5] Imprime la informacion de las Bicis de Montaña",
                         "[6] Imprime la informacion de las Bicis de Ruta",
                         "[0] Salir del Menu Principal"};
        return lista;
    }
    
    static void menu(String [] pLista)
    {
        out.println();
        for(int i=0;i<pLista.length;i++)
        {
            out.println(pLista[i]);
        }
        out.println();
            
    }
    
    static char seleccionarOpcionMenu()throws java.io.IOException
    {
        char opcion;
        
        out.println("Seleccione la opcion de su preferencia");
        opcion= in.readLine().charAt(0);
        return opcion;
    }
    
    static boolean procesarOpcionMenu(char pOpcion)throws java.io.IOException
    {
        boolean continuar=true;
        
        switch(pOpcion)
        {
            case'1':
                llenarBici();
                break;
                
            case'2':
                //llenarBiciMontania();
                break;
                    
            case'3':
               // llenarBiciRuta();
                break;
                
                
            case'4':
                imprimeBici();
                break;
                
                
            case'5':
                //imprimeMountain();
                break;
                
                
            case'6':
              //  imprimeRuta();
                break;
                
            case'0':
                continuar=false;
                break;
                
            default:
                out.println("Dato Incorrecto");
                break;
                  
        }
        return continuar;
    }
    
    
    public static void llenarBici()throws java.io.IOException
    {
        Cliente miCliente;
        miCliente = new Cliente();
        
        MountainBike miMountain;
        miMountain = new MountainBike();
        
        out.println("Ingtrese la cedula del cliente");
        miCliente.setCedula(in.readLine());
        
        out.println("Ingrese el Nombre del cliente");
        miCliente.setNombre(in.readLine());
        
        out.println("Ingrese la edad del cliente");
        miCliente.setEdad(Integer.parseInt(in.readLine()));
        
        out.println("Indique la cantidad de Bicis de Montaña que tiene el Cliente");
        miCliente.setCantBicisMontania(Integer.parseInt(in.readLine()));

        miCliente = new Cliente(miCliente.getCedula(),miCliente.getNombre(),miCliente.getEdad(),miCliente.getCantBicisMontania());

        //la asignacion de las bicis al cliente

        for(int i=0;i<miCliente.getMiBiciMontania().length;i++)
        {
            out.println("Ingrese la Candencia de la Bicicleta...:"+(i+1));
            miMountain.setCadence(Integer.parseInt(in.readLine()));

            out.println("Ingrese el Engranaje de la Bicicleta");
            miMountain.setGear(Integer.parseInt(in.readLine()));

            out.println("Ingrese la velocidad de la Bicicleta");
            miMountain.setSpeed(Integer.parseInt(in.readLine()));

            out.println("Ingrese el tipo de suspension de la Bici");
            miMountain.setSuspension(in.readLine());


            miCliente.getMiBiciMontania()[i]= new MountainBike(miMountain.getCadence(),miMountain.getGear(),miMountain.getSpeed(),miMountain.getSuspension());
            clientes.add(miCliente);



        }
   
    }

    public static void imprimeBici()
    {
       
        
        
        for(Cliente unCliente : clientes)
        {
            while(contBicisMontania < unCliente.getMiBiciMontania().length)
            {
                
                out.println(unCliente.toString());
                for(int i=0;i<unCliente.getMiBiciMontania().length;i++)
                {
                    out.println("Datos de la Bicicleta...:"+(i+1));
                    out.println(unCliente.getMiBiciMontania()[i].toString());
                    contBicisMontania=contBicisMontania+1;
                }
            }
        }
    }
}
                
            
            
            
            
        
        
        
        
        
    
    
   
   

    

    

        
        
       
   

    

        
        
    

    
        
    
        
    

