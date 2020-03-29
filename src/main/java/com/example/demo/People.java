package com.example.demo;

import java.util.*;
import java.util.function.Consumer;

public abstract class  People<PersonType extends Person> implements Iterable<PersonType>{
    protected List<PersonType> personList;

    public People(List<Instructor> personList){
        this.personList= personList;
    }
    public boolean add(PersonType personType){
        return  personList.add(personType);
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
        ArrayList<PersonType> personTypeList= new ArrayList<>();
        personTypes.forEach(personType -> personTypeList.add(personType));
        return personList.addAll(personTypeList);
    }
    public PersonType findById(long id){
        for(PersonType person : personList){
            if(Objects.equals(person.getId(), id)) return person;
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

    @Override
    public void forEach(Consumer<? super PersonType> action) {
        personList.forEach(action);

    }

    @Override
    public Spliterator<PersonType> spliterator() {
        return personList.spliterator();
    }

    @Override
    public Iterator<PersonType> iterator() {
        return personList.iterator();
    }
}
