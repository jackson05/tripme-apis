package tripme.tripme.user;

 
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;



@Service
public class UserService{
   
     @Autowired
     private UserRepository usersRepo;


     
     public User signUp(User user){

     return usersRepo.save(user);

     }

     public User EditUser(User user){

     return usersRepo.save(user);

     }
   
     public User getUserById(int id){
         return usersRepo.findUserByIdUser(id);
     }

     public User getUserByMail(String mail){

      return usersRepo.findUserByEmail(mail);
     }
    

     public List <User> getAllUsers(){
     
         return usersRepo.findAll();

     }

     public void deleteUser(int id){

         usersRepo.deleteById(id);
     }

    
     


}
