package com.example.TesterPRJ;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.reactive.server.WebTestClient;
import org.springframework.test.web.servlet.MockMvc;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class SampleControllerTest {

//	@Rule
//    public OutputCaptureRule outputCapture = new OutputCaptureRule();

//    @Rule
//    public OutputCaptureRule output = new OutputCaptureRule();
	
	@Autowired
	WebTestClient webTestClient;
	
	@Autowired
	MockMvc mockMvc;
	
	@MockBean
	SampleService mockSampleService;
	
	
	@Test
	public void hello() throws Exception {
		
		when(mockSampleService.getName()).thenReturn("hongma-dev");
		
		webTestClient.get().uri("/hello").exchange()
							.expectStatus().isOk()
							.expectBody(String.class).isEqualTo("hello hongma-dev");
							
		//tomcat 9.0 이상 버전에서 사용 할 수 있음
//		assertThat(output).contains("hongma-man");

	}
	
	
}
