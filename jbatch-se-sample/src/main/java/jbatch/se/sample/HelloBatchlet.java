package jbatch.se.sample;

import javax.batch.api.AbstractBatchlet;
import javax.inject.Inject;
import javax.inject.Named;

@Named("HelloBatchlet")
public class HelloBatchlet extends AbstractBatchlet {
	@Inject
	HelloService helloService;

	@Override
	public String process() throws Exception {
		System.out.println(helloService.hello("world22"));
		return null;
	}

}
