package edu.cassandra.cassandrademo.pojo;

import org.springframework.data.cassandra.core.cql.PrimaryKeyType;
import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.Map;

@Table("Users")
public class User {
    @PrimaryKeyColumn(name = "id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
    @Column("id")
    private int id;

    @Column("name")
    private String name;

    @Column("favorites")
    private Map<String, String> favorites;

    public User() {
    }

    public User(int id) {
        this.id = id;
    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public User(int id, String name, Map<String, String> favorites) {
        this.id = id;
        this.name = name;
        this.favorites = favorites;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, String> getFavorites() {
        return favorites;
    }

    public void setFavorites(Map<String, String> favorites) {
        this.favorites = favorites;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("name", name)
                .append("favorites", favorites)
                .toString();
    }
}
