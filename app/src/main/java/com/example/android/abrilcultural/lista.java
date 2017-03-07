package com.example.android.abrilcultural;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by INTEL on 06/03/2017.
 */

public class lista {
     ArrayList<Evento> listaEventos;

    public  lista() {
        listaEventos=new ArrayList<>();

        listaEventos.add(new Evento("Abril","Miércoles","1",
                "Exposición","Las Calles de salta a tarves del tiempo","Fotografias de las principales calles",
                "Fotografías de las principales calles y avenidas de nuestra ciudad en distintas" +
                        "épocas, permitiendo a los visitantes conocer la historia y evolución de la ciudad" +
                        "de Salta"
                ,"Museo de la Ciudad Casa de Hernández Sala Teresa Cadena de Hesling – Museo de la Ciudad Hernández –" +
                "Florida 79 – Salta", "9:00 a 13:00 hs y de 16:00 a 20:30 hs" ));
        listaEventos.add(new Evento("Abril","Miércoles","1",
                "Exposición","Paseo de Esculturas","Esculturas de los Expositores Carlos" +
                "Enrique Valdez, Carlos Ponce Peñalba, Fabián Nanni, Martín Zambrano, Pilar" +
                "Velasco, Roberto Giménez "
                ," Kiosco de Arte Javier Farfán ","Galeria el Palacio – Mitre 37 - Salta","08:00 a 22:00"));
        listaEventos.add(new Evento("Abril","Miércoles","1", "Exposición",
                "Filipinas”. Grupo Connection Art. Project.","Permanecerá hasta el 13 de abril. "
                ," Kiosco de Arte Javier Farfán ","Casa de la Cultura","08:00 a 22:00"));
        listaEventos.add(new Evento("Abril","Miércoles","1", "Exposición",
                "Vestidos Antiguos de Alta Costura de los siglos XIX y XX","A" +
                "través del tiempo en la moda, recordando la vestimenta de nuestros" +
                "antepasados "
                ,"Museo de la Ciudad Casa de Hernández","Sala de Recepción – Museo de la Ciudad Casa de Hernández – Florida" +
                "20 – Salta"," 9:00 a 13:00 hs y de 16:00 a 20:30 hs "));

        listaEventos.add(new Evento("Abril","Miércoles","1", "Exposición",
                "Vestidos Antiguos de Alta Costura de los siglos XIX y XX","A" +
                "través del tiempo en la moda, recordando la vestimenta de nuestros" +
                "antepasados "
                ,"Museo de la Ciudad Casa de Hernández","Sala de Recepción – Museo de la Ciudad Casa de Hernández – Florida" +
                "20 – Salta"," 9:00 a 13:00 hs y de 16:00 a 20:30 hs "));

        listaEventos.add(new Evento("Abril","Miércoles","1", "Exposición",
                "Vestidos Antiguos de Alta Costura de los siglos XIX y XX","A" +
                "través del tiempo en la moda, recordando la vestimenta de nuestros" +
                "antepasados "
                ,"Museo de la Ciudad Casa de Hernández","Sala de Recepción – Museo de la Ciudad Casa de Hernández – Florida" +
                "20 – Salta"," 9:00 a 13:00 hs y de 16:00 a 20:30 hs "));

        listaEventos.add(new Evento("Abril","Jueves","2", "Exposición", "Jueves de Jazz y Vino ","","Café del Tiempo y Bodega Miraluna","Balcarce 901 – Salta" +
                "20 – Salta"," desde las 22:00 "));

        listaEventos.add(new Evento("Abril","Viernes","3", "Exposición", "Cemento: Muestra de Luisa Gesualdo Cuencos de cemento “De" +
                "la Carmela","desde el 3 al 30 de abril. Contacto: 155753759"," Luisa Gesualdo","Cerro Azufre esq. Llullaillaco – Ruta 51, Km. 9/5 – San Luis, Salta "
                ," 15:00 a 20:00 hs "));
        listaEventos.add(new Evento("Abril","Viernes","3", "Exposición", "Taller de improvisación de Contemporáneo Victor Campichay " +
                "Emiliano Calvo"," ","  Escuela de Danza Alexander Ananiev ","Necochea 730 – Salta "
                ," 15:00 hs "));
        listaEventos.add(new Evento("Abril","Viernes","3", "Cine", "Documental “Tango en una noche de Verano”","Dirección:" +
                "Viviane Blumenschein ",
                " Dirección de Audiovisuales",
                "Espacio INCAA Hogar Escuela - Pje. Chiclana s/n e Hipólito Irigoyen –" +
                        "Salta. "
                ," 22:00 hs "));
        listaEventos.add(new Evento("Abril","Viernes","3", "Teatro", "UNIONES POSIBLES - Comedia Gourmet","Creación y Dirección de Mariana Kutulas",
                " Mariana Kutulas y Pro Cultura Salta ",
                "Sala Teatro-Bar – Sede de Pro Cultura Salta – Mitre 331 – Salta "
                ," 21:00 hs "));

        listaEventos.add(new Evento("Abril","Sabado","4", "Fotografia", "REENCUENTRO","A cargo del Fotógrafo: Erick Rafael Elías." +
                "Permanecerá hasta el día 19 de abril",
                " Museo Histórico del Norte ",
                "Museo Histórico del Norte – Caseros 549 – Salta. \n "
                ," 21:00 hs "));

        listaEventos.add(new Evento("Abril","Sabado","4", "Taller", "“Taller Ojo al Piojo","A cargo del Fotógrafo: Erick Rafael Elías." +
                "Permanecerá hasta el día 19 de abril",
                "  Pato Molina",
                " Sala de Talleres del Abril Cultural – Galeria El Palacio – Local 27 – Mitre 37- Salta"
                ," 09:00 hs "));
        listaEventos.add(new Evento("Abril","Sabado","4", "Taller", "Taller Mascaras y Títeres “Del papel al escenario, una propuesta para niños",
                " Dictado por Marcelo Barrios – Leomar Títeres ",
                " Marcelo Barrios – Leomar Títeres ",
                " Museo Casa Arias Rengel – Florida 20 – Salta "
                ," 10:30 hs "));
        listaEventos.add(new Evento("Abril","Sabado","4", "Taller", "Taller de Dibujo de Historietas y Caricaturas",
                " Dictado por Felipe Mendoza ",
                " Museo Arias Rengel  ",
                " Museo Casa Arias Rengel – Florida 20 – Salta "
                ," 10:30 hs "));

        Log.d("listado de eventos",String.valueOf (listaEventos.size()));

    }

    public  ArrayList<Evento> lista(String dia){
         ArrayList<Evento> listaFiltrada;
              listaFiltrada =new ArrayList<Evento>();
               for(int i=0;i<listaEventos.size();i++){
                   Log.d("dia del listado",listaEventos.get(i).getDiaMes());
                     if(dia==listaEventos.get(i).getDiaMes()){
                         Log.d("dia del listado",listaEventos.get(i).getDiaMes());
                         listaFiltrada.add(listaEventos.get(i));
                     };
               }
        Log.d("caracter pasado",dia);
        Log.d("listado de eventos",String.valueOf (listaFiltrada.size()));
        return listaFiltrada;
    }

    public ArrayList<Evento> getListado() {
        return listaEventos;
    }

    public void setListado(ArrayList<Evento> listado) {
        this.listaEventos = listado;
    }
}
