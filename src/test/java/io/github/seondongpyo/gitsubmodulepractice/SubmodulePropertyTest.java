package io.github.seondongpyo.gitsubmodulepractice;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SubmodulePropertyTest {

	@Value("${server.port}")
	private int serverPort;

	@Test
	void port() {
		assertThat(serverPort).isEqualTo(9090);
	}
}
