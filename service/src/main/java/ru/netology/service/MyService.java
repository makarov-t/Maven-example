// MyService.java
package ru.netology.service;

import ru.netology.db.DbSetting;
import ru.netology.db.MyEntity;

import java.util.UUID;

public class MyService {
    private DbSetting dbSetting = new DbSetting("name", "password");
    private String name = "myService";
    private ru.netology.db.Db db = new ru.netology.db.Db(dbSetting);

    public String getName() {
        return name;
    }

    public MyEntity setMyEntity(MyEntity myEntity) {
        myEntity.setId(UUID.randomUUID());
        db.setMyEntity(myEntity);
        return myEntity;
    }

    public MyEntity getMyEntity() {
        return db.getMyEntity();
    }
}