//package ed.uml;

package ed.uml;

import java.util.List;


/**
 * 
 * @author TECH
 *
 */
public class Persona {
    private String nombre; // nombre de la persona
    private String apellido; // apellido de la persona
    private int edad; // edad de la persona

    /**
     * Devuelve el nombre de la persona.
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre de la persona.
     * @param nombre el nombre a establecer
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el apellido de la persona.
     * @return el apellido de la persona
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido de la persona.
     * @param apellido el apellido a establecer
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve la edad de la persona.
     * @return la edad de la persona
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Establece la edad de la persona.
     * @param edad la edad a establecer
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}

/**
 * Clase que representa a un estudiante.
 */
class Estudiante extends Persona {
    private int matricula; // número de matrícula del estudiante
    private Curso curso; // curso en el que está inscripto el estudiante

    /**
     * Devuelve el número de matrícula del estudiante.
     * @return el número de matrícula del estudiante
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * Establece el número de matrícula del estudiante.
     * @param matricula el número de matrícula a establecer
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * Devuelve el curso en el que está inscripto el estudiante.
     * @return el curso en el que está inscripto el estudiante
     */
    public Curso getCurso() {
        return curso;
    }

    /**
     * Establece el curso en el que está inscripto el estudiante.
     * @param curso el curso a establecer
     */
    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}

/**
 * La clase Curso representa un curso en una universidad, el cual tiene un nombre y una lista de estudiantes inscritos.
 */
class Curso {
    private String nombre;
    private List<Estudiante> estudiantes;

    /**
     * Retorna el nombre del curso.
     *
     * @return el nombre del curso.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del curso.
     *
     * @param nombre el nuevo nombre del curso.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retorna la lista de estudiantes inscritos en el curso.
     *
     * @return la lista de estudiantes inscritos en el curso.
     */
    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    /**
     * Establece la lista de estudiantes inscritos en el curso.
     *
     * @param estudiantes la nueva lista de estudiantes inscritos en el curso.
     */
    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }
}

/**
 * La clase Profesor representa a un profesor de una universidad, el cual tiene un nombre, un apellido, una edad y una lista de cursos que imparte.
 */
class Profesor extends Persona {
    private List<Curso> cursos;

    /**
     * Retorna la lista de cursos que imparte el profesor.
     *
     * @return la lista de cursos que imparte el profesor.
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Establece la lista de cursos que imparte el profesor.
     *
     * @param cursos la nueva lista de cursos que imparte el profesor.
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}

/**
 * La clase Universidad representa una universidad, la cual tiene una lista de profesores y una lista de cursos.
 */
class Universidad {
    private List<Profesor> profesores;
    private List<Curso> cursos;

    /**
     * Retorna la lista de profesores de la universidad.
     *
     * @return la lista de profesores de la universidad.
     */
    public List<Profesor> getProfesores() {
        return profesores;
    }

    /**
     * Establece la lista de profesores de la universidad.
     *
     * @param profesores la nueva lista de profesores de la universidad.
     */
    public void setProfesores(List<Profesor> profesores) {
        this.profesores = profesores;
    }

    /**
     * Retorna la lista de cursos de la universidad.
     *
     * @return la lista de cursos de la universidad.
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * Establece la lista de cursos de la universidad.
     *
     * @param cursos la nueva lista de cursos de la universidad.
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }
}
