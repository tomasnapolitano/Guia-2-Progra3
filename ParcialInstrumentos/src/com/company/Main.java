package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bateria bateria1 = new Bateria("Pearl",4,5);
        Bateria bateria2 = new Bateria("Yamaha",3,2);
        Bateria bateria3 = new Bateria("Tamboriloco",6,4);
        Bateria bateria4 = new Bateria("Energizer",8,1);

        GuitAcustica guitAcustica1 = new GuitAcustica(50000,"Parquer",Madera.CAOBA);
        GuitAcustica guitAcustica2 = new GuitAcustica(32000,"Gracia",Madera.CAOBA);
        GuitAcustica guitAcustica3 = new GuitAcustica(48300,"Yamaha",Madera.NOGAL);
        GuitAcustica guitAcustica4 = new GuitAcustica(23000,"Parquer",Madera.NOGAL);
        GuitAcustica guitAcustica5 = new GuitAcustica(70500,"Washburn",Madera.CAOBA);

        GuitElectrica guitElectrica1 = new GuitElectrica(78500,"Gibson","texas 1950");
        GuitElectrica guitElectrica2 = new GuitElectrica(92500,"Yamaha","SG");
        GuitElectrica guitElectrica3 = new GuitElectrica(42500,"SX","SemiHollow");
        GuitElectrica guitElectrica4 = new GuitElectrica(27500,"Canion","Stratocaster");

        Bajo bajo1 = new Bajo(54300, "Yamaha","FC-32");
        Bajo bajo2 = new Bajo(102000, "Bajazo","AMD-32");
        Bajo bajo3 = new Bajo(45350, "Bajon","CIA-32");
        Bajo bajo4 = new Bajo(72300, "Bajote","FBI-32");
        Bajo bajo5 = new Bajo(17800, "Bajito","CIDE-32");

        ArrayList<Instrumento> instrumentos = new ArrayList<Instrumento>();
        instrumentos.add(bateria1);
        instrumentos.add(bateria2);
        instrumentos.add(bateria3);
        instrumentos.add(bateria4);

        instrumentos.add(guitAcustica1);
        instrumentos.add(guitAcustica2);
        instrumentos.add(guitAcustica3);
        instrumentos.add(guitAcustica4);
        instrumentos.add(guitAcustica5);
        instrumentos.add(guitElectrica1);
        instrumentos.add(guitElectrica2);
        instrumentos.add(guitElectrica3);
        instrumentos.add(guitElectrica4);

        instrumentos.add(bajo1);
        instrumentos.add(bajo2);
        instrumentos.add(bajo3);
        instrumentos.add(bajo4);
        instrumentos.add(bajo5);

        for (Instrumento instrumento : instrumentos)
        {
            if (instrumento!=null)
                System.out.println(instrumento.toString());
        }

        for (Instrumento instrumento : instrumentos)
        {
            if (instrumento!= null)
            {
                instrumento.actualizarPrecio();
            }
        }
    }
}
