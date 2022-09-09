public class GeneradorVertebrados {
    public static Vertebrado[] generarArrayVertebrados(){
        Vertebrado[] miVertebrados = new Vertebrado[4];
        miVertebrados[0] = new Vertebrado("Camello", "Mamifero"); 
        miVertebrados[1] = new Vertebrado("Vaca", "Mamifero");
        miVertebrados[2] = new Vertebrado("Tiburón", "Pez"); 
        miVertebrados[3] = new Vertebrado("Pez dorado", "Pez"); 
        miVertebrados[4] = new Vertebrado("Cirujano", "Pez"); 
        miVertebrados[5] = new Vertebrado("Perro", "Mamifero"); 
        
        return miVertebrados;
    }
}
