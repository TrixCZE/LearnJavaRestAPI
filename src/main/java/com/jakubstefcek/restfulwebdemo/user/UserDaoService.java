package com.jakubstefcek.restfulwebdemo.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	// Vytvoreni useru pro zobrayeni
	private static List<User> users = new ArrayList<>();
	
	// Promenna pro ID usera
	private static int usersCount = 0;
	
	static {
		users.add(new User(++usersCount,"Jakub",LocalDate.now().minusYears(24)));
		users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(25)));
		users.add(new User(++usersCount,"Dominik",LocalDate.now().minusYears(23)));
		users.add(new User(++usersCount,"Andrejka",LocalDate.now().minusYears(22)));
		users.add(new User(++usersCount,"Tomas",LocalDate.now().minusYears(35)));
	}
	
	// Zobrazeni vsech useru
	public List<User> findAll() {
		return users;
	}
	
	// Pridani uzivatele
	public User save(User user) {
		user.setId(++usersCount);
		users.add(user);
		return user;
	}
	
	// Delete jednoho uzivatele
		public void deleteByID(int id) {
			Predicate<? super User> predicate = user -> user.getId().equals(id);
			users.removeIf(predicate);
		}
	
	// Nalezeni jednoho uzivatele
	public User findOne(int id) {
		Predicate<? super User> predicate = user -> user.getId().equals(id);
		return users.stream().filter(predicate).findFirst().orElse(null);
	}
}
