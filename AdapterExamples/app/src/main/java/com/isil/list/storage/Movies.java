package com.isil.list.storage;

import com.isil.list.model.MovieEntity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Profesor on 27/10/2016.
 */
public class Movies {

    //DATA SOURCE
    public static final String[] DATA = {"Batman", "Tiburón","Harry Potter",
            "DR. STRANGE","UNA PAREJA DISPAREJA","ROBERT EL MUNECO POSEIDO",
    "ENEMIGO EN LA RED","PRESENCIA DIABOLICA","Batman", "Tiburón","Harry Potter",
            "DR. STRANGE","UNA PAREJA DISPAREJA","ROBERT EL MUNECO POSEIDO",
            "MANOS DE PIEDRA","LA REINA DE KATWE"};

    public  List<MovieEntity> movieEntityList;

    public Movies() {
        movieEntityList= new ArrayList<>();
        movieEntityList.add(new MovieEntity("Batman",false));
        movieEntityList.add(new MovieEntity("Tiburón",false));
        movieEntityList.add(new MovieEntity("Harry Potter",true));
        movieEntityList.add(new MovieEntity("LA REINA DE KATWE",false));
        movieEntityList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieEntityList.add(new MovieEntity("UNA PAREJA DISPAREJA",false));
        movieEntityList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieEntityList.add(new MovieEntity("ENEMIGO EN LA RED",true));
        movieEntityList.add(new MovieEntity("ROBERT EL MUNECO POSEIDO",true));
        movieEntityList.add(new MovieEntity("LA REINA DE KATWE",true));
    }

    public List<MovieEntity> getMovieEntityList() {
        return movieEntityList;
    }
}
