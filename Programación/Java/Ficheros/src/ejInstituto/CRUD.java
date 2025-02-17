package ejInstituto;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface CRUD<T> {
    public void create(T t) throws GroupAlreadyExist, IOException;
    public Map<Integer, T> read();
    public void update(int id, T t);
    public void delete(int id);
}