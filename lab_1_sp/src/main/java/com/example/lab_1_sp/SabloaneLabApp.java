package com.example.lab_1_sp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.lab_1_sp.models.Book;
import com.example.lab_1_sp.models.Element;
import com.example.lab_1_sp.models.Paragraph;
import com.example.lab_1_sp.models.Section;
import com.example.lab_1_sp.services.*;
import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.lab_1_sp.models", "com.example.lab_1_sp.services"})
public class SabloaneLabApp {

    public static void main(String[] args) {
        //SpringApplication.run(SabloaneLabApplication.class, args);
        /*long startTime = System.currentTimeMillis();
        ImageProxy img1 = new ImageProxy("Pamela Anderson");
        ImageProxy img2 = new ImageProxy("Kim Kardashian");
        ImageProxy img3 = new ImageProxy("Kirby Griffin");
        Section playboyS1 = new Section("Front Cover");
        playboyS1.add(img1);
        Section playboyS2 = new Section("Summer Girls");
        playboyS2.add(img2);
        playboyS2.add(img3);
        Book playboy = new Book("Playboy");
        playboy.addContent(playboyS1);
        playboy.addContent(playboyS2);
        long endTime = System.currentTimeMillis();
        System.out.println("Creation of the content took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing of the section 1 took " + (endTime -
                startTime) + " milliseconds");
        startTime = System.currentTimeMillis();
        playboyS1.print();
        endTime = System.currentTimeMillis();
        System.out.println("Printing again the section 1 took " + (endTime -
                startTime) + " milliseconds");*/


        ApplicationContext context = SpringApplication.run(SabloaneLabApp.class, args);
        /*TransientComp transientBean = context.getBean(TransientComp.class);
        transientBean.operation();

        transientBean = context.getBean(TransientComp.class);
        transientBean.operation();

        SingletonComp singletonBean = context.getBean(SingletonComp.class);
        singletonBean.operation();

        singletonBean = context.getBean(SingletonComp.class);
        singletonBean.operation();

        ClientComp c = context.getBean(ClientComp.class);
        c.operation();

        c = (ClientComp)context.getBean("clientComponent");
        c.operation();*/

        BooksService booksService = context.getBean(BooksService.class);
        BookController bookController = context.getBean(BookController.class);

        Book book = new Book("Carte1");

        Section cap1 = new Section("Capitolul 1");
        cap1.add(new Paragraph("Paragraph 1"));
        cap1.add(new Paragraph("Paragraph 2"));
        cap1.add(new Paragraph("Paragraph 3"));
        book.addContent(cap1);
        book.addContent(new Paragraph("Multumesc!"));
        bookController.createBook(book);
        bookController.getAll();

 
    }
}
