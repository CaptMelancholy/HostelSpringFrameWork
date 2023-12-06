package com.danko.dao.impl;

import com.danko.dao.RoomsDAO;
import com.danko.entity.rooms.Rooms;
import com.danko.entity.user.User;
import com.danko.utils.HibernateSessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;
@Component
public class HibernateRoomsDAO implements RoomsDAO {

    private SessionFactory sessionFactory;

    @Autowired
    private HibernateRoomsDAO() { sessionFactory = HibernateSessionFactory.getSessionFactory();}

    @Override
    public Rooms findRoomByID(Long ID) {
        return null;
    }

    @Override
    public void deleteRoom(long ID) {

    }

    @Override
    public void addRoom(Rooms rooms) {

    }

    @Override
    public void updateRoom(Rooms rooms) {

    }

    @Override
    public List<Rooms> findAllRooms() {
        try(Session session = sessionFactory.openSession()) {
            CriteriaBuilder criteriaBuilder = session.getCriteriaBuilder();
            CriteriaQuery<Rooms> criteriaQuery = criteriaBuilder.createQuery(Rooms.class);
            Root<Rooms> root = criteriaQuery.from(Rooms.class);
            criteriaQuery.select(root);
            Query query = session.createQuery(criteriaQuery);
            return query.getResultList();
        }
    }
}
