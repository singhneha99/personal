package com.interview;

public class Q12 {
	
/*Create a Spring Boot REST API that handles user management, with basic CRUD operations.
	Requirements:
		1. User Entity: id, name, email, age.
		2. Endpoints: GET /users, GET /users/{id}, POST /users, PUT /users/{id}, DELETE /users/{id}.
		3. Use appropriate HTTP status codes.
		4. Handle validation for fields like name, email, and age.
		*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = null;


		if(s1 != null && s1.equals("y"))
		{
			System.out.println("Hi");
		}

	}



//@Entity
//class User
//{
//	
//	
//	@Id
//	private int id;
//	
//	@Column
//	private String name;
//	
//	@Column
//	private String email;
//	
//	@Column
//	private int age;
//	
//}
//
//@RestController
//class UserController
//{
//	@Autowired
//	private UserService userService;
//	
//	
//	@GetMapping("/users/{id}")
//	public User getUser(@PathVariable int id)
//	{
//		return userService.getUser();
//	}
//	
//	@GetMapping("/users")
//	public List<User> getUsers()
//	{
//		
//	}
//	
//	@PostMapping("/users")
//	public String addUser()
//	{
//		
//	}
//	
//	@PutMapping("/users/{id}")
//	public String updateUser(@PathVariable int id)
//	{
//		
//	}
//	
//	@DeleteMapping("/users/id")
//	public String deleteUser(@PathVariable int id)
//	{
//		
//	}

}