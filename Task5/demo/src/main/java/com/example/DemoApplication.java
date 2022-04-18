package com.example;

import com.example.eventListeners.*;
import com.example.events.*;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.example.eventListeners" })
public class DemoApplication {

	public static void main(String[] args) {
		var asyncEvent = new AsyncEvent(0, "Async Works!");
		var basicEvent = new BasicEvent(0, "Basic Works!");
		var transactionalEvent = new TransactionalEvent(0, "Transactional Works!");
		var context = SpringApplication.run(DemoApplication.class, args);
		context.getBean(AsyncEventListener.class).handleEvent(asyncEvent);
		context.getBean(BasicEventListener.class).handleEvent(basicEvent);
		context.getBean(TransactionalEventListener.class).handleEvent(transactionalEvent);

	}

}
