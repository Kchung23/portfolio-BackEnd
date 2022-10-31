package prueba_java;

public class Prueba_Java {
    
    public static void main(String[] args) {
        
        /*Auto auto1 = new Auto();*/
        Vehiculo vehi = new Vehiculo(52134, 4, "Renault", "Alfa");
        Auto auto2 = new Auto(1, "AA111JO", 5, "rojo", true, 65715, 4, "Volkswagen", "Gol Trende");
        Moto moto = new Moto(142, 124243, 2, "Yamaha", "ZR125");
        Camion cami1 = new Camion(6, true, 51234, 6, "Mercedez", "ModelZ");
        
        Vehiculo vector[] = new Vehiculo[4];
        vector[0] = vehi;
        vector[1] = auto2;
        vector[2] = moto;
        vector[3] = cami1;
        
        for (int i=0; i<4; i++){
            System.out.println("Registro N° " + i + vector[i].getMarca());
        }
        
        
        
        /*System.out.println(auto2.toString());
        System.out.println(auto1.toString());*/
        
        
        /*auto2.encender();
        auto2.acelerar(60);
        auto2.frenar(30);
        auto2.apagar();*/
          
      
        /*System.out.println("El valor del Id es: " + auto2.getId());
        auto2.setId(35000);
        System.out.println("El nuevo valor del Id es: " + auto2.getId());*/
        
        /*System.out.println("La id de auto1 es: " + auto1.getId());
        System.out.println("El color del auto1 es: " + auto1.getColor());
        
        auto1.setId(1500);
        auto1.setPatente("ADSD87");
        auto1.setCant_puertas(3);
        auto1.setColor("Amarillo");
        auto1.setCaja_manual(false);
        
        System.out.println("--------------------");
        
        System.out.println("La nueva id de auto1 es: " + auto1.getId());
        System.out.println("El nuevo color del auto1 es: " + auto1.getColor());*/
        
        
    }
        
}
















