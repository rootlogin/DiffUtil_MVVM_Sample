package sample.lyl.xyz.module.provider;

import java.io.Serializable;

/**
 * Author: lyl
 * <p>
 * Time: 2018/7/9 下午8:43
 * <p>
 * Version: 1.0.0
 * <p>
 * Description: 数据结构
 */
public class ArchitectureComponents implements Serializable {

    private static final long serialVersionUID = -6936556464304411299L;

    private int id;

    private String name;

    private String image;

    private String description;

    private String time;


    public ArchitectureComponents(int id, String name, String image, String description, String time) {
        this.id = id;
        this.name = name;
        this.image = image;
        this.description = description;
        this.time = time;
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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
