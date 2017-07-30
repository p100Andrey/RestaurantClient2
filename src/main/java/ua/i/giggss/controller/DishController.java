package ua.i.giggss.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ua.i.giggss.model.Dish;
import ua.i.giggss.model.Worker;
import ua.i.giggss.service.DishService;
import ua.i.giggss.service.WorkerService;

@Controller
public class DishController {
    private DishService dishService;

    @Autowired(required = true)
    @Qualifier(value = "dishService")
    public void setDishService(DishService dishService) {
        this.dishService = dishService;
    }

    @RequestMapping(value = "restaurantmap", method = RequestMethod.GET)
    public String restaurantmap() {
        return "restaurantmap";
    }

    @RequestMapping(value = "contacts", method = RequestMethod.GET)
    public String contacts() {
        return "contacts";
    }

    // формерую полный список книг
    @RequestMapping(value = "dishes", method = RequestMethod.GET)
    public String listDishes(Model model) {
        model.addAttribute("dish", new Dish());
        model.addAttribute("listDishes", this.dishService.listDishes());

        return "dishes";
    }

    @RequestMapping(value = "/dishes/add", method = RequestMethod.POST)
    public String addDish(@ModelAttribute("dish") Dish dish) {
        if (dish.getDishId() == 0) {
            this.dishService.addDish(dish);
        } else {
            this.dishService.updateDish(dish);
        }

        return "redirect:/dishes";
    }

    @RequestMapping("/remove/{id}")
    public String removeDish(@PathVariable("id") int id) {
        this.dishService.removeDish(id);

        return "redirect:/dishes";
    }

    @RequestMapping("edit/{id}")
    public String editDish(@PathVariable("id") int id, Model model) {
        model.addAttribute("dish", this.dishService.getDishById(id));
        model.addAttribute("listDishes", this.dishService.listDishes());

        return "dishes";
    }

    @RequestMapping("dishdata/{id}")
    public String dishData(@PathVariable("id") int id, Model model) {
        model.addAttribute("dish", this.dishService.getDishById(id));

        return "dishdata";
    }

}