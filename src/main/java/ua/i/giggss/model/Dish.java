package ua.i.giggss.model;

import javax.persistence.*;

@Entity
@Table(name = "dish")
public class Dish {

    @Id
    @Column(name = "dishid")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dishId;

    @Column(name = "dishname")
    private String dishName;

    @Column(name = "category")
    private String category;

    @Column(name = "ingredients")
    private String ingredients;

    @Column(name = "cost")
    private double cost;

    @Column(name = "weight")
    private double weight;

    public int getDishId() {
        return dishId;
    }

    public void setDishId(int dishId) {
        this.dishId = dishId;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Dish{" +
                "dishId=" + dishId +
                ", dishName='" + dishName + '\'' +
                ", category='" + category + '\'' +
                ", ingredients='" + ingredients + '\'' +
                ", cost=" + cost +
                ", weight=" + weight +
                '}';
    }
}