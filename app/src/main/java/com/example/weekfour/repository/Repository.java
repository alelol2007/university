package com.example.weekfour.repository;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import com.example.weekfour.model.SoccerEntity;
public class Repository<T extends SoccerEntity> {
    private List<T> items;
    public Repository(){
        this.items = new ArrayList<>();
    }
    public List<T> getAll() {
        return items;
    }

    public void add(T item){
        this.items.add( item);
    }
    public List<T> filter(Predicate<T> predicate){
        List<T> filteredList  = new ArrayList<>();
        for (T item : this.items){
            if (predicate.test(item)){
                filteredList.add(item);
            }
        }
        return filteredList;
    }

    public T getById(String id ){
        for (T item : this.items){
            if (item.getId().equals(id)){
                return item;
            }
        }
        return null;
    }
}
