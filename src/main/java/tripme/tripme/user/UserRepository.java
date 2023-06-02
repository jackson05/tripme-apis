package tripme.tripme.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>  {

    public User findUserByIdUser(int idUser);
    public User findUserByEmail(String email);
    
    
}

