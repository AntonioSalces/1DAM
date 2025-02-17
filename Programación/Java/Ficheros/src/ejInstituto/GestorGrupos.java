package ejInstituto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class GestorGrupos implements CRUD<Grupo>{
    HashMap<Integer, Grupo> grupos;

    public GestorGrupos() {
        grupos = new HashMap<>();
    }

    @Override
    public void create(Grupo t) throws GroupAlreadyExist, IOException {
        for(Grupo g : grupos.values()) {
            if (g.getNombre().equals(t.getNombre())) {
                throw new GroupAlreadyExist();
            }
        }

        int id = grupos.size() + 1;
        grupos.put(id, t);
        BufferedWriter bw = new BufferedWriter(new FileWriter("ejInstituto - Grupo.csv"));
        for(Grupo g : grupos.values()) {
            String linea = g.toString();
            String partes[] = linea.split(",");

            if (partes.length == 3) {
                int _id = Integer.parseInt(partes[0]);
                String nombre = partes[1];
                String turno = partes[2];

                bw.write(_id + "," + nombre + "," + turno);
                bw.newLine();

            }
        }
        bw.close();
    }

    @Override
    public Map<Integer, Grupo> read() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'read'");
    }

    @Override
    public void update(int id, Grupo t) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    

}
