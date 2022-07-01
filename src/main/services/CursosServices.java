package main.services;

import main.model.Curso;
import main.model.Duration;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CursosServices {
    private List<Curso> cursos;

    public CursosServices() {
        cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
    }

    public List<Curso> getAllCourseByDuration(float duration, Duration whatDuration) {
        List<Curso> result = new ArrayList<>();
        switch (whatDuration) {
            case LESSTHAN -> result = cursos.stream().filter(course -> course.getDuracion() < duration).toList();
            case GREATERTHAN -> result = cursos.stream().filter(course -> course.getDuracion() > duration).toList();
        }
        return result;
    }

    public List<Curso> getAllCourseByNumberOfVideos(int numberVideos) {
        return cursos.stream().filter(course -> course.getVideos() > numberVideos).toList();
    }

    public List<Curso> getCourseLongestDuration() {
        //Como hacer que un map o un for each o el mismo sorted me entrege solo tres cursos, o es mejor ordenar atravez del stream y despues escoger los 3 primeros
        //Este deja el estado de la lista curso ordenada?
        return cursos.stream().sorted(Comparator.comparingDouble(Curso::getDuracion).reversed()).toList();
    }

    public double getTotalDuration(){
        return cursos.stream().mapToDouble(Curso::getDuracion).sum();
    }

    public List<Curso> getCourseLongerThanAverage(){
        double average = getTotalDuration() / cursos.size();
        return cursos.stream().filter(course -> course.getDuracion() > average).toList();

    }

    public  List<Curso> getCourseThanStudentsRegister(int numberStudent){
        return cursos.stream().filter(courses -> courses.getAlumnos() > numberStudent).toList();
    }

    public List<String> getAllCurseTitle(){
        return cursos.stream().map(Curso::getTitulo).toList();
    }



}

