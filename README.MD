该项目主要测试springboot2的logback的使用<br>
1、引入lombok依赖，小工具使用@Data注解可以自动生成getter/setter方法，
   使用@Slf4j注解可以直接使用日志记录对象log<br>
   
2、进行日志的记录，包含控制台和文件。ERROR和INFO消息分开目录存放

【说明】<br>
默认情况下，Spring Boot会用Logback来记录日志，并用INFO级别输出到控制台。

自定义日志配置
根据不同的日志系统，你可以按如下规则组织配置文件名，就能被正确加载：

Logback：logback-spring.xml, logback-spring.groovy, logback.xml, logback.groovy
Log4j：log4j-spring.properties, log4j-spring.xml, log4j.properties, log4j.xml
Log4j2：log4j2-spring.xml, log4j2.xml
JDK (Java Util Logging)：logging.properties
Spring Boot官方推荐优先使用带有-spring的文件名作为你的日志配置（如使用logback-spring.xml，而不是logback.xml），命名为logback-spring.xml的日志配置文件，spring boot可以为它添加一些spring boot特有的配置项（下面会提到）。 
默认的命名规则，并且放在 src/main/resources 下面即可

如果你即想完全掌控日志配置，但又不想用logback.xml作为Logback配置的名字，application.yml可以通过logging.config属性指定自定义的名字：

logging.config=classpath:logging-config.xml

虽然一般并不需要改变配置文件的名字，但是如果你想针对不同运行时Profile使用不同的日志配置，这个功能会很有用。 
一般不需要这个属性，而是直接在logback-spring.xml中使用springProfile配置，不需要logging.config指定不同环境使用不同配置文件。springProfile配置在下面介绍。
