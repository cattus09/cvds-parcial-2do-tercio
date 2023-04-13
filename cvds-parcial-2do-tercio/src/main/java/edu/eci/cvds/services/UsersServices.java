package edu.eci.cvds.services;

public class UsersServices {
    private final Users Repository UsersRepository;
	
	@Autowired
	public UsersService(UsersRepository UsersRepository) {
		this.UsersRepository = UsersRepository;
	}
	
	public Users addUsers(Users Users) {
		return UsersRepository.save(Users);
	}
	
	public Users getUsers(Long UsersId) {
		return UsersRepository.findById(UsersId).get();
	}
	
	public List<Users> getAllUserss() {
		return UsersRepository.findAll();
	}
	
	public Users updateUsers(Users Users) {
		if(UsersRepository.existsById(Users.getUsersId())) {
			return UsersRepository.save(Users);
		}
		
		return null;
	}
	
	public void deleteUsers(Long UsersId) {
		UsersRepository.deleteById(UsersId);
	}	
}
}
