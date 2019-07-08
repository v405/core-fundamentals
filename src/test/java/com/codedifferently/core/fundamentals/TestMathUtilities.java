package com.codedifferently.core.fundamentals;

import com.codedifferently.core.fundamentals.mathutilities.TestAddition;
import com.codedifferently.core.fundamentals.mathutilities.TestDivision;
import com.codedifferently.core.fundamentals.mathutilities.TestMultiplication;
import com.codedifferently.core.fundamentals.mathutilities.TestSubtraction;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestAddition.class,
        TestSubtraction.class,
        TestDivision.class,
        TestMultiplication.class
})
public class TestMathUtilities {
}