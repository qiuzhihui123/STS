package com.qiuhui;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
/*@ContextConfiguration(locations="classpath:application-configuration.xml")*/
@ContextConfiguration(classes=Application.class)
public class BaseTest {

}
