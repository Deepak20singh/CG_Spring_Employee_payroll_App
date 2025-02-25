package tempory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class tempController {
    @Autowired
    public ServiceTemp temp;
   @PutMapping("/add")
    public void add(@RequestBody temporyEmployee employee){
       temp.add(employee);
   }
   @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
       temp.delete(id);
   }
   @GetMapping("/find/{id}")
    public Optional<temporyEmployee> fetch(@PathVariable Long id){
       return temp.getid(id);
   }
   @GetMapping("/fetch")
    public List<temporyEmployee> find(){
       return temp.fetchAll();
   }
   @PostMapping("post/{id}")
    public void push(@PathVariable Long id,@RequestBody temporyEmployee employee){
       temp.update(id,employee);
   }
}
