package ru.alexandr.repository;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class UserRepository {

    private HashMap<String, HashMap<String, List<Authorities>>> db = new HashMap<>();

    public void createTempData() {
        HashMap<String, List<Authorities>> map0 = new HashMap<>();
        List<Authorities> list1 = new ArrayList<>();
        list1.add(Authorities.DELETE);
        list1.add(Authorities.READ);
        map0.put("123", list1);

        HashMap<String, List<Authorities>> map1 = new HashMap<>();
        List<Authorities> list2 = new ArrayList<>();
        list2.add(Authorities.DELETE);
        list2.add(Authorities.READ);
        list2.add(Authorities.WRITE);
        map1.put("12345", list2);

        HashMap<String, List<Authorities>> map2 = new HashMap<>();
        List<Authorities> list3 = new ArrayList<>();
        list3.add(Authorities.DELETE);
        map2.put("1", list3);

        db.put("Yang", map0);
        db.put("Alex", map1);
        db.put("Yo", map2);
    }

    public List<Authorities> getUserAuthorities(String userName, String password) {
        HashMap<String, List<Authorities>> hashMap = db.get(userName);
        if (hashMap == null) return new ArrayList<>();
        return hashMap.get(password);
    }
}