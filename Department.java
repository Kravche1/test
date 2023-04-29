import java.util.Objects;

public class Department {
    int ID;
    String Name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return ID == that.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "Department{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                '}';
    }
}
