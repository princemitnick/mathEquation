package org.prince.math.service.etudiant;

import org.prince.math.model.Etudiant;
import org.prince.math.model.Level;

import java.util.ArrayList;
import java.util.List;

public class EtudiantServiceImpl implements  EtudiantService{

    private List<Etudiant> etudiantList = new ArrayList<>();

    @Override
    public void add(Etudiant etudiant) {
        Level level = new Level("Rheto", 1);

        Etudiant etudiant1 = new Etudiant("001","Prince","Stanley",level);
        etudiantList.add(etudiant1);

    }

    @Override
    public Etudiant edit(Etudiant etudiant, String code) {
        return null;
    }

    @Override
    public void delete(String code) {

    }

    @Override
    public List<Etudiant> findAll() {
        return etudiantList;
    }

    @Override
    public Etudiant findOne(String code) {
        return null;
    }
}
