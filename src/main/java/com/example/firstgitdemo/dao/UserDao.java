package com.example.firstgitdemo.dao;

import com.example.firstgitdemo.domain.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDao{

    private final SessionFactory sessionFactory;

    @Autowired
    public UserDao(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }
    public List<User> gerAllUsers() {
        String hql = "from User";
        Query query = getCurrentSession().createQuery(hql);
        return query.list();
    }

    public User getUserById(Integer id) {
        String hql = "from User where id = :id";
        Query query = getCurrentSession().createQuery(hql);
        return (User) query.setParameter("id", id).uniqueResult();
    }

}
