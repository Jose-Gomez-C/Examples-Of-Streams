package test;

import main.model.Curso;
import main.model.Duration;
import main.services.CursosServices;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class TestOne {
    private CursosServices cursosServices;
    @Before
    public void setUp(){
        cursosServices = new CursosServices();
    }
    @Test
    public void getAllCoursesLessThanNumber(){
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getAllCourseByDuration(2, Duration.LESSTHAN);
        courses.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }
    @Test
    public void shouldGetAllCoursesGreaterThanNumber(){
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getAllCourseByDuration(5, Duration.GREATERTHAN);
        courses.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }

    @Test
    public void shouldGetAllCourseByNumberVideos() {
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getAllCourseByNumberOfVideos(50);
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }
    @Test
    public void shouldOrderCourseByDuration(){
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getCourseLongestDuration();
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        courses.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        courses.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        courses.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }
    @Test
    public void shouldGetTotalDuration(){
        assertEquals(28.5, cursosServices.getTotalDuration(), 0.1);
    }
    @Test
    public void shouldGetCourseLongerThanAverage(){
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getCourseLongerThanAverage();
        courses.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }
    @Test
    public void shouldGetCourseThanStudentsRegister(){
        List<Curso> courses = new ArrayList<>();
        List<Curso> result = cursosServices.getCourseThanStudentsRegister(500);
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        assertEquals(courses.size(), result.size());
        for (int i = 0; i < courses.size(); i++){
            assertTrue(courses.get(i).equals(result.get(i)));
        }
    }
    @Test
    public void shouldGetAllCurseTitle(){
        List<Curso> courses = new ArrayList<>();
        List<String> result = cursosServices.getAllCurseTitle();
        courses.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        courses.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        courses.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        courses.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        courses.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));
        assertEquals(courses.size(), result.size());
        result.forEach(System.out::println);
        for (int i = 0; i < courses.size(); i++){
            assertEquals(courses.get(i).getTitulo(), result.get(i));
        }

    }


}
