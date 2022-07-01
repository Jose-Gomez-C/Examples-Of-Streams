package main;

import main.model.Duration;
import main.services.CursosServices;



public class Main {

    public static void main(String[] args) {
        CursosServices cursosServices = new CursosServices();
        System.out.println("problema uno: ");
        cursosServices.getAllCourseByDuration(5, Duration.GREATERTHAN).forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("problema dos: ");
        cursosServices.getAllCourseByDuration(2, Duration.LESSTHAN).forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("probelma tres: ");
        cursosServices.getAllCourseByNumberOfVideos(50).forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("problema cuatro: ");
        cursosServices.getCourseLongestDuration().forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("Problema Cinco:");
        System.out.println(cursosServices.getTotalDuration());
        System.out.println("Problema seis:");
        cursosServices.getCourseLongerThanAverage().forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("Problema seis:");
        cursosServices.getCourseThanStudentsRegister(500).forEach(course -> System.out.println(course.getTitulo()));
        System.out.println("problema ocho");
        cursosServices.getAllCurseTitle().forEach(System.out::println);
        System.out.println();
    }
}
