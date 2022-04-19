package com.org.ssa.service;

import com.org.ssa.model.Ministry;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface MinistryService {
    public void createMinistry( Ministry ministry);
    public List<Ministry> getAllministry( Ministry ministry);
    public String deleteById( Integer id);
    public String deleteByName(String name);
    public String salaryDouble( String address);



}
