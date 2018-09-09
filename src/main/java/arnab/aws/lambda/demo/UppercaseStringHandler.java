package arnab.aws.lambda.demo;

import java.util.function.Function;

import org.springframework.stereotype.Component;

@Component("uppercaseStringHandler")
public class UppercaseStringHandler implements Function<String, String> {

	@Override
	public String apply(String t) {
		return t.toUpperCase();
	}

}
