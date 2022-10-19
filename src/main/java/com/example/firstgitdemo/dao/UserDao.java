package com.example.firstgitdemo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDao{

//    private final SessionFactory sessionFactory;
//
//    @Autowired
//    public UserDao(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }


//    protected Session getCurrentSession() {
//        return sessionFactory.getCurrentSession();
//    }
//    public List<User> gerAllUsers() {
//        String hql = "from User";
//        Query query = getCurrentSession().createQuery(hql);
//        return query.list();
//    }
//
//    public User getUserById(Integer id) {
//        String hql = "from User where id = :id";
//        Query query = getCurrentSession().createQuery(hql);
//        return (User) query.setParameter("id", id).uniqueResult();
//    }

}
