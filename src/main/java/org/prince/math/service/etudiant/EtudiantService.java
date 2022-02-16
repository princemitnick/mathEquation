package org.prince.math.service.etudiant;

import org.prince.math.model.Etudiant;

import java.util.List;

public interface EtudiantService {

    public void add(Etudiant etudiant);
    public Etudiant edit(Etudiant etudiant, String code);
    public void delete(String code);
    public List<Etudiant> findAll();
    public Etudiant findOne(String code);

}
