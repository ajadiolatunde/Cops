package com.phy.app;

import com.phy.app.user.User;
import com.phy.app.user.UserRepository;
import com.phy.app.user.UserRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashSet;
import java.util.UUID;
import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
class AppApplicationTests {
	@Autowired
	private UserRepository repository;

	@Test
	void contextLoads() {

	}

	@Test
	public void testStoreUser() {
		HashSet<UserRole> roles = new HashSet<>();
		roles.add(UserRole.OFFICER);
		User user = repository.save(new User(UUID.randomUUID(),
				"alex.foley@beverly-hills.com",
				"my-secret-pwd",
				roles));
		assertThat(user).isNotNull();
		assertThat(repository.count()).isEqualTo(1L);
	}

}
