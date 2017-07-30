package ua.i.giggss.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import ua.i.giggss.model.Dish;

import java.util.List;

@Repository
public class DishDaoImpl implements DishDao {
    private static final Logger logger = LoggerFactory.getLogger(DishDaoImpl.class);

    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void addDish(Dish dish) {
        Session session = this.sessionFactory.getCurrentSession();
        session.persist(dish);
        logger.info("Dish successfully saved. Dish details: " + dish);
    }

    @Override
    public void updateDish(Dish dish) {
        Session session = this.sessionFactory.getCurrentSession();
        session.update(dish);
        logger.info("Dish successfully update. Dish details: " + dish);
    }

    @Override
    public void removeDish(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Dish dish = (Dish) session.load(Dish.class, new Integer(id));

        if (dish != null) {
            session.delete(dish);
        }
        logger.info("Dish successfully removed. Dish details: " + dish);
    }

    @Override
    public Dish getDishById(int id) {
        Session session = this.sessionFactory.getCurrentSession();
        Dish dish = (Dish) session.load(Dish.class, new Integer(id));
        logger.info("Dish successfully loaded. Dish details: " + dish);

        return dish;
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<Dish> listDishes() {
        Session session = this.sessionFactory.getCurrentSession();
        List<Dish> dishList = session.createQuery("from Dish").list();

        for(Dish dish: dishList){
            logger.info("Dish list: " + dish);
        }

        return dishList;
    }
}
