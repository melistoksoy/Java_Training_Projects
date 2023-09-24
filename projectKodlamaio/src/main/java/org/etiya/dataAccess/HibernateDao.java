package org.etiya.dataAccess;


import org.etiya.entities.Category;
import org.etiya.entities.Course;
import org.etiya.entities.Instructor;

public class HibernateDao implements InstructorDao,CategoryDao,CourseDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanina eklendi");
        System.out.println("------");

    }

    @Override
    public void add(Category category) {
        System.out.println("Hibernate ile veritabanina eklendi");
        System.out.println("-----");

    }

    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile veritabanina eklendi");
        System.out.println("-----");


    }

}