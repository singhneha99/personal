package com.interview;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

//public class Q23 {
//
//	public static void main(String[] args) 
//	{
////		String s = "google";
////		
////		char[] ch = s.toCharArray();
////		
////		List<Character> l1 = new ArrayList<>();
////		
////		List<Character> nonRepeating = new ArrayList<>();
////		
////		for(int i = 0; i <= ch.length-1; i++)
////		{
////			l1.add(ch[i]);
////		}
////		
////		
////		Map<Character, Long> map = l1.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,Collectors.counting()));
////		
////		for(Entry<Character, Long> e: map.entrySet())
////		{
////			if(e.getValue() == 1)
////			{
////				nonRepeating.add(e.getKey());
////			}
////		}
////		
////		System.out.println(nonRepeating.get(0));
//		
//		
//		
//		
//		
//		@SpringBootApplication, @ComponentScan, @Configuration, @EnableAutoConfiguration
//		@Component
//		@Service
//		@Repository
//		@Controller
//		@RestController
//		@GetMapping, @PostMapping, @PutMapping, @DeletMapping
//		@PathVariable
//		@RequestParam
//		@Transactional
//		@Autowired
//		@Profile
//		@Qualifier
//		@Value
//		@Entity
//		@Id
//		
//		
//		@ControllerAdvice
//		@ExceptionHandler(CustomException.class)
//		public void customException(String message)
//		{
//			throw new CustomException(message);
//		}
//		
//		
//		
//		
//		
//		Integer id = 101;
//		EntityBuilder<Customer> customer = new EntityBuilder.builder(Customer.class);
//		
//		customer.select(Customer.Fields.Id)
//				.select(Customer.Fields.Name)
//				.select(Customer.Fields.Designation)
//				.whereEquals(customer.getId, id)
//				.build();
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//		
//	}
//
//}

final class Employee5
{
	
	private final Integer id = null;
	private final String name = "";
	
	
	
	//getters
	
	public Integer getId() {
		return id;
	}


	public String getName() {
		return name;
	}


	public static Employee5 getE() {
		return e;
	}

  
	private static final Employee5 e = new Employee5();
	
	
	public Employee5 getInstance()
	{
		if(e == null)
		{
			return new Employee5();
		}
		else
		{
			return e;
		}
		
	}			
	
}






//@Entity
//public class Student
//{
//	@Id
//	private String studentId;
//	private String studentName;
//	
//	@ManyToMany(@JoinColumn = "bookId")
//	private Book book;
//
//
//}



































