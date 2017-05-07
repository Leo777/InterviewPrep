public class User implements Comparable<User> {
    private int id;

    public User(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(User o) {
        if (this.id == o.id)
            return 0;
        if (this.id > o.id) {
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        return id == user.id;

    }

    @Override
    public int hashCode() {
        return id;
    }
}

