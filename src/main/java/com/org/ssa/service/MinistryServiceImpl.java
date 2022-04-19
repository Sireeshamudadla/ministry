package com.org.ssa.service;

import com.org.ssa.model.Ministry;
import com.org.ssa.repository.MinistryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class MinistryServiceImpl implements MinistryService {

    @Autowired
    MinistryRepo ministryRepo;

    @Override
    public void createMinistry(Ministry ministry) {
        ministryRepo.save(ministry);

    }

    @Override
    public List<Ministry> getAllministry(Ministry ministry) {
        List<Ministry> siri = ministryRepo.findAll();
        return siri;

    }

    @Override
    public String deleteById(Integer id) {
        ministryRepo.deleteById(id);
        return "manu";
    }

    @Override
    public String deleteByName(String name) {
        ministryRepo.deleteByName(name);
        return "null";
    }

    @Override
    public String salaryDouble(String address) {

        List<Ministry> ministryList = ministryRepo.findByAddress(address);

        for (int i = 0; i < ministryList.size(); i++) {
            Ministry ministry = ministryList.get(i);
            ministry.setSalary(ministry.getSalary() * 2);
            ministryRepo.save(ministry);
        }

        return "success fully double the salary";
    }
}
