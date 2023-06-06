import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

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

    public void filterFromList(List<T> parameterList, int menor) throws AgeException {
        parameterList.forEach(person -> {
            if (person.getAge() >= menor) {
                items.add(person);
            } else {
                try {
                    throw new AgeException(person.getAge());
                } catch (AgeException e) {
                    System.out.println("Exception: " + e.getMessage());
                    System.out.println("Invalid age: " + e.getAge());
                }
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

    public HashMap<Integer, ArrayList<String>> exportTagsToHashMap() {
        HashMap<Integer, ArrayList<String>> container = new HashMap<>();

        items.forEach(element -> {
            int id = element.getId();
            List<String> tags = element.getTags();

            if (container.containsKey(id)) {
                List<String> existingTags = container.get(id);
                existingTags.addAll(tags);
            } else {
                List<String> newTags = new ArrayList<>(tags);
                container.put(id, (ArrayList<String>) newTags);
            }
        });

        return container;
    }

    public int totalTags(int id) throws CustomException {
        AtomicBoolean claveEncontrada = new AtomicBoolean(false);
        AtomicInteger totalTags = new AtomicInteger(0);

        items.forEach(element -> {
            if (element.getId() == id) {
                List<String> elementTags = element.getTags();
                elementTags.forEach(tag -> {
                    totalTags.incrementAndGet();
                });
                claveEncontrada.set(true);
            }
        });

        if (!claveEncontrada.get()) {
            throw new CustomException("id not exists!");
        }
        return totalTags.get();
    }

}
