package com.sxt.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import com.bjsxt.config.JavaConfigA;
import com.bjsxt.config.JavaConfigB;

@Configuration
@Import(value = {JavaConfigA.class,JavaConfigB.class})
public class JavaConfigC {

}
