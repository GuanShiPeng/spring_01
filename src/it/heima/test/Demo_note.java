package it.heima.test;

import it.heima.config.SpringConfig;
import it.heima.domain.Note;
import it.heima.serviceimp.NoteService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by GuanShiPeng on 2017/7/28 15:37.
 */
public class Demo_note
{
    @Test
    public void t()
    {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext_note.xml");
        Note note_01 = (Note) cp.getBean("note");
        System.out.println(note_01);
    }

    @Test
    public void t1()
    {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext_note.xml");
        NoteService note_01 = (NoteService) cp.getBean("noteService");
        NoteService note_02 = (NoteService) cp.getBean("noteService");
        System.out.println(note_01);
        System.out.println(note_02);
    }

    @Test
    public void t2()
    {
        ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext("applicationContext_note.xml");
        NoteService note_01 = (NoteService) cp.getBean("noteService");
        note_01.save();
        note_01.delete();
        note_01.update();
        note_01.find();
        note_01.findAll();
    }

    @Test

    public void t3()
    {
        //创建注解的工厂类
        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(SpringConfig.class);

        Note note = (Note) annotation.getBean("note");

        System.out.println(note);
    }

    @Test
    public void t4()
    {
        AnnotationConfigApplicationContext annotation = new AnnotationConfigApplicationContext(SpringConfig.class);

        //得到service层对象
        NoteService noteService = (NoteService) annotation.getBean("noteService");

        noteService.save();


    }
}