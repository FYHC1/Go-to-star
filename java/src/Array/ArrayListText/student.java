package Array.ArrayListText;

import java.util.Objects;

public class student {
    String id;
    String name;
    String age;
    String address;


    public student() {
    }

    public student(String id, String name, String age, String address) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    /**
     * 获取
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * 设置
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        student student = (student) o;
        return Objects.equals(id, student.id) && Objects.equals(name, student.name) && Objects.equals(age, student.age) && Objects.equals(address, student.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, address);
    }

    public String toString() {
        return "student{id = " + id + ", name = " + name + ", age = " + age + ", address = " + address + "}";
    }
}
