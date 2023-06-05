import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class MajorPersonGeneric<T extends Person> {
    private List<T> items;

    public MajorPersonGeneric() {
        this.items = new ArrayList<>();
    }

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "MajorPersonGeneric [items=" + items + "]";
    }

    public void filterFromList(List<T> parameterList, int menor) {
        parameterList.forEach(person -> {
            if (person.getAge() >= menor) {
                items.add(person);
            }
        });
    }

    public HashSet<String> saveAuthors() {
        HashSet<String> hashSetAuthors = new HashSet<>();
        items.forEach(item -> {
            List<Book> bookList = item.getBooks();
            bookList.forEach(bookItem -> {
                hashSetAuthors.add(bookItem.getAuthor());
            });
        });

        return hashSetAuthors;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((items == null) ? 0 : items.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        MajorPersonGeneric<?> other = (MajorPersonGeneric<?>) obj;
        return Objects.equals(items, other.items);
    }

}
