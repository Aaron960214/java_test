package org.lqb.java.googleTest;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * @author Aaron960214
 * @create 2017-12-26 18:09
 * @ClassName Car
 * @desc
 **/
public class Car {
    private String name;

    public Car(String name) {
        this.name = checkNotNull(name);
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void drive(double speed) {
        checkArgument(speed > 0, "speed (%s) must be positive", speed);
    }

}
