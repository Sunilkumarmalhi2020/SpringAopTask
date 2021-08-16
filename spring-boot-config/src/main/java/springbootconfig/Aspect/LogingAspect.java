package springbootconfig.Aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import springbootconfig.db.DbConfiguration;

@Component
@Aspect
@EnableAspectJAutoProxy

public class LogingAspect {

	@Autowired
	private DbConfiguration dbconfig;
	
	@Before("execution(public String getData1())")
	public void loggingAdvised() {
		System.out.println("internally application property contain email : "+dbconfig.getEmail());
	}
}
