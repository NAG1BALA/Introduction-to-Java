package Task;

public class Cat {
    String name;
    int age;
    String owner;
    String poroda;

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", owner: " + owner + ", poroda: " + poroda;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Cat)){
            return false;
        }
        Cat cat = (Cat) obj;
        return name.equals(cat.name) && age == cat.age && poroda.equals(cat.poroda);
    }

    @Override
    public int hashCode() {
        return name.hashCode() + 7*age + 13*poroda.hashCode();
    }
}

