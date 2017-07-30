package ua.i.giggss.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.i.giggss.dao.DishDao;
import ua.i.giggss.model.Dish;

import java.util.List;

@Service
public class DishServiceImpl implements DishService {
    private DishDao dishDao;

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    @Override
    @Transactional
    public void addDish(Dish dish) {
        this.dishDao.addDish(dish);
    }

    @Override
    @Transactional
    public void updateDish(Dish dish) {
        this.dishDao.updateDish(dish);
    }

    @Override
    @Transactional
    public void removeDish(int id) {
        this.dishDao.removeDish(id);
    }

    @Override
    @Transactional
    public Dish getDishById(int id) {
        return this.dishDao.getDishById(id);
    }

    @Override
    @Transactional
    public List<Dish> listDishes() {
        return this.dishDao.listDishes();
    }
}