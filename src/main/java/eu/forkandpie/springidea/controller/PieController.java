package eu.forkandpie.springidea.controller;

import eu.forkandpie.springidea.entity.Pie;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Repository
@RestController
@RequestMapping("/pieapi")
public class PieController {

    @Autowired
    private SessionFactory sessionFactory;

    @GetMapping("/pies/{pieId}")
    private Pie getPie(@PathVariable int pieId) {
        Session session = sessionFactory.openSession();

        Pie pie = session.get(Pie.class, pieId);

        return pie;
    }
}
