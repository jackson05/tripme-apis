package tripme.tripme.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @PostMapping("/user/save")
    public User creatUser(@RequestBody User user){
        userService.signUp(user);
        return user;
    }
    

    @GetMapping("/user")
    public List<User> getUsers(){
        return userService.getAllUsers();
      
    }

    @DeleteMapping("user/delete/{id}")
    public String deleteUser(@PathVariable int id){

         userService.deleteUser(id);

         return "users deleted";
    }
    
    @PutMapping("user/update/{id}")
    public User updateUser(@RequestBody User user,@PathVariable int id){
        
         userService.EditUser(user);
         
         return user;
    }
    
    
    
}


