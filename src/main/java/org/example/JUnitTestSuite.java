package org.example;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({MessageTest1.class,MessageTest2.class})
public class JUnitTestSuite {
}
