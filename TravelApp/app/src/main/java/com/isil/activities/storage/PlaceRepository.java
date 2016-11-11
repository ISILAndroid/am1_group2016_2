package com.isil.activities.storage;

import com.isil.activities.R;
import com.isil.activities.model.NoteEntity;
import com.isil.activities.model.Place;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Created by Profesor on 03/11/2016.
 */
public class PlaceRepository {

    private List<Place> places;

    public PlaceRepository() {
        places = new ArrayList<Place>();
    }

    public void mock() {

        Calendar calendar= Calendar.getInstance();
        String ndate= ""+calendar.getTime();

        Place place1= new Place(1,"Cuzco","Cuzco - Machu Picchu - Camino Inca",
                "La Capital Arqueológica de América; constituye el mayor atractivo turístico del Perú y el más visitado. Cuzco fue la más grande ciudad y capital del Imperio Inca, luego fue tomada por los conquistadores españoles. Hoy en día muestra una arquitectura que fusiona el estilo Inca con el español. Su pueblo conserva con orgullo sus costumbres y tradiciones. Un lugar obligado para conocer es la mística y enigmática Machu Picchu la ciudad sagrada de los Incas que los conquistadores nunca conocieron y que fue descubirta a la cultura occidental en 1911, para llegar a ella también a través de la más famosa caminata el Camino Inca. Cuzco, como Machu Picchu, por su valor histórico y por su belleza han sido considerados como Patrimonio de la Humanidad. El Valle Sagrado de los Incas, Choquequirao, el Parque Nacional del Manu y muchos otros fascinantes lugares están esperando por usted.",
                R.mipmap.ic_cuzco, "#ff00ff");
        Place place2= new Place(1,"Puno","Lago Titicaca y Puno",
                "Puno está localizado en las alturas de los Andes, a orillas del Titicaca, el lago navegable más alto del mundo habitado por los Uros y con maravillos paisajes. En las islas de Amantani y Taquile podrá tener la experiencia de compartir la vida con sus nativos y hacer turismo vivencial. Tierra del legendario pueblo Aymara y la Cultura Tiahuanaco. Puno es la capital folklórica del Perú. La fiesta de la Virgen de la Candelaria celebrada en febrero, es una extraordinaria oportunidad de vivir las tradiciones del pueblo puneño. Ofrece una excelente alternativa para el turismo arqueológico, de culturas vivas y biodiversidad.",
                R.mipmap.ic_puno, "#2196F3");

        places.add(place1);
        places.add(place2);
    }

    public void addPlace(Place place)
    {
        places.add(place);
    }

    public void removePlace(Place place)
    {
        this.places.remove(place);
    }

    public void removePlaceById(int placeId)
    {
        int position=-1;
        Place note;
        for (int i = 0; i <this.places.size() ; i++)
        {
            note= places.get(i);
            if(note.getId()==placeId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< places.size())
        {
            this.places.remove(position);
        }
    }

    public void updatePlace(int position, Place place)
    {
        if(position< places.size())
        {
            places.set(position, place);
        }
    }
    public void updatePlaceeById(int noteId, Place place)
    {
        int position=-1;
        Place note;
        for (int i = 0; i <this.places.size() ; i++) {
            note= places.get(i);
            if(note.getId()==noteId)
            {
                position=i;
                break;
            }
        }
        if(position>=0 && position< places.size())
        {
            this.places.set(position, place);
        }
    }


    public List<Place> allPlaces()
    {
        return this.places;
    }

    public int countPlaces()
    {
        return this.places.size();
    }
    public Place lastPlace()
    {
        if(this.places.size()>0)
        {
            return this.places.get(this.places.size()-1);
        }
        return null;
    }
}
