package github;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.annotations.VisibleForTesting;

public class GitHub {
	@Test
	public void addMessage() {
		Reporter.log("Welcome to GitHub", true);
	}
}
