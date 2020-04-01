package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<PersonType extends Person> implements Iterable<PersonType>{
    protected List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public boolean add(PersonType personType){
        return personList.add(personType);
    }

    public boolean remove(PersonType personType){
        return personList.remove(personType);
    }

    public int size(){
        return personList.size();
    }

    public void clear(){
        personList.clear();
    }

    public boolean addAll(Iterable<PersonType> personTypes){
        ArrayList<PersonType> personTypesList = new ArrayList<>();
        personTypes.forEach(personType -> personTypesList.add(personType));
        return personList.addAll(personTypesList);
    }

    public PersonType findById(long id){
        for (PersonType person: personList) {
            if (person.getId().equals(id)) return person;
        }
        return null;
    }

    public List<PersonType> findAll(){
        return personList;
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {
        personList.forEach(action);
    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return personList.spliterator();
    }
}

