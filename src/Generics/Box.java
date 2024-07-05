package Generics;

import java.util.ArrayList;
import java.util.List;

public class Box <T> {
    private List<T> contents = new ArrayList<>(); // в дженериках нельзя инициализировать массивы таким образом, а коллекции можно.

    public Box() {
    }

    public Box(List<T> contents) {
        this.contents = contents;
    }

    public void add(T item){
        contents.add(item);
    } // добавляет объект в список contents

    public List<T> getContents() {
        return contents;
    }
}
