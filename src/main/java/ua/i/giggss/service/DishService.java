package ua.i.giggss.service;

import ua.i.giggss.model.Dish;

import java.util.List;

public interface DishService {
    public void addDish(Dish dish);

    public void updateDish(Dish dish);

    public void removeDish(int id);

    public Dish getDishById(int id);

    public List<Dish> listDishes();
}
