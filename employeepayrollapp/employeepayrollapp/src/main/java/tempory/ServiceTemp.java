package tempory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceTemp {
    @Autowired
    private repotemp repotempt;

    public temporyEmployee add(temporyEmployee employee){
        return repotempt.save(employee);
    }
    public boolean delete(Long id){
        if(repotempt.existsById(id)){
            repotempt.deleteById(id);
            return true;
        }
        return false;
    }
    public Optional<temporyEmployee> getid(Long id){
        return repotempt.findById(id);
    }
    public temporyEmployee update(Long id,temporyEmployee updateEmployee){
      return repotempt.findById(id).map(employee -> {
          employee.setName(updateEmployee.getname());
       employee.setSalary(updateEmployee.getSalary());
      return repotempt.save(employee);
      }).orElse(null);
    }
    public List<temporyEmployee> fetchAll(){
        return repotempt.findAll();
    }

}
